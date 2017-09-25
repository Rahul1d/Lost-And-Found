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
 * Provides a wrapper for {@link ItemVerificationLocalService}.
 *
 * @author Utkarsh
 * @see ItemVerificationLocalService
 * @generated
 */
@ProviderType
public class ItemVerificationLocalServiceWrapper
	implements ItemVerificationLocalService,
		ServiceWrapper<ItemVerificationLocalService> {
	public ItemVerificationLocalServiceWrapper(
		ItemVerificationLocalService itemVerificationLocalService) {
		_itemVerificationLocalService = itemVerificationLocalService;
	}

	/**
	* Adds the item verification to the database. Also notifies the appropriate model listeners.
	*
	* @param itemVerification the item verification
	* @return the item verification that was added
	*/
	@Override
	public com.Trylof.services.model.ItemVerification addItemVerification(
		com.Trylof.services.model.ItemVerification itemVerification) {
		return _itemVerificationLocalService.addItemVerification(itemVerification);
	}

	/**
	* Creates a new item verification with the primary key. Does not add the item verification to the database.
	*
	* @param itemVerificationId the primary key for the new item verification
	* @return the new item verification
	*/
	@Override
	public com.Trylof.services.model.ItemVerification createItemVerification(
		long itemVerificationId) {
		return _itemVerificationLocalService.createItemVerification(itemVerificationId);
	}

	/**
	* Deletes the item verification from the database. Also notifies the appropriate model listeners.
	*
	* @param itemVerification the item verification
	* @return the item verification that was removed
	*/
	@Override
	public com.Trylof.services.model.ItemVerification deleteItemVerification(
		com.Trylof.services.model.ItemVerification itemVerification) {
		return _itemVerificationLocalService.deleteItemVerification(itemVerification);
	}

	/**
	* Deletes the item verification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification that was removed
	* @throws PortalException if a item verification with the primary key could not be found
	*/
	@Override
	public com.Trylof.services.model.ItemVerification deleteItemVerification(
		long itemVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemVerificationLocalService.deleteItemVerification(itemVerificationId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemVerificationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _itemVerificationLocalService.dynamicQuery();
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
		return _itemVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _itemVerificationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _itemVerificationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _itemVerificationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _itemVerificationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.Trylof.services.model.ItemVerification fetchItemVerification(
		long itemVerificationId) {
		return _itemVerificationLocalService.fetchItemVerification(itemVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _itemVerificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.Trylof.services.model.ItemVerification getDetailsByStatusMatch(
		long lostid) {
		return _itemVerificationLocalService.getDetailsByStatusMatch(lostid);
	}

	@Override
	public java.util.List<com.Trylof.services.model.ItemVerification> getDetailsByUser(
		long user, java.lang.String Status) {
		return _itemVerificationLocalService.getDetailsByUser(user, Status);
	}

	@Override
	public com.Trylof.services.model.ItemVerificationImage1BlobModel getImage1BlobModel(
		java.io.Serializable primaryKey) {
		return _itemVerificationLocalService.getImage1BlobModel(primaryKey);
	}

	@Override
	public com.Trylof.services.model.ItemVerificationImage2BlobModel getImage2BlobModel(
		java.io.Serializable primaryKey) {
		return _itemVerificationLocalService.getImage2BlobModel(primaryKey);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _itemVerificationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the item verification with the primary key.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification
	* @throws PortalException if a item verification with the primary key could not be found
	*/
	@Override
	public com.Trylof.services.model.ItemVerification getItemVerification(
		long itemVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemVerificationLocalService.getItemVerification(itemVerificationId);
	}

	/**
	* Returns a range of all the item verifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item verifications
	* @param end the upper bound of the range of item verifications (not inclusive)
	* @return the range of item verifications
	*/
	@Override
	public java.util.List<com.Trylof.services.model.ItemVerification> getItemVerifications(
		int start, int end) {
		return _itemVerificationLocalService.getItemVerifications(start, end);
	}

	/**
	* Returns the number of item verifications.
	*
	* @return the number of item verifications
	*/
	@Override
	public int getItemVerificationsCount() {
		return _itemVerificationLocalService.getItemVerificationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _itemVerificationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _itemVerificationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _itemVerificationLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Updates the item verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param itemVerification the item verification
	* @return the item verification that was updated
	*/
	@Override
	public com.Trylof.services.model.ItemVerification updateItemVerification(
		com.Trylof.services.model.ItemVerification itemVerification) {
		return _itemVerificationLocalService.updateItemVerification(itemVerification);
	}

	@Override
	public ItemVerificationLocalService getWrappedService() {
		return _itemVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		ItemVerificationLocalService itemVerificationLocalService) {
		_itemVerificationLocalService = itemVerificationLocalService;
	}

	private ItemVerificationLocalService _itemVerificationLocalService;
}