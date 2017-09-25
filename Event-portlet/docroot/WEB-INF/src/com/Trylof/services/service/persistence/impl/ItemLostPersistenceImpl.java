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

import com.Trylof.services.exception.NoSuchItemLostException;
import com.Trylof.services.model.ItemLost;
import com.Trylof.services.model.impl.ItemLostImpl;
import com.Trylof.services.model.impl.ItemLostModelImpl;
import com.Trylof.services.service.persistence.ItemLostPersistence;

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
 * The persistence implementation for the item lost service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see ItemLostPersistence
 * @see com.Trylof.services.service.persistence.ItemLostUtil
 * @generated
 */
@ProviderType
public class ItemLostPersistenceImpl extends BasePersistenceImpl<ItemLost>
	implements ItemLostPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ItemLostUtil} to access the item lost persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ItemLostImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMLOSTID =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByitemLostid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTID =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByitemLostid",
			new String[] { Long.class.getName() },
			ItemLostModelImpl.ITEMLOSTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ITEMLOSTID = new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByitemLostid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the item losts where itemLostId = &#63;.
	 *
	 * @param itemLostId the item lost ID
	 * @return the matching item losts
	 */
	@Override
	public List<ItemLost> findByitemLostid(long itemLostId) {
		return findByitemLostid(itemLostId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemLost> findByitemLostid(long itemLostId, int start, int end) {
		return findByitemLostid(itemLostId, start, end, null);
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
	@Override
	public List<ItemLost> findByitemLostid(long itemLostId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return findByitemLostid(itemLostId, start, end, orderByComparator, true);
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
	@Override
	public List<ItemLost> findByitemLostid(long itemLostId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTID;
			finderArgs = new Object[] { itemLostId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMLOSTID;
			finderArgs = new Object[] { itemLostId, start, end, orderByComparator };
		}

		List<ItemLost> list = null;

		if (retrieveFromCache) {
			list = (List<ItemLost>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ItemLost itemLost : list) {
					if ((itemLostId != itemLost.getItemLostId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ITEMLOST_WHERE);

			query.append(_FINDER_COLUMN_ITEMLOSTID_ITEMLOSTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ItemLostModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(itemLostId);

				if (!pagination) {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first item lost in the ordered set where itemLostId = &#63;.
	 *
	 * @param itemLostId the item lost ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost
	 * @throws NoSuchItemLostException if a matching item lost could not be found
	 */
	@Override
	public ItemLost findByitemLostid_First(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByitemLostid_First(itemLostId,
				orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("itemLostId=");
		msg.append(itemLostId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the first item lost in the ordered set where itemLostId = &#63;.
	 *
	 * @param itemLostId the item lost ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByitemLostid_First(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator) {
		List<ItemLost> list = findByitemLostid(itemLostId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last item lost in the ordered set where itemLostId = &#63;.
	 *
	 * @param itemLostId the item lost ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item lost
	 * @throws NoSuchItemLostException if a matching item lost could not be found
	 */
	@Override
	public ItemLost findByitemLostid_Last(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByitemLostid_Last(itemLostId, orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("itemLostId=");
		msg.append(itemLostId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the last item lost in the ordered set where itemLostId = &#63;.
	 *
	 * @param itemLostId the item lost ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByitemLostid_Last(long itemLostId,
		OrderByComparator<ItemLost> orderByComparator) {
		int count = countByitemLostid(itemLostId);

		if (count == 0) {
			return null;
		}

		List<ItemLost> list = findByitemLostid(itemLostId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the item losts where itemLostId = &#63; from the database.
	 *
	 * @param itemLostId the item lost ID
	 */
	@Override
	public void removeByitemLostid(long itemLostId) {
		for (ItemLost itemLost : findByitemLostid(itemLostId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(itemLost);
		}
	}

	/**
	 * Returns the number of item losts where itemLostId = &#63;.
	 *
	 * @param itemLostId the item lost ID
	 * @return the number of matching item losts
	 */
	@Override
	public int countByitemLostid(long itemLostId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ITEMLOSTID;

		Object[] finderArgs = new Object[] { itemLostId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ITEMLOST_WHERE);

			query.append(_FINDER_COLUMN_ITEMLOSTID_ITEMLOSTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(itemLostId);

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

	private static final String _FINDER_COLUMN_ITEMLOSTID_ITEMLOSTID_2 = "itemLost.itemLostId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMLOSTUSERID =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByitemLostUserid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTUSERID =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByitemLostUserid",
			new String[] { Long.class.getName() },
			ItemLostModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ITEMLOSTUSERID = new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByitemLostUserid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the item losts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching item losts
	 */
	@Override
	public List<ItemLost> findByitemLostUserid(long userId) {
		return findByitemLostUserid(userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemLost> findByitemLostUserid(long userId, int start, int end) {
		return findByitemLostUserid(userId, start, end, null);
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
	@Override
	public List<ItemLost> findByitemLostUserid(long userId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return findByitemLostUserid(userId, start, end, orderByComparator, true);
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
	@Override
	public List<ItemLost> findByitemLostUserid(long userId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTUSERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMLOSTUSERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<ItemLost> list = null;

		if (retrieveFromCache) {
			list = (List<ItemLost>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ItemLost itemLost : list) {
					if ((userId != itemLost.getUserId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ITEMLOST_WHERE);

			query.append(_FINDER_COLUMN_ITEMLOSTUSERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ItemLostModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first item lost in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost
	 * @throws NoSuchItemLostException if a matching item lost could not be found
	 */
	@Override
	public ItemLost findByitemLostUserid_First(long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByitemLostUserid_First(userId,
				orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the first item lost in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByitemLostUserid_First(long userId,
		OrderByComparator<ItemLost> orderByComparator) {
		List<ItemLost> list = findByitemLostUserid(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last item lost in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item lost
	 * @throws NoSuchItemLostException if a matching item lost could not be found
	 */
	@Override
	public ItemLost findByitemLostUserid_Last(long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByitemLostUserid_Last(userId, orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the last item lost in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByitemLostUserid_Last(long userId,
		OrderByComparator<ItemLost> orderByComparator) {
		int count = countByitemLostUserid(userId);

		if (count == 0) {
			return null;
		}

		List<ItemLost> list = findByitemLostUserid(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemLost[] findByitemLostUserid_PrevAndNext(long itemLostId,
		long userId, OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = findByPrimaryKey(itemLostId);

		Session session = null;

		try {
			session = openSession();

			ItemLost[] array = new ItemLostImpl[3];

			array[0] = getByitemLostUserid_PrevAndNext(session, itemLost,
					userId, orderByComparator, true);

			array[1] = itemLost;

			array[2] = getByitemLostUserid_PrevAndNext(session, itemLost,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ItemLost getByitemLostUserid_PrevAndNext(Session session,
		ItemLost itemLost, long userId,
		OrderByComparator<ItemLost> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ITEMLOST_WHERE);

		query.append(_FINDER_COLUMN_ITEMLOSTUSERID_USERID_2);

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
			query.append(ItemLostModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(itemLost);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ItemLost> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the item losts where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByitemLostUserid(long userId) {
		for (ItemLost itemLost : findByitemLostUserid(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(itemLost);
		}
	}

	/**
	 * Returns the number of item losts where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching item losts
	 */
	@Override
	public int countByitemLostUserid(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ITEMLOSTUSERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ITEMLOST_WHERE);

			query.append(_FINDER_COLUMN_ITEMLOSTUSERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_ITEMLOSTUSERID_USERID_2 = "itemLost.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMSTATUSMATCH =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByItemStatusMatch",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTATUSMATCH =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByItemStatusMatch",
			new String[] { String.class.getName() },
			ItemLostModelImpl.LOSTSTATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ITEMSTATUSMATCH = new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByItemStatusMatch", new String[] { String.class.getName() });

	/**
	 * Returns all the item losts where LostStatus = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @return the matching item losts
	 */
	@Override
	public List<ItemLost> findByItemStatusMatch(String LostStatus) {
		return findByItemStatusMatch(LostStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemLost> findByItemStatusMatch(String LostStatus, int start,
		int end) {
		return findByItemStatusMatch(LostStatus, start, end, null);
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
	@Override
	public List<ItemLost> findByItemStatusMatch(String LostStatus, int start,
		int end, OrderByComparator<ItemLost> orderByComparator) {
		return findByItemStatusMatch(LostStatus, start, end, orderByComparator,
			true);
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
	@Override
	public List<ItemLost> findByItemStatusMatch(String LostStatus, int start,
		int end, OrderByComparator<ItemLost> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTATUSMATCH;
			finderArgs = new Object[] { LostStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMSTATUSMATCH;
			finderArgs = new Object[] { LostStatus, start, end, orderByComparator };
		}

		List<ItemLost> list = null;

		if (retrieveFromCache) {
			list = (List<ItemLost>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ItemLost itemLost : list) {
					if (!Validator.equals(LostStatus, itemLost.getLostStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ITEMLOST_WHERE);

			boolean bindLostStatus = false;

			if (LostStatus == null) {
				query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_1);
			}
			else if (LostStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_3);
			}
			else {
				bindLostStatus = true;

				query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ItemLostModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLostStatus) {
					qPos.add(LostStatus);
				}

				if (!pagination) {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first item lost in the ordered set where LostStatus = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost
	 * @throws NoSuchItemLostException if a matching item lost could not be found
	 */
	@Override
	public ItemLost findByItemStatusMatch_First(String LostStatus,
		OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByItemStatusMatch_First(LostStatus,
				orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("LostStatus=");
		msg.append(LostStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the first item lost in the ordered set where LostStatus = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByItemStatusMatch_First(String LostStatus,
		OrderByComparator<ItemLost> orderByComparator) {
		List<ItemLost> list = findByItemStatusMatch(LostStatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last item lost in the ordered set where LostStatus = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item lost
	 * @throws NoSuchItemLostException if a matching item lost could not be found
	 */
	@Override
	public ItemLost findByItemStatusMatch_Last(String LostStatus,
		OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByItemStatusMatch_Last(LostStatus,
				orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("LostStatus=");
		msg.append(LostStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the last item lost in the ordered set where LostStatus = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByItemStatusMatch_Last(String LostStatus,
		OrderByComparator<ItemLost> orderByComparator) {
		int count = countByItemStatusMatch(LostStatus);

		if (count == 0) {
			return null;
		}

		List<ItemLost> list = findByItemStatusMatch(LostStatus, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemLost[] findByItemStatusMatch_PrevAndNext(long itemLostId,
		String LostStatus, OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = findByPrimaryKey(itemLostId);

		Session session = null;

		try {
			session = openSession();

			ItemLost[] array = new ItemLostImpl[3];

			array[0] = getByItemStatusMatch_PrevAndNext(session, itemLost,
					LostStatus, orderByComparator, true);

			array[1] = itemLost;

			array[2] = getByItemStatusMatch_PrevAndNext(session, itemLost,
					LostStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ItemLost getByItemStatusMatch_PrevAndNext(Session session,
		ItemLost itemLost, String LostStatus,
		OrderByComparator<ItemLost> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ITEMLOST_WHERE);

		boolean bindLostStatus = false;

		if (LostStatus == null) {
			query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_1);
		}
		else if (LostStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_3);
		}
		else {
			bindLostStatus = true;

			query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_2);
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
			query.append(ItemLostModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLostStatus) {
			qPos.add(LostStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(itemLost);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ItemLost> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the item losts where LostStatus = &#63; from the database.
	 *
	 * @param LostStatus the lost status
	 */
	@Override
	public void removeByItemStatusMatch(String LostStatus) {
		for (ItemLost itemLost : findByItemStatusMatch(LostStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(itemLost);
		}
	}

	/**
	 * Returns the number of item losts where LostStatus = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @return the number of matching item losts
	 */
	@Override
	public int countByItemStatusMatch(String LostStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ITEMSTATUSMATCH;

		Object[] finderArgs = new Object[] { LostStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ITEMLOST_WHERE);

			boolean bindLostStatus = false;

			if (LostStatus == null) {
				query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_1);
			}
			else if (LostStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_3);
			}
			else {
				bindLostStatus = true;

				query.append(_FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLostStatus) {
					qPos.add(LostStatus);
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

	private static final String _FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_1 = "itemLost.LostStatus IS NULL";
	private static final String _FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_2 = "itemLost.LostStatus = ?";
	private static final String _FINDER_COLUMN_ITEMSTATUSMATCH_LOSTSTATUS_3 = "(itemLost.LostStatus IS NULL OR itemLost.LostStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMSTSTAUSANDUSER =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByItemStstausAndUser",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTSTAUSANDUSER =
		new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, ItemLostImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByItemStstausAndUser",
			new String[] { String.class.getName(), Long.class.getName() },
			ItemLostModelImpl.LOSTSTATUS_COLUMN_BITMASK |
			ItemLostModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ITEMSTSTAUSANDUSER = new FinderPath(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByItemStstausAndUser",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the item losts where LostStatus = &#63; and userId = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param userId the user ID
	 * @return the matching item losts
	 */
	@Override
	public List<ItemLost> findByItemStstausAndUser(String LostStatus,
		long userId) {
		return findByItemStstausAndUser(LostStatus, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemLost> findByItemStstausAndUser(String LostStatus,
		long userId, int start, int end) {
		return findByItemStstausAndUser(LostStatus, userId, start, end, null);
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
	@Override
	public List<ItemLost> findByItemStstausAndUser(String LostStatus,
		long userId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return findByItemStstausAndUser(LostStatus, userId, start, end,
			orderByComparator, true);
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
	@Override
	public List<ItemLost> findByItemStstausAndUser(String LostStatus,
		long userId, int start, int end,
		OrderByComparator<ItemLost> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTSTAUSANDUSER;
			finderArgs = new Object[] { LostStatus, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMSTSTAUSANDUSER;
			finderArgs = new Object[] {
					LostStatus, userId,
					
					start, end, orderByComparator
				};
		}

		List<ItemLost> list = null;

		if (retrieveFromCache) {
			list = (List<ItemLost>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ItemLost itemLost : list) {
					if (!Validator.equals(LostStatus, itemLost.getLostStatus()) ||
							(userId != itemLost.getUserId())) {
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

			query.append(_SQL_SELECT_ITEMLOST_WHERE);

			boolean bindLostStatus = false;

			if (LostStatus == null) {
				query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_1);
			}
			else if (LostStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_3);
			}
			else {
				bindLostStatus = true;

				query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_2);
			}

			query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ItemLostModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLostStatus) {
					qPos.add(LostStatus);
				}

				qPos.add(userId);

				if (!pagination) {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost
	 * @throws NoSuchItemLostException if a matching item lost could not be found
	 */
	@Override
	public ItemLost findByItemStstausAndUser_First(String LostStatus,
		long userId, OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByItemStstausAndUser_First(LostStatus, userId,
				orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("LostStatus=");
		msg.append(LostStatus);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the first item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByItemStstausAndUser_First(String LostStatus,
		long userId, OrderByComparator<ItemLost> orderByComparator) {
		List<ItemLost> list = findByItemStstausAndUser(LostStatus, userId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemLost findByItemStstausAndUser_Last(String LostStatus,
		long userId, OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByItemStstausAndUser_Last(LostStatus, userId,
				orderByComparator);

		if (itemLost != null) {
			return itemLost;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("LostStatus=");
		msg.append(LostStatus);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemLostException(msg.toString());
	}

	/**
	 * Returns the last item lost in the ordered set where LostStatus = &#63; and userId = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item lost, or <code>null</code> if a matching item lost could not be found
	 */
	@Override
	public ItemLost fetchByItemStstausAndUser_Last(String LostStatus,
		long userId, OrderByComparator<ItemLost> orderByComparator) {
		int count = countByItemStstausAndUser(LostStatus, userId);

		if (count == 0) {
			return null;
		}

		List<ItemLost> list = findByItemStstausAndUser(LostStatus, userId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemLost[] findByItemStstausAndUser_PrevAndNext(long itemLostId,
		String LostStatus, long userId,
		OrderByComparator<ItemLost> orderByComparator)
		throws NoSuchItemLostException {
		ItemLost itemLost = findByPrimaryKey(itemLostId);

		Session session = null;

		try {
			session = openSession();

			ItemLost[] array = new ItemLostImpl[3];

			array[0] = getByItemStstausAndUser_PrevAndNext(session, itemLost,
					LostStatus, userId, orderByComparator, true);

			array[1] = itemLost;

			array[2] = getByItemStstausAndUser_PrevAndNext(session, itemLost,
					LostStatus, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ItemLost getByItemStstausAndUser_PrevAndNext(Session session,
		ItemLost itemLost, String LostStatus, long userId,
		OrderByComparator<ItemLost> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_ITEMLOST_WHERE);

		boolean bindLostStatus = false;

		if (LostStatus == null) {
			query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_1);
		}
		else if (LostStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_3);
		}
		else {
			bindLostStatus = true;

			query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_2);
		}

		query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_USERID_2);

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
			query.append(ItemLostModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLostStatus) {
			qPos.add(LostStatus);
		}

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(itemLost);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ItemLost> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the item losts where LostStatus = &#63; and userId = &#63; from the database.
	 *
	 * @param LostStatus the lost status
	 * @param userId the user ID
	 */
	@Override
	public void removeByItemStstausAndUser(String LostStatus, long userId) {
		for (ItemLost itemLost : findByItemStstausAndUser(LostStatus, userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(itemLost);
		}
	}

	/**
	 * Returns the number of item losts where LostStatus = &#63; and userId = &#63;.
	 *
	 * @param LostStatus the lost status
	 * @param userId the user ID
	 * @return the number of matching item losts
	 */
	@Override
	public int countByItemStstausAndUser(String LostStatus, long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ITEMSTSTAUSANDUSER;

		Object[] finderArgs = new Object[] { LostStatus, userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ITEMLOST_WHERE);

			boolean bindLostStatus = false;

			if (LostStatus == null) {
				query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_1);
			}
			else if (LostStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_3);
			}
			else {
				bindLostStatus = true;

				query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_2);
			}

			query.append(_FINDER_COLUMN_ITEMSTSTAUSANDUSER_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLostStatus) {
					qPos.add(LostStatus);
				}

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_1 = "itemLost.LostStatus IS NULL AND ";
	private static final String _FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_2 = "itemLost.LostStatus = ? AND ";
	private static final String _FINDER_COLUMN_ITEMSTSTAUSANDUSER_LOSTSTATUS_3 = "(itemLost.LostStatus IS NULL OR itemLost.LostStatus = '') AND ";
	private static final String _FINDER_COLUMN_ITEMSTSTAUSANDUSER_USERID_2 = "itemLost.userId = ?";

	public ItemLostPersistenceImpl() {
		setModelClass(ItemLost.class);
	}

	/**
	 * Caches the item lost in the entity cache if it is enabled.
	 *
	 * @param itemLost the item lost
	 */
	@Override
	public void cacheResult(ItemLost itemLost) {
		entityCache.putResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostImpl.class, itemLost.getPrimaryKey(), itemLost);

		itemLost.resetOriginalValues();
	}

	/**
	 * Caches the item losts in the entity cache if it is enabled.
	 *
	 * @param itemLosts the item losts
	 */
	@Override
	public void cacheResult(List<ItemLost> itemLosts) {
		for (ItemLost itemLost : itemLosts) {
			if (entityCache.getResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
						ItemLostImpl.class, itemLost.getPrimaryKey()) == null) {
				cacheResult(itemLost);
			}
			else {
				itemLost.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all item losts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ItemLostImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the item lost.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ItemLost itemLost) {
		entityCache.removeResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostImpl.class, itemLost.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ItemLost> itemLosts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ItemLost itemLost : itemLosts) {
			entityCache.removeResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
				ItemLostImpl.class, itemLost.getPrimaryKey());
		}
	}

	/**
	 * Creates a new item lost with the primary key. Does not add the item lost to the database.
	 *
	 * @param itemLostId the primary key for the new item lost
	 * @return the new item lost
	 */
	@Override
	public ItemLost create(long itemLostId) {
		ItemLost itemLost = new ItemLostImpl();

		itemLost.setNew(true);
		itemLost.setPrimaryKey(itemLostId);

		return itemLost;
	}

	/**
	 * Removes the item lost with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemLostId the primary key of the item lost
	 * @return the item lost that was removed
	 * @throws NoSuchItemLostException if a item lost with the primary key could not be found
	 */
	@Override
	public ItemLost remove(long itemLostId) throws NoSuchItemLostException {
		return remove((Serializable)itemLostId);
	}

	/**
	 * Removes the item lost with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the item lost
	 * @return the item lost that was removed
	 * @throws NoSuchItemLostException if a item lost with the primary key could not be found
	 */
	@Override
	public ItemLost remove(Serializable primaryKey)
		throws NoSuchItemLostException {
		Session session = null;

		try {
			session = openSession();

			ItemLost itemLost = (ItemLost)session.get(ItemLostImpl.class,
					primaryKey);

			if (itemLost == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchItemLostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(itemLost);
		}
		catch (NoSuchItemLostException nsee) {
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
	protected ItemLost removeImpl(ItemLost itemLost) {
		itemLost = toUnwrappedModel(itemLost);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(itemLost)) {
				itemLost = (ItemLost)session.get(ItemLostImpl.class,
						itemLost.getPrimaryKeyObj());
			}

			if (itemLost != null) {
				session.delete(itemLost);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (itemLost != null) {
			clearCache(itemLost);
		}

		return itemLost;
	}

	@Override
	public ItemLost updateImpl(ItemLost itemLost) {
		itemLost = toUnwrappedModel(itemLost);

		boolean isNew = itemLost.isNew();

		ItemLostModelImpl itemLostModelImpl = (ItemLostModelImpl)itemLost;

		Session session = null;

		try {
			session = openSession();

			if (itemLost.isNew()) {
				session.save(itemLost);

				itemLost.setNew(false);
			}
			else {
				session.evict(itemLost);
				session.saveOrUpdate(itemLost);
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

		if (isNew || !ItemLostModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((itemLostModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						itemLostModelImpl.getOriginalItemLostId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMLOSTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTID,
					args);

				args = new Object[] { itemLostModelImpl.getItemLostId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMLOSTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTID,
					args);
			}

			if ((itemLostModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						itemLostModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMLOSTUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTUSERID,
					args);

				args = new Object[] { itemLostModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMLOSTUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMLOSTUSERID,
					args);
			}

			if ((itemLostModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTATUSMATCH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						itemLostModelImpl.getOriginalLostStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMSTATUSMATCH,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTATUSMATCH,
					args);

				args = new Object[] { itemLostModelImpl.getLostStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMSTATUSMATCH,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTATUSMATCH,
					args);
			}

			if ((itemLostModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTSTAUSANDUSER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						itemLostModelImpl.getOriginalLostStatus(),
						itemLostModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMSTSTAUSANDUSER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTSTAUSANDUSER,
					args);

				args = new Object[] {
						itemLostModelImpl.getLostStatus(),
						itemLostModelImpl.getUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMSTSTAUSANDUSER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMSTSTAUSANDUSER,
					args);
			}
		}

		entityCache.putResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
			ItemLostImpl.class, itemLost.getPrimaryKey(), itemLost, false);

		itemLost.resetOriginalValues();

		return itemLost;
	}

	protected ItemLost toUnwrappedModel(ItemLost itemLost) {
		if (itemLost instanceof ItemLostImpl) {
			return itemLost;
		}

		ItemLostImpl itemLostImpl = new ItemLostImpl();

		itemLostImpl.setNew(itemLost.isNew());
		itemLostImpl.setPrimaryKey(itemLost.getPrimaryKey());

		itemLostImpl.setItemLostId(itemLost.getItemLostId());
		itemLostImpl.setUserId(itemLost.getUserId());
		itemLostImpl.setLostDate(itemLost.getLostDate());
		itemLostImpl.setLostLocation(itemLost.getLostLocation());
		itemLostImpl.setLostCompany(itemLost.getLostCompany());
		itemLostImpl.setLostColor(itemLost.getLostColor());
		itemLostImpl.setLostSize(itemLost.getLostSize());
		itemLostImpl.setLostType(itemLost.getLostType());
		itemLostImpl.setLostStatus(itemLost.getLostStatus());
		itemLostImpl.setLostDesc(itemLost.getLostDesc());
		itemLostImpl.setMimeType(itemLost.getMimeType());
		itemLostImpl.setBlobData(itemLost.getBlobData());

		return itemLostImpl;
	}

	/**
	 * Returns the item lost with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the item lost
	 * @return the item lost
	 * @throws NoSuchItemLostException if a item lost with the primary key could not be found
	 */
	@Override
	public ItemLost findByPrimaryKey(Serializable primaryKey)
		throws NoSuchItemLostException {
		ItemLost itemLost = fetchByPrimaryKey(primaryKey);

		if (itemLost == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchItemLostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return itemLost;
	}

	/**
	 * Returns the item lost with the primary key or throws a {@link NoSuchItemLostException} if it could not be found.
	 *
	 * @param itemLostId the primary key of the item lost
	 * @return the item lost
	 * @throws NoSuchItemLostException if a item lost with the primary key could not be found
	 */
	@Override
	public ItemLost findByPrimaryKey(long itemLostId)
		throws NoSuchItemLostException {
		return findByPrimaryKey((Serializable)itemLostId);
	}

	/**
	 * Returns the item lost with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the item lost
	 * @return the item lost, or <code>null</code> if a item lost with the primary key could not be found
	 */
	@Override
	public ItemLost fetchByPrimaryKey(Serializable primaryKey) {
		ItemLost itemLost = (ItemLost)entityCache.getResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
				ItemLostImpl.class, primaryKey);

		if (itemLost == _nullItemLost) {
			return null;
		}

		if (itemLost == null) {
			Session session = null;

			try {
				session = openSession();

				itemLost = (ItemLost)session.get(ItemLostImpl.class, primaryKey);

				if (itemLost != null) {
					cacheResult(itemLost);
				}
				else {
					entityCache.putResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
						ItemLostImpl.class, primaryKey, _nullItemLost);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
					ItemLostImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return itemLost;
	}

	/**
	 * Returns the item lost with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemLostId the primary key of the item lost
	 * @return the item lost, or <code>null</code> if a item lost with the primary key could not be found
	 */
	@Override
	public ItemLost fetchByPrimaryKey(long itemLostId) {
		return fetchByPrimaryKey((Serializable)itemLostId);
	}

	@Override
	public Map<Serializable, ItemLost> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ItemLost> map = new HashMap<Serializable, ItemLost>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ItemLost itemLost = fetchByPrimaryKey(primaryKey);

			if (itemLost != null) {
				map.put(primaryKey, itemLost);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			ItemLost itemLost = (ItemLost)entityCache.getResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
					ItemLostImpl.class, primaryKey);

			if (itemLost == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, itemLost);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ITEMLOST_WHERE_PKS_IN);

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

			for (ItemLost itemLost : (List<ItemLost>)q.list()) {
				map.put(itemLost.getPrimaryKeyObj(), itemLost);

				cacheResult(itemLost);

				uncachedPrimaryKeys.remove(itemLost.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ItemLostModelImpl.ENTITY_CACHE_ENABLED,
					ItemLostImpl.class, primaryKey, _nullItemLost);
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
	 * Returns all the item losts.
	 *
	 * @return the item losts
	 */
	@Override
	public List<ItemLost> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemLost> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ItemLost> findAll(int start, int end,
		OrderByComparator<ItemLost> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ItemLost> findAll(int start, int end,
		OrderByComparator<ItemLost> orderByComparator, boolean retrieveFromCache) {
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

		List<ItemLost> list = null;

		if (retrieveFromCache) {
			list = (List<ItemLost>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ITEMLOST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ITEMLOST;

				if (pagination) {
					sql = sql.concat(ItemLostModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemLost>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the item losts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ItemLost itemLost : findAll()) {
			remove(itemLost);
		}
	}

	/**
	 * Returns the number of item losts.
	 *
	 * @return the number of item losts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ITEMLOST);

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
		return ItemLostModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the item lost persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ItemLostImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_ITEMLOST = "SELECT itemLost FROM ItemLost itemLost";
	private static final String _SQL_SELECT_ITEMLOST_WHERE_PKS_IN = "SELECT itemLost FROM ItemLost itemLost WHERE itemLostId IN (";
	private static final String _SQL_SELECT_ITEMLOST_WHERE = "SELECT itemLost FROM ItemLost itemLost WHERE ";
	private static final String _SQL_COUNT_ITEMLOST = "SELECT COUNT(itemLost) FROM ItemLost itemLost";
	private static final String _SQL_COUNT_ITEMLOST_WHERE = "SELECT COUNT(itemLost) FROM ItemLost itemLost WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "itemLost.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ItemLost exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ItemLost exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ItemLostPersistenceImpl.class);
	private static final ItemLost _nullItemLost = new ItemLostImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ItemLost> toCacheModel() {
				return _nullItemLostCacheModel;
			}
		};

	private static final CacheModel<ItemLost> _nullItemLostCacheModel = new CacheModel<ItemLost>() {
			@Override
			public ItemLost toEntityModel() {
				return _nullItemLost;
			}
		};
}