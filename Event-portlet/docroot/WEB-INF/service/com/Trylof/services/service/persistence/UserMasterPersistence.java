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

import com.Trylof.services.exception.NoSuchUserMasterException;
import com.Trylof.services.model.UserMaster;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the user master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.persistence.impl.UserMasterPersistenceImpl
 * @see UserMasterUtil
 * @generated
 */
@ProviderType
public interface UserMasterPersistence extends BasePersistence<UserMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserMasterUtil} to access the user master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user masters where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @return the matching user masters
	*/
	public java.util.List<UserMaster> findByuserEmail(
		java.lang.String userEmail, java.lang.String userPass);

	/**
	* Returns a range of all the user masters where userEmail = &#63; and userPass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param start the lower bound of the range of user masters
	* @param end the upper bound of the range of user masters (not inclusive)
	* @return the range of matching user masters
	*/
	public java.util.List<UserMaster> findByuserEmail(
		java.lang.String userEmail, java.lang.String userPass, int start,
		int end);

	/**
	* Returns an ordered range of all the user masters where userEmail = &#63; and userPass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param start the lower bound of the range of user masters
	* @param end the upper bound of the range of user masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user masters
	*/
	public java.util.List<UserMaster> findByuserEmail(
		java.lang.String userEmail, java.lang.String userPass, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator);

	/**
	* Returns an ordered range of all the user masters where userEmail = &#63; and userPass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param start the lower bound of the range of user masters
	* @param end the upper bound of the range of user masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching user masters
	*/
	public java.util.List<UserMaster> findByuserEmail(
		java.lang.String userEmail, java.lang.String userPass, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user master
	* @throws NoSuchUserMasterException if a matching user master could not be found
	*/
	public UserMaster findByuserEmail_First(java.lang.String userEmail,
		java.lang.String userPass,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator)
		throws NoSuchUserMasterException;

	/**
	* Returns the first user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user master, or <code>null</code> if a matching user master could not be found
	*/
	public UserMaster fetchByuserEmail_First(java.lang.String userEmail,
		java.lang.String userPass,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator);

	/**
	* Returns the last user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user master
	* @throws NoSuchUserMasterException if a matching user master could not be found
	*/
	public UserMaster findByuserEmail_Last(java.lang.String userEmail,
		java.lang.String userPass,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator)
		throws NoSuchUserMasterException;

	/**
	* Returns the last user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user master, or <code>null</code> if a matching user master could not be found
	*/
	public UserMaster fetchByuserEmail_Last(java.lang.String userEmail,
		java.lang.String userPass,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator);

	/**
	* Returns the user masters before and after the current user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userMasterId the primary key of the current user master
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user master
	* @throws NoSuchUserMasterException if a user master with the primary key could not be found
	*/
	public UserMaster[] findByuserEmail_PrevAndNext(long userMasterId,
		java.lang.String userEmail, java.lang.String userPass,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator)
		throws NoSuchUserMasterException;

	/**
	* Removes all the user masters where userEmail = &#63; and userPass = &#63; from the database.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	*/
	public void removeByuserEmail(java.lang.String userEmail,
		java.lang.String userPass);

	/**
	* Returns the number of user masters where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @return the number of matching user masters
	*/
	public int countByuserEmail(java.lang.String userEmail,
		java.lang.String userPass);

	/**
	* Caches the user master in the entity cache if it is enabled.
	*
	* @param userMaster the user master
	*/
	public void cacheResult(UserMaster userMaster);

	/**
	* Caches the user masters in the entity cache if it is enabled.
	*
	* @param userMasters the user masters
	*/
	public void cacheResult(java.util.List<UserMaster> userMasters);

	/**
	* Creates a new user master with the primary key. Does not add the user master to the database.
	*
	* @param userMasterId the primary key for the new user master
	* @return the new user master
	*/
	public UserMaster create(long userMasterId);

	/**
	* Removes the user master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userMasterId the primary key of the user master
	* @return the user master that was removed
	* @throws NoSuchUserMasterException if a user master with the primary key could not be found
	*/
	public UserMaster remove(long userMasterId)
		throws NoSuchUserMasterException;

	public UserMaster updateImpl(UserMaster userMaster);

	/**
	* Returns the user master with the primary key or throws a {@link NoSuchUserMasterException} if it could not be found.
	*
	* @param userMasterId the primary key of the user master
	* @return the user master
	* @throws NoSuchUserMasterException if a user master with the primary key could not be found
	*/
	public UserMaster findByPrimaryKey(long userMasterId)
		throws NoSuchUserMasterException;

	/**
	* Returns the user master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userMasterId the primary key of the user master
	* @return the user master, or <code>null</code> if a user master with the primary key could not be found
	*/
	public UserMaster fetchByPrimaryKey(long userMasterId);

	@Override
	public java.util.Map<java.io.Serializable, UserMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the user masters.
	*
	* @return the user masters
	*/
	public java.util.List<UserMaster> findAll();

	/**
	* Returns a range of all the user masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user masters
	* @param end the upper bound of the range of user masters (not inclusive)
	* @return the range of user masters
	*/
	public java.util.List<UserMaster> findAll(int start, int end);

	/**
	* Returns an ordered range of all the user masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user masters
	* @param end the upper bound of the range of user masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user masters
	*/
	public java.util.List<UserMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator);

	/**
	* Returns an ordered range of all the user masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user masters
	* @param end the upper bound of the range of user masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of user masters
	*/
	public java.util.List<UserMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserMaster> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the user masters from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of user masters.
	*
	* @return the number of user masters
	*/
	public int countAll();
}