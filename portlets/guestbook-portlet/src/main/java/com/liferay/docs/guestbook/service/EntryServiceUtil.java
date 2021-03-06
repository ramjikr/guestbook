package com.liferay.docs.guestbook.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Entry. This utility wraps
 * {@link com.liferay.docs.guestbook.service.impl.EntryServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Diogo Peixoto
 * @see EntryService
 * @see com.liferay.docs.guestbook.service.base.EntryServiceBaseImpl
 * @see com.liferay.docs.guestbook.service.impl.EntryServiceImpl
 * @generated
 */
public class EntryServiceUtil {
    private static EntryService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.guestbook.service.impl.EntryServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.docs.guestbook.model.Entry add(
        com.liferay.docs.guestbook.model.Entry entry,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().add(entry, serviceContext);
    }

    public static com.liferay.docs.guestbook.model.Entry delete(
        com.liferay.docs.guestbook.model.Entry entry)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().delete(entry);
    }

    public static int countByGroupIdGuestbookId(long groupId, long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByGroupIdGuestbookId(groupId, guestbookId);
    }

    public static com.liferay.docs.guestbook.model.Entry findByPrimaryKey(
        long entryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByPrimaryKey(entryId);
    }

    public static java.util.List<com.liferay.docs.guestbook.model.Entry> findByGroupIdGuestbookId(
        long groupId, long guestbookId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findByGroupIdGuestbookId(groupId, guestbookId, start, end);
    }

    public static java.util.List<com.liferay.docs.guestbook.model.Entry> findByGroupIdGuestbookIdName(
        long groupId, long guestbookId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findByGroupIdGuestbookIdName(groupId, guestbookId, name);
    }

    public static void clearService() {
        _service = null;
    }

    public static EntryService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EntryService.class.getName());

            if (invokableService instanceof EntryService) {
                _service = (EntryService) invokableService;
            } else {
                _service = new EntryServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(EntryServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EntryService service) {
    }
}
