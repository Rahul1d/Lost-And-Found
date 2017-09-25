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

import com.Trylof.services.model.UserMaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the user master service. This utility wraps {@link com.Trylof.services.service.persistence.impl.UserMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see UserMasterPersistence
 * @see com.Trylof.services.service.persistence.impl.UserMasterPersistenceImpl
 * @generated
 */
@ProviderType
public class UserMasterUtil {
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
	public static void clearCache(UserMaster userMaster) {
		getPersistence().clearCache(userMaster);
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
	public static List<UserMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UserMaster> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UserMaster update(UserMaster userMaster) {
		return getPersistence().update(userMaster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UserMaster update(UserMaster userMaster,
		ServiceContext serviceContext) {
		return getPersistence().update(userMaster, serviceContext);
	}

	/**
	* Returns all the user masters where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @return the matching user masters
	*/
	public static List<UserMaster> findByuserEmail(java.lang.String userEmail,
		java.lang.String userPass) {
		return getPersistence().findByuserEmail(userEmail, userPass);
	}

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
	public static List<UserMaster> findByuserEmail(java.lang.String userEmail,
		java.lang.String userPass, int start, int end) {
		return getPersistence().findByuserEmail(userEmail, userPass, start, end);
	}

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
	public static List<UserMaster> findByuserEmail(java.lang.String userEmail,
		java.lang.String userPass, int start, int end,
		OrderByComparator<UserMaster> orderByComparator) {
		return getPersistence()
				   .findByuserEmail(userEmail, userPass, start, end,
			orderByComparator);
	}

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
	public static List<UserMaster> findByuserEmail(java.lang.String userEmail,
		java.lang.String userPass, int start, int end,
		OrderByComparator<UserMaster> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByuserEmail(userEmail, userPass, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user master
	* @throws NoSuchUserMasterException if a matching user master could not be found
	*/
	public static UserMaster findByuserEmail_First(java.lang.String userEmail,
		java.lang.String userPass,
		OrderByComparator<UserMaster> orderByComparator)
		throws com.Trylof.services.exception.NoSuchUserMasterException {
		return getPersistence()
				   .findByuserEmail_First(userEmail, userPass, orderByComparator);
	}

	/**
	* Returns the first user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user master, or <code>null</code> if a matching user master could not be found
	*/
	public static UserMaster fetchByuserEmail_First(
		java.lang.String userEmail, java.lang.String userPass,
		OrderByComparator<UserMaster> orderByComparator) {
		return getPersistence()
				   .fetchByuserEmail_First(userEmail, userPass,
			orderByComparator);
	}

	/**
	* Returns the last user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user master
	* @throws NoSuchUserMasterException if a matching user master could not be found
	*/
	public static UserMaster findByuserEmail_Last(java.lang.String userEmail,
		java.lang.String userPass,
		OrderByComparator<UserMaster> orderByComparator)
		throws com.Trylof.services.exception.NoSuchUserMasterException {
		return getPersistence()
				   .findByuserEmail_Last(userEmail, userPass, orderByComparator);
	}

	/**
	* Returns the last user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user master, or <code>null</code> if a matching user master could not be found
	*/
	public static UserMaster fetchByuserEmail_Last(java.lang.String userEmail,
		java.lang.String userPass,
		OrderByComparator<UserMaster> orderByComparator) {
		return getPersistence()
				   .fetchByuserEmail_Last(userEmail, userPass, orderByComparator);
	}

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
	public static UserMaster[] findByuserEmail_PrevAndNext(long userMasterId,
		java.lang.String userEmail, java.lang.String userPass,
		OrderByComparator<UserMaster> orderByComparator)
		throws com.Trylof.services.exception.NoSuchUserMasterException {
		return getPersistence()
				   .findByuserEmail_PrevAndNext(userMasterId, userEmail,
			userPass, orderByComparator);
	}

	/**
	* Removes all the user masters where userEmail = &#63; and userPass = &#63; from the database.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	*/
	public static void removeByuserEmail(java.lang.String userEmail,
		java.lang.String userPass) {
		getPersistence().removeByuserEmail(userEmail, userPass);
	}

	/**
	* Returns the number of user masters where userEmail = &#63; and userPass = &#63;.
	*
	* @param userEmail the user email
	* @param userPass the user pass
	* @return the number of matching user masters
	*/
	public static int countByuserEmail(java.lang.String userEmail,
		java.lang.String userPass) {
		return getPersistence().countByuserEmail(userEmail, userPass);
	}

	/**
	* Caches the user master in the entity cache if it is enabled.
	*
	* @param userMaster the user master
	*/
	public static void cacheResult(UserMaster userMaster) {
		getPersistence().cacheResult(userMaster);
	}

	/**
	* Caches the user masters in the entity cache if it is enabled.
	*
	* @param userMasters the user masters
	*/
	public static void cacheResult(List<UserMaster> userMasters) {
		getPersistence().cacheResult(userMasters);
	}

	/**
	* Creates a new user master with the primary key. Does not add the user master to the database.
	*
	* @param userMasterId the primary key for the new user master
	* @return the new user master
	*/
	public static UserMaster create(long userMasterId) {
		return getPersistence().create(userMasterId);
	}

	/**
	* Removes the user master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userMasterId the primary key of the user master
	* @return the user master that was removed
	* @throws NoSuchUserMasterException if a user master with the primary key could not be found
	*/
	public static UserMaster remove(long userMasterId)
		throws com.Trylof.services.exception.NoSuchUserMasterException {
		return getPersistence().remove(userMasterId);
	}

	public static UserMaster updateImpl(UserMaster userMaster) {
		return getPersistence().updateImpl(userMaster);
	}

	/**
	* Returns the user master with the primary key or throws a {@link NoSuchUserMasterException} if it could not be found.
	*
	* @param userMasterId the primary key of the user master
	* @return the user master
	* @throws NoSuchUserMasterException if a user master with the primary key could not be found
	*/
	public static UserMaster findByPrimaryKey(long userMasterId)
		throws com.Trylof.services.exception.NoSuchUserMasterException {
		return getPersistence().findByPrimaryKey(userMasterId);
	}

	/**
	* Returns the user master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userMasterId the primary key of the user master
	* @return the user master, or <code>null</code> if a user master with the primary key could not be found
	*/
	public static UserMaster fetchByPrimaryKey(long userMasterId) {
		return getPersistence().fetchByPrimaryKey(userMasterId);
	}

	public static java.util.Map<java.io.Serializable, UserMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the user masters.
	*
	* @return the user masters
	*/
	public static List<UserMaster> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<UserMaster> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<UserMaster> findAll(int start, int end,
		OrderByComparator<UserMaster> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<UserMaster> findAll(int start, int end,
		OrderByComparator<UserMaster> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the user masters from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user masters.
	*
	* @return the number of user masters
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UserMasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserMasterPersistence)PortletBeanLocatorUtil.locate(com.Trylof.services.service.ClpSerializer.getServletContextName(),
					UserMasterPersistence.class.getName());

			ReferenceRegistry.registerReference(UserMasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static UserMasterPersistence _persistence;
}