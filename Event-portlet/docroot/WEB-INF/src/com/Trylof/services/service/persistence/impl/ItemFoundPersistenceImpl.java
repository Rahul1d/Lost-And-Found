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

import com.Trylof.services.exception.NoSuchItemFoundException;
import com.Trylof.services.model.ItemFound;
import com.Trylof.services.model.impl.ItemFoundImpl;
import com.Trylof.services.model.impl.ItemFoundModelImpl;
import com.Trylof.services.service.persistence.ItemFoundPersistence;

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
 * The persistence implementation for the item found service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see ItemFoundPersistence
 * @see com.Trylof.services.service.persistence.ItemFoundUtil
 * @generated
 */
@ProviderType
public class ItemFoundPersistenceImpl extends BasePersistenceImpl<ItemFound>
	implements ItemFoundPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ItemFoundUtil} to access the item found persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ItemFoundImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundModelImpl.FINDER_CACHE_ENABLED, ItemFoundImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundModelImpl.FINDER_CACHE_ENABLED, ItemFoundImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMTYPE = new FinderPath(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundModelImpl.FINDER_CACHE_ENABLED, ItemFoundImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByItemType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMTYPE =
		new FinderPath(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundModelImpl.FINDER_CACHE_ENABLED, ItemFoundImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByItemType",
			new String[] { String.class.getName() },
			ItemFoundModelImpl.FOUNDTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ITEMTYPE = new FinderPath(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByItemType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the item founds where FoundType = &#63;.
	 *
	 * @param FoundType the found type
	 * @return the matching item founds
	 */
	@Override
	public List<ItemFound> findByItemType(String FoundType) {
		return findByItemType(FoundType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<ItemFound> findByItemType(String FoundType, int start, int end) {
		return findByItemType(FoundType, start, end, null);
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
	@Override
	public List<ItemFound> findByItemType(String FoundType, int start, int end,
		OrderByComparator<ItemFound> orderByComparator) {
		return findByItemType(FoundType, start, end, orderByComparator, true);
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
	@Override
	public List<ItemFound> findByItemType(String FoundType, int start, int end,
		OrderByComparator<ItemFound> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMTYPE;
			finderArgs = new Object[] { FoundType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMTYPE;
			finderArgs = new Object[] { FoundType, start, end, orderByComparator };
		}

		List<ItemFound> list = null;

		if (retrieveFromCache) {
			list = (List<ItemFound>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ItemFound itemFound : list) {
					if (!Validator.equals(FoundType, itemFound.getFoundType())) {
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

			query.append(_SQL_SELECT_ITEMFOUND_WHERE);

			boolean bindFoundType = false;

			if (FoundType == null) {
				query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_1);
			}
			else if (FoundType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_3);
			}
			else {
				bindFoundType = true;

				query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ItemFoundModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFoundType) {
					qPos.add(FoundType);
				}

				if (!pagination) {
					list = (List<ItemFound>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemFound>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first item found in the ordered set where FoundType = &#63;.
	 *
	 * @param FoundType the found type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item found
	 * @throws NoSuchItemFoundException if a matching item found could not be found
	 */
	@Override
	public ItemFound findByItemType_First(String FoundType,
		OrderByComparator<ItemFound> orderByComparator)
		throws NoSuchItemFoundException {
		ItemFound itemFound = fetchByItemType_First(FoundType, orderByComparator);

		if (itemFound != null) {
			return itemFound;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FoundType=");
		msg.append(FoundType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemFoundException(msg.toString());
	}

	/**
	 * Returns the first item found in the ordered set where FoundType = &#63;.
	 *
	 * @param FoundType the found type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item found, or <code>null</code> if a matching item found could not be found
	 */
	@Override
	public ItemFound fetchByItemType_First(String FoundType,
		OrderByComparator<ItemFound> orderByComparator) {
		List<ItemFound> list = findByItemType(FoundType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last item found in the ordered set where FoundType = &#63;.
	 *
	 * @param FoundType the found type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item found
	 * @throws NoSuchItemFoundException if a matching item found could not be found
	 */
	@Override
	public ItemFound findByItemType_Last(String FoundType,
		OrderByComparator<ItemFound> orderByComparator)
		throws NoSuchItemFoundException {
		ItemFound itemFound = fetchByItemType_Last(FoundType, orderByComparator);

		if (itemFound != null) {
			return itemFound;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FoundType=");
		msg.append(FoundType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemFoundException(msg.toString());
	}

	/**
	 * Returns the last item found in the ordered set where FoundType = &#63;.
	 *
	 * @param FoundType the found type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item found, or <code>null</code> if a matching item found could not be found
	 */
	@Override
	public ItemFound fetchByItemType_Last(String FoundType,
		OrderByComparator<ItemFound> orderByComparator) {
		int count = countByItemType(FoundType);

		if (count == 0) {
			return null;
		}

		List<ItemFound> list = findByItemType(FoundType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ItemFound[] findByItemType_PrevAndNext(long itemFoundId,
		String FoundType, OrderByComparator<ItemFound> orderByComparator)
		throws NoSuchItemFoundException {
		ItemFound itemFound = findByPrimaryKey(itemFoundId);

		Session session = null;

		try {
			session = openSession();

			ItemFound[] array = new ItemFoundImpl[3];

			array[0] = getByItemType_PrevAndNext(session, itemFound, FoundType,
					orderByComparator, true);

			array[1] = itemFound;

			array[2] = getByItemType_PrevAndNext(session, itemFound, FoundType,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ItemFound getByItemType_PrevAndNext(Session session,
		ItemFound itemFound, String FoundType,
		OrderByComparator<ItemFound> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ITEMFOUND_WHERE);

		boolean bindFoundType = false;

		if (FoundType == null) {
			query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_1);
		}
		else if (FoundType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_3);
		}
		else {
			bindFoundType = true;

			query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_2);
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
			query.append(ItemFoundModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFoundType) {
			qPos.add(FoundType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(itemFound);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ItemFound> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the item founds where FoundType = &#63; from the database.
	 *
	 * @param FoundType the found type
	 */
	@Override
	public void removeByItemType(String FoundType) {
		for (ItemFound itemFound : findByItemType(FoundType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(itemFound);
		}
	}

	/**
	 * Returns the number of item founds where FoundType = &#63;.
	 *
	 * @param FoundType the found type
	 * @return the number of matching item founds
	 */
	@Override
	public int countByItemType(String FoundType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ITEMTYPE;

		Object[] finderArgs = new Object[] { FoundType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ITEMFOUND_WHERE);

			boolean bindFoundType = false;

			if (FoundType == null) {
				query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_1);
			}
			else if (FoundType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_3);
			}
			else {
				bindFoundType = true;

				query.append(_FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFoundType) {
					qPos.add(FoundType);
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

	private static final String _FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_1 = "itemFound.FoundType IS NULL";
	private static final String _FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_2 = "itemFound.FoundType = ?";
	private static final String _FINDER_COLUMN_ITEMTYPE_FOUNDTYPE_3 = "(itemFound.FoundType IS NULL OR itemFound.FoundType = '')";

	public ItemFoundPersistenceImpl() {
		setModelClass(ItemFound.class);
	}

	/**
	 * Caches the item found in the entity cache if it is enabled.
	 *
	 * @param itemFound the item found
	 */
	@Override
	public void cacheResult(ItemFound itemFound) {
		entityCache.putResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundImpl.class, itemFound.getPrimaryKey(), itemFound);

		itemFound.resetOriginalValues();
	}

	/**
	 * Caches the item founds in the entity cache if it is enabled.
	 *
	 * @param itemFounds the item founds
	 */
	@Override
	public void cacheResult(List<ItemFound> itemFounds) {
		for (ItemFound itemFound : itemFounds) {
			if (entityCache.getResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
						ItemFoundImpl.class, itemFound.getPrimaryKey()) == null) {
				cacheResult(itemFound);
			}
			else {
				itemFound.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all item founds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ItemFoundImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the item found.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ItemFound itemFound) {
		entityCache.removeResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundImpl.class, itemFound.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ItemFound> itemFounds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ItemFound itemFound : itemFounds) {
			entityCache.removeResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
				ItemFoundImpl.class, itemFound.getPrimaryKey());
		}
	}

	/**
	 * Creates a new item found with the primary key. Does not add the item found to the database.
	 *
	 * @param itemFoundId the primary key for the new item found
	 * @return the new item found
	 */
	@Override
	public ItemFound create(long itemFoundId) {
		ItemFound itemFound = new ItemFoundImpl();

		itemFound.setNew(true);
		itemFound.setPrimaryKey(itemFoundId);

		return itemFound;
	}

	/**
	 * Removes the item found with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemFoundId the primary key of the item found
	 * @return the item found that was removed
	 * @throws NoSuchItemFoundException if a item found with the primary key could not be found
	 */
	@Override
	public ItemFound remove(long itemFoundId) throws NoSuchItemFoundException {
		return remove((Serializable)itemFoundId);
	}

	/**
	 * Removes the item found with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the item found
	 * @return the item found that was removed
	 * @throws NoSuchItemFoundException if a item found with the primary key could not be found
	 */
	@Override
	public ItemFound remove(Serializable primaryKey)
		throws NoSuchItemFoundException {
		Session session = null;

		try {
			session = openSession();

			ItemFound itemFound = (ItemFound)session.get(ItemFoundImpl.class,
					primaryKey);

			if (itemFound == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchItemFoundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(itemFound);
		}
		catch (NoSuchItemFoundException nsee) {
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
	protected ItemFound removeImpl(ItemFound itemFound) {
		itemFound = toUnwrappedModel(itemFound);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(itemFound)) {
				itemFound = (ItemFound)session.get(ItemFoundImpl.class,
						itemFound.getPrimaryKeyObj());
			}

			if (itemFound != null) {
				session.delete(itemFound);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (itemFound != null) {
			clearCache(itemFound);
		}

		return itemFound;
	}

	@Override
	public ItemFound updateImpl(ItemFound itemFound) {
		itemFound = toUnwrappedModel(itemFound);

		boolean isNew = itemFound.isNew();

		ItemFoundModelImpl itemFoundModelImpl = (ItemFoundModelImpl)itemFound;

		Session session = null;

		try {
			session = openSession();

			if (itemFound.isNew()) {
				session.save(itemFound);

				itemFound.setNew(false);
			}
			else {
				session.evict(itemFound);
				session.saveOrUpdate(itemFound);
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

		if (isNew || !ItemFoundModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((itemFoundModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						itemFoundModelImpl.getOriginalFoundType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMTYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMTYPE,
					args);

				args = new Object[] { itemFoundModelImpl.getFoundType() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ITEMTYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMTYPE,
					args);
			}
		}

		entityCache.putResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
			ItemFoundImpl.class, itemFound.getPrimaryKey(), itemFound, false);

		itemFound.resetOriginalValues();

		return itemFound;
	}

	protected ItemFound toUnwrappedModel(ItemFound itemFound) {
		if (itemFound instanceof ItemFoundImpl) {
			return itemFound;
		}

		ItemFoundImpl itemFoundImpl = new ItemFoundImpl();

		itemFoundImpl.setNew(itemFound.isNew());
		itemFoundImpl.setPrimaryKey(itemFound.getPrimaryKey());

		itemFoundImpl.setItemFoundId(itemFound.getItemFoundId());
		itemFoundImpl.setUserId(itemFound.getUserId());
		itemFoundImpl.setFoundDate(itemFound.getFoundDate());
		itemFoundImpl.setFoundLocation(itemFound.getFoundLocation());
		itemFoundImpl.setFoundCompany(itemFound.getFoundCompany());
		itemFoundImpl.setFoundColor(itemFound.getFoundColor());
		itemFoundImpl.setFoundSize(itemFound.getFoundSize());
		itemFoundImpl.setFoundType(itemFound.getFoundType());
		itemFoundImpl.setFoundStatus(itemFound.getFoundStatus());
		itemFoundImpl.setFoundDesc(itemFound.getFoundDesc());
		itemFoundImpl.setLostItem(itemFound.getLostItem());
		itemFoundImpl.setMimeType(itemFound.getMimeType());
		itemFoundImpl.setBlobData(itemFound.getBlobData());

		return itemFoundImpl;
	}

	/**
	 * Returns the item found with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the item found
	 * @return the item found
	 * @throws NoSuchItemFoundException if a item found with the primary key could not be found
	 */
	@Override
	public ItemFound findByPrimaryKey(Serializable primaryKey)
		throws NoSuchItemFoundException {
		ItemFound itemFound = fetchByPrimaryKey(primaryKey);

		if (itemFound == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchItemFoundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return itemFound;
	}

	/**
	 * Returns the item found with the primary key or throws a {@link NoSuchItemFoundException} if it could not be found.
	 *
	 * @param itemFoundId the primary key of the item found
	 * @return the item found
	 * @throws NoSuchItemFoundException if a item found with the primary key could not be found
	 */
	@Override
	public ItemFound findByPrimaryKey(long itemFoundId)
		throws NoSuchItemFoundException {
		return findByPrimaryKey((Serializable)itemFoundId);
	}

	/**
	 * Returns the item found with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the item found
	 * @return the item found, or <code>null</code> if a item found with the primary key could not be found
	 */
	@Override
	public ItemFound fetchByPrimaryKey(Serializable primaryKey) {
		ItemFound itemFound = (ItemFound)entityCache.getResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
				ItemFoundImpl.class, primaryKey);

		if (itemFound == _nullItemFound) {
			return null;
		}

		if (itemFound == null) {
			Session session = null;

			try {
				session = openSession();

				itemFound = (ItemFound)session.get(ItemFoundImpl.class,
						primaryKey);

				if (itemFound != null) {
					cacheResult(itemFound);
				}
				else {
					entityCache.putResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
						ItemFoundImpl.class, primaryKey, _nullItemFound);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
					ItemFoundImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return itemFound;
	}

	/**
	 * Returns the item found with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemFoundId the primary key of the item found
	 * @return the item found, or <code>null</code> if a item found with the primary key could not be found
	 */
	@Override
	public ItemFound fetchByPrimaryKey(long itemFoundId) {
		return fetchByPrimaryKey((Serializable)itemFoundId);
	}

	@Override
	public Map<Serializable, ItemFound> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ItemFound> map = new HashMap<Serializable, ItemFound>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ItemFound itemFound = fetchByPrimaryKey(primaryKey);

			if (itemFound != null) {
				map.put(primaryKey, itemFound);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			ItemFound itemFound = (ItemFound)entityCache.getResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
					ItemFoundImpl.class, primaryKey);

			if (itemFound == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, itemFound);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ITEMFOUND_WHERE_PKS_IN);

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

			for (ItemFound itemFound : (List<ItemFound>)q.list()) {
				map.put(itemFound.getPrimaryKeyObj(), itemFound);

				cacheResult(itemFound);

				uncachedPrimaryKeys.remove(itemFound.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ItemFoundModelImpl.ENTITY_CACHE_ENABLED,
					ItemFoundImpl.class, primaryKey, _nullItemFound);
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
	 * Returns all the item founds.
	 *
	 * @return the item founds
	 */
	@Override
	public List<ItemFound> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ItemFound> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ItemFound> findAll(int start, int end,
		OrderByComparator<ItemFound> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ItemFound> findAll(int start, int end,
		OrderByComparator<ItemFound> orderByComparator,
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

		List<ItemFound> list = null;

		if (retrieveFromCache) {
			list = (List<ItemFound>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ITEMFOUND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ITEMFOUND;

				if (pagination) {
					sql = sql.concat(ItemFoundModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ItemFound>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ItemFound>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the item founds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ItemFound itemFound : findAll()) {
			remove(itemFound);
		}
	}

	/**
	 * Returns the number of item founds.
	 *
	 * @return the number of item founds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ITEMFOUND);

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
		return ItemFoundModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the item found persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ItemFoundImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_ITEMFOUND = "SELECT itemFound FROM ItemFound itemFound";
	private static final String _SQL_SELECT_ITEMFOUND_WHERE_PKS_IN = "SELECT itemFound FROM ItemFound itemFound WHERE itemFoundId IN (";
	private static final String _SQL_SELECT_ITEMFOUND_WHERE = "SELECT itemFound FROM ItemFound itemFound WHERE ";
	private static final String _SQL_COUNT_ITEMFOUND = "SELECT COUNT(itemFound) FROM ItemFound itemFound";
	private static final String _SQL_COUNT_ITEMFOUND_WHERE = "SELECT COUNT(itemFound) FROM ItemFound itemFound WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "itemFound.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ItemFound exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ItemFound exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ItemFoundPersistenceImpl.class);
	private static final ItemFound _nullItemFound = new ItemFoundImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ItemFound> toCacheModel() {
				return _nullItemFoundCacheModel;
			}
		};

	private static final CacheModel<ItemFound> _nullItemFoundCacheModel = new CacheModel<ItemFound>() {
			@Override
			public ItemFound toEntityModel() {
				return _nullItemFound;
			}
		};
}