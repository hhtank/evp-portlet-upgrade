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

import com.liferay.evp.model.EVPEmployee;
import com.liferay.evp.model.EVPEmployeeModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the EVPEmployee service. Represents a row in the &quot;EVPEmployee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.evp.model.EVPEmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EVPEmployeeImpl}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPEmployeeImpl
 * @see com.liferay.evp.model.EVPEmployee
 * @see com.liferay.evp.model.EVPEmployeeModel
 * @generated
 */
public class EVPEmployeeModelImpl extends BaseModelImpl<EVPEmployee>
	implements EVPEmployeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a e v p employee model instance should use the {@link com.liferay.evp.model.EVPEmployee} interface instead.
	 */
	public static final String TABLE_NAME = "EVPEmployee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "evpEmployeeId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "employeeUserId", Types.BIGINT },
			{ "managerUserId", Types.BIGINT },
			{ "subsidiaryEVPDivisionId", Types.BIGINT },
			{ "employmentType", Types.INTEGER },
			{ "hireDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table EVPEmployee (evpEmployeeId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,employeeUserId LONG,managerUserId LONG,subsidiaryEVPDivisionId LONG,employmentType INTEGER,hireDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table EVPEmployee";
	public static final String ORDER_BY_JPQL = " ORDER BY evpEmployee.evpEmployeeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EVPEmployee.evpEmployeeId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.evp.model.EVPEmployee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.evp.model.EVPEmployee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.evp.model.EVPEmployee"),
			true);
	public static long EMPLOYEEUSERID_COLUMN_BITMASK = 1L;
	public static long EVPEMPLOYEEID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.evp.model.EVPEmployee"));

	public EVPEmployeeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _evpEmployeeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEvpEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _evpEmployeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EVPEmployee.class;
	}

	@Override
	public String getModelClassName() {
		return EVPEmployee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpEmployeeId", getEvpEmployeeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("employeeUserId", getEmployeeUserId());
		attributes.put("managerUserId", getManagerUserId());
		attributes.put("subsidiaryEVPDivisionId", getSubsidiaryEVPDivisionId());
		attributes.put("employmentType", getEmploymentType());
		attributes.put("hireDate", getHireDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpEmployeeId = (Long)attributes.get("evpEmployeeId");

		if (evpEmployeeId != null) {
			setEvpEmployeeId(evpEmployeeId);
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

		Long employeeUserId = (Long)attributes.get("employeeUserId");

		if (employeeUserId != null) {
			setEmployeeUserId(employeeUserId);
		}

		Long managerUserId = (Long)attributes.get("managerUserId");

		if (managerUserId != null) {
			setManagerUserId(managerUserId);
		}

		Long subsidiaryEVPDivisionId = (Long)attributes.get(
				"subsidiaryEVPDivisionId");

		if (subsidiaryEVPDivisionId != null) {
			setSubsidiaryEVPDivisionId(subsidiaryEVPDivisionId);
		}

		Integer employmentType = (Integer)attributes.get("employmentType");

		if (employmentType != null) {
			setEmploymentType(employmentType);
		}

		Date hireDate = (Date)attributes.get("hireDate");

		if (hireDate != null) {
			setHireDate(hireDate);
		}
	}

	@Override
	public long getEvpEmployeeId() {
		return _evpEmployeeId;
	}

	@Override
	public void setEvpEmployeeId(long evpEmployeeId) {
		_evpEmployeeId = evpEmployeeId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
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
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
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
	public long getEmployeeUserId() {
		return _employeeUserId;
	}

	@Override
	public void setEmployeeUserId(long employeeUserId) {
		_columnBitmask |= EMPLOYEEUSERID_COLUMN_BITMASK;

		if (!_setOriginalEmployeeUserId) {
			_setOriginalEmployeeUserId = true;

			_originalEmployeeUserId = _employeeUserId;
		}

		_employeeUserId = employeeUserId;
	}

	@Override
	public String getEmployeeUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getEmployeeUserId(), "uuid",
			_employeeUserUuid);
	}

	@Override
	public void setEmployeeUserUuid(String employeeUserUuid) {
		_employeeUserUuid = employeeUserUuid;
	}

	public long getOriginalEmployeeUserId() {
		return _originalEmployeeUserId;
	}

	@Override
	public long getManagerUserId() {
		return _managerUserId;
	}

	@Override
	public void setManagerUserId(long managerUserId) {
		_managerUserId = managerUserId;
	}

	@Override
	public String getManagerUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getManagerUserId(), "uuid",
			_managerUserUuid);
	}

	@Override
	public void setManagerUserUuid(String managerUserUuid) {
		_managerUserUuid = managerUserUuid;
	}

	@Override
	public long getSubsidiaryEVPDivisionId() {
		return _subsidiaryEVPDivisionId;
	}

	@Override
	public void setSubsidiaryEVPDivisionId(long subsidiaryEVPDivisionId) {
		_subsidiaryEVPDivisionId = subsidiaryEVPDivisionId;
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
	public Date getHireDate() {
		return _hireDate;
	}

	@Override
	public void setHireDate(Date hireDate) {
		_hireDate = hireDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EVPEmployee.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EVPEmployee toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EVPEmployee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EVPEmployeeImpl evpEmployeeImpl = new EVPEmployeeImpl();

		evpEmployeeImpl.setEvpEmployeeId(getEvpEmployeeId());
		evpEmployeeImpl.setCompanyId(getCompanyId());
		evpEmployeeImpl.setUserId(getUserId());
		evpEmployeeImpl.setUserName(getUserName());
		evpEmployeeImpl.setCreateDate(getCreateDate());
		evpEmployeeImpl.setModifiedDate(getModifiedDate());
		evpEmployeeImpl.setEmployeeUserId(getEmployeeUserId());
		evpEmployeeImpl.setManagerUserId(getManagerUserId());
		evpEmployeeImpl.setSubsidiaryEVPDivisionId(getSubsidiaryEVPDivisionId());
		evpEmployeeImpl.setEmploymentType(getEmploymentType());
		evpEmployeeImpl.setHireDate(getHireDate());

		evpEmployeeImpl.resetOriginalValues();

		return evpEmployeeImpl;
	}

	@Override
	public int compareTo(EVPEmployee evpEmployee) {
		long primaryKey = evpEmployee.getPrimaryKey();

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

		if (!(obj instanceof EVPEmployee)) {
			return false;
		}

		EVPEmployee evpEmployee = (EVPEmployee)obj;

		long primaryKey = evpEmployee.getPrimaryKey();

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
		EVPEmployeeModelImpl evpEmployeeModelImpl = this;

		evpEmployeeModelImpl._originalEmployeeUserId = evpEmployeeModelImpl._employeeUserId;

		evpEmployeeModelImpl._setOriginalEmployeeUserId = false;

		evpEmployeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EVPEmployee> toCacheModel() {
		EVPEmployeeCacheModel evpEmployeeCacheModel = new EVPEmployeeCacheModel();

		evpEmployeeCacheModel.evpEmployeeId = getEvpEmployeeId();

		evpEmployeeCacheModel.companyId = getCompanyId();

		evpEmployeeCacheModel.userId = getUserId();

		evpEmployeeCacheModel.userName = getUserName();

		String userName = evpEmployeeCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			evpEmployeeCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			evpEmployeeCacheModel.createDate = createDate.getTime();
		}
		else {
			evpEmployeeCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			evpEmployeeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			evpEmployeeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		evpEmployeeCacheModel.employeeUserId = getEmployeeUserId();

		evpEmployeeCacheModel.managerUserId = getManagerUserId();

		evpEmployeeCacheModel.subsidiaryEVPDivisionId = getSubsidiaryEVPDivisionId();

		evpEmployeeCacheModel.employmentType = getEmploymentType();

		Date hireDate = getHireDate();

		if (hireDate != null) {
			evpEmployeeCacheModel.hireDate = hireDate.getTime();
		}
		else {
			evpEmployeeCacheModel.hireDate = Long.MIN_VALUE;
		}

		return evpEmployeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{evpEmployeeId=");
		sb.append(getEvpEmployeeId());
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
		sb.append(", employeeUserId=");
		sb.append(getEmployeeUserId());
		sb.append(", managerUserId=");
		sb.append(getManagerUserId());
		sb.append(", subsidiaryEVPDivisionId=");
		sb.append(getSubsidiaryEVPDivisionId());
		sb.append(", employmentType=");
		sb.append(getEmploymentType());
		sb.append(", hireDate=");
		sb.append(getHireDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.evp.model.EVPEmployee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evpEmployeeId</column-name><column-value><![CDATA[");
		sb.append(getEvpEmployeeId());
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
			"<column><column-name>employeeUserId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>managerUserId</column-name><column-value><![CDATA[");
		sb.append(getManagerUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subsidiaryEVPDivisionId</column-name><column-value><![CDATA[");
		sb.append(getSubsidiaryEVPDivisionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employmentType</column-name><column-value><![CDATA[");
		sb.append(getEmploymentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hireDate</column-name><column-value><![CDATA[");
		sb.append(getHireDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EVPEmployee.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EVPEmployee.class
		};
	private long _evpEmployeeId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _employeeUserId;
	private String _employeeUserUuid;
	private long _originalEmployeeUserId;
	private boolean _setOriginalEmployeeUserId;
	private long _managerUserId;
	private String _managerUserUuid;
	private long _subsidiaryEVPDivisionId;
	private int _employmentType;
	private Date _hireDate;
	private long _columnBitmask;
	private EVPEmployee _escapedModel;
}