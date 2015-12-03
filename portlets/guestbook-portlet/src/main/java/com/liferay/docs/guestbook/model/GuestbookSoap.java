package com.liferay.docs.guestbook.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.guestbook.service.http.GuestbookServiceSoap}.
 *
 * @author Diogo Peixoto
 * @see com.liferay.docs.guestbook.service.http.GuestbookServiceSoap
 * @generated
 */
public class GuestbookSoap implements Serializable {
    private String _uuid;
    private long _guestbookId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;

    public GuestbookSoap() {
    }

    public static GuestbookSoap toSoapModel(Guestbook model) {
        GuestbookSoap soapModel = new GuestbookSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setGuestbookId(model.getGuestbookId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static GuestbookSoap[] toSoapModels(Guestbook[] models) {
        GuestbookSoap[] soapModels = new GuestbookSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static GuestbookSoap[][] toSoapModels(Guestbook[][] models) {
        GuestbookSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new GuestbookSoap[models.length][models[0].length];
        } else {
            soapModels = new GuestbookSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static GuestbookSoap[] toSoapModels(List<Guestbook> models) {
        List<GuestbookSoap> soapModels = new ArrayList<GuestbookSoap>(models.size());

        for (Guestbook model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new GuestbookSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _guestbookId;
    }

    public void setPrimaryKey(long pk) {
        setGuestbookId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getGuestbookId() {
        return _guestbookId;
    }

    public void setGuestbookId(long guestbookId) {
        _guestbookId = guestbookId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
