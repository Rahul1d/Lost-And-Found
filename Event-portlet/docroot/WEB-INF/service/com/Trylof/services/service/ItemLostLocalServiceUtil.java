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
 * Provides the local service utility for ItemLost. This utility wraps
 * {@link com.Trylof.services.service.impl.ItemLostLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Utkarsh
 * @see ItemLostLocalService
 * @see com.Trylof.services.service.base.ItemLostLocalServiceBaseImpl
 * @see com.Trylof.services.service.impl.ItemLostLocalServiceImpl
 * @generated
 */
@ProviderType
public class ItemLostLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.Trylof.services.service.impl.ItemLostLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the item lost to the database. Also notifies the appropriate model listeners.
	*
	* @param itemLost the item lost
	* @return the item lost that was added
	*/
	public static com.Trylof.services.model.ItemLost addItemLost(
		com.Trylof.services.model.ItemLost itemLost) {
		return getService().addItemLost(itemLost);
	}

	/**
	* Creates a new item lost with the primary key. Does not add the item lost to the database.
	*
	* @param itemLostId the primary key for the new item lost
	* @return the new item lost
	*/
	public static com.Trylof.services.model.ItemLost createItemLost(
		long itemLostId) {
		return getService().createItemLost(itemLostId);
	}

	/**
	* Deletes the item lost from the database. Also notifies the appropriate model listeners.
	*
	* @param itemLost the item lost
	* @return the item lost that was removed
	*/
	public static com.Trylof.services.model.ItemLost deleteItemLost(
		com.Trylof.services.model.ItemLost itemLost) {
		return getService().deleteItemLost(itemLost);
	}

	/**
	* Deletes the item lost with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost that was removed
	* @throws PortalException if a item lost with the primary key could not be found
	*/
	public static com.Trylof.services.model.ItemLost deleteItemLost(
		long itemLostId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteItemLost(itemLostId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.Trylof.services.model.ItemLost fetchItemLost(
		long itemLostId) {
		return getService().fetchItemLost(itemLostId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.Trylof.services.model.ItemLostBlobDataBlobModel getBlobDataBlobModel(
		java.io.Serializable primaryKey) {
		return getService().getBlobDataBlobModel(primaryKey);
	}

	public static java.util.List<com.Trylof.services.model.ItemLost> getDetailsByStatusMatch(
		java.lang.String match) {
		return getService().getDetailsByStatusMatch(match);
	}

	public static java.util.List<com.Trylof.services.model.ItemLost> getDetailsByStatusMatchAndUser(
		java.lang.String match, long userid) {
		return getService().getDetailsByStatusMatchAndUser(match, userid);
	}

	public static java.util.List<com.Trylof.services.model.ItemLost> getDetailsByUserid(
		long id) {
		return getService().getDetailsByUserid(id);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the item lost with the primary key.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost
	* @throws PortalException if a item lost with the primary key could not be found
	*/
	public static com.Trylof.services.model.ItemLost getItemLost(
		long itemLostId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getItemLost(itemLostId);
	}

	/**
	* Returns a range of all the item losts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @return the range of item losts
	*/
	public static java.util.List<com.Trylof.services.model.ItemLost> getItemLosts(
		int start, int end) {
		return getService().getItemLosts(start, end);
	}

	/**
	* Returns the number of item losts.
	*
	* @return the number of item losts
	*/
	public static int getItemLostsCount() {
		return getService().getItemLostsCount();
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

	public static com.Trylof.services.model.ItemLost getdetails(long id)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getService().getdetails(id);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Updates the item lost in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param itemLost the item lost
	* @return the item lost that was updated
	*/
	public static com.Trylof.services.model.ItemLost updateItemLost(
		com.Trylof.services.model.ItemLost itemLost) {
		return getService().updateItemLost(itemLost);
	}

	public static void clearService() {
		_service = null;
	}

	public static ItemLostLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ItemLostLocalService.class.getName());

			if (invokableLocalService instanceof ItemLostLocalService) {
				_service = (ItemLostLocalService)invokableLocalService;
			}
			else {
				_service = new ItemLostLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ItemLostLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static ItemLostLocalService _service;
}