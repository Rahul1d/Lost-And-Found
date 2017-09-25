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

import com.Trylof.services.exception.NoSuchItemVerificationException;
import com.Trylof.services.model.ItemVerification;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the item verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.persistence.impl.ItemVerificationPersistenceImpl
 * @see ItemVerificationUtil
 * @generated
 */
@ProviderType
public interface ItemVerificationPersistence extends BasePersistence<ItemVerification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemVerificationUtil} to access the item verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the item verification where LostItemid = &#63; or throws a {@link NoSuchItemVerificationException} if it could not be found.
	*
	* @param LostItemid the lost itemid
	* @return the matching item verification
	* @throws NoSuchItemVerificationException if a matching item verification could not be found
	*/
	public ItemVerification findByLostItemIdMatch(long LostItemid)
		throws NoSuchItemVerificationException;

	/**
	* Returns the item verification where LostItemid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param LostItemid the lost itemid
	* @return the matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public ItemVerification fetchByLostItemIdMatch(long LostItemid);

	/**
	* Returns the item verification where LostItemid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param LostItemid the lost itemid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public ItemVerification fetchByLostItemIdMatch(long LostItemid,
		boolean retrieveFromCache);

	/**
	* Removes the item verification where LostItemid = &#63; from the database.
	*
	* @param LostItemid the lost itemid
	* @return the item verification that was removed
	*/
	public ItemVerification removeByLostItemIdMatch(long LostItemid)
		throws NoSuchItemVerificationException;

	/**
	* Returns the number of item verifications where LostItemid = &#63;.
	*
	* @param LostItemid the lost itemid
	* @return the number of matching item verifications
	*/
	public int countByLostItemIdMatch(long LostItemid);

	/**
	* Returns all the item verifications where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @return the matching item verifications
	*/
	public java.util.List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus);

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
	public java.util.List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus, int start, int end);

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
	public java.util.List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator);

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
	public java.util.List<ItemVerification> findByUserMatch(long UserId,
		java.lang.String VerifyStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item verification
	* @throws NoSuchItemVerificationException if a matching item verification could not be found
	*/
	public ItemVerification findByUserMatch_First(long UserId,
		java.lang.String VerifyStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator)
		throws NoSuchItemVerificationException;

	/**
	* Returns the first item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public ItemVerification fetchByUserMatch_First(long UserId,
		java.lang.String VerifyStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator);

	/**
	* Returns the last item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item verification
	* @throws NoSuchItemVerificationException if a matching item verification could not be found
	*/
	public ItemVerification findByUserMatch_Last(long UserId,
		java.lang.String VerifyStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator)
		throws NoSuchItemVerificationException;

	/**
	* Returns the last item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching item verification, or <code>null</code> if a matching item verification could not be found
	*/
	public ItemVerification fetchByUserMatch_Last(long UserId,
		java.lang.String VerifyStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator);

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
	public ItemVerification[] findByUserMatch_PrevAndNext(
		long itemVerificationId, long UserId, java.lang.String VerifyStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator)
		throws NoSuchItemVerificationException;

	/**
	* Removes all the item verifications where UserId = &#63; and VerifyStatus = &#63; from the database.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	*/
	public void removeByUserMatch(long UserId, java.lang.String VerifyStatus);

	/**
	* Returns the number of item verifications where UserId = &#63; and VerifyStatus = &#63;.
	*
	* @param UserId the user ID
	* @param VerifyStatus the verify status
	* @return the number of matching item verifications
	*/
	public int countByUserMatch(long UserId, java.lang.String VerifyStatus);

	/**
	* Caches the item verification in the entity cache if it is enabled.
	*
	* @param itemVerification the item verification
	*/
	public void cacheResult(ItemVerification itemVerification);

	/**
	* Caches the item verifications in the entity cache if it is enabled.
	*
	* @param itemVerifications the item verifications
	*/
	public void cacheResult(java.util.List<ItemVerification> itemVerifications);

	/**
	* Creates a new item verification with the primary key. Does not add the item verification to the database.
	*
	* @param itemVerificationId the primary key for the new item verification
	* @return the new item verification
	*/
	public ItemVerification create(long itemVerificationId);

	/**
	* Removes the item verification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification that was removed
	* @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	*/
	public ItemVerification remove(long itemVerificationId)
		throws NoSuchItemVerificationException;

	public ItemVerification updateImpl(ItemVerification itemVerification);

	/**
	* Returns the item verification with the primary key or throws a {@link NoSuchItemVerificationException} if it could not be found.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification
	* @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	*/
	public ItemVerification findByPrimaryKey(long itemVerificationId)
		throws NoSuchItemVerificationException;

	/**
	* Returns the item verification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemVerificationId the primary key of the item verification
	* @return the item verification, or <code>null</code> if a item verification with the primary key could not be found
	*/
	public ItemVerification fetchByPrimaryKey(long itemVerificationId);

	@Override
	public java.util.Map<java.io.Serializable, ItemVerification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the item verifications.
	*
	* @return the item verifications
	*/
	public java.util.List<ItemVerification> findAll();

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
	public java.util.List<ItemVerification> findAll(int start, int end);

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
	public java.util.List<ItemVerification> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator);

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
	public java.util.List<ItemVerification> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemVerification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the item verifications from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of item verifications.
	*
	* @return the number of item verifications
	*/
	public int countAll();
}