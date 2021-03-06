package com.liferay.docs.guestbook.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Guestbook}.
 * </p>
 *
 * @author Diogo Peixoto
 * @see Guestbook
 * @generated
 */
public class GuestbookWrapper implements Guestbook, ModelWrapper<Guestbook> {
    private Guestbook _guestbook;

    public GuestbookWrapper(Guestbook guestbook) {
        _guestbook = guestbook;
    }

    @Override
    public Class<?> getModelClass() {
        return Guestbook.class;
    }

    @Override
    public String getModelClassName() {
        return Guestbook.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("guestbookId", getGuestbookId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusByUserName", getStatusByUserName());
        attributes.put("statusDate", getStatusDate());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long guestbookId = (Long) attributes.get("guestbookId");

        if (guestbookId != null) {
            setGuestbookId(guestbookId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        String statusByUserName = (String) attributes.get("statusByUserName");

        if (statusByUserName != null) {
            setStatusByUserName(statusByUserName);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }
    }

    /**
    * Returns the primary key of this guestbook.
    *
    * @return the primary key of this guestbook
    */
    @Override
    public long getPrimaryKey() {
        return _guestbook.getPrimaryKey();
    }

    /**
    * Sets the primary key of this guestbook.
    *
    * @param primaryKey the primary key of this guestbook
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _guestbook.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this guestbook.
    *
    * @return the uuid of this guestbook
    */
    @Override
    public java.lang.String getUuid() {
        return _guestbook.getUuid();
    }

    /**
    * Sets the uuid of this guestbook.
    *
    * @param uuid the uuid of this guestbook
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _guestbook.setUuid(uuid);
    }

    /**
    * Returns the guestbook ID of this guestbook.
    *
    * @return the guestbook ID of this guestbook
    */
    @Override
    public long getGuestbookId() {
        return _guestbook.getGuestbookId();
    }

    /**
    * Sets the guestbook ID of this guestbook.
    *
    * @param guestbookId the guestbook ID of this guestbook
    */
    @Override
    public void setGuestbookId(long guestbookId) {
        _guestbook.setGuestbookId(guestbookId);
    }

    /**
    * Returns the company ID of this guestbook.
    *
    * @return the company ID of this guestbook
    */
    @Override
    public long getCompanyId() {
        return _guestbook.getCompanyId();
    }

    /**
    * Sets the company ID of this guestbook.
    *
    * @param companyId the company ID of this guestbook
    */
    @Override
    public void setCompanyId(long companyId) {
        _guestbook.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this guestbook.
    *
    * @return the group ID of this guestbook
    */
    @Override
    public long getGroupId() {
        return _guestbook.getGroupId();
    }

    /**
    * Sets the group ID of this guestbook.
    *
    * @param groupId the group ID of this guestbook
    */
    @Override
    public void setGroupId(long groupId) {
        _guestbook.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this guestbook.
    *
    * @return the user ID of this guestbook
    */
    @Override
    public long getUserId() {
        return _guestbook.getUserId();
    }

    /**
    * Sets the user ID of this guestbook.
    *
    * @param userId the user ID of this guestbook
    */
    @Override
    public void setUserId(long userId) {
        _guestbook.setUserId(userId);
    }

    /**
    * Returns the user uuid of this guestbook.
    *
    * @return the user uuid of this guestbook
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _guestbook.getUserUuid();
    }

    /**
    * Sets the user uuid of this guestbook.
    *
    * @param userUuid the user uuid of this guestbook
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _guestbook.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this guestbook.
    *
    * @return the user name of this guestbook
    */
    @Override
    public java.lang.String getUserName() {
        return _guestbook.getUserName();
    }

    /**
    * Sets the user name of this guestbook.
    *
    * @param userName the user name of this guestbook
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _guestbook.setUserName(userName);
    }

    /**
    * Returns the create date of this guestbook.
    *
    * @return the create date of this guestbook
    */
    @Override
    public java.util.Date getCreateDate() {
        return _guestbook.getCreateDate();
    }

    /**
    * Sets the create date of this guestbook.
    *
    * @param createDate the create date of this guestbook
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _guestbook.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this guestbook.
    *
    * @return the modified date of this guestbook
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _guestbook.getModifiedDate();
    }

    /**
    * Sets the modified date of this guestbook.
    *
    * @param modifiedDate the modified date of this guestbook
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _guestbook.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the status of this guestbook.
    *
    * @return the status of this guestbook
    */
    @Override
    public int getStatus() {
        return _guestbook.getStatus();
    }

    /**
    * Sets the status of this guestbook.
    *
    * @param status the status of this guestbook
    */
    @Override
    public void setStatus(int status) {
        _guestbook.setStatus(status);
    }

    /**
    * Returns the status by user ID of this guestbook.
    *
    * @return the status by user ID of this guestbook
    */
    @Override
    public long getStatusByUserId() {
        return _guestbook.getStatusByUserId();
    }

    /**
    * Sets the status by user ID of this guestbook.
    *
    * @param statusByUserId the status by user ID of this guestbook
    */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        _guestbook.setStatusByUserId(statusByUserId);
    }

    /**
    * Returns the status by user uuid of this guestbook.
    *
    * @return the status by user uuid of this guestbook
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getStatusByUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _guestbook.getStatusByUserUuid();
    }

    /**
    * Sets the status by user uuid of this guestbook.
    *
    * @param statusByUserUuid the status by user uuid of this guestbook
    */
    @Override
    public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
        _guestbook.setStatusByUserUuid(statusByUserUuid);
    }

    /**
    * Returns the status by user name of this guestbook.
    *
    * @return the status by user name of this guestbook
    */
    @Override
    public java.lang.String getStatusByUserName() {
        return _guestbook.getStatusByUserName();
    }

    /**
    * Sets the status by user name of this guestbook.
    *
    * @param statusByUserName the status by user name of this guestbook
    */
    @Override
    public void setStatusByUserName(java.lang.String statusByUserName) {
        _guestbook.setStatusByUserName(statusByUserName);
    }

    /**
    * Returns the status date of this guestbook.
    *
    * @return the status date of this guestbook
    */
    @Override
    public java.util.Date getStatusDate() {
        return _guestbook.getStatusDate();
    }

    /**
    * Sets the status date of this guestbook.
    *
    * @param statusDate the status date of this guestbook
    */
    @Override
    public void setStatusDate(java.util.Date statusDate) {
        _guestbook.setStatusDate(statusDate);
    }

    /**
    * Returns the name of this guestbook.
    *
    * @return the name of this guestbook
    */
    @Override
    public java.lang.String getName() {
        return _guestbook.getName();
    }

    /**
    * Sets the name of this guestbook.
    *
    * @param name the name of this guestbook
    */
    @Override
    public void setName(java.lang.String name) {
        _guestbook.setName(name);
    }

    /**
    * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
    */
    @Override
    public boolean getApproved() {
        return _guestbook.getApproved();
    }

    /**
    * Returns <code>true</code> if this guestbook is approved.
    *
    * @return <code>true</code> if this guestbook is approved; <code>false</code> otherwise
    */
    @Override
    public boolean isApproved() {
        return _guestbook.isApproved();
    }

    /**
    * Returns <code>true</code> if this guestbook is denied.
    *
    * @return <code>true</code> if this guestbook is denied; <code>false</code> otherwise
    */
    @Override
    public boolean isDenied() {
        return _guestbook.isDenied();
    }

    /**
    * Returns <code>true</code> if this guestbook is a draft.
    *
    * @return <code>true</code> if this guestbook is a draft; <code>false</code> otherwise
    */
    @Override
    public boolean isDraft() {
        return _guestbook.isDraft();
    }

    /**
    * Returns <code>true</code> if this guestbook is expired.
    *
    * @return <code>true</code> if this guestbook is expired; <code>false</code> otherwise
    */
    @Override
    public boolean isExpired() {
        return _guestbook.isExpired();
    }

    /**
    * Returns <code>true</code> if this guestbook is inactive.
    *
    * @return <code>true</code> if this guestbook is inactive; <code>false</code> otherwise
    */
    @Override
    public boolean isInactive() {
        return _guestbook.isInactive();
    }

    /**
    * Returns <code>true</code> if this guestbook is incomplete.
    *
    * @return <code>true</code> if this guestbook is incomplete; <code>false</code> otherwise
    */
    @Override
    public boolean isIncomplete() {
        return _guestbook.isIncomplete();
    }

    /**
    * Returns <code>true</code> if this guestbook is pending.
    *
    * @return <code>true</code> if this guestbook is pending; <code>false</code> otherwise
    */
    @Override
    public boolean isPending() {
        return _guestbook.isPending();
    }

    /**
    * Returns <code>true</code> if this guestbook is scheduled.
    *
    * @return <code>true</code> if this guestbook is scheduled; <code>false</code> otherwise
    */
    @Override
    public boolean isScheduled() {
        return _guestbook.isScheduled();
    }

    @Override
    public boolean isNew() {
        return _guestbook.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _guestbook.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _guestbook.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _guestbook.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _guestbook.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _guestbook.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _guestbook.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _guestbook.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _guestbook.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _guestbook.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _guestbook.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new GuestbookWrapper((Guestbook) _guestbook.clone());
    }

    @Override
    public int compareTo(com.liferay.docs.guestbook.model.Guestbook guestbook) {
        return _guestbook.compareTo(guestbook);
    }

    @Override
    public int hashCode() {
        return _guestbook.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.docs.guestbook.model.Guestbook> toCacheModel() {
        return _guestbook.toCacheModel();
    }

    @Override
    public com.liferay.docs.guestbook.model.Guestbook toEscapedModel() {
        return new GuestbookWrapper(_guestbook.toEscapedModel());
    }

    @Override
    public com.liferay.docs.guestbook.model.Guestbook toUnescapedModel() {
        return new GuestbookWrapper(_guestbook.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _guestbook.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _guestbook.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _guestbook.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof GuestbookWrapper)) {
            return false;
        }

        GuestbookWrapper guestbookWrapper = (GuestbookWrapper) obj;

        if (Validator.equals(_guestbook, guestbookWrapper._guestbook)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _guestbook.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Guestbook getWrappedGuestbook() {
        return _guestbook;
    }

    @Override
    public Guestbook getWrappedModel() {
        return _guestbook;
    }

    @Override
    public void resetOriginalValues() {
        _guestbook.resetOriginalValues();
    }
}
