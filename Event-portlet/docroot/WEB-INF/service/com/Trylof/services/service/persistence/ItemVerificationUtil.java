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

import com.Trylof.services.model.ItemVerification;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the item verification service. This utility wraps {@link com.Trylof.services.service.persistence.impl.ItemVerificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see ItemVerificationPersistence
 * @see com.Trylof.services.service.persistence.impl.ItemVerificationPersistenceImpl
 * @generated
 */
@ProviderType
public class ItemVerificationUtil {
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
	public static void clearCache(ItemVerification itemVerification) {
		getPersistence().clearCache(itemVerification);
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
	public static List<ItemVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ItemVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ItemVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ItemVerification> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ItemVerification update(ItemVerification itemVerification) {
		return getPersistence().update(itemVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ItemVerification update(ItemVerification itemVerification,
		ServiceContext serviceContext) {
		return getPersistence().update(itemVerification, serviceContext);
	}

	/**
	* Returns the item verification where LostItemid = &#63; or throws a {@link NoSuchItemVerificationException} if it could not be found.
	*
	* @param LostItemid the lost itemid
	* @return the matching item verification
	* @throws NoSuchItemVerificationException if a matching item verification could not be found
	*/
	public static ItemVerification findByLostItemIdMatch(long LostItemid)
		throws com.Trylof.services.exception.NoSuchItemVerificationException {
		return getPersistence().findByLostItemIdMatch(LostItemid);
	}

	/**
	* Returns the item verification where LostItemid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param LostItemid the lost itemid
	* @return the matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public static ItemVerification fetchByLostItemIdMatch(long LostItemid) {
		return getPersistence().fetchByLostItemIdMatch(LostItemid);
	}

	/**
	* Returns the item verification where LostItemid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param LostItemid the lost itemid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public static ItemVerification fetchByLostItemIdMatch(long LostItemid,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByLostItemIdMatch(LostItemid, retrieveFromCache);
	}

	/**
	* Removes the item verification where LostItemid = &#63; from the database.
	*
	* @param LostItemid the lost itemid
	* @return the item verification that was removed
	*/
	public static ItemVerification removeByLostItemIdMatch(long LostItemid)
		throws com.Trylof.services.exception.NoSuchItemVerificationException {
		return getPersistence().removeByLostItemIdMatch(LostItemid);
	}

	/**
	* Returns the number of item verifications where LostItemid = &#63;.
	*
	* @param LostItemid the lost itemid
	* @return the number of matching item verifications
	*/
	public static int countByLostItemIdMatch(long LostItemid) {
		return getPersistence().countByLostItemIdMatch(LostItemid);
	}

	/**
	* Returns all the item verifications where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @return the matching item verifications
	*/
	public static List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus) {
		return getPersistence().findByUserMatch(UserId, VerifyStatus);
	}

	/**
	* Returns a range of all the item verifications where UserId = &#63; and VerifyStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param start the lower bound of the range of item verifications
	* @param end the upper bound of the range of item verifications (not inclusive)
	* @return the range of matching item verifications
	*/
	public static List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus, int start, int end) {
		return getPersistence().findByUserMatch(UserId, VerifyStatus, start, end);
	}

	/**
	* Returns an ordered range of all the item verifications where UserId = &#63; and VerifyStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param start the lower bound of the range of item verifications
	* @param end the upper bound of the range of item verifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching item verifications
	*/
	public static List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus, int start, int end,
		OrderByComparator<ItemVerification> orderByComparator) {
		return getPersistence()
				   .findByUserMatch(UserId, VerifyStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the item verifications where UserId = &#63; and VerifyStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param start the lower bound of the range of item verifications
	* @param end the upper bound of the range of item verifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching item verifications
	*/
	public static List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus, int start, int end,
		OrderByComparator<ItemVerification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUserMatch(UserId, VerifyStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item verification
	* @throws NoSuchItemVerificationException if a matching item verification could not be found
	*/
	public static ItemVerification findByUserMatch_First(long UserId,
		java.lang.String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemVerificationException {
		return getPersistence()
				   .findByUserMatch_First(UserId, VerifyStatus,
			orderByComparator);
	}

	/**
	* Returns the first item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public static ItemVerification fetchByUserMatch_First(long UserId,
		java.lang.String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator) {
		return getPersistence()
				   .fetchByUserMatch_First(UserId, VerifyStatus,
			orderByComparator);
	}

	/**
	* Returns the last item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item verification
	* @throws NoSuchItemVerificationException if a matching item verification could not be found
	*/
	public static ItemVerification findByUserMatch_Last(long UserId,
		java.lang.String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemVerificationException {
		return getPersistence()
				   .findByUserMatch_Last(UserId, VerifyStatus, orderByComparator);
	}

	/**
	* Returns the last item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public static ItemVerification fetchByUserMatch_Last(long UserId,
		java.lang.String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator) {
		return getPersistence()
				   .fetchByUserMatch_Last(UserId, VerifyStatus,
			orderByComparator);
	}

	/**
	* Returns the item verifications before and after the current item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param itemVerificationId the primary key of the current item verification
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next item verification
	* @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	*/
	public static ItemVerification[] findByUserMatch_PrevAndNext(
		long itemVerificationId, long UserId, java.lang.String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator)
		throws com.Trylof.services.exception.NoSuchItemVerificationException {
		return getPersistence()
				   .findByUserMatch_PrevAndNext(itemVerificationId, UserId,
			VerifyStatus, orderByComparator);
	}

	/**
	* Removes all the item verifications where UserId = &#63; and VerifyStatus = &#63; from the database.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	*/
	public static void removeByUserMatch(long UserId,
		java.lang.String VerifyStatus) {
		getPersistence().removeByUserMatch(UserId, VerifyStatus);
	}

	/**
	* Returns the number of item verifications where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @return the number of matching item verifications
	*/
	public static int countByUserMatch(long UserId,
		java.lang.String VerifyStatus) {
		return getPersistence().countByUserMatch(UserId, VerifyStatus);
	}

	/**
	* Caches the item verification in the entity cache if it is enabled.
	*
	* @param itemVerification the item verification
	*/
	public static void cacheResult(ItemVerification itemVerification) {
		getPersistence().cacheResult(itemVerification);
	}

	/**
	* Caches the item verifications in the entity cache if it is enabled.
	*
	* @param itemVerifications the item verifications
	*/
	public static void cacheResult(List<ItemVerification> itemVerifications) {
		getPersistence().cacheResult(itemVerifications);
	}

	/**
	* Creates a new item verification with the primary key. Does not add the item verification to the database.
	*
	* @param itemVerificationId the primary key for the new item verification
	* @return the new item verification
	*/
	public static ItemVerification create(long itemVerificationId) {
		return getPersistence().create(itemVerificationId);
	}

	/**
	* Removes the item verification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification that was removed
	* @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	*/
	public static ItemVerification remove(long itemVerificationId)
		throws com.Trylof.services.exception.NoSuchItemVerificationException {
		return getPersistence().remove(itemVerificationId);
	}

	public static ItemVerification updateImpl(ItemVerification itemVerification) {
		return getPersistence().updateImpl(itemVerification);
	}

	/**
	* Returns the item verification with the primary key or throws a {@link NoSuchItemVerificationException} if it could not be found.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification
	* @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	*/
	public static ItemVerification findByPrimaryKey(long itemVerificationId)
		throws com.Trylof.services.exception.NoSuchItemVerificationException {
		return getPersistence().findByPrimaryKey(itemVerificationId);
	}

	/**
	* Returns the item verification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification, or <code>null</code> if a item verification with the primary key could not be found
	*/
	public static ItemVerification fetchByPrimaryKey(long itemVerificationId) {
		return getPersistence().fetchByPrimaryKey(itemVerificationId);
	}

	public static java.util.Map<java.io.Serializable, ItemVerification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the item verifications.
	*
	* @return the item verifications
	*/
	public static List<ItemVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the item verifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item verifications
	* @param end the upper bound of the range of item verifications (not inclusive)
	* @return the range of item verifications
	*/
	public static List<ItemVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the item verifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item verifications
	* @param end the upper bound of the range of item verifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of item verifications
	*/
	public static List<ItemVerification> findAll(int start, int end,
		OrderByComparator<ItemVerification> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the item verifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ItemVerificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of item verifications
	* @param end the upper bound of the range of item verifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of item verifications
	*/
	public static List<ItemVerification> findAll(int start, int end,
		OrderByComparator<ItemVerification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the item verifications from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of item verifications.
	*
	* @return the number of item verifications
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemVerificationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ItemVerificationPersistence)PortletBeanLocatorUtil.locate(com.Trylof.services.service.ClpSerializer.getServletContextName(),
					ItemVerificationPersistence.class.getName());

			ReferenceRegistry.registerReference(ItemVerificationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static ItemVerificationPersistence _persistence;
}