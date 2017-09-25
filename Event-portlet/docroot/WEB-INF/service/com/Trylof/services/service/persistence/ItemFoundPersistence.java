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

import com.Trylof.services.exception.NoSuchItemFoundException;
import com.Trylof.services.model.ItemFound;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the item found service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.persistence.impl.ItemFoundPersistenceImpl
 * @see ItemFoundUtil
 * @generated
 */
@ProviderType
public interface ItemFoundPersistence extends BasePersistence<ItemFound> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemFoundUtil} to access the item found persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the item founds where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @return the matching item founds
	*/
	public java.util.List<ItemFound> findByItemType(java.lang.String FoundType);

	/**
	* Returns a range of all the item founds where FoundType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FoundType the found type
	* @param start the lower bound of the range of item founds
	* @param end the upper bound of the range of item founds (not inclusive)
	* @return the range of matching item founds
	*/
	public java.util.List<ItemFound> findByItemType(
		java.lang.String FoundType, int start, int end);

	/**
	* Returns an ordered range of all the item founds where FoundType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FoundType the found type
	* @param start the lower bound of the range of item founds
	* @param end the upper bound of the range of item founds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching item founds
	*/
	public java.util.List<ItemFound> findByItemType(
		java.lang.String FoundType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator);

	/**
	* Returns an ordered range of all the item founds where FoundType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FoundType the found type
	* @param start the lower bound of the range of item founds
	* @param end the upper bound of the range of item founds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching item founds
	*/
	public java.util.List<ItemFound> findByItemType(
		java.lang.String FoundType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item found
	* @throws NoSuchItemFoundException if a matching item found could not be found
	*/
	public ItemFound findByItemType_First(java.lang.String FoundType,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator)
		throws NoSuchItemFoundException;

	/**
	* Returns the first item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item found, or <code>null</code> if a matching item found could not be found
	*/
	public ItemFound fetchByItemType_First(java.lang.String FoundType,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator);

	/**
	* Returns the last item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item found
	* @throws NoSuchItemFoundException if a matching item found could not be found
	*/
	public ItemFound findByItemType_Last(java.lang.String FoundType,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator)
		throws NoSuchItemFoundException;

	/**
	* Returns the last item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item found, or <code>null</code> if a matching item found could not be found
	*/
	public ItemFound fetchByItemType_Last(java.lang.String FoundType,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator);

	/**
	* Returns the item founds before and after the current item found in the ordered set where FoundType = &#63;.
	*
	* @param itemFoundId the primary key of the current item found
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item found
	* @throws NoSuchItemFoundException if a item found with the primary key could not be found
	*/
	public ItemFound[] findByItemType_PrevAndNext(long itemFoundId,
		java.lang.String FoundType,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator)
		throws NoSuchItemFoundException;

	/**
	* Removes all the item founds where FoundType = &#63; from the database.
	*
	* @param FoundType the found type
	*/
	public void removeByItemType(java.lang.String FoundType);

	/**
	* Returns the number of item founds where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @return the number of matching item founds
	*/
	public int countByItemType(java.lang.String FoundType);

	/**
	* Caches the item found in the entity cache if it is enabled.
	*
	* @param itemFound the item found
	*/
	public void cacheResult(ItemFound itemFound);

	/**
	* Caches the item founds in the entity cache if it is enabled.
	*
	* @param itemFounds the item founds
	*/
	public void cacheResult(java.util.List<ItemFound> itemFounds);

	/**
	* Creates a new item found with the primary key. Does not add the item found to the database.
	*
	* @param itemFoundId the primary key for the new item found
	* @return the new item found
	*/
	public ItemFound create(long itemFoundId);

	/**
	* Removes the item found with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found that was removed
	* @throws NoSuchItemFoundException if a item found with the primary key could not be found
	*/
	public ItemFound remove(long itemFoundId) throws NoSuchItemFoundException;

	public ItemFound updateImpl(ItemFound itemFound);

	/**
	* Returns the item found with the primary key or throws a {@link NoSuchItemFoundException} if it could not be found.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found
	* @throws NoSuchItemFoundException if a item found with the primary key could not be found
	*/
	public ItemFound findByPrimaryKey(long itemFoundId)
		throws NoSuchItemFoundException;

	/**
	* Returns the item found with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found, or <code>null</code> if a item found with the primary key could not be found
	*/
	public ItemFound fetchByPrimaryKey(long itemFoundId);

	@Override
	public java.util.Map<java.io.Serializable, ItemFound> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the item founds.
	*
	* @return the item founds
	*/
	public java.util.List<ItemFound> findAll();

	/**
	* Returns a range of all the item founds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item founds
	* @param end the upper bound of the range of item founds (not inclusive)
	* @return the range of item founds
	*/
	public java.util.List<ItemFound> findAll(int start, int end);

	/**
	* Returns an ordered range of all the item founds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item founds
	* @param end the upper bound of the range of item founds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of item founds
	*/
	public java.util.List<ItemFound> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator);

	/**
	* Returns an ordered range of all the item founds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item founds
	* @param end the upper bound of the range of item founds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of item founds
	*/
	public java.util.List<ItemFound> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemFound> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the item founds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of item founds.
	*
	* @return the number of item founds
	*/
	public int countAll();
}