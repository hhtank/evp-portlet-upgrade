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

import com.liferay.evp.model.EVPRequestOrganization;
import com.liferay.evp.service.EVPRequestOrganizationLocalService;
import com.liferay.evp.service.persistence.EVPDivisionPersistence;
import com.liferay.evp.service.persistence.EVPEmployeePersistence;
import com.liferay.evp.service.persistence.EVPGrantRequestPersistence;
import com.liferay.evp.service.persistence.EVPGrantTransactionPersistence;
import com.liferay.evp.service.persistence.EVPKaleoForkInstancePersistence;
import com.liferay.evp.service.persistence.EVPRequestOrganizationPersistence;
import com.liferay.evp.service.persistence.EVPServiceRequestPersistence;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the evp request organization local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.evp.service.impl.EVPRequestOrganizationLocalServiceImpl}.
 * </p>
 *
 * @author Val Nagy
 * @see com.liferay.evp.service.impl.EVPRequestOrganizationLocalServiceImpl
 * @generated
 */
public abstract class EVPRequestOrganizationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, EVPRequestOrganizationLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EVPRequestOrganizationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.evp.service.EVPRequestOrganizationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the evp request organization to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganization the evp request organization
	 * @return the evp request organization that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EVPRequestOrganization addEVPRequestOrganization(
		EVPRequestOrganization evpRequestOrganization) {

		evpRequestOrganization.setNew(true);

		return evpRequestOrganizationPersistence.update(evpRequestOrganization);
	}

	/**
	 * Creates a new evp request organization with the primary key. Does not add the evp request organization to the database.
	 *
	 * @param evpRequestOrganizationId the primary key for the new evp request organization
	 * @return the new evp request organization
	 */
	@Override
	@Transactional(enabled = false)
	public EVPRequestOrganization createEVPRequestOrganization(
		long evpRequestOrganizationId) {

		return evpRequestOrganizationPersistence.create(
			evpRequestOrganizationId);
	}

	/**
	 * Deletes the evp request organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization that was removed
	 * @throws PortalException if a evp request organization with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EVPRequestOrganization deleteEVPRequestOrganization(
			long evpRequestOrganizationId)
		throws PortalException {

		return evpRequestOrganizationPersistence.remove(
			evpRequestOrganizationId);
	}

	/**
	 * Deletes the evp request organization from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganization the evp request organization
	 * @return the evp request organization that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EVPRequestOrganization deleteEVPRequestOrganization(
		EVPRequestOrganization evpRequestOrganization) {

		return evpRequestOrganizationPersistence.remove(evpRequestOrganization);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			EVPRequestOrganization.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return evpRequestOrganizationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return evpRequestOrganizationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return evpRequestOrganizationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return evpRequestOrganizationPersistence.countWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return evpRequestOrganizationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public EVPRequestOrganization fetchEVPRequestOrganization(
		long evpRequestOrganizationId) {

		return evpRequestOrganizationPersistence.fetchByPrimaryKey(
			evpRequestOrganizationId);
	}

	/**
	 * Returns the evp request organization with the primary key.
	 *
	 * @param evpRequestOrganizationId the primary key of the evp request organization
	 * @return the evp request organization
	 * @throws PortalException if a evp request organization with the primary key could not be found
	 */
	@Override
	public EVPRequestOrganization getEVPRequestOrganization(
			long evpRequestOrganizationId)
		throws PortalException {

		return evpRequestOrganizationPersistence.findByPrimaryKey(
			evpRequestOrganizationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			evpRequestOrganizationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EVPRequestOrganization.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"evpRequestOrganizationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			evpRequestOrganizationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			EVPRequestOrganization.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"evpRequestOrganizationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			evpRequestOrganizationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EVPRequestOrganization.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"evpRequestOrganizationId");
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return evpRequestOrganizationPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return evpRequestOrganizationLocalService.deleteEVPRequestOrganization(
			(EVPRequestOrganization)persistedModel);
	}

	public BasePersistence<EVPRequestOrganization> getBasePersistence() {
		return evpRequestOrganizationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return evpRequestOrganizationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the evp request organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.evp.model.impl.EVPRequestOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of evp request organizations
	 * @param end the upper bound of the range of evp request organizations (not inclusive)
	 * @return the range of evp request organizations
	 */
	@Override
	public List<EVPRequestOrganization> getEVPRequestOrganizations(
		int start, int end) {

		return evpRequestOrganizationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of evp request organizations.
	 *
	 * @return the number of evp request organizations
	 */
	@Override
	public int getEVPRequestOrganizationsCount() {
		return evpRequestOrganizationPersistence.countAll();
	}

	/**
	 * Updates the evp request organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EVPRequestOrganizationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param evpRequestOrganization the evp request organization
	 * @return the evp request organization that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EVPRequestOrganization updateEVPRequestOrganization(
		EVPRequestOrganization evpRequestOrganization) {

		return evpRequestOrganizationPersistence.update(evpRequestOrganization);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			EVPRequestOrganizationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		evpRequestOrganizationLocalService =
			(EVPRequestOrganizationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EVPRequestOrganizationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return EVPRequestOrganization.class;
	}

	protected String getModelClassName() {
		return EVPRequestOrganization.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				evpRequestOrganizationPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected EVPDivisionPersistence evpDivisionPersistence;

	@Reference
	protected EVPEmployeePersistence evpEmployeePersistence;

	@Reference
	protected EVPGrantRequestPersistence evpGrantRequestPersistence;

	@Reference
	protected EVPGrantTransactionPersistence evpGrantTransactionPersistence;

	@Reference
	protected EVPKaleoForkInstancePersistence evpKaleoForkInstancePersistence;

	protected EVPRequestOrganizationLocalService
		evpRequestOrganizationLocalService;

	@Reference
	protected EVPRequestOrganizationPersistence
		evpRequestOrganizationPersistence;

	@Reference
	protected EVPServiceRequestPersistence evpServiceRequestPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}