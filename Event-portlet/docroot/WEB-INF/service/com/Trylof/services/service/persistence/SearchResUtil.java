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

package com.Trylof.services.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.Trylof.services.model.SearchRes;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the search res service. This utility wraps {@link com.Trylof.services.service.persistence.impl.SearchResPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see SearchResPersistence
 * @see com.Trylof.services.service.persistence.impl.SearchResPersistenceImpl
 * @generated
 */
@ProviderType
public class SearchResUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SearchRes searchRes) {
		getPersistence().clearCache(searchRes);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SearchRes> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SearchRes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SearchRes> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SearchRes> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SearchRes update(SearchRes searchRes) {
		return getPersistence().update(searchRes);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SearchRes update(SearchRes searchRes,
		ServiceContext serviceContext) {
		return getPersistence().update(searchRes, serviceContext);
	}

	/**
	* Caches the search res in the entity cache if it is enabled.
	*
	* @param searchRes the search res
	*/
	public static void cacheResult(SearchRes searchRes) {
		getPersistence().cacheResult(searchRes);
	}

	/**
	* Caches the search reses in the entity cache if it is enabled.
	*
	* @param searchReses the search reses
	*/
	public static void cacheResult(List<SearchRes> searchReses) {
		getPersistence().cacheResult(searchReses);
	}

	/**
	* Creates a new search res with the primary key. Does not add the search res to the database.
	*
	* @param searchResId the primary key for the new search res
	* @return the new search res
	*/
	public static SearchRes create(long searchResId) {
		return getPersistence().create(searchResId);
	}

	/**
	* Removes the search res with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param searchResId the primary key of the search res
	* @return the search res that was removed
	* @throws NoSuchSearchResException if a search res with the primary key could not be found
	*/
	public static SearchRes remove(long searchResId)
		throws com.Trylof.services.exception.NoSuchSearchResException {
		return getPersistence().remove(searchResId);
	}

	public static SearchRes updateImpl(SearchRes searchRes) {
		return getPersistence().updateImpl(searchRes);
	}

	/**
	* Returns the search res with the primary key or throws a {@link NoSuchSearchResException} if it could not be found.
	*
	* @param searchResId the primary key of the search res
	* @return the search res
	* @throws NoSuchSearchResException if a search res with the primary key could not be found
	*/
	public static SearchRes findByPrimaryKey(long searchResId)
		throws com.Trylof.services.exception.NoSuchSearchResException {
		return getPersistence().findByPrimaryKey(searchResId);
	}

	/**
	* Returns the search res with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param searchResId the primary key of the search res
	* @return the search res, or <code>null</code> if a search res with the primary key could not be found
	*/
	public static SearchRes fetchByPrimaryKey(long searchResId) {
		return getPersistence().fetchByPrimaryKey(searchResId);
	}

	public static java.util.Map<java.io.Serializable, SearchRes> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the search reses.
	*
	* @return the search reses
	*/
	public static List<SearchRes> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the search reses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of search reses
	* @param end the upper bound of the range of search reses (not inclusive)
	* @return the range of search reses
	*/
	public static List<SearchRes> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the search reses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of search reses
	* @param end the upper bound of the range of search reses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of search reses
	*/
	public static List<SearchRes> findAll(int start, int end,
		OrderByComparator<SearchRes> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the search reses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of search reses
	* @param end the upper bound of the range of search reses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of search reses
	*/
	public static List<SearchRes> findAll(int start, int end,
		OrderByComparator<SearchRes> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the search reses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of search reses.
	*
	* @return the number of search reses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static SearchResPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SearchResPersistence)PortletBeanLocatorUtil.locate(com.Trylof.services.service.ClpSerializer.getServletContextName(),
					SearchResPersistence.class.getName());

			ReferenceRegistry.registerReference(SearchResUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static SearchResPersistence _persistence;
}