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

import com.Trylof.services.exception.NoSuchSearchResException;
import com.Trylof.services.model.SearchRes;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the search res service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.persistence.impl.SearchResPersistenceImpl
 * @see SearchResUtil
 * @generated
 */
@ProviderType
public interface SearchResPersistence extends BasePersistence<SearchRes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SearchResUtil} to access the search res persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the search res in the entity cache if it is enabled.
	*
	* @param searchRes the search res
	*/
	public void cacheResult(SearchRes searchRes);

	/**
	* Caches the search reses in the entity cache if it is enabled.
	*
	* @param searchReses the search reses
	*/
	public void cacheResult(java.util.List<SearchRes> searchReses);

	/**
	* Creates a new search res with the primary key. Does not add the search res to the database.
	*
	* @param searchResId the primary key for the new search res
	* @return the new search res
	*/
	public SearchRes create(long searchResId);

	/**
	* Removes the search res with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param searchResId the primary key of the search res
	* @return the search res that was removed
	* @throws NoSuchSearchResException if a search res with the primary key could not be found
	*/
	public SearchRes remove(long searchResId) throws NoSuchSearchResException;

	public SearchRes updateImpl(SearchRes searchRes);

	/**
	* Returns the search res with the primary key or throws a {@link NoSuchSearchResException} if it could not be found.
	*
	* @param searchResId the primary key of the search res
	* @return the search res
	* @throws NoSuchSearchResException if a search res with the primary key could not be found
	*/
	public SearchRes findByPrimaryKey(long searchResId)
		throws NoSuchSearchResException;

	/**
	* Returns the search res with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param searchResId the primary key of the search res
	* @return the search res, or <code>null</code> if a search res with the primary key could not be found
	*/
	public SearchRes fetchByPrimaryKey(long searchResId);

	@Override
	public java.util.Map<java.io.Serializable, SearchRes> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the search reses.
	*
	* @return the search reses
	*/
	public java.util.List<SearchRes> findAll();

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
	public java.util.List<SearchRes> findAll(int start, int end);

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
	public java.util.List<SearchRes> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchRes> orderByComparator);

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
	public java.util.List<SearchRes> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SearchRes> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the search reses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of search reses.
	*
	* @return the number of search reses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}