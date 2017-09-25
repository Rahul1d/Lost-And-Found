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

import com.Trylof.services.exception.NoSuchItemVerificationException;
import com.Trylof.services.model.ItemVerification;
import com.Trylof.services.model.impl.ItemVerificationImpl;
import com.Trylof.services.model.impl.ItemVerificationModelImpl;
import com.Trylof.services.service.persistence.ItemVerificationPersistence;

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
import com.liferay.portal.kernel.util.StringUtil;
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
 * The persistence implementation for the item verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see ItemVerificationPersistence
 * @see com.Trylof.services.service.persistence.ItemVerificationUtil
 * @generated
 */
@ProviderType
public class ItemVerificationPersistenceImpl extends BasePersistenceImpl<ItemVerification>
	implements ItemVerificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ItemVerificationUtil} to access the item verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ItemVerificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED,
			ItemVerificationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED,
			ItemVerificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH = new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED,
			ItemVerificationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByLostItemIdMatch", new String[] { Long.class.getName() },
			ItemVerificationModelImpl.LOSTITEMID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOSTITEMIDMATCH = new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLostItemIdMatch", new String[] { Long.class.getName() });

	/**
	 * Returns the item verification where LostItemid = &#63; or throws a {@link NoSuchItemVerificationException} if it could not be found.
	 *
	 * @param LostItemid the lost itemid
	 * @return the matching item verification
	 * @throws NoSuchItemVerificationException if a matching item verification could not be found
	 */
	@Override
	public ItemVerification findByLostItemIdMatch(long LostItemid)
		throws NoSuchItemVerificationException {
		ItemVerification itemVerification = fetchByLostItemIdMatch(LostItemid);

		if (itemVerification == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("LostItemid=");
			msg.append(LostItemid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchItemVerificationException(msg.toString());
		}

		return itemVerification;
	}

	/**
	 * Returns the item verification where LostItemid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param LostItemid the lost itemid
	 * @return the matching item verification, or <code>null</code> if a matching item verification could not be found
	 */
	@Override
	public ItemVerification fetchByLostItemIdMatch(long LostItemid) {
		return fetchByLostItemIdMatch(LostItemid, true);
	}

	/**
	 * Returns the item verification where LostItemid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param LostItemid the lost itemid
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching item verification, or <code>null</code> if a matching item verification could not be found
	 */
	@Override
	public ItemVerification fetchByLostItemIdMatch(long LostItemid,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { LostItemid };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH,
					finderArgs, this);
		}

		if (result instanceof ItemVerification) {
			ItemVerification itemVerification = (ItemVerification)result;

			if ((LostItemid != itemVerification.getLostItemid())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ITEMVERIFICATION_WHERE);

			query.append(_FINDER_COLUMN_LOSTITEMIDMATCH_LOSTITEMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(LostItemid);

				List<ItemVerification> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ItemVerificationPersistenceImpl.fetchByLostItemIdMatch(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ItemVerification itemVerification = list.get(0);

					result = itemVerification;

					cacheResult(itemVerification);

					if ((itemVerification.getLostItemid() != LostItemid)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH,
							finderArgs, itemVerification);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ItemVerification)result;
		}
	}

	/**
	 * Removes the item verification where LostItemid = &#63; from the database.
	 *
	 * @param LostItemid the lost itemid
	 * @return the item verification that was removed
	 */
	@Override
	public ItemVerification removeByLostItemIdMatch(long LostItemid)
		throws NoSuchItemVerificationException {
		ItemVerification itemVerification = findByLostItemIdMatch(LostItemid);

		return remove(itemVerification);
	}

	/**
	 * Returns the number of item verifications where LostItemid = &#63;.
	 *
	 * @param LostItemid the lost itemid
	 * @return the number of matching item verifications
	 */
	@Override
	public int countByLostItemIdMatch(long LostItemid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOSTITEMIDMATCH;

		Object[] finderArgs = new Object[] { LostItemid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ITEMVERIFICATION_WHERE);

			query.append(_FINDER_COLUMN_LOSTITEMIDMATCH_LOSTITEMID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(LostItemid);

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

	private static final String _FINDER_COLUMN_LOSTITEMIDMATCH_LOSTITEMID_2 = "itemVerification.LostItemid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERMATCH =
		new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED,
			ItemVerificationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUserMatch",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERMATCH =
		new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED,
			ItemVerificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUserMatch",
			new String[] { Long.class.getName(), String.class.getName() },
			ItemVerificationModelImpl.USERID_COLUMN_BITMASK |
			ItemVerificationModelImpl.VERIFYSTATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERMATCH = new FinderPath(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUserMatch",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the item verifications where UserId = &#63; and VerifyStatus = &#63;.
	 *
	 * @param UserId the user ID
	 * @param VerifyStatus the verify status
	 * @return the matching item verifications
	 */
	@Override
	public List<ItemVerification> findByUserMatch(long UserId,
		String VerifyStatus) {
		return findByUserMatch(UserId, VerifyStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemVerification> findByUserMatch(long UserId,
		String VerifyStatus, int start, int end) {
		return findByUserMatch(UserId, VerifyStatus, start, end, null);
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
	@Override
	public List<ItemVerification> findByUserMatch(long UserId,
		String VerifyStatus, int start, int end,
		OrderByComparator<ItemVerification> orderByComparator) {
		return findByUserMatch(UserId, VerifyStatus, start, end,
			orderByComparator, true);
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
	@Override
	public List<ItemVerification> findByUserMatch(long UserId,
		String VerifyStatus, int start, int end,
		OrderByComparator<ItemVerification> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERMATCH;
			finderArgs = new Object[] { UserId, VerifyStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERMATCH;
			finderArgs = new Object[] {
					UserId, VerifyStatus,
					
					start, end, orderByComparator
				};
		}

		List<ItemVerification> list = null;

		if (retrieveFromCache) {
			list = (List<ItemVerification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ItemVerification itemVerification : list) {
					if ((UserId != itemVerification.getUserId()) ||
							!Validator.equals(VerifyStatus,
								itemVerification.getVerifyStatus())) {
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

			query.append(_SQL_SELECT_ITEMVERIFICATION_WHERE);

			query.append(_FINDER_COLUMN_USERMATCH_USERID_2);

			boolean bindVerifyStatus = false;

			if (VerifyStatus == null) {
				query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_1);
			}
			else if (VerifyStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_3);
			}
			else {
				bindVerifyStatus = true;

				query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ItemVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(UserId);

				if (bindVerifyStatus) {
					qPos.add(VerifyStatus);
				}

				if (!pagination) {
					list = (List<ItemVerification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemVerification>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	 *
	 * @param UserId the user ID
	 * @param VerifyStatus the verify status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item verification
	 * @throws NoSuchItemVerificationException if a matching item verification could not be found
	 */
	@Override
	public ItemVerification findByUserMatch_First(long UserId,
		String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator)
		throws NoSuchItemVerificationException {
		ItemVerification itemVerification = fetchByUserMatch_First(UserId,
				VerifyStatus, orderByComparator);

		if (itemVerification != null) {
			return itemVerification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("UserId=");
		msg.append(UserId);

		msg.append(", VerifyStatus=");
		msg.append(VerifyStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemVerificationException(msg.toString());
	}

	/**
	 * Returns the first item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	 *
	 * @param UserId the user ID
	 * @param VerifyStatus the verify status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item verification, or <code>null</code> if a matching item verification could not be found
	 */
	@Override
	public ItemVerification fetchByUserMatch_First(long UserId,
		String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator) {
		List<ItemVerification> list = findByUserMatch(UserId, VerifyStatus, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemVerification findByUserMatch_Last(long UserId,
		String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator)
		throws NoSuchItemVerificationException {
		ItemVerification itemVerification = fetchByUserMatch_Last(UserId,
				VerifyStatus, orderByComparator);

		if (itemVerification != null) {
			return itemVerification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("UserId=");
		msg.append(UserId);

		msg.append(", VerifyStatus=");
		msg.append(VerifyStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemVerificationException(msg.toString());
	}

	/**
	 * Returns the last item verification in the ordered set where UserId = &#63; and VerifyStatus = &#63;.
	 *
	 * @param UserId the user ID
	 * @param VerifyStatus the verify status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item verification, or <code>null</code> if a matching item verification could not be found
	 */
	@Override
	public ItemVerification fetchByUserMatch_Last(long UserId,
		String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator) {
		int count = countByUserMatch(UserId, VerifyStatus);

		if (count == 0) {
			return null;
		}

		List<ItemVerification> list = findByUserMatch(UserId, VerifyStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemVerification[] findByUserMatch_PrevAndNext(
		long itemVerificationId, long UserId, String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator)
		throws NoSuchItemVerificationException {
		ItemVerification itemVerification = findByPrimaryKey(itemVerificationId);

		Session session = null;

		try {
			session = openSession();

			ItemVerification[] array = new ItemVerificationImpl[3];

			array[0] = getByUserMatch_PrevAndNext(session, itemVerification,
					UserId, VerifyStatus, orderByComparator, true);

			array[1] = itemVerification;

			array[2] = getByUserMatch_PrevAndNext(session, itemVerification,
					UserId, VerifyStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ItemVerification getByUserMatch_PrevAndNext(Session session,
		ItemVerification itemVerification, long UserId, String VerifyStatus,
		OrderByComparator<ItemVerification> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ITEMVERIFICATION_WHERE);

		query.append(_FINDER_COLUMN_USERMATCH_USERID_2);

		boolean bindVerifyStatus = false;

		if (VerifyStatus == null) {
			query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_1);
		}
		else if (VerifyStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_3);
		}
		else {
			bindVerifyStatus = true;

			query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_2);
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
			query.append(ItemVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(UserId);

		if (bindVerifyStatus) {
			qPos.add(VerifyStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(itemVerification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ItemVerification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the item verifications where UserId = &#63; and VerifyStatus = &#63; from the database.
	 *
	 * @param UserId the user ID
	 * @param VerifyStatus the verify status
	 */
	@Override
	public void removeByUserMatch(long UserId, String VerifyStatus) {
		for (ItemVerification itemVerification : findByUserMatch(UserId,
				VerifyStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(itemVerification);
		}
	}

	/**
	 * Returns the number of item verifications where UserId = &#63; and VerifyStatus = &#63;.
	 *
	 * @param UserId the user ID
	 * @param VerifyStatus the verify status
	 * @return the number of matching item verifications
	 */
	@Override
	public int countByUserMatch(long UserId, String VerifyStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERMATCH;

		Object[] finderArgs = new Object[] { UserId, VerifyStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ITEMVERIFICATION_WHERE);

			query.append(_FINDER_COLUMN_USERMATCH_USERID_2);

			boolean bindVerifyStatus = false;

			if (VerifyStatus == null) {
				query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_1);
			}
			else if (VerifyStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_3);
			}
			else {
				bindVerifyStatus = true;

				query.append(_FINDER_COLUMN_USERMATCH_VERIFYSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(UserId);

				if (bindVerifyStatus) {
					qPos.add(VerifyStatus);
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

	private static final String _FINDER_COLUMN_USERMATCH_USERID_2 = "itemVerification.UserId = ? AND ";
	private static final String _FINDER_COLUMN_USERMATCH_VERIFYSTATUS_1 = "itemVerification.VerifyStatus IS NULL";
	private static final String _FINDER_COLUMN_USERMATCH_VERIFYSTATUS_2 = "itemVerification.VerifyStatus = ?";
	private static final String _FINDER_COLUMN_USERMATCH_VERIFYSTATUS_3 = "(itemVerification.VerifyStatus IS NULL OR itemVerification.VerifyStatus = '')";

	public ItemVerificationPersistenceImpl() {
		setModelClass(ItemVerification.class);
	}

	/**
	 * Caches the item verification in the entity cache if it is enabled.
	 *
	 * @param itemVerification the item verification
	 */
	@Override
	public void cacheResult(ItemVerification itemVerification) {
		entityCache.putResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationImpl.class, itemVerification.getPrimaryKey(),
			itemVerification);

		finderCache.putResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH,
			new Object[] { itemVerification.getLostItemid() }, itemVerification);

		itemVerification.resetOriginalValues();
	}

	/**
	 * Caches the item verifications in the entity cache if it is enabled.
	 *
	 * @param itemVerifications the item verifications
	 */
	@Override
	public void cacheResult(List<ItemVerification> itemVerifications) {
		for (ItemVerification itemVerification : itemVerifications) {
			if (entityCache.getResult(
						ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
						ItemVerificationImpl.class,
						itemVerification.getPrimaryKey()) == null) {
				cacheResult(itemVerification);
			}
			else {
				itemVerification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all item verifications.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ItemVerificationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the item verification.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ItemVerification itemVerification) {
		entityCache.removeResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationImpl.class, itemVerification.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ItemVerificationModelImpl)itemVerification);
	}

	@Override
	public void clearCache(List<ItemVerification> itemVerifications) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ItemVerification itemVerification : itemVerifications) {
			entityCache.removeResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
				ItemVerificationImpl.class, itemVerification.getPrimaryKey());

			clearUniqueFindersCache((ItemVerificationModelImpl)itemVerification);
		}
	}

	protected void cacheUniqueFindersCache(
		ItemVerificationModelImpl itemVerificationModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					itemVerificationModelImpl.getLostItemid()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_LOSTITEMIDMATCH, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH, args,
				itemVerificationModelImpl);
		}
		else {
			if ((itemVerificationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						itemVerificationModelImpl.getLostItemid()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_LOSTITEMIDMATCH,
					args, Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH,
					args, itemVerificationModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ItemVerificationModelImpl itemVerificationModelImpl) {
		Object[] args = new Object[] { itemVerificationModelImpl.getLostItemid() };

		finderCache.removeResult(FINDER_PATH_COUNT_BY_LOSTITEMIDMATCH, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH, args);

		if ((itemVerificationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH.getColumnBitmask()) != 0) {
			args = new Object[] {
					itemVerificationModelImpl.getOriginalLostItemid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LOSTITEMIDMATCH, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_LOSTITEMIDMATCH, args);
		}
	}

	/**
	 * Creates a new item verification with the primary key. Does not add the item verification to the database.
	 *
	 * @param itemVerificationId the primary key for the new item verification
	 * @return the new item verification
	 */
	@Override
	public ItemVerification create(long itemVerificationId) {
		ItemVerification itemVerification = new ItemVerificationImpl();

		itemVerification.setNew(true);
		itemVerification.setPrimaryKey(itemVerificationId);

		return itemVerification;
	}

	/**
	 * Removes the item verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemVerificationId the primary key of the item verification
	 * @return the item verification that was removed
	 * @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	 */
	@Override
	public ItemVerification remove(long itemVerificationId)
		throws NoSuchItemVerificationException {
		return remove((Serializable)itemVerificationId);
	}

	/**
	 * Removes the item verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the item verification
	 * @return the item verification that was removed
	 * @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	 */
	@Override
	public ItemVerification remove(Serializable primaryKey)
		throws NoSuchItemVerificationException {
		Session session = null;

		try {
			session = openSession();

			ItemVerification itemVerification = (ItemVerification)session.get(ItemVerificationImpl.class,
					primaryKey);

			if (itemVerification == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchItemVerificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(itemVerification);
		}
		catch (NoSuchItemVerificationException nsee) {
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
	protected ItemVerification removeImpl(ItemVerification itemVerification) {
		itemVerification = toUnwrappedModel(itemVerification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(itemVerification)) {
				itemVerification = (ItemVerification)session.get(ItemVerificationImpl.class,
						itemVerification.getPrimaryKeyObj());
			}

			if (itemVerification != null) {
				session.delete(itemVerification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (itemVerification != null) {
			clearCache(itemVerification);
		}

		return itemVerification;
	}

	@Override
	public ItemVerification updateImpl(ItemVerification itemVerification) {
		itemVerification = toUnwrappedModel(itemVerification);

		boolean isNew = itemVerification.isNew();

		ItemVerificationModelImpl itemVerificationModelImpl = (ItemVerificationModelImpl)itemVerification;

		Session session = null;

		try {
			session = openSession();

			if (itemVerification.isNew()) {
				session.save(itemVerification);

				itemVerification.setNew(false);
			}
			else {
				session.evict(itemVerification);
				session.saveOrUpdate(itemVerification);
			}

			session.flush();
			session.clear();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ItemVerificationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((itemVerificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERMATCH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						itemVerificationModelImpl.getOriginalUserId(),
						itemVerificationModelImpl.getOriginalVerifyStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERMATCH, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERMATCH,
					args);

				args = new Object[] {
						itemVerificationModelImpl.getUserId(),
						itemVerificationModelImpl.getVerifyStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERMATCH, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERMATCH,
					args);
			}
		}

		entityCache.putResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
			ItemVerificationImpl.class, itemVerification.getPrimaryKey(),
			itemVerification, false);

		clearUniqueFindersCache(itemVerificationModelImpl);
		cacheUniqueFindersCache(itemVerificationModelImpl, isNew);

		itemVerification.resetOriginalValues();

		return itemVerification;
	}

	protected ItemVerification toUnwrappedModel(
		ItemVerification itemVerification) {
		if (itemVerification instanceof ItemVerificationImpl) {
			return itemVerification;
		}

		ItemVerificationImpl itemVerificationImpl = new ItemVerificationImpl();

		itemVerificationImpl.setNew(itemVerification.isNew());
		itemVerificationImpl.setPrimaryKey(itemVerification.getPrimaryKey());

		itemVerificationImpl.setItemVerificationId(itemVerification.getItemVerificationId());
		itemVerificationImpl.setVerifyDesc(itemVerification.getVerifyDesc());
		itemVerificationImpl.setImage1(itemVerification.getImage1());
		itemVerificationImpl.setImage2(itemVerification.getImage2());
		itemVerificationImpl.setLostItemid(itemVerification.getLostItemid());
		itemVerificationImpl.setFoundItemid(itemVerification.getFoundItemid());
		itemVerificationImpl.setUserId(itemVerification.getUserId());
		itemVerificationImpl.setVerifyStatus(itemVerification.getVerifyStatus());

		return itemVerificationImpl;
	}

	/**
	 * Returns the item verification with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the item verification
	 * @return the item verification
	 * @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	 */
	@Override
	public ItemVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchItemVerificationException {
		ItemVerification itemVerification = fetchByPrimaryKey(primaryKey);

		if (itemVerification == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchItemVerificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return itemVerification;
	}

	/**
	 * Returns the item verification with the primary key or throws a {@link NoSuchItemVerificationException} if it could not be found.
	 *
	 * @param itemVerificationId the primary key of the item verification
	 * @return the item verification
	 * @throws NoSuchItemVerificationException if a item verification with the primary key could not be found
	 */
	@Override
	public ItemVerification findByPrimaryKey(long itemVerificationId)
		throws NoSuchItemVerificationException {
		return findByPrimaryKey((Serializable)itemVerificationId);
	}

	/**
	 * Returns the item verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the item verification
	 * @return the item verification, or <code>null</code> if a item verification with the primary key could not be found
	 */
	@Override
	public ItemVerification fetchByPrimaryKey(Serializable primaryKey) {
		ItemVerification itemVerification = (ItemVerification)entityCache.getResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
				ItemVerificationImpl.class, primaryKey);

		if (itemVerification == _nullItemVerification) {
			return null;
		}

		if (itemVerification == null) {
			Session session = null;

			try {
				session = openSession();

				itemVerification = (ItemVerification)session.get(ItemVerificationImpl.class,
						primaryKey);

				if (itemVerification != null) {
					cacheResult(itemVerification);
				}
				else {
					entityCache.putResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
						ItemVerificationImpl.class, primaryKey,
						_nullItemVerification);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
					ItemVerificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return itemVerification;
	}

	/**
	 * Returns the item verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemVerificationId the primary key of the item verification
	 * @return the item verification, or <code>null</code> if a item verification with the primary key could not be found
	 */
	@Override
	public ItemVerification fetchByPrimaryKey(long itemVerificationId) {
		return fetchByPrimaryKey((Serializable)itemVerificationId);
	}

	@Override
	public Map<Serializable, ItemVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ItemVerification> map = new HashMap<Serializable, ItemVerification>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ItemVerification itemVerification = fetchByPrimaryKey(primaryKey);

			if (itemVerification != null) {
				map.put(primaryKey, itemVerification);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			ItemVerification itemVerification = (ItemVerification)entityCache.getResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
					ItemVerificationImpl.class, primaryKey);

			if (itemVerification == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, itemVerification);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ITEMVERIFICATION_WHERE_PKS_IN);

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

			for (ItemVerification itemVerification : (List<ItemVerification>)q.list()) {
				map.put(itemVerification.getPrimaryKeyObj(), itemVerification);

				cacheResult(itemVerification);

				uncachedPrimaryKeys.remove(itemVerification.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ItemVerificationModelImpl.ENTITY_CACHE_ENABLED,
					ItemVerificationImpl.class, primaryKey,
					_nullItemVerification);
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
	 * Returns all the item verifications.
	 *
	 * @return the item verifications
	 */
	@Override
	public List<ItemVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemVerification> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ItemVerification> findAll(int start, int end,
		OrderByComparator<ItemVerification> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ItemVerification> findAll(int start, int end,
		OrderByComparator<ItemVerification> orderByComparator,
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

		List<ItemVerification> list = null;

		if (retrieveFromCache) {
			list = (List<ItemVerification>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ITEMVERIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ITEMVERIFICATION;

				if (pagination) {
					sql = sql.concat(ItemVerificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ItemVerification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemVerification>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the item verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ItemVerification itemVerification : findAll()) {
			remove(itemVerification);
		}
	}

	/**
	 * Returns the number of item verifications.
	 *
	 * @return the number of item verifications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ITEMVERIFICATION);

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
		return ItemVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the item verification persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ItemVerificationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_ITEMVERIFICATION = "SELECT itemVerification FROM ItemVerification itemVerification";
	private static final String _SQL_SELECT_ITEMVERIFICATION_WHERE_PKS_IN = "SELECT itemVerification FROM ItemVerification itemVerification WHERE itemVerificationId IN (";
	private static final String _SQL_SELECT_ITEMVERIFICATION_WHERE = "SELECT itemVerification FROM ItemVerification itemVerification WHERE ";
	private static final String _SQL_COUNT_ITEMVERIFICATION = "SELECT COUNT(itemVerification) FROM ItemVerification itemVerification";
	private static final String _SQL_COUNT_ITEMVERIFICATION_WHERE = "SELECT COUNT(itemVerification) FROM ItemVerification itemVerification WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "itemVerification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ItemVerification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ItemVerification exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ItemVerificationPersistenceImpl.class);
	private static final ItemVerification _nullItemVerification = new ItemVerificationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ItemVerification> toCacheModel() {
				return _nullItemVerificationCacheModel;
			}
		};

	private static final CacheModel<ItemVerification> _nullItemVerificationCacheModel =
		new CacheModel<ItemVerification>() {
			@Override
			public ItemVerification toEntityModel() {
				return _nullItemVerification;
			}
		};
}