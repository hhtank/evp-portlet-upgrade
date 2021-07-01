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

package com.liferay.evp.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for EVPGrantTransaction. This utility wraps
 * {@link com.liferay.evp.service.impl.EVPGrantTransactionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Val Nagy
 * @see EVPGrantTransactionLocalService
 * @see com.liferay.evp.service.base.EVPGrantTransactionLocalServiceBaseImpl
 * @see com.liferay.evp.service.impl.EVPGrantTransactionLocalServiceImpl
 * @generated
 */
public class EVPGrantTransactionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.evp.service.impl.EVPGrantTransactionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the e v p grant transaction to the database. Also notifies the appropriate model listeners.
	*
	* @param evpGrantTransaction the e v p grant transaction
	* @return the e v p grant transaction that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.evp.model.EVPGrantTransaction addEVPGrantTransaction(
		com.liferay.evp.model.EVPGrantTransaction evpGrantTransaction)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEVPGrantTransaction(evpGrantTransaction);
	}

	/**
	* Creates a new e v p grant transaction with the primary key. Does not add the e v p grant transaction to the database.
	*
	* @param evpGrantTransactionId the primary key for the new e v p grant transaction
	* @return the new e v p grant transaction
	*/
	public static com.liferay.evp.model.EVPGrantTransaction createEVPGrantTransaction(
		long evpGrantTransactionId) {
		return getService().createEVPGrantTransaction(evpGrantTransactionId);
	}

	/**
	* Deletes the e v p grant transaction with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param evpGrantTransactionId the primary key of the e v p grant transaction
	* @return the e v p grant transaction that was removed
	* @throws PortalException if a e v p grant transaction with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.evp.model.EVPGrantTransaction deleteEVPGrantTransaction(
		long evpGrantTransactionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEVPGrantTransaction(evpGrantTransactionId);
	}

	/**
	* Deletes the e v p grant transaction from the database. Also notifies the appropriate model listeners.
	*
	* @param evpGrantTransaction the e v p grant transaction
	* @return the e v p grant transaction that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.evp.model.EVPGrantTransaction deleteEVPGrantTransaction(
		com.liferay.evp.model.EVPGrantTransaction evpGrantTransaction)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEVPGrantTransaction(evpGrantTransaction);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.model.impl.EVPGrantTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.model.impl.EVPGrantTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.evp.model.EVPGrantTransaction fetchEVPGrantTransaction(
		long evpGrantTransactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEVPGrantTransaction(evpGrantTransactionId);
	}

	/**
	* Returns the e v p grant transaction with the primary key.
	*
	* @param evpGrantTransactionId the primary key of the e v p grant transaction
	* @return the e v p grant transaction
	* @throws PortalException if a e v p grant transaction with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.evp.model.EVPGrantTransaction getEVPGrantTransaction(
		long evpGrantTransactionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEVPGrantTransaction(evpGrantTransactionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the e v p grant transactions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.evp.model.impl.EVPGrantTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of e v p grant transactions
	* @param end the upper bound of the range of e v p grant transactions (not inclusive)
	* @return the range of e v p grant transactions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.evp.model.EVPGrantTransaction> getEVPGrantTransactions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEVPGrantTransactions(start, end);
	}

	/**
	* Returns the number of e v p grant transactions.
	*
	* @return the number of e v p grant transactions
	* @throws SystemException if a system exception occurred
	*/
	public static int getEVPGrantTransactionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEVPGrantTransactionsCount();
	}

	/**
	* Updates the e v p grant transaction in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param evpGrantTransaction the e v p grant transaction
	* @return the e v p grant transaction that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.evp.model.EVPGrantTransaction updateEVPGrantTransaction(
		com.liferay.evp.model.EVPGrantTransaction evpGrantTransaction)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEVPGrantTransaction(evpGrantTransaction);
	}

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

	public static com.liferay.evp.model.EVPGrantTransaction addEVPGrantTransaction(
		long companyId, long userId, java.util.Date createDate,
		long evpGrantRequestId, long fileEntryId, int grantType, double amount,
		java.lang.String currencyCode, java.util.Date date,
		java.lang.String note, java.lang.String number,
		java.lang.String bankBICCode, java.lang.String bankIBANCode,
		java.lang.String bankName, java.lang.String purposeOfUse)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addEVPGrantTransaction(companyId, userId, createDate,
			evpGrantRequestId, fileEntryId, grantType, amount, currencyCode,
			date, note, number, bankBICCode, bankIBANCode, bankName,
			purposeOfUse);
	}

	public static void clearService() {
		_service = null;
	}

	public static EVPGrantTransactionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EVPGrantTransactionLocalService.class.getName());

			if (invokableLocalService instanceof EVPGrantTransactionLocalService) {
				_service = (EVPGrantTransactionLocalService)invokableLocalService;
			}
			else {
				_service = new EVPGrantTransactionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EVPGrantTransactionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(EVPGrantTransactionLocalService service) {
	}

	private static EVPGrantTransactionLocalService _service;
}