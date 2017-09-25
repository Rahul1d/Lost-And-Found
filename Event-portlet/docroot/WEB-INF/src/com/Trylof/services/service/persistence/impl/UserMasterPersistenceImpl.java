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

package com.Trylof.services.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.Trylof.services.exception.NoSuchUserMasterException;
import com.Trylof.services.model.UserMaster;
import com.Trylof.services.model.impl.UserMasterImpl;
import com.Trylof.services.model.impl.UserMasterModelImpl;
import com.Trylof.services.service.persistence.UserMasterPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the user master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see UserMasterPersistence
 * @see com.Trylof.services.service.persistence.UserMasterUtil
 * @generated
 */
@ProviderType
public class UserMasterPersistenceImpl extends BasePersistenceImpl<UserMaster>
	implements UserMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserMasterUtil} to access the user master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterModelImpl.FINDER_CACHE_ENABLED, UserMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterModelImpl.FINDER_CACHE_ENABLED, UserMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USEREMAIL =
		new FinderPath(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterModelImpl.FINDER_CACHE_ENABLED, UserMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserEmail",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USEREMAIL =
		new FinderPath(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterModelImpl.FINDER_CACHE_ENABLED, UserMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserEmail",
			new String[] { String.class.getName(), String.class.getName() },
			UserMasterModelImpl.USEREMAIL_COLUMN_BITMASK |
			UserMasterModelImpl.USERPASS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USEREMAIL = new FinderPath(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserEmail",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the user masters where userEmail = &#63; and userPass = &#63;.
	 *
	 * @param userEmail the user email
	 * @param userPass the user pass
	 * @return the matching user masters
	 */
	@Override
	public List<UserMaster> findByuserEmail(String userEmail, String userPass) {
		return findByuserEmail(userEmail, userPass, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserMaster> findByuserEmail(String userEmail, String userPass,
		int start, int end) {
		return findByuserEmail(userEmail, userPass, start, end, null);
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
	@Override
	public List<UserMaster> findByuserEmail(String userEmail, String userPass,
		int start, int end, OrderByComparator<UserMaster> orderByComparator) {
		return findByuserEmail(userEmail, userPass, start, end,
			orderByComparator, true);
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
	@Override
	public List<UserMaster> findByuserEmail(String userEmail, String userPass,
		int start, int end, OrderByComparator<UserMaster> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USEREMAIL;
			finderArgs = new Object[] { userEmail, userPass };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USEREMAIL;
			finderArgs = new Object[] {
					userEmail, userPass,
					
					start, end, orderByComparator
				};
		}

		List<UserMaster> list = null;

		if (retrieveFromCache) {
			list = (List<UserMaster>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UserMaster userMaster : list) {
					if (!Validator.equals(userEmail, userMaster.getUserEmail()) ||
							!Validator.equals(userPass, userMaster.getUserPass())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_USERMASTER_WHERE);

			boolean bindUserEmail = false;

			if (userEmail == null) {
				query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_1);
			}
			else if (userEmail.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_3);
			}
			else {
				bindUserEmail = true;

				query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_2);
			}

			boolean bindUserPass = false;

			if (userPass == null) {
				query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_1);
			}
			else if (userPass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_3);
			}
			else {
				bindUserPass = true;

				query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserMasterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserEmail) {
					qPos.add(userEmail);
				}

				if (bindUserPass) {
					qPos.add(userPass);
				}

				if (!pagination) {
					list = (List<UserMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UserMaster>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public UserMaster findByuserEmail_First(String userEmail, String userPass,
		OrderByComparator<UserMaster> orderByComparator)
		throws NoSuchUserMasterException {
		UserMaster userMaster = fetchByuserEmail_First(userEmail, userPass,
				orderByComparator);

		if (userMaster != null) {
			return userMaster;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userEmail=");
		msg.append(userEmail);

		msg.append(", userPass=");
		msg.append(userPass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMasterException(msg.toString());
	}

	/**
	 * Returns the first user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	 *
	 * @param userEmail the user email
	 * @param userPass the user pass
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user master, or <code>null</code> if a matching user master could not be found
	 */
	@Override
	public UserMaster fetchByuserEmail_First(String userEmail, String userPass,
		OrderByComparator<UserMaster> orderByComparator) {
		List<UserMaster> list = findByuserEmail(userEmail, userPass, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserMaster findByuserEmail_Last(String userEmail, String userPass,
		OrderByComparator<UserMaster> orderByComparator)
		throws NoSuchUserMasterException {
		UserMaster userMaster = fetchByuserEmail_Last(userEmail, userPass,
				orderByComparator);

		if (userMaster != null) {
			return userMaster;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userEmail=");
		msg.append(userEmail);

		msg.append(", userPass=");
		msg.append(userPass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserMasterException(msg.toString());
	}

	/**
	 * Returns the last user master in the ordered set where userEmail = &#63; and userPass = &#63;.
	 *
	 * @param userEmail the user email
	 * @param userPass the user pass
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user master, or <code>null</code> if a matching user master could not be found
	 */
	@Override
	public UserMaster fetchByuserEmail_Last(String userEmail, String userPass,
		OrderByComparator<UserMaster> orderByComparator) {
		int count = countByuserEmail(userEmail, userPass);

		if (count == 0) {
			return null;
		}

		List<UserMaster> list = findByuserEmail(userEmail, userPass, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserMaster[] findByuserEmail_PrevAndNext(long userMasterId,
		String userEmail, String userPass,
		OrderByComparator<UserMaster> orderByComparator)
		throws NoSuchUserMasterException {
		UserMaster userMaster = findByPrimaryKey(userMasterId);

		Session session = null;

		try {
			session = openSession();

			UserMaster[] array = new UserMasterImpl[3];

			array[0] = getByuserEmail_PrevAndNext(session, userMaster,
					userEmail, userPass, orderByComparator, true);

			array[1] = userMaster;

			array[2] = getByuserEmail_PrevAndNext(session, userMaster,
					userEmail, userPass, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserMaster getByuserEmail_PrevAndNext(Session session,
		UserMaster userMaster, String userEmail, String userPass,
		OrderByComparator<UserMaster> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_USERMASTER_WHERE);

		boolean bindUserEmail = false;

		if (userEmail == null) {
			query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_1);
		}
		else if (userEmail.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_3);
		}
		else {
			bindUserEmail = true;

			query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_2);
		}

		boolean bindUserPass = false;

		if (userPass == null) {
			query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_1);
		}
		else if (userPass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_3);
		}
		else {
			bindUserPass = true;

			query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(UserMasterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUserEmail) {
			qPos.add(userEmail);
		}

		if (bindUserPass) {
			qPos.add(userPass);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userMaster);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserMaster> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user masters where userEmail = &#63; and userPass = &#63; from the database.
	 *
	 * @param userEmail the user email
	 * @param userPass the user pass
	 */
	@Override
	public void removeByuserEmail(String userEmail, String userPass) {
		for (UserMaster userMaster : findByuserEmail(userEmail, userPass,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userMaster);
		}
	}

	/**
	 * Returns the number of user masters where userEmail = &#63; and userPass = &#63;.
	 *
	 * @param userEmail the user email
	 * @param userPass the user pass
	 * @return the number of matching user masters
	 */
	@Override
	public int countByuserEmail(String userEmail, String userPass) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USEREMAIL;

		Object[] finderArgs = new Object[] { userEmail, userPass };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_USERMASTER_WHERE);

			boolean bindUserEmail = false;

			if (userEmail == null) {
				query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_1);
			}
			else if (userEmail.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_3);
			}
			else {
				bindUserEmail = true;

				query.append(_FINDER_COLUMN_USEREMAIL_USEREMAIL_2);
			}

			boolean bindUserPass = false;

			if (userPass == null) {
				query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_1);
			}
			else if (userPass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_3);
			}
			else {
				bindUserPass = true;

				query.append(_FINDER_COLUMN_USEREMAIL_USERPASS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserEmail) {
					qPos.add(userEmail);
				}

				if (bindUserPass) {
					qPos.add(userPass);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USEREMAIL_USEREMAIL_1 = "userMaster.userEmail IS NULL AND ";
	private static final String _FINDER_COLUMN_USEREMAIL_USEREMAIL_2 = "userMaster.userEmail = ? AND ";
	private static final String _FINDER_COLUMN_USEREMAIL_USEREMAIL_3 = "(userMaster.userEmail IS NULL OR userMaster.userEmail = '') AND ";
	private static final String _FINDER_COLUMN_USEREMAIL_USERPASS_1 = "userMaster.userPass IS NULL";
	private static final String _FINDER_COLUMN_USEREMAIL_USERPASS_2 = "userMaster.userPass = ?";
	private static final String _FINDER_COLUMN_USEREMAIL_USERPASS_3 = "(userMaster.userPass IS NULL OR userMaster.userPass = '')";

	public UserMasterPersistenceImpl() {
		setModelClass(UserMaster.class);
	}

	/**
	 * Caches the user master in the entity cache if it is enabled.
	 *
	 * @param userMaster the user master
	 */
	@Override
	public void cacheResult(UserMaster userMaster) {
		entityCache.putResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterImpl.class, userMaster.getPrimaryKey(), userMaster);

		userMaster.resetOriginalValues();
	}

	/**
	 * Caches the user masters in the entity cache if it is enabled.
	 *
	 * @param userMasters the user masters
	 */
	@Override
	public void cacheResult(List<UserMaster> userMasters) {
		for (UserMaster userMaster : userMasters) {
			if (entityCache.getResult(
						UserMasterModelImpl.ENTITY_CACHE_ENABLED,
						UserMasterImpl.class, userMaster.getPrimaryKey()) == null) {
				cacheResult(userMaster);
			}
			else {
				userMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user masters.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UserMasterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user master.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserMaster userMaster) {
		entityCache.removeResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterImpl.class, userMaster.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserMaster> userMasters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserMaster userMaster : userMasters) {
			entityCache.removeResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
				UserMasterImpl.class, userMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user master with the primary key. Does not add the user master to the database.
	 *
	 * @param userMasterId the primary key for the new user master
	 * @return the new user master
	 */
	@Override
	public UserMaster create(long userMasterId) {
		UserMaster userMaster = new UserMasterImpl();

		userMaster.setNew(true);
		userMaster.setPrimaryKey(userMasterId);

		return userMaster;
	}

	/**
	 * Removes the user master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userMasterId the primary key of the user master
	 * @return the user master that was removed
	 * @throws NoSuchUserMasterException if a user master with the primary key could not be found
	 */
	@Override
	public UserMaster remove(long userMasterId)
		throws NoSuchUserMasterException {
		return remove((Serializable)userMasterId);
	}

	/**
	 * Removes the user master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user master
	 * @return the user master that was removed
	 * @throws NoSuchUserMasterException if a user master with the primary key could not be found
	 */
	@Override
	public UserMaster remove(Serializable primaryKey)
		throws NoSuchUserMasterException {
		Session session = null;

		try {
			session = openSession();

			UserMaster userMaster = (UserMaster)session.get(UserMasterImpl.class,
					primaryKey);

			if (userMaster == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userMaster);
		}
		catch (NoSuchUserMasterException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected UserMaster removeImpl(UserMaster userMaster) {
		userMaster = toUnwrappedModel(userMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userMaster)) {
				userMaster = (UserMaster)session.get(UserMasterImpl.class,
						userMaster.getPrimaryKeyObj());
			}

			if (userMaster != null) {
				session.delete(userMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userMaster != null) {
			clearCache(userMaster);
		}

		return userMaster;
	}

	@Override
	public UserMaster updateImpl(UserMaster userMaster) {
		userMaster = toUnwrappedModel(userMaster);

		boolean isNew = userMaster.isNew();

		UserMasterModelImpl userMasterModelImpl = (UserMasterModelImpl)userMaster;

		Session session = null;

		try {
			session = openSession();

			if (userMaster.isNew()) {
				session.save(userMaster);

				userMaster.setNew(false);
			}
			else {
				userMaster = (UserMaster)session.merge(userMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserMasterModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userMasterModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USEREMAIL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userMasterModelImpl.getOriginalUserEmail(),
						userMasterModelImpl.getOriginalUserPass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USEREMAIL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USEREMAIL,
					args);

				args = new Object[] {
						userMasterModelImpl.getUserEmail(),
						userMasterModelImpl.getUserPass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USEREMAIL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USEREMAIL,
					args);
			}
		}

		entityCache.putResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
			UserMasterImpl.class, userMaster.getPrimaryKey(), userMaster, false);

		userMaster.resetOriginalValues();

		return userMaster;
	}

	protected UserMaster toUnwrappedModel(UserMaster userMaster) {
		if (userMaster instanceof UserMasterImpl) {
			return userMaster;
		}

		UserMasterImpl userMasterImpl = new UserMasterImpl();

		userMasterImpl.setNew(userMaster.isNew());
		userMasterImpl.setPrimaryKey(userMaster.getPrimaryKey());

		userMasterImpl.setUserMasterId(userMaster.getUserMasterId());
		userMasterImpl.setUserName(userMaster.getUserName());
		userMasterImpl.setUserEmail(userMaster.getUserEmail());
		userMasterImpl.setUserPass(userMaster.getUserPass());
		userMasterImpl.setUserAddress(userMaster.getUserAddress());
		userMasterImpl.setUserPhoneno(userMaster.getUserPhoneno());
		userMasterImpl.setUserType(userMaster.getUserType());
		userMasterImpl.setUserOrganization(userMaster.getUserOrganization());

		return userMasterImpl;
	}

	/**
	 * Returns the user master with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user master
	 * @return the user master
	 * @throws NoSuchUserMasterException if a user master with the primary key could not be found
	 */
	@Override
	public UserMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserMasterException {
		UserMaster userMaster = fetchByPrimaryKey(primaryKey);

		if (userMaster == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userMaster;
	}

	/**
	 * Returns the user master with the primary key or throws a {@link NoSuchUserMasterException} if it could not be found.
	 *
	 * @param userMasterId the primary key of the user master
	 * @return the user master
	 * @throws NoSuchUserMasterException if a user master with the primary key could not be found
	 */
	@Override
	public UserMaster findByPrimaryKey(long userMasterId)
		throws NoSuchUserMasterException {
		return findByPrimaryKey((Serializable)userMasterId);
	}

	/**
	 * Returns the user master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user master
	 * @return the user master, or <code>null</code> if a user master with the primary key could not be found
	 */
	@Override
	public UserMaster fetchByPrimaryKey(Serializable primaryKey) {
		UserMaster userMaster = (UserMaster)entityCache.getResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
				UserMasterImpl.class, primaryKey);

		if (userMaster == _nullUserMaster) {
			return null;
		}

		if (userMaster == null) {
			Session session = null;

			try {
				session = openSession();

				userMaster = (UserMaster)session.get(UserMasterImpl.class,
						primaryKey);

				if (userMaster != null) {
					cacheResult(userMaster);
				}
				else {
					entityCache.putResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
						UserMasterImpl.class, primaryKey, _nullUserMaster);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
					UserMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userMaster;
	}

	/**
	 * Returns the user master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userMasterId the primary key of the user master
	 * @return the user master, or <code>null</code> if a user master with the primary key could not be found
	 */
	@Override
	public UserMaster fetchByPrimaryKey(long userMasterId) {
		return fetchByPrimaryKey((Serializable)userMasterId);
	}

	@Override
	public Map<Serializable, UserMaster> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UserMaster> map = new HashMap<Serializable, UserMaster>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UserMaster userMaster = fetchByPrimaryKey(primaryKey);

			if (userMaster != null) {
				map.put(primaryKey, userMaster);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			UserMaster userMaster = (UserMaster)entityCache.getResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
					UserMasterImpl.class, primaryKey);

			if (userMaster == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, userMaster);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_USERMASTER_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (UserMaster userMaster : (List<UserMaster>)q.list()) {
				map.put(userMaster.getPrimaryKeyObj(), userMaster);

				cacheResult(userMaster);

				uncachedPrimaryKeys.remove(userMaster.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UserMasterModelImpl.ENTITY_CACHE_ENABLED,
					UserMasterImpl.class, primaryKey, _nullUserMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the user masters.
	 *
	 * @return the user masters
	 */
	@Override
	public List<UserMaster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserMaster> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<UserMaster> findAll(int start, int end,
		OrderByComparator<UserMaster> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<UserMaster> findAll(int start, int end,
		OrderByComparator<UserMaster> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<UserMaster> list = null;

		if (retrieveFromCache) {
			list = (List<UserMaster>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_USERMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERMASTER;

				if (pagination) {
					sql = sql.concat(UserMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UserMaster>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the user masters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserMaster userMaster : findAll()) {
			remove(userMaster);
		}
	}

	/**
	 * Returns the number of user masters.
	 *
	 * @return the number of user masters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERMASTER);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UserMasterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user master persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UserMasterImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_USERMASTER = "SELECT userMaster FROM UserMaster userMaster";
	private static final String _SQL_SELECT_USERMASTER_WHERE_PKS_IN = "SELECT userMaster FROM UserMaster userMaster WHERE userMasterId IN (";
	private static final String _SQL_SELECT_USERMASTER_WHERE = "SELECT userMaster FROM UserMaster userMaster WHERE ";
	private static final String _SQL_COUNT_USERMASTER = "SELECT COUNT(userMaster) FROM UserMaster userMaster";
	private static final String _SQL_COUNT_USERMASTER_WHERE = "SELECT COUNT(userMaster) FROM UserMaster userMaster WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserMaster exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserMaster exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(UserMasterPersistenceImpl.class);
	private static final UserMaster _nullUserMaster = new UserMasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserMaster> toCacheModel() {
				return _nullUserMasterCacheModel;
			}
		};

	private static final CacheModel<UserMaster> _nullUserMasterCacheModel = new CacheModel<UserMaster>() {
			@Override
			public UserMaster toEntityModel() {
				return _nullUserMaster;
			}
		};
}