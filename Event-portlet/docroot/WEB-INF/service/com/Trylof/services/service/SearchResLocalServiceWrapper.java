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
 * Provides a wrapper for {@link SearchResLocalService}.
 *
 * @author Utkarsh
 * @see SearchResLocalService
 * @generated
 */
@ProviderType
public class SearchResLocalServiceWrapper implements SearchResLocalService,
	ServiceWrapper<SearchResLocalService> {
	public SearchResLocalServiceWrapper(
		SearchResLocalService searchResLocalService) {
		_searchResLocalService = searchResLocalService;
	}

	/**
	* Adds the search res to the database. Also notifies the appropriate model listeners.
	*
	* @param searchRes the search res
	* @return the search res that was added
	*/
	@Override
	public com.Trylof.services.model.SearchRes addSearchRes(
		com.Trylof.services.model.SearchRes searchRes) {
		return _searchResLocalService.addSearchRes(searchRes);
	}

	/**
	* Creates a new search res with the primary key. Does not add the search res to the database.
	*
	* @param searchResId the primary key for the new search res
	* @return the new search res
	*/
	@Override
	public com.Trylof.services.model.SearchRes createSearchRes(long searchResId) {
		return _searchResLocalService.createSearchRes(searchResId);
	}

	@Override
	public void deleteAllLocations() {
		_searchResLocalService.deleteAllLocations();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _searchResLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the search res from the database. Also notifies the appropriate model listeners.
	*
	* @param searchRes the search res
	* @return the search res that was removed
	*/
	@Override
	public com.Trylof.services.model.SearchRes deleteSearchRes(
		com.Trylof.services.model.SearchRes searchRes) {
		return _searchResLocalService.deleteSearchRes(searchRes);
	}

	/**
	* Deletes the search res with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param searchResId the primary key of the search res
	* @return the search res that was removed
	* @throws PortalException if a search res with the primary key could not be found
	*/
	@Override
	public com.Trylof.services.model.SearchRes deleteSearchRes(long searchResId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _searchResLocalService.deleteSearchRes(searchResId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _searchResLocalService.dynamicQuery();
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
		return _searchResLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _searchResLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _searchResLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _searchResLocalService.dynamicQueryCount(dynamicQuery);
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
		return _searchResLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.Trylof.services.model.SearchRes fetchSearchRes(long searchResId) {
		return _searchResLocalService.fetchSearchRes(searchResId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _searchResLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _searchResLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _searchResLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _searchResLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the search res with the primary key.
	*
	* @param searchResId the primary key of the search res
	* @return the search res
	* @throws PortalException if a search res with the primary key could not be found
	*/
	@Override
	public com.Trylof.services.model.SearchRes getSearchRes(long searchResId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _searchResLocalService.getSearchRes(searchResId);
	}

	/**
	* Returns a range of all the search reses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.Trylof.services.model.impl.SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of search reses
	* @param end the upper bound of the range of search reses (not inclusive)
	* @return the range of search reses
	*/
	@Override
	public java.util.List<com.Trylof.services.model.SearchRes> getSearchReses(
		int start, int end) {
		return _searchResLocalService.getSearchReses(start, end);
	}

	/**
	* Returns the number of search reses.
	*
	* @return the number of search reses
	*/
	@Override
	public int getSearchResesCount() {
		return _searchResLocalService.getSearchResesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _searchResLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Updates the search res in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param searchRes the search res
	* @return the search res that was updated
	*/
	@Override
	public com.Trylof.services.model.SearchRes updateSearchRes(
		com.Trylof.services.model.SearchRes searchRes) {
		return _searchResLocalService.updateSearchRes(searchRes);
	}

	@Override
	public SearchResLocalService getWrappedService() {
		return _searchResLocalService;
	}

	@Override
	public void setWrappedService(SearchResLocalService searchResLocalService) {
		_searchResLocalService = searchResLocalService;
	}

	private SearchResLocalService _searchResLocalService;
}