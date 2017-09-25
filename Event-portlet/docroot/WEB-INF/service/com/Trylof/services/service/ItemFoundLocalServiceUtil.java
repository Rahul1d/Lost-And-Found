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

package com.Trylof.services.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for ItemFound. This utility wraps
 * {@link com.Trylof.services.service.impl.ItemFoundLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Utkarsh
 * @see ItemFoundLocalService
 * @see com.Trylof.services.service.base.ItemFoundLocalServiceBaseImpl
 * @see com.Trylof.services.service.impl.ItemFoundLocalServiceImpl
 * @generated
 */
@ProviderType
public class ItemFoundLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.Trylof.services.service.impl.ItemFoundLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the item found to the database. Also notifies the appropriate model listeners.
	*
	* @param itemFound the item found
	* @return the item found that was added
	*/
	public static com.Trylof.services.model.ItemFound addItemFound(
		com.Trylof.services.model.ItemFound itemFound) {
		return getService().addItemFound(itemFound);
	}

	/**
	* Creates a new item found with the primary key. Does not add the item found to the database.
	*
	* @param itemFoundId the primary key for the new item found
	* @return the new item found
	*/
	public static com.Trylof.services.model.ItemFound createItemFound(
		long itemFoundId) {
		return getService().createItemFound(itemFoundId);
	}

	/**
	* Deletes the item found from the database. Also notifies the appropriate model listeners.
	*
	* @param itemFound the item found
	* @return the item found that was removed
	*/
	public static com.Trylof.services.model.ItemFound deleteItemFound(
		com.Trylof.services.model.ItemFound itemFound) {
		return getService().deleteItemFound(itemFound);
	}

	/**
	* Deletes the item found with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found that was removed
	* @throws PortalException if a item found with the primary key could not be found
	*/
	public static com.Trylof.services.model.ItemFound deleteItemFound(
		long itemFoundId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteItemFound(itemFoundId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.Trylof.services.model.ItemFound fetchItemFound(
		long itemFoundId) {
		return getService().fetchItemFound(itemFoundId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.Trylof.services.model.ItemFoundBlobDataBlobModel getBlobDataBlobModel(
		java.io.Serializable primaryKey) {
		return getService().getBlobDataBlobModel(primaryKey);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the item found with the primary key.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found
	* @throws PortalException if a item found with the primary key could not be found
	*/
	public static com.Trylof.services.model.ItemFound getItemFound(
		long itemFoundId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getItemFound(itemFoundId);
	}

	/**
	* Returns a range of all the item founds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item founds
	* @param end the upper bound of the range of item founds (not inclusive)
	* @return the range of item founds
	*/
	public static java.util.List<com.Trylof.services.model.ItemFound> getItemFounds(
		int start, int end) {
		return getService().getItemFounds(start, end);
	}

	/**
	* Returns the number of item founds.
	*
	* @return the number of item founds
	*/
	public static int getItemFoundsCount() {
		return getService().getItemFoundsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static java.util.List<com.Trylof.services.model.ItemFound> getitemType(
		java.lang.String itemType) {
		return getService().getitemType(itemType);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.Trylof.services.model.ItemFound itemType(
		java.lang.Long itemFoundid) {
		return getService().itemType(itemFoundid);
	}

	/**
	* Updates the item found in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param itemFound the item found
	* @return the item found that was updated
	*/
	public static com.Trylof.services.model.ItemFound updateItemFound(
		com.Trylof.services.model.ItemFound itemFound) {
		return getService().updateItemFound(itemFound);
	}

	public static void clearService() {
		_service = null;
	}

	public static ItemFoundLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ItemFoundLocalService.class.getName());

			if (invokableLocalService instanceof ItemFoundLocalService) {
				_service = (ItemFoundLocalService)invokableLocalService;
			}
			else {
				_service = new ItemFoundLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ItemFoundLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static ItemFoundLocalService _service;
}