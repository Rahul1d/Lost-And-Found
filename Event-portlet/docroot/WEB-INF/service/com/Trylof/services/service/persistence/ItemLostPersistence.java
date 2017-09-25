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

import com.Trylof.services.exception.NoSuchItemLostException;
import com.Trylof.services.model.ItemLost;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the item lost service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.persistence.impl.ItemLostPersistenceImpl
 * @see ItemLostUtil
 * @generated
 */
@ProviderType
public interface ItemLostPersistence extends BasePersistence<ItemLost> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemLostUtil} to access the item lost persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the item losts where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @return the matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostid(long itemLostId);

	/**
	* Returns a range of all the item losts where itemLostId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param itemLostId the item lost ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @return the range of matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostid(long itemLostId,
		int start, int end);

	/**
	* Returns an ordered range of all the item losts where itemLostId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param itemLostId the item lost ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostid(long itemLostId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns an ordered range of all the item losts where itemLostId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param itemLostId the item lost ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostid(long itemLostId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByitemLostid_First(long itemLostId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the first item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByitemLostid_First(long itemLostId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns the last item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByitemLostid_Last(long itemLostId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the last item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByitemLostid_Last(long itemLostId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Removes all the item losts where itemLostId = &#63; from the database.
	*
	* @param itemLostId the item lost ID
	*/
	public void removeByitemLostid(long itemLostId);

	/**
	* Returns the number of item losts where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @return the number of matching item losts
	*/
	public int countByitemLostid(long itemLostId);

	/**
	* Returns all the item losts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostUserid(long userId);

	/**
	* Returns a range of all the item losts where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @return the range of matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostUserid(long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the item losts where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostUserid(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns an ordered range of all the item losts where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByitemLostUserid(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByitemLostUserid_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the first item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByitemLostUserid_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns the last item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByitemLostUserid_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the last item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByitemLostUserid_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns the item losts before and after the current item lost in the ordered set where userId = &#63;.
	*
	* @param itemLostId the primary key of the current item lost
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item lost
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public ItemLost[] findByitemLostUserid_PrevAndNext(long itemLostId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Removes all the item losts where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByitemLostUserid(long userId);

	/**
	* Returns the number of item losts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching item losts
	*/
	public int countByitemLostUserid(long userId);

	/**
	* Returns all the item losts where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @return the matching item losts
	*/
	public java.util.List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus);

	/**
	* Returns a range of all the item losts where LostStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param LostStatus the lost status
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @return the range of matching item losts
	*/
	public java.util.List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus, int start, int end);

	/**
	* Returns an ordered range of all the item losts where LostStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param LostStatus the lost status
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns an ordered range of all the item losts where LostStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param LostStatus the lost status
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByItemStatusMatch_First(java.lang.String LostStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByItemStatusMatch_First(java.lang.String LostStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByItemStatusMatch_Last(java.lang.String LostStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByItemStatusMatch_Last(java.lang.String LostStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns the item losts before and after the current item lost in the ordered set where LostStatus = &#63;.
	*
	* @param itemLostId the primary key of the current item lost
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item lost
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public ItemLost[] findByItemStatusMatch_PrevAndNext(long itemLostId,
		java.lang.String LostStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Removes all the item losts where LostStatus = &#63; from the database.
	*
	* @param LostStatus the lost status
	*/
	public void removeByItemStatusMatch(java.lang.String LostStatus);

	/**
	* Returns the number of item losts where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @return the number of matching item losts
	*/
	public int countByItemStatusMatch(java.lang.String LostStatus);

	/**
	* Returns all the item losts where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @return the matching item losts
	*/
	public java.util.List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId);

	/**
	* Returns a range of all the item losts where LostStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @return the range of matching item losts
	*/
	public java.util.List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId, int start, int end);

	/**
	* Returns an ordered range of all the item losts where LostStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns an ordered range of all the item losts where LostStatus = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching item losts
	*/
	public java.util.List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByItemStstausAndUser_First(
		java.lang.String LostStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByItemStstausAndUser_First(
		java.lang.String LostStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public ItemLost findByItemStstausAndUser_Last(java.lang.String LostStatus,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public ItemLost fetchByItemStstausAndUser_Last(
		java.lang.String LostStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns the item losts before and after the current item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param itemLostId the primary key of the current item lost
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item lost
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public ItemLost[] findByItemStstausAndUser_PrevAndNext(long itemLostId,
		java.lang.String LostStatus, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException;

	/**
	* Removes all the item losts where LostStatus = &#63; and userId = &#63; from the database.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	*/
	public void removeByItemStstausAndUser(java.lang.String LostStatus,
		long userId);

	/**
	* Returns the number of item losts where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @return the number of matching item losts
	*/
	public int countByItemStstausAndUser(java.lang.String LostStatus,
		long userId);

	/**
	* Caches the item lost in the entity cache if it is enabled.
	*
	* @param itemLost the item lost
	*/
	public void cacheResult(ItemLost itemLost);

	/**
	* Caches the item losts in the entity cache if it is enabled.
	*
	* @param itemLosts the item losts
	*/
	public void cacheResult(java.util.List<ItemLost> itemLosts);

	/**
	* Creates a new item lost with the primary key. Does not add the item lost to the database.
	*
	* @param itemLostId the primary key for the new item lost
	* @return the new item lost
	*/
	public ItemLost create(long itemLostId);

	/**
	* Removes the item lost with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost that was removed
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public ItemLost remove(long itemLostId) throws NoSuchItemLostException;

	public ItemLost updateImpl(ItemLost itemLost);

	/**
	* Returns the item lost with the primary key or throws a {@link NoSuchItemLostException} if it could not be found.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public ItemLost findByPrimaryKey(long itemLostId)
		throws NoSuchItemLostException;

	/**
	* Returns the item lost with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost, or <code>null</code> if a item lost with the primary key could not be found
	*/
	public ItemLost fetchByPrimaryKey(long itemLostId);

	@Override
	public java.util.Map<java.io.Serializable, ItemLost> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the item losts.
	*
	* @return the item losts
	*/
	public java.util.List<ItemLost> findAll();

	/**
	* Returns a range of all the item losts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @return the range of item losts
	*/
	public java.util.List<ItemLost> findAll(int start, int end);

	/**
	* Returns an ordered range of all the item losts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of item losts
	*/
	public java.util.List<ItemLost> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator);

	/**
	* Returns an ordered range of all the item losts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemLostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item losts
	* @param end the upper bound of the range of item losts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of item losts
	*/
	public java.util.List<ItemLost> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the item losts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of item losts.
	*
	* @return the number of item losts
	*/
	public int countAll();
}