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

package com.liferay.evp.service.base;

import com.liferay.evp.model.EVPServiceRequest;
import com.liferay.evp.service.EVPServiceRequestLocalService;
import com.liferay.evp.service.persistence.EVPDivisionPersistence;
import com.liferay.evp.service.persistence.EVPEmployeePersistence;
import com.liferay.evp.service.persistence.EVPGrantRequestPersistence;
import com.liferay.evp.service.persistence.EVPGrantTransactionPersistence;
import com.liferay.evp.service.persistence.EVPKaleoForkInstancePersistence;
import com.liferay.evp.service.persistence.EVPRequestOrganizationPersistence;
import com.liferay.evp.service.persistence.EVPServiceRequestPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the e v p service request local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.evp.service.impl.EVPServiceRequestLocalServiceImpl}.
 * </p>
 *
 * @author Val Nagy
 * @see com.liferay.evp.service.impl.EVPServiceRequestLocalServiceImpl
 * @see com.liferay.evp.service.EVPServiceRequestLocalServiceUtil
 * @generated
 */
public abstract class EVPServiceRequestLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements EVPServiceRequestLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.evp.service.EVPServiceRequestLocalServiceUtil} to access the e v p service request local service.
	 */

	/**
	 * Adds the e v p service request to the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpServiceRequest the e v p service request
	 * @return the e v p service request that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EVPServiceRequest addEVPServiceRequest(
		EVPServiceRequest evpServiceRequest) throws SystemException {
		evpServiceRequest.setNew(true);

		return evpServiceRequestPersistence.update(evpServiceRequest);
	}

	/**
	 * Creates a new e v p service request with the primary key. Does not add the e v p service request to the database.
	 *
	 * @param evpServiceRequestId the primary key for the new e v p service request
	 * @return the new e v p service request
	 */
	@Override
	public EVPServiceRequest createEVPServiceRequest(long evpServiceRequestId) {
		return evpServiceRequestPersistence.create(evpServiceRequestId);
	}

	/**
	 * Deletes the e v p service request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpServiceRequestId the primary key of the e v p service request
	 * @return the e v p service request that was removed
	 * @throws PortalException if a e v p service request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EVPServiceRequest deleteEVPServiceRequest(long evpServiceRequestId)
		throws PortalException, SystemException {
		return evpServiceRequestPersistence.remove(evpServiceRequestId);
	}

	/**
	 * Deletes the e v p service request from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evpServiceRequest the e v p service request
	 * @return the e v p service request that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EVPServiceRequest deleteEVPServiceRequest(
		EVPServiceRequest evpServiceRequest) throws SystemException {
		return evpServiceRequestPersistence.remove(evpServiceRequest);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(EVPServiceRequest.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return evpServiceRequestPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.model.impl.EVPServiceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return evpServiceRequestPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.model.impl.EVPServiceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return evpServiceRequestPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return evpServiceRequestPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return evpServiceRequestPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public EVPServiceRequest fetchEVPServiceRequest(long evpServiceRequestId)
		throws SystemException {
		return evpServiceRequestPersistence.fetchByPrimaryKey(evpServiceRequestId);
	}

	/**
	 * Returns the e v p service request with the primary key.
	 *
	 * @param evpServiceRequestId the primary key of the e v p service request
	 * @return the e v p service request
	 * @throws PortalException if a e v p service request with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EVPServiceRequest getEVPServiceRequest(long evpServiceRequestId)
		throws PortalException, SystemException {
		return evpServiceRequestPersistence.findByPrimaryKey(evpServiceRequestId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return evpServiceRequestPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the e v p service requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.model.impl.EVPServiceRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of e v p service requests
	 * @param end the upper bound of the range of e v p service requests (not inclusive)
	 * @return the range of e v p service requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EVPServiceRequest> getEVPServiceRequests(int start, int end)
		throws SystemException {
		return evpServiceRequestPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of e v p service requests.
	 *
	 * @return the number of e v p service requests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getEVPServiceRequestsCount() throws SystemException {
		return evpServiceRequestPersistence.countAll();
	}

	/**
	 * Updates the e v p service request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param evpServiceRequest the e v p service request
	 * @return the e v p service request that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EVPServiceRequest updateEVPServiceRequest(
		EVPServiceRequest evpServiceRequest) throws SystemException {
		return evpServiceRequestPersistence.update(evpServiceRequest);
	}

	/**
	 * Returns the e v p division local service.
	 *
	 * @return the e v p division local service
	 */
	public com.liferay.evp.service.EVPDivisionLocalService getEVPDivisionLocalService() {
		return evpDivisionLocalService;
	}

	/**
	 * Sets the e v p division local service.
	 *
	 * @param evpDivisionLocalService the e v p division local service
	 */
	public void setEVPDivisionLocalService(
		com.liferay.evp.service.EVPDivisionLocalService evpDivisionLocalService) {
		this.evpDivisionLocalService = evpDivisionLocalService;
	}

	/**
	 * Returns the e v p division persistence.
	 *
	 * @return the e v p division persistence
	 */
	public EVPDivisionPersistence getEVPDivisionPersistence() {
		return evpDivisionPersistence;
	}

	/**
	 * Sets the e v p division persistence.
	 *
	 * @param evpDivisionPersistence the e v p division persistence
	 */
	public void setEVPDivisionPersistence(
		EVPDivisionPersistence evpDivisionPersistence) {
		this.evpDivisionPersistence = evpDivisionPersistence;
	}

	/**
	 * Returns the e v p employee local service.
	 *
	 * @return the e v p employee local service
	 */
	public com.liferay.evp.service.EVPEmployeeLocalService getEVPEmployeeLocalService() {
		return evpEmployeeLocalService;
	}

	/**
	 * Sets the e v p employee local service.
	 *
	 * @param evpEmployeeLocalService the e v p employee local service
	 */
	public void setEVPEmployeeLocalService(
		com.liferay.evp.service.EVPEmployeeLocalService evpEmployeeLocalService) {
		this.evpEmployeeLocalService = evpEmployeeLocalService;
	}

	/**
	 * Returns the e v p employee persistence.
	 *
	 * @return the e v p employee persistence
	 */
	public EVPEmployeePersistence getEVPEmployeePersistence() {
		return evpEmployeePersistence;
	}

	/**
	 * Sets the e v p employee persistence.
	 *
	 * @param evpEmployeePersistence the e v p employee persistence
	 */
	public void setEVPEmployeePersistence(
		EVPEmployeePersistence evpEmployeePersistence) {
		this.evpEmployeePersistence = evpEmployeePersistence;
	}

	/**
	 * Returns the e v p grant request local service.
	 *
	 * @return the e v p grant request local service
	 */
	public com.liferay.evp.service.EVPGrantRequestLocalService getEVPGrantRequestLocalService() {
		return evpGrantRequestLocalService;
	}

	/**
	 * Sets the e v p grant request local service.
	 *
	 * @param evpGrantRequestLocalService the e v p grant request local service
	 */
	public void setEVPGrantRequestLocalService(
		com.liferay.evp.service.EVPGrantRequestLocalService evpGrantRequestLocalService) {
		this.evpGrantRequestLocalService = evpGrantRequestLocalService;
	}

	/**
	 * Returns the e v p grant request persistence.
	 *
	 * @return the e v p grant request persistence
	 */
	public EVPGrantRequestPersistence getEVPGrantRequestPersistence() {
		return evpGrantRequestPersistence;
	}

	/**
	 * Sets the e v p grant request persistence.
	 *
	 * @param evpGrantRequestPersistence the e v p grant request persistence
	 */
	public void setEVPGrantRequestPersistence(
		EVPGrantRequestPersistence evpGrantRequestPersistence) {
		this.evpGrantRequestPersistence = evpGrantRequestPersistence;
	}

	/**
	 * Returns the e v p grant transaction local service.
	 *
	 * @return the e v p grant transaction local service
	 */
	public com.liferay.evp.service.EVPGrantTransactionLocalService getEVPGrantTransactionLocalService() {
		return evpGrantTransactionLocalService;
	}

	/**
	 * Sets the e v p grant transaction local service.
	 *
	 * @param evpGrantTransactionLocalService the e v p grant transaction local service
	 */
	public void setEVPGrantTransactionLocalService(
		com.liferay.evp.service.EVPGrantTransactionLocalService evpGrantTransactionLocalService) {
		this.evpGrantTransactionLocalService = evpGrantTransactionLocalService;
	}

	/**
	 * Returns the e v p grant transaction persistence.
	 *
	 * @return the e v p grant transaction persistence
	 */
	public EVPGrantTransactionPersistence getEVPGrantTransactionPersistence() {
		return evpGrantTransactionPersistence;
	}

	/**
	 * Sets the e v p grant transaction persistence.
	 *
	 * @param evpGrantTransactionPersistence the e v p grant transaction persistence
	 */
	public void setEVPGrantTransactionPersistence(
		EVPGrantTransactionPersistence evpGrantTransactionPersistence) {
		this.evpGrantTransactionPersistence = evpGrantTransactionPersistence;
	}

	/**
	 * Returns the e v p kaleo fork instance local service.
	 *
	 * @return the e v p kaleo fork instance local service
	 */
	public com.liferay.evp.service.EVPKaleoForkInstanceLocalService getEVPKaleoForkInstanceLocalService() {
		return evpKaleoForkInstanceLocalService;
	}

	/**
	 * Sets the e v p kaleo fork instance local service.
	 *
	 * @param evpKaleoForkInstanceLocalService the e v p kaleo fork instance local service
	 */
	public void setEVPKaleoForkInstanceLocalService(
		com.liferay.evp.service.EVPKaleoForkInstanceLocalService evpKaleoForkInstanceLocalService) {
		this.evpKaleoForkInstanceLocalService = evpKaleoForkInstanceLocalService;
	}

	/**
	 * Returns the e v p kaleo fork instance persistence.
	 *
	 * @return the e v p kaleo fork instance persistence
	 */
	public EVPKaleoForkInstancePersistence getEVPKaleoForkInstancePersistence() {
		return evpKaleoForkInstancePersistence;
	}

	/**
	 * Sets the e v p kaleo fork instance persistence.
	 *
	 * @param evpKaleoForkInstancePersistence the e v p kaleo fork instance persistence
	 */
	public void setEVPKaleoForkInstancePersistence(
		EVPKaleoForkInstancePersistence evpKaleoForkInstancePersistence) {
		this.evpKaleoForkInstancePersistence = evpKaleoForkInstancePersistence;
	}

	/**
	 * Returns the e v p request organization local service.
	 *
	 * @return the e v p request organization local service
	 */
	public com.liferay.evp.service.EVPRequestOrganizationLocalService getEVPRequestOrganizationLocalService() {
		return evpRequestOrganizationLocalService;
	}

	/**
	 * Sets the e v p request organization local service.
	 *
	 * @param evpRequestOrganizationLocalService the e v p request organization local service
	 */
	public void setEVPRequestOrganizationLocalService(
		com.liferay.evp.service.EVPRequestOrganizationLocalService evpRequestOrganizationLocalService) {
		this.evpRequestOrganizationLocalService = evpRequestOrganizationLocalService;
	}

	/**
	 * Returns the e v p request organization persistence.
	 *
	 * @return the e v p request organization persistence
	 */
	public EVPRequestOrganizationPersistence getEVPRequestOrganizationPersistence() {
		return evpRequestOrganizationPersistence;
	}

	/**
	 * Sets the e v p request organization persistence.
	 *
	 * @param evpRequestOrganizationPersistence the e v p request organization persistence
	 */
	public void setEVPRequestOrganizationPersistence(
		EVPRequestOrganizationPersistence evpRequestOrganizationPersistence) {
		this.evpRequestOrganizationPersistence = evpRequestOrganizationPersistence;
	}

	/**
	 * Returns the e v p service request local service.
	 *
	 * @return the e v p service request local service
	 */
	public com.liferay.evp.service.EVPServiceRequestLocalService getEVPServiceRequestLocalService() {
		return evpServiceRequestLocalService;
	}

	/**
	 * Sets the e v p service request local service.
	 *
	 * @param evpServiceRequestLocalService the e v p service request local service
	 */
	public void setEVPServiceRequestLocalService(
		com.liferay.evp.service.EVPServiceRequestLocalService evpServiceRequestLocalService) {
		this.evpServiceRequestLocalService = evpServiceRequestLocalService;
	}

	/**
	 * Returns the e v p service request persistence.
	 *
	 * @return the e v p service request persistence
	 */
	public EVPServiceRequestPersistence getEVPServiceRequestPersistence() {
		return evpServiceRequestPersistence;
	}

	/**
	 * Sets the e v p service request persistence.
	 *
	 * @param evpServiceRequestPersistence the e v p service request persistence
	 */
	public void setEVPServiceRequestPersistence(
		EVPServiceRequestPersistence evpServiceRequestPersistence) {
		this.evpServiceRequestPersistence = evpServiceRequestPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.liferay.evp.model.EVPServiceRequest",
			evpServiceRequestLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.liferay.evp.model.EVPServiceRequest");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return EVPServiceRequest.class;
	}

	protected String getModelClassName() {
		return EVPServiceRequest.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = evpServiceRequestPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.evp.service.EVPDivisionLocalService.class)
	protected com.liferay.evp.service.EVPDivisionLocalService evpDivisionLocalService;
	@BeanReference(type = EVPDivisionPersistence.class)
	protected EVPDivisionPersistence evpDivisionPersistence;
	@BeanReference(type = com.liferay.evp.service.EVPEmployeeLocalService.class)
	protected com.liferay.evp.service.EVPEmployeeLocalService evpEmployeeLocalService;
	@BeanReference(type = EVPEmployeePersistence.class)
	protected EVPEmployeePersistence evpEmployeePersistence;
	@BeanReference(type = com.liferay.evp.service.EVPGrantRequestLocalService.class)
	protected com.liferay.evp.service.EVPGrantRequestLocalService evpGrantRequestLocalService;
	@BeanReference(type = EVPGrantRequestPersistence.class)
	protected EVPGrantRequestPersistence evpGrantRequestPersistence;
	@BeanReference(type = com.liferay.evp.service.EVPGrantTransactionLocalService.class)
	protected com.liferay.evp.service.EVPGrantTransactionLocalService evpGrantTransactionLocalService;
	@BeanReference(type = EVPGrantTransactionPersistence.class)
	protected EVPGrantTransactionPersistence evpGrantTransactionPersistence;
	@BeanReference(type = com.liferay.evp.service.EVPKaleoForkInstanceLocalService.class)
	protected com.liferay.evp.service.EVPKaleoForkInstanceLocalService evpKaleoForkInstanceLocalService;
	@BeanReference(type = EVPKaleoForkInstancePersistence.class)
	protected EVPKaleoForkInstancePersistence evpKaleoForkInstancePersistence;
	@BeanReference(type = com.liferay.evp.service.EVPRequestOrganizationLocalService.class)
	protected com.liferay.evp.service.EVPRequestOrganizationLocalService evpRequestOrganizationLocalService;
	@BeanReference(type = EVPRequestOrganizationPersistence.class)
	protected EVPRequestOrganizationPersistence evpRequestOrganizationPersistence;
	@BeanReference(type = com.liferay.evp.service.EVPServiceRequestLocalService.class)
	protected com.liferay.evp.service.EVPServiceRequestLocalService evpServiceRequestLocalService;
	@BeanReference(type = EVPServiceRequestPersistence.class)
	protected EVPServiceRequestPersistence evpServiceRequestPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ClassNameLocalService.class)
	protected com.liferay.portal.service.ClassNameLocalService classNameLocalService;
	@BeanReference(type = com.liferay.portal.service.ClassNameService.class)
	protected com.liferay.portal.service.ClassNameService classNameService;
	@BeanReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private EVPServiceRequestLocalServiceClpInvoker _clpInvoker = new EVPServiceRequestLocalServiceClpInvoker();
}
