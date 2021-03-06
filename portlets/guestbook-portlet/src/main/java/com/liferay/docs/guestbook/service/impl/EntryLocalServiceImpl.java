
package com.liferay.docs.guestbook.service.impl;

import com.liferay.docs.guestbook.EntryEmailException;
import com.liferay.docs.guestbook.EntryMessageException;
import com.liferay.docs.guestbook.EntryNameException;
import com.liferay.docs.guestbook.model.Entry;
import com.liferay.docs.guestbook.service.base.EntryLocalServiceBaseImpl;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetLinkConstants;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the entry local service. <p> All custom service methods
 * should be put in this class. Whenever methods are added, rerun ServiceBuilder
 * to copy their definitions into the
 * {@link com.liferay.docs.guestbook.service.EntryLocalService} interface. <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM. </p>
 *
 * @author Diogo Peixoto
 * @see com.liferay.docs.guestbook.service.base.EntryLocalServiceBaseImpl
 * @see com.liferay.docs.guestbook.service.EntryLocalServiceUtil
 */
public class EntryLocalServiceImpl extends EntryLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use
	 * {@link com.liferay.docs.guestbook.service.EntryLocalServiceUtil} to
	 * access the entry local service.
	 */

	public Entry add(Entry entry, ServiceContext serviceContext)
		throws PortalException, SystemException {

		boolean addResource = false;
		if (entry.getEntryId() <= 0) {
			addResource = true;
		}

		setAttributes(entry, serviceContext);
		validate(entry);

		// Resource
		if (addResource) {
			resourceLocalService.addResources(
				serviceContext.getCompanyId(),
				serviceContext.getScopeGroupId(), serviceContext.getUserId(),
				Entry.class.getName(), entry.getEntryId(), false, true, true);

			entry.setStatus(WorkflowConstants.STATUS_PENDING);
		}
		else {
			resourceLocalService.updateResources(
				serviceContext.getCompanyId(),
				serviceContext.getScopeGroupId(), Entry.class.getName(),
				entry.getEntryId(), serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions());
		}

		// Asset Framework
		AssetEntry assetEntry =
			assetEntryLocalService.updateEntry(
				serviceContext.getUserId(), serviceContext.getScopeGroupId(),
				entry.getCreateDate(), entry.getModifiedDate(),
				Entry.class.getName(), entry.getEntryId(), entry.getUuid(), 0,
				serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames(), true, null, null, null,
				ContentTypes.TEXT_HTML, entry.getMessage(), null, null, null,
				null, 0, 0, null, false);

		assetLinkLocalService.updateLinks(
			serviceContext.getUserId(), assetEntry.getEntryId(),
			serviceContext.getAssetLinkEntryIds(),
			AssetLinkConstants.TYPE_RELATED);

		entry = super.updateEntry(entry);

		if (addResource) {
			// Workflow
			WorkflowHandlerRegistryUtil.startWorkflowInstance(
				entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				Entry.class.getName(), entry.getPrimaryKey(), entry,
				serviceContext);
		}

		// Indexer
		updateEntryIndexer(entry, false);

		return entry;
	}

	public Entry delete(Entry entry)
		throws PortalException, SystemException {

		// Resource
		resourceLocalService.deleteResource(
			entry.getCompanyId(), Entry.class.getName(),
			ResourceConstants.SCOPE_INDIVIDUAL, entry.getEntryId());

		// Asset Framework
		AssetEntry assetEntry =
			assetEntryLocalService.fetchEntry(
				Entry.class.getName(), entry.getEntryId());

		assetLinkLocalService.deleteLinks(assetEntry.getEntryId());
		assetEntryLocalService.deleteEntry(assetEntry);

		entry = super.deleteEntry(entry);

		// Indexer
		updateEntryIndexer(entry, true);

		return entry;
	}

	public Entry updateStatus(
		long userId, long entryId, int status, ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userLocalService.getUser(userId);
		Entry entry = getEntry(entryId);

		entry.setStatus(status);
		entry.setStatusByUserId(userId);
		entry.setStatusByUserName(user.getFullName());
		entry.setStatusDate(new Date());

		super.updateEntry(entry);

		if (status == WorkflowConstants.STATUS_APPROVED) {
			assetEntryLocalService.updateVisible(
				Entry.class.getName(), entryId, true);
		}
		else {
			assetEntryLocalService.updateVisible(
				Entry.class.getName(), entryId, false);
		}
		return entry;
	}

	public int countByGroupIdGuestbookId(long groupId, long guestbookId)
		throws SystemException {

		return entryPersistence.countByG_G_S(
			groupId, guestbookId, WorkflowConstants.STATUS_APPROVED);
	}

	public List<Entry> findByGroupIdGuestbookId(long groupId, long guestbookId)
		throws SystemException {

		return entryPersistence.findByG_G(groupId, guestbookId);
	}

	public List<Entry> findByGroupIdGuestbookId(
		long groupId, long guestbookId, int start, int end)
		throws SystemException {

		return entryPersistence.findByG_G_S(
			groupId, guestbookId, WorkflowConstants.STATUS_APPROVED, start, end);
	}

	public List<Entry> findByGroupIdGuestbookIdName(
		long groupId, long guestbookId, String name)
		throws SystemException {

		return entryPersistence.findByG_G_N(groupId, guestbookId, name);
	}

	private void validate(Entry entry)
		throws PortalException, SystemException {

		if (Validator.isNull(entry.getName())) {
			throw new EntryNameException();
		}

		if (!Validator.isEmailAddress(entry.getEmail())) {
			throw new EntryEmailException();
		}

		if (Validator.isNull(entry.getMessage())) {
			throw new EntryMessageException();
		}

		guestbookPersistence.findByPrimaryKey(entry.getGuestbookId());
	}

	private void setAttributes(Entry entry, ServiceContext serviceContext)
		throws NoSuchUserException, SystemException {

		User user =
			userPersistence.findByPrimaryKey(serviceContext.getUserId());

		Date now = new Date();

		if (entry.getEntryId() <= 0) {
			long entryId = counterLocalService.increment(Entry.class.getName());

			entry.setEntryId(entryId);
			entry.setUuid(serviceContext.getUuid());

			entry.setCompanyId(user.getCompanyId());
			entry.setGroupId(serviceContext.getScopeGroupId());
			entry.setUserId(user.getUserId());
			entry.setUserName(user.getFullName());
			entry.setCreateDate(serviceContext.getCreateDate(now));
		}

		entry.setModifiedDate(serviceContext.getModifiedDate(now));

		entry.setExpandoBridgeAttributes(serviceContext);
	}

	private void updateEntryIndexer(Entry entry, boolean delete)
		throws SearchException {

		Indexer indexer =
			IndexerRegistryUtil.nullSafeGetIndexer(Entry.class.getName());

		if (delete) {
			indexer.delete(entry);
		}
		else {
			indexer.reindex(entry);
		}
	}
}
