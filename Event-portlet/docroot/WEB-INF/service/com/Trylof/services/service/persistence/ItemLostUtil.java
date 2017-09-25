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

import com.Trylof.services.model.ItemLost;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the item lost service. This utility wraps {@link com.Trylof.services.service.persistence.impl.ItemLostPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see ItemLostPersistence
 * @see com.Trylof.services.service.persistence.impl.ItemLostPersistenceImpl
 * @generated
 */
@ProviderType
public class ItemLostUtil {
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
	public static void clearCache(ItemLost itemLost) {
		getPersistence().clearCache(itemLost);
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
	public static List<ItemLost> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ItemLost> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ItemLost> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ItemLost update(ItemLost itemLost) {
		return getPersistence().update(itemLost);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ItemLost update(ItemLost itemLost,
		ServiceContext serviceContext) {
		return getPersistence().update(itemLost, serviceContext);
	}

	/**
	* Returns all the item losts where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @return the matching item losts
	*/
	public static List<ItemLost> findByitemLostid(long itemLostId) {
		return getPersistence().findByitemLostid(itemLostId);
	}

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
	public static List<ItemLost> findByitemLostid(long itemLostId, int start,
		int end) {
		return getPersistence().findByitemLostid(itemLostId, start, end);
	}

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
	public static List<ItemLost> findByitemLostid(long itemLostId, int start,
		int end, OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .findByitemLostid(itemLostId, start, end, orderByComparator);
	}

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
	public static List<ItemLost> findByitemLostid(long itemLostId, int start,
		int end, OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByitemLostid(itemLostId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByitemLostid_First(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByitemLostid_First(itemLostId, orderByComparator);
	}

	/**
	* Returns the first item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByitemLostid_First(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByitemLostid_First(itemLostId, orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByitemLostid_Last(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByitemLostid_Last(itemLostId, orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByitemLostid_Last(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByitemLostid_Last(itemLostId, orderByComparator);
	}

	/**
	* Removes all the item losts where itemLostId = &#63; from the database.
	*
	* @param itemLostId the item lost ID
	*/
	public static void removeByitemLostid(long itemLostId) {
		getPersistence().removeByitemLostid(itemLostId);
	}

	/**
	* Returns the number of item losts where itemLostId = &#63;.
	*
	* @param itemLostId the item lost ID
	* @return the number of matching item losts
	*/
	public static int countByitemLostid(long itemLostId) {
		return getPersistence().countByitemLostid(itemLostId);
	}

	/**
	* Returns all the item losts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching item losts
	*/
	public static List<ItemLost> findByitemLostUserid(long userId) {
		return getPersistence().findByitemLostUserid(userId);
	}

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
	public static List<ItemLost> findByitemLostUserid(long userId, int start,
		int end) {
		return getPersistence().findByitemLostUserid(userId, start, end);
	}

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
	public static List<ItemLost> findByitemLostUserid(long userId, int start,
		int end, OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .findByitemLostUserid(userId, start, end, orderByComparator);
	}

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
	public static List<ItemLost> findByitemLostUserid(long userId, int start,
		int end, OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByitemLostUserid(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByitemLostUserid_First(long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByitemLostUserid_First(userId, orderByComparator);
	}

	/**
	* Returns the first item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByitemLostUserid_First(long userId,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByitemLostUserid_First(userId, orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByitemLostUserid_Last(long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByitemLostUserid_Last(userId, orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByitemLostUserid_Last(long userId,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByitemLostUserid_Last(userId, orderByComparator);
	}

	/**
	* Returns the item losts before and after the current item lost in the ordered set where userId = &#63;.
	*
	* @param itemLostId the primary key of the current item lost
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item lost
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public static ItemLost[] findByitemLostUserid_PrevAndNext(long itemLostId,
		long userId, OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByitemLostUserid_PrevAndNext(itemLostId, userId,
			orderByComparator);
	}

	/**
	* Removes all the item losts where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByitemLostUserid(long userId) {
		getPersistence().removeByitemLostUserid(userId);
	}

	/**
	* Returns the number of item losts where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching item losts
	*/
	public static int countByitemLostUserid(long userId) {
		return getPersistence().countByitemLostUserid(userId);
	}

	/**
	* Returns all the item losts where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @return the matching item losts
	*/
	public static List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus) {
		return getPersistence().findByItemStatusMatch(LostStatus);
	}

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
	public static List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus, int start, int end) {
		return getPersistence().findByItemStatusMatch(LostStatus, start, end);
	}

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
	public static List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus, int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .findByItemStatusMatch(LostStatus, start, end,
			orderByComparator);
	}

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
	public static List<ItemLost> findByItemStatusMatch(
		java.lang.String LostStatus, int start, int end,
		OrderByComparator<ItemLost> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByItemStatusMatch(LostStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByItemStatusMatch_First(
		java.lang.String LostStatus,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByItemStatusMatch_First(LostStatus, orderByComparator);
	}

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByItemStatusMatch_First(
		java.lang.String LostStatus,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByItemStatusMatch_First(LostStatus, orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByItemStatusMatch_Last(
		java.lang.String LostStatus,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByItemStatusMatch_Last(LostStatus, orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByItemStatusMatch_Last(
		java.lang.String LostStatus,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByItemStatusMatch_Last(LostStatus, orderByComparator);
	}

	/**
	* Returns the item losts before and after the current item lost in the ordered set where LostStatus = &#63;.
	*
	* @param itemLostId the primary key of the current item lost
	* @param LostStatus the lost status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item lost
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public static ItemLost[] findByItemStatusMatch_PrevAndNext(
		long itemLostId, java.lang.String LostStatus,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByItemStatusMatch_PrevAndNext(itemLostId, LostStatus,
			orderByComparator);
	}

	/**
	* Removes all the item losts where LostStatus = &#63; from the database.
	*
	* @param LostStatus the lost status
	*/
	public static void removeByItemStatusMatch(java.lang.String LostStatus) {
		getPersistence().removeByItemStatusMatch(LostStatus);
	}

	/**
	* Returns the number of item losts where LostStatus = &#63;.
	*
	* @param LostStatus the lost status
	* @return the number of matching item losts
	*/
	public static int countByItemStatusMatch(java.lang.String LostStatus) {
		return getPersistence().countByItemStatusMatch(LostStatus);
	}

	/**
	* Returns all the item losts where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @return the matching item losts
	*/
	public static List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId) {
		return getPersistence().findByItemStstausAndUser(LostStatus, userId);
	}

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
	public static List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId, int start, int end) {
		return getPersistence()
				   .findByItemStstausAndUser(LostStatus, userId, start, end);
	}

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
	public static List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .findByItemStstausAndUser(LostStatus, userId, start, end,
			orderByComparator);
	}

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
	public static List<ItemLost> findByItemStstausAndUser(
		java.lang.String LostStatus, long userId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByItemStstausAndUser(LostStatus, userId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByItemStstausAndUser_First(
		java.lang.String LostStatus, long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByItemStstausAndUser_First(LostStatus, userId,
			orderByComparator);
	}

	/**
	* Returns the first item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByItemStstausAndUser_First(
		java.lang.String LostStatus, long userId,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByItemStstausAndUser_First(LostStatus, userId,
			orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost
	* @throws NoSuchItemLostException if a matching item lost could not be found
	*/
	public static ItemLost findByItemStstausAndUser_Last(
		java.lang.String LostStatus, long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByItemStstausAndUser_Last(LostStatus, userId,
			orderByComparator);
	}

	/**
	* Returns the last item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	*/
	public static ItemLost fetchByItemStstausAndUser_Last(
		java.lang.String LostStatus, long userId,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence()
				   .fetchByItemStstausAndUser_Last(LostStatus, userId,
			orderByComparator);
	}

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
	public static ItemLost[] findByItemStstausAndUser_PrevAndNext(
		long itemLostId, java.lang.String LostStatus, long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence()
				   .findByItemStstausAndUser_PrevAndNext(itemLostId,
			LostStatus, userId, orderByComparator);
	}

	/**
	* Removes all the item losts where LostStatus = &#63; and userId = &#63; from the database.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	*/
	public static void removeByItemStstausAndUser(java.lang.String LostStatus,
		long userId) {
		getPersistence().removeByItemStstausAndUser(LostStatus, userId);
	}

	/**
	* Returns the number of item losts where LostStatus = &#63; and userId = &#63;.
	*
	* @param LostStatus the lost status
	* @param userId the user ID
	* @return the number of matching item losts
	*/
	public static int countByItemStstausAndUser(java.lang.String LostStatus,
		long userId) {
		return getPersistence().countByItemStstausAndUser(LostStatus, userId);
	}

	/**
	* Caches the item lost in the entity cache if it is enabled.
	*
	* @param itemLost the item lost
	*/
	public static void cacheResult(ItemLost itemLost) {
		getPersistence().cacheResult(itemLost);
	}

	/**
	* Caches the item losts in the entity cache if it is enabled.
	*
	* @param itemLosts the item losts
	*/
	public static void cacheResult(List<ItemLost> itemLosts) {
		getPersistence().cacheResult(itemLosts);
	}

	/**
	* Creates a new item lost with the primary key. Does not add the item lost to the database.
	*
	* @param itemLostId the primary key for the new item lost
	* @return the new item lost
	*/
	public static ItemLost create(long itemLostId) {
		return getPersistence().create(itemLostId);
	}

	/**
	* Removes the item lost with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost that was removed
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public static ItemLost remove(long itemLostId)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence().remove(itemLostId);
	}

	public static ItemLost updateImpl(ItemLost itemLost) {
		return getPersistence().updateImpl(itemLost);
	}

	/**
	* Returns the item lost with the primary key or throws a {@link NoSuchItemLostException} if it could not be found.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost
	* @throws NoSuchItemLostException if a item lost with the primary key could not be found
	*/
	public static ItemLost findByPrimaryKey(long itemLostId)
		throws com.Trylof.services.exception.NoSuchItemLostException {
		return getPersistence().findByPrimaryKey(itemLostId);
	}

	/**
	* Returns the item lost with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemLostId the primary key of the item lost
	* @return the item lost, or <code>null</code> if a item lost with the primary key could not be found
	*/
	public static ItemLost fetchByPrimaryKey(long itemLostId) {
		return getPersistence().fetchByPrimaryKey(itemLostId);
	}

	public static java.util.Map<java.io.Serializable, ItemLost> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the item losts.
	*
	* @return the item losts
	*/
	public static List<ItemLost> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ItemLost> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ItemLost> findAll(int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ItemLost> findAll(int start, int end,
		OrderByComparator<ItemLost> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the item losts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of item losts.
	*
	* @return the number of item losts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemLostPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ItemLostPersistence)PortletBeanLocatorUtil.locate(com.Trylof.services.service.ClpSerializer.getServletContextName(),
					ItemLostPersistence.class.getName());

			ReferenceRegistry.registerReference(ItemLostUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static ItemLostPersistence _persistence;
}