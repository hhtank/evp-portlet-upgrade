/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.evp.model.impl;

import com.liferay.evp.model.EVPGrantRequest;
import com.liferay.evp.model.EVPGrantRequestModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the EVPGrantRequest service. Represents a row in the &quot;EVPGrantRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.evp.model.EVPGrantRequestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EVPGrantRequestImpl}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPGrantRequestImpl
 * @see com.liferay.evp.model.EVPGrantRequest
 * @see com.liferay.evp.model.EVPGrantRequestModel
 * @generated
 */
public class EVPGrantRequestModelImpl extends BaseModelImpl<EVPGrantRequest>
	implements EVPGrantRequestModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a e v p grant request model instance should use the {@link com.liferay.evp.model.EVPGrantRequest} interface instead.
	 */
	public static final String TABLE_NAME = "EVPGrantRequest";
	public static final Object[][] TABLE_COLUMNS = {
			{ "evpGrantRequestId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "contactEmailAddressId", Types.BIGINT },
			{ "contactPhoneId", Types.BIGINT },
			{ "contactUserId", Types.BIGINT },
			{ "evpRequestOrganizationId", Types.BIGINT },
			{ "parentEVPGrantRequestId", Types.BIGINT },
			{ "requestOrganizationAddressId", Types.BIGINT },
			{ "requestOrganizationWebsiteId", Types.BIGINT },
			{ "subsidiaryGroupId", Types.BIGINT },
			{ "description", Types.VARCHAR },
			{ "employmentType", Types.INTEGER },
			{ "employmentHoursPerWeek", Types.INTEGER },
			{ "purpose", Types.VARCHAR },
			{ "purposeOther", Types.VARCHAR },
			{ "behalfOf", Types.VARCHAR },
			{ "behalfOfOther", Types.VARCHAR },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusByUserName", Types.VARCHAR },
			{ "statusDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table EVPGrantRequest (evpGrantRequestId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(128) null,createDate DATE null,modifiedDate DATE null,contactEmailAddressId LONG,contactPhoneId LONG,contactUserId LONG,evpRequestOrganizationId LONG,parentEVPGrantRequestId LONG,requestOrganizationAddressId LONG,requestOrganizationWebsiteId LONG,subsidiaryGroupId LONG,description STRING null,employmentType INTEGER,employmentHoursPerWeek INTEGER,purpose VARCHAR(128) null,purposeOther VARCHAR(128) null,behalfOf VARCHAR(128) null,behalfOfOther VARCHAR(128) null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(128) null,statusDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table EVPGrantRequest";
	public static final String ORDER_BY_JPQL = " ORDER BY evpGrantRequest.evpGrantRequestId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EVPGrantRequest.evpGrantRequestId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.evp.model.EVPGrantRequest"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.evp.model.EVPGrantRequest"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.evp.model.EVPGrantRequest"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long STATUS_COLUMN_BITMASK = 2L;
	public static long EVPGRANTREQUESTID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.evp.model.EVPGrantRequest"));

	public EVPGrantRequestModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _evpGrantRequestId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEvpGrantRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _evpGrantRequestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EVPGrantRequest.class;
	}

	@Override
	public String getModelClassName() {
		return EVPGrantRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpGrantRequestId", getEvpGrantRequestId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("contactEmailAddressId", getContactEmailAddressId());
		attributes.put("contactPhoneId", getContactPhoneId());
		attributes.put("contactUserId", getContactUserId());
		attributes.put("evpRequestOrganizationId", getEvpRequestOrganizationId());
		attributes.put("parentEVPGrantRequestId", getParentEVPGrantRequestId());
		attributes.put("requestOrganizationAddressId",
			getRequestOrganizationAddressId());
		attributes.put("requestOrganizationWebsiteId",
			getRequestOrganizationWebsiteId());
		attributes.put("subsidiaryGroupId", getSubsidiaryGroupId());
		attributes.put("description", getDescription());
		attributes.put("employmentType", getEmploymentType());
		attributes.put("employmentHoursPerWeek", getEmploymentHoursPerWeek());
		attributes.put("purpose", getPurpose());
		attributes.put("purposeOther", getPurposeOther());
		attributes.put("behalfOf", getBehalfOf());
		attributes.put("behalfOfOther", getBehalfOfOther());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpGrantRequestId = (Long)attributes.get("evpGrantRequestId");

		if (evpGrantRequestId != null) {
			setEvpGrantRequestId(evpGrantRequestId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long contactEmailAddressId = (Long)attributes.get(
				"contactEmailAddressId");

		if (contactEmailAddressId != null) {
			setContactEmailAddressId(contactEmailAddressId);
		}

		Long contactPhoneId = (Long)attributes.get("contactPhoneId");

		if (contactPhoneId != null) {
			setContactPhoneId(contactPhoneId);
		}

		Long contactUserId = (Long)attributes.get("contactUserId");

		if (contactUserId != null) {
			setContactUserId(contactUserId);
		}

		Long evpRequestOrganizationId = (Long)attributes.get(
				"evpRequestOrganizationId");

		if (evpRequestOrganizationId != null) {
			setEvpRequestOrganizationId(evpRequestOrganizationId);
		}

		Long parentEVPGrantRequestId = (Long)attributes.get(
				"parentEVPGrantRequestId");

		if (parentEVPGrantRequestId != null) {
			setParentEVPGrantRequestId(parentEVPGrantRequestId);
		}

		Long requestOrganizationAddressId = (Long)attributes.get(
				"requestOrganizationAddressId");

		if (requestOrganizationAddressId != null) {
			setRequestOrganizationAddressId(requestOrganizationAddressId);
		}

		Long requestOrganizationWebsiteId = (Long)attributes.get(
				"requestOrganizationWebsiteId");

		if (requestOrganizationWebsiteId != null) {
			setRequestOrganizationWebsiteId(requestOrganizationWebsiteId);
		}

		Long subsidiaryGroupId = (Long)attributes.get("subsidiaryGroupId");

		if (subsidiaryGroupId != null) {
			setSubsidiaryGroupId(subsidiaryGroupId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer employmentType = (Integer)attributes.get("employmentType");

		if (employmentType != null) {
			setEmploymentType(employmentType);
		}

		Integer employmentHoursPerWeek = (Integer)attributes.get(
				"employmentHoursPerWeek");

		if (employmentHoursPerWeek != null) {
			setEmploymentHoursPerWeek(employmentHoursPerWeek);
		}

		String purpose = (String)attributes.get("purpose");

		if (purpose != null) {
			setPurpose(purpose);
		}

		String purposeOther = (String)attributes.get("purposeOther");

		if (purposeOther != null) {
			setPurposeOther(purposeOther);
		}

		String behalfOf = (String)attributes.get("behalfOf");

		if (behalfOf != null) {
			setBehalfOf(behalfOf);
		}

		String behalfOfOther = (String)attributes.get("behalfOfOther");

		if (behalfOfOther != null) {
			setBehalfOfOther(behalfOfOther);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public long getEvpGrantRequestId() {
		return _evpGrantRequestId;
	}

	@Override
	public void setEvpGrantRequestId(long evpGrantRequestId) {
		_evpGrantRequestId = evpGrantRequestId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid); // FIXME: @deprecated As of Wilberforce (7.0.x), with no direct replacement
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getContactEmailAddressId() {
		return _contactEmailAddressId;
	}

	@Override
	public void setContactEmailAddressId(long contactEmailAddressId) {
		_contactEmailAddressId = contactEmailAddressId;
	}

	@Override
	public long getContactPhoneId() {
		return _contactPhoneId;
	}

	@Override
	public void setContactPhoneId(long contactPhoneId) {
		_contactPhoneId = contactPhoneId;
	}

	@Override
	public long getContactUserId() {
		return _contactUserId;
	}

	@Override
	public void setContactUserId(long contactUserId) {
		_contactUserId = contactUserId;
	}

	@Override
	public String getContactUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getContactUserId(), "uuid", // FIXME: @deprecated As of Wilberforce (7.0.x), with no direct replacement
			_contactUserUuid);
	}

	@Override
	public void setContactUserUuid(String contactUserUuid) {
		_contactUserUuid = contactUserUuid;
	}

	@Override
	public long getEvpRequestOrganizationId() {
		return _evpRequestOrganizationId;
	}

	@Override
	public void setEvpRequestOrganizationId(long evpRequestOrganizationId) {
		_evpRequestOrganizationId = evpRequestOrganizationId;
	}

	@Override
	public long getParentEVPGrantRequestId() {
		return _parentEVPGrantRequestId;
	}

	@Override
	public void setParentEVPGrantRequestId(long parentEVPGrantRequestId) {
		_parentEVPGrantRequestId = parentEVPGrantRequestId;
	}

	@Override
	public long getRequestOrganizationAddressId() {
		return _requestOrganizationAddressId;
	}

	@Override
	public void setRequestOrganizationAddressId(
		long requestOrganizationAddressId) {
		_requestOrganizationAddressId = requestOrganizationAddressId;
	}

	@Override
	public long getRequestOrganizationWebsiteId() {
		return _requestOrganizationWebsiteId;
	}

	@Override
	public void setRequestOrganizationWebsiteId(
		long requestOrganizationWebsiteId) {
		_requestOrganizationWebsiteId = requestOrganizationWebsiteId;
	}

	@Override
	public long getSubsidiaryGroupId() {
		return _subsidiaryGroupId;
	}

	@Override
	public void setSubsidiaryGroupId(long subsidiaryGroupId) {
		_subsidiaryGroupId = subsidiaryGroupId;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public int getEmploymentType() {
		return _employmentType;
	}

	@Override
	public void setEmploymentType(int employmentType) {
		_employmentType = employmentType;
	}

	@Override
	public int getEmploymentHoursPerWeek() {
		return _employmentHoursPerWeek;
	}

	@Override
	public void setEmploymentHoursPerWeek(int employmentHoursPerWeek) {
		_employmentHoursPerWeek = employmentHoursPerWeek;
	}

	@Override
	public String getPurpose() {
		if (_purpose == null) {
			return StringPool.BLANK;
		}
		else {
			return _purpose;
		}
	}

	@Override
	public void setPurpose(String purpose) {
		_purpose = purpose;
	}

	@Override
	public String getPurposeOther() {
		if (_purposeOther == null) {
			return StringPool.BLANK;
		}
		else {
			return _purposeOther;
		}
	}

	@Override
	public void setPurposeOther(String purposeOther) {
		_purposeOther = purposeOther;
	}

	@Override
	public String getBehalfOf() {
		if (_behalfOf == null) {
			return StringPool.BLANK;
		}
		else {
			return _behalfOf;
		}
	}

	@Override
	public void setBehalfOf(String behalfOf) {
		_behalfOf = behalfOf;
	}

	@Override
	public String getBehalfOfOther() {
		if (_behalfOfOther == null) {
			return StringPool.BLANK;
		}
		else {
			return _behalfOfOther;
		}
	}

	@Override
	public void setBehalfOfOther(String behalfOfOther) {
		_behalfOfOther = behalfOfOther;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid", // FIXME: @deprecated As of Wilberforce (7.0.x), with no direct replacement
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved}
	 */
	@Override
	public boolean getApproved() {
		return isApproved();
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EVPGrantRequest.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EVPGrantRequest toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EVPGrantRequest)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EVPGrantRequestImpl evpGrantRequestImpl = new EVPGrantRequestImpl();

		evpGrantRequestImpl.setEvpGrantRequestId(getEvpGrantRequestId());
		evpGrantRequestImpl.setCompanyId(getCompanyId());
		evpGrantRequestImpl.setUserId(getUserId());
		evpGrantRequestImpl.setUserName(getUserName());
		evpGrantRequestImpl.setCreateDate(getCreateDate());
		evpGrantRequestImpl.setModifiedDate(getModifiedDate());
		evpGrantRequestImpl.setContactEmailAddressId(getContactEmailAddressId());
		evpGrantRequestImpl.setContactPhoneId(getContactPhoneId());
		evpGrantRequestImpl.setContactUserId(getContactUserId());
		evpGrantRequestImpl.setEvpRequestOrganizationId(getEvpRequestOrganizationId());
		evpGrantRequestImpl.setParentEVPGrantRequestId(getParentEVPGrantRequestId());
		evpGrantRequestImpl.setRequestOrganizationAddressId(getRequestOrganizationAddressId());
		evpGrantRequestImpl.setRequestOrganizationWebsiteId(getRequestOrganizationWebsiteId());
		evpGrantRequestImpl.setSubsidiaryGroupId(getSubsidiaryGroupId());
		evpGrantRequestImpl.setDescription(getDescription());
		evpGrantRequestImpl.setEmploymentType(getEmploymentType());
		evpGrantRequestImpl.setEmploymentHoursPerWeek(getEmploymentHoursPerWeek());
		evpGrantRequestImpl.setPurpose(getPurpose());
		evpGrantRequestImpl.setPurposeOther(getPurposeOther());
		evpGrantRequestImpl.setBehalfOf(getBehalfOf());
		evpGrantRequestImpl.setBehalfOfOther(getBehalfOfOther());
		evpGrantRequestImpl.setStatus(getStatus());
		evpGrantRequestImpl.setStatusByUserId(getStatusByUserId());
		evpGrantRequestImpl.setStatusByUserName(getStatusByUserName());
		evpGrantRequestImpl.setStatusDate(getStatusDate());

		evpGrantRequestImpl.resetOriginalValues();

		return evpGrantRequestImpl;
	}

	@Override
	public int compareTo(EVPGrantRequest evpGrantRequest) {
		long primaryKey = evpGrantRequest.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EVPGrantRequest)) {
			return false;
		}

		EVPGrantRequest evpGrantRequest = (EVPGrantRequest)obj;

		long primaryKey = evpGrantRequest.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		EVPGrantRequestModelImpl evpGrantRequestModelImpl = this;

		evpGrantRequestModelImpl._originalCompanyId = evpGrantRequestModelImpl._companyId;

		evpGrantRequestModelImpl._setOriginalCompanyId = false;

		evpGrantRequestModelImpl._originalStatus = evpGrantRequestModelImpl._status;

		evpGrantRequestModelImpl._setOriginalStatus = false;

		evpGrantRequestModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EVPGrantRequest> toCacheModel() {
		EVPGrantRequestCacheModel evpGrantRequestCacheModel = new EVPGrantRequestCacheModel();

		evpGrantRequestCacheModel.evpGrantRequestId = getEvpGrantRequestId();

		evpGrantRequestCacheModel.companyId = getCompanyId();

		evpGrantRequestCacheModel.userId = getUserId();

		evpGrantRequestCacheModel.userName = getUserName();

		String userName = evpGrantRequestCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			evpGrantRequestCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			evpGrantRequestCacheModel.createDate = createDate.getTime();
		}
		else {
			evpGrantRequestCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			evpGrantRequestCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			evpGrantRequestCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		evpGrantRequestCacheModel.contactEmailAddressId = getContactEmailAddressId();

		evpGrantRequestCacheModel.contactPhoneId = getContactPhoneId();

		evpGrantRequestCacheModel.contactUserId = getContactUserId();

		evpGrantRequestCacheModel.evpRequestOrganizationId = getEvpRequestOrganizationId();

		evpGrantRequestCacheModel.parentEVPGrantRequestId = getParentEVPGrantRequestId();

		evpGrantRequestCacheModel.requestOrganizationAddressId = getRequestOrganizationAddressId();

		evpGrantRequestCacheModel.requestOrganizationWebsiteId = getRequestOrganizationWebsiteId();

		evpGrantRequestCacheModel.subsidiaryGroupId = getSubsidiaryGroupId();

		evpGrantRequestCacheModel.description = getDescription();

		String description = evpGrantRequestCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			evpGrantRequestCacheModel.description = null;
		}

		evpGrantRequestCacheModel.employmentType = getEmploymentType();

		evpGrantRequestCacheModel.employmentHoursPerWeek = getEmploymentHoursPerWeek();

		evpGrantRequestCacheModel.purpose = getPurpose();

		String purpose = evpGrantRequestCacheModel.purpose;

		if ((purpose != null) && (purpose.length() == 0)) {
			evpGrantRequestCacheModel.purpose = null;
		}

		evpGrantRequestCacheModel.purposeOther = getPurposeOther();

		String purposeOther = evpGrantRequestCacheModel.purposeOther;

		if ((purposeOther != null) && (purposeOther.length() == 0)) {
			evpGrantRequestCacheModel.purposeOther = null;
		}

		evpGrantRequestCacheModel.behalfOf = getBehalfOf();

		String behalfOf = evpGrantRequestCacheModel.behalfOf;

		if ((behalfOf != null) && (behalfOf.length() == 0)) {
			evpGrantRequestCacheModel.behalfOf = null;
		}

		evpGrantRequestCacheModel.behalfOfOther = getBehalfOfOther();

		String behalfOfOther = evpGrantRequestCacheModel.behalfOfOther;

		if ((behalfOfOther != null) && (behalfOfOther.length() == 0)) {
			evpGrantRequestCacheModel.behalfOfOther = null;
		}

		evpGrantRequestCacheModel.status = getStatus();

		evpGrantRequestCacheModel.statusByUserId = getStatusByUserId();

		evpGrantRequestCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = evpGrantRequestCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			evpGrantRequestCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			evpGrantRequestCacheModel.statusDate = statusDate.getTime();
		}
		else {
			evpGrantRequestCacheModel.statusDate = Long.MIN_VALUE;
		}

		return evpGrantRequestCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{evpGrantRequestId=");
		sb.append(getEvpGrantRequestId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", contactEmailAddressId=");
		sb.append(getContactEmailAddressId());
		sb.append(", contactPhoneId=");
		sb.append(getContactPhoneId());
		sb.append(", contactUserId=");
		sb.append(getContactUserId());
		sb.append(", evpRequestOrganizationId=");
		sb.append(getEvpRequestOrganizationId());
		sb.append(", parentEVPGrantRequestId=");
		sb.append(getParentEVPGrantRequestId());
		sb.append(", requestOrganizationAddressId=");
		sb.append(getRequestOrganizationAddressId());
		sb.append(", requestOrganizationWebsiteId=");
		sb.append(getRequestOrganizationWebsiteId());
		sb.append(", subsidiaryGroupId=");
		sb.append(getSubsidiaryGroupId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", employmentType=");
		sb.append(getEmploymentType());
		sb.append(", employmentHoursPerWeek=");
		sb.append(getEmploymentHoursPerWeek());
		sb.append(", purpose=");
		sb.append(getPurpose());
		sb.append(", purposeOther=");
		sb.append(getPurposeOther());
		sb.append(", behalfOf=");
		sb.append(getBehalfOf());
		sb.append(", behalfOfOther=");
		sb.append(getBehalfOfOther());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("com.liferay.evp.model.EVPGrantRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evpGrantRequestId</column-name><column-value><![CDATA[");
		sb.append(getEvpGrantRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactEmailAddressId</column-name><column-value><![CDATA[");
		sb.append(getContactEmailAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhoneId</column-name><column-value><![CDATA[");
		sb.append(getContactPhoneId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactUserId</column-name><column-value><![CDATA[");
		sb.append(getContactUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evpRequestOrganizationId</column-name><column-value><![CDATA[");
		sb.append(getEvpRequestOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentEVPGrantRequestId</column-name><column-value><![CDATA[");
		sb.append(getParentEVPGrantRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestOrganizationAddressId</column-name><column-value><![CDATA[");
		sb.append(getRequestOrganizationAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestOrganizationWebsiteId</column-name><column-value><![CDATA[");
		sb.append(getRequestOrganizationWebsiteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subsidiaryGroupId</column-name><column-value><![CDATA[");
		sb.append(getSubsidiaryGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employmentType</column-name><column-value><![CDATA[");
		sb.append(getEmploymentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employmentHoursPerWeek</column-name><column-value><![CDATA[");
		sb.append(getEmploymentHoursPerWeek());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purpose</column-name><column-value><![CDATA[");
		sb.append(getPurpose());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeOther</column-name><column-value><![CDATA[");
		sb.append(getPurposeOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>behalfOf</column-name><column-value><![CDATA[");
		sb.append(getBehalfOf());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>behalfOfOther</column-name><column-value><![CDATA[");
		sb.append(getBehalfOfOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EVPGrantRequest.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EVPGrantRequest.class
		};
	private long _evpGrantRequestId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _contactEmailAddressId;
	private long _contactPhoneId;
	private long _contactUserId;
	private String _contactUserUuid;
	private long _evpRequestOrganizationId;
	private long _parentEVPGrantRequestId;
	private long _requestOrganizationAddressId;
	private long _requestOrganizationWebsiteId;
	private long _subsidiaryGroupId;
	private String _description;
	private int _employmentType;
	private int _employmentHoursPerWeek;
	private String _purpose;
	private String _purposeOther;
	private String _behalfOf;
	private String _behalfOfOther;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private String _statusByUserName;
	private Date _statusDate;
	private long _columnBitmask;
	private EVPGrantRequest _escapedModel;
}