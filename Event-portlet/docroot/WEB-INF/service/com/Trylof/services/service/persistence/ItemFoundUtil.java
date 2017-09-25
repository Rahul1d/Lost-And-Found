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

import com.Trylof.services.model.ItemFound;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the item found service. This utility wraps {@link com.Trylof.services.service.persistence.impl.ItemFoundPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see ItemFoundPersistence
 * @see com.Trylof.services.service.persistence.impl.ItemFoundPersistenceImpl
 * @generated
 */
@ProviderType
public class ItemFoundUtil {
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
	public static void clearCache(ItemFound itemFound) {
		getPersistence().clearCache(itemFound);
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
	public static List<ItemFound> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ItemFound> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ItemFound> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ItemFound> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ItemFound update(ItemFound itemFound) {
		return getPersistence().update(itemFound);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ItemFound update(ItemFound itemFound,
		ServiceContext serviceContext) {
		return getPersistence().update(itemFound, serviceContext);
	}

	/**
	* Returns all the item founds where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @return the matching item founds
	*/
	public static List<ItemFound> findByItemType(java.lang.String FoundType) {
		return getPersistence().findByItemType(FoundType);
	}

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
	public static List<ItemFound> findByItemType(java.lang.String FoundType,
		int start, int end) {
		return getPersistence().findByItemType(FoundType, start, end);
	}

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
	public static List<ItemFound> findByItemType(java.lang.String FoundType,
		int start, int end, OrderByComparator<ItemFound> orderByComparator) {
		return getPersistence()
				   .findByItemType(FoundType, start, end, orderByComparator);
	}

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
	public static List<ItemFound> findByItemType(java.lang.String FoundType,
		int start, int end, OrderByComparator<ItemFound> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByItemType(FoundType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item found
	* @throws NoSuchItemFoundException if a matching item found could not be found
	*/
	public static ItemFound findByItemType_First(java.lang.String FoundType,
		OrderByComparator<ItemFound> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemFoundException {
		return getPersistence()
				   .findByItemType_First(FoundType, orderByComparator);
	}

	/**
	* Returns the first item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item found, or <code>null</code> if a matching item found could not be found
	*/
	public static ItemFound fetchByItemType_First(java.lang.String FoundType,
		OrderByComparator<ItemFound> orderByComparator) {
		return getPersistence()
				   .fetchByItemType_First(FoundType, orderByComparator);
	}

	/**
	* Returns the last item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item found
	* @throws NoSuchItemFoundException if a matching item found could not be found
	*/
	public static ItemFound findByItemType_Last(java.lang.String FoundType,
		OrderByComparator<ItemFound> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemFoundException {
		return getPersistence().findByItemType_Last(FoundType, orderByComparator);
	}

	/**
	* Returns the last item found in the ordered set where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item found, or <code>null</code> if a matching item found could not be found
	*/
	public static ItemFound fetchByItemType_Last(java.lang.String FoundType,
		OrderByComparator<ItemFound> orderByComparator) {
		return getPersistence()
				   .fetchByItemType_Last(FoundType, orderByComparator);
	}

	/**
	* Returns the item founds before and after the current item found in the ordered set where FoundType = &#63;.
	*
	* @param itemFoundId the primary key of the current item found
	* @param FoundType the found type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item found
	* @throws NoSuchItemFoundException if a item found with the primary key could not be found
	*/
	public static ItemFound[] findByItemType_PrevAndNext(long itemFoundId,
		java.lang.String FoundType,
		OrderByComparator<ItemFound> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemFoundException {
		return getPersistence()
				   .findByItemType_PrevAndNext(itemFoundId, FoundType,
			orderByComparator);
	}

	/**
	* Removes all the item founds where FoundType = &#63; from the database.
	*
	* @param FoundType the found type
	*/
	public static void removeByItemType(java.lang.String FoundType) {
		getPersistence().removeByItemType(FoundType);
	}

	/**
	* Returns the number of item founds where FoundType = &#63;.
	*
	* @param FoundType the found type
	* @return the number of matching item founds
	*/
	public static int countByItemType(java.lang.String FoundType) {
		return getPersistence().countByItemType(FoundType);
	}

	/**
	* Caches the item found in the entity cache if it is enabled.
	*
	* @param itemFound the item found
	*/
	public static void cacheResult(ItemFound itemFound) {
		getPersistence().cacheResult(itemFound);
	}

	/**
	* Caches the item founds in the entity cache if it is enabled.
	*
	* @param itemFounds the item founds
	*/
	public static void cacheResult(List<ItemFound> itemFounds) {
		getPersistence().cacheResult(itemFounds);
	}

	/**
	* Creates a new item found with the primary key. Does not add the item found to the database.
	*
	* @param itemFoundId the primary key for the new item found
	* @return the new item found
	*/
	public static ItemFound create(long itemFoundId) {
		return getPersistence().create(itemFoundId);
	}

	/**
	* Removes the item found with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found that was removed
	* @throws NoSuchItemFoundException if a item found with the primary key could not be found
	*/
	public static ItemFound remove(long itemFoundId)
		throws com.Trylof.services.exception.NoSuchItemFoundException {
		return getPersistence().remove(itemFoundId);
	}

	public static ItemFound updateImpl(ItemFound itemFound) {
		return getPersistence().updateImpl(itemFound);
	}

	/**
	* Returns the item found with the primary key or throws a {@link NoSuchItemFoundException} if it could not be found.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found
	* @throws NoSuchItemFoundException if a item found with the primary key could not be found
	*/
	public static ItemFound findByPrimaryKey(long itemFoundId)
		throws com.Trylof.services.exception.NoSuchItemFoundException {
		return getPersistence().findByPrimaryKey(itemFoundId);
	}

	/**
	* Returns the item found with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemFoundId the primary key of the item found
	* @return the item found, or <code>null</code> if a item found with the primary key could not be found
	*/
	public static ItemFound fetchByPrimaryKey(long itemFoundId) {
		return getPersistence().fetchByPrimaryKey(itemFoundId);
	}

	public static java.util.Map<java.io.Serializable, ItemFound> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the item founds.
	*
	* @return the item founds
	*/
	public static List<ItemFound> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ItemFound> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ItemFound> findAll(int start, int end,
		OrderByComparator<ItemFound> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ItemFound> findAll(int start, int end,
		OrderByComparator<ItemFound> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the item founds from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of item founds.
	*
	* @return the number of item founds
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemFoundPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ItemFoundPersistence)PortletBeanLocatorUtil.locate(com.Trylof.services.service.ClpSerializer.getServletContextName(),
					ItemFoundPersistence.class.getName());

			ReferenceRegistry.registerReference(ItemFoundUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static ItemFoundPersistence _persistence;
}