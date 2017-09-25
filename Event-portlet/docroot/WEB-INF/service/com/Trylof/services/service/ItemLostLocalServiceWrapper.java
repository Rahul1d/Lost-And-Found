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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ItemLostLocalService}.
 *
 * @author Utkarsh
 * @see ItemLostLocalService
 * @generated
 */
@ProviderType
public class ItemLostLocalServiceWrapper implements ItemLostLocalService,
	ServiceWrapper<ItemLostLocalService> {
	public ItemLostLocalServiceWrapper(
		ItemLostLocalService itemLostLocalService) {
		_itemLostLocalService = itemLostLocalService;
	}

	/**
	* Adds the item lost to the database. Also notifies the appropriate model listeners.
	*
	* @param itemLost the item lost
	* @return the item lost that was added
	*/
	@Override
	public com.Trylof.services.model.ItemLost addItemLost(
		com.Trylof.services.model.ItemLost itemLost) {
		return _itemLostLocalService.addItemLost(itemLost);
	}

	/**
	* Creates a new item lost with the primary key. Does not add the item lost to the database.
	*
	* @param itemLostId the primary key for the new item lost
	* @return the new item lost
	*/
	@Override
	public com.Trylof.services.model.ItemLost createItemLost(long itemLostId) {
		return _itemLostLocalService.createItemLost(itemLostId);
	}

	/**
	* Deletes the item lost from the database. Also notifies the appropriate model listeners.
	*
	* @param itemLost the item lost
	* @return the item lost that was removed
	*/
	@Override
	public com.Trylof.services.model.ItemLost deleteItemLost(
		com.Trylof.services.model.ItemLost itemLost) {
		return _itemLostLocalService.deleteItemLost(itemLost);
	}

	/**
	* Deletes the item lost with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost that was removed
	* @throws PortalException if a item lost with the primary key could not be found
	*/
	@Override
	public com.Trylof.services.model.ItemLost deleteItemLost(long itemLostId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemLostLocalService.deleteItemLost(itemLostId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemLostLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _itemLostLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _itemLostLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _itemLostLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _itemLostLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _itemLostLocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _itemLostLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.Trylof.services.model.ItemLost fetchItemLost(long itemLostId) {
		return _itemLostLocalService.fetchItemLost(itemLostId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _itemLostLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.Trylof.services.model.ItemLostBlobDataBlobModel getBlobDataBlobModel(
		java.io.Serializable primaryKey) {
		return _itemLostLocalService.getBlobDataBlobModel(primaryKey);
	}

	@Override
	public java.util.List<com.Trylof.services.model.ItemLost> getDetailsByStatusMatch(
		java.lang.String match) {
		return _itemLostLocalService.getDetailsByStatusMatch(match);
	}

	@Override
	public java.util.List<com.Trylof.services.model.ItemLost> getDetailsByStatusMatchAndUser(
		java.lang.String match, long userid) {
		return _itemLostLocalService.getDetailsByStatusMatchAndUser(match,
			userid);
	}

	@Override
	public java.util.List<com.Trylof.services.model.ItemLost> getDetailsByUserid(
		long id) {
		return _itemLostLocalService.getDetailsByUserid(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _itemLostLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the item lost with the primary key.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost
	* @throws PortalException if a item lost with the primary key could not be found
	*/
	@Override
	public com.Trylof.services.model.ItemLost getItemLost(long itemLostId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemLostLocalService.getItemLost(itemLostId);
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
	@Override
	public java.util.List<com.Trylof.services.model.ItemLost> getItemLosts(
		int start, int end) {
		return _itemLostLocalService.getItemLosts(start, end);
	}

	/**
	* Returns the number of item losts.
	*
	* @return the number of item losts
	*/
	@Override
	public int getItemLostsCount() {
		return _itemLostLocalService.getItemLostsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _itemLostLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemLostLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.Trylof.services.model.ItemLost getdetails(long id)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return _itemLostLocalService.getdetails(id);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _itemLostLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Updates the item lost in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param itemLost the item lost
	* @return the item lost that was updated
	*/
	@Override
	public com.Trylof.services.model.ItemLost updateItemLost(
		com.Trylof.services.model.ItemLost itemLost) {
		return _itemLostLocalService.updateItemLost(itemLost);
	}

	@Override
	public ItemLostLocalService getWrappedService() {
		return _itemLostLocalService;
	}

	@Override
	public void setWrappedService(ItemLostLocalService itemLostLocalService) {
		_itemLostLocalService = itemLostLocalService;
	}

	private ItemLostLocalService _itemLostLocalService;
}