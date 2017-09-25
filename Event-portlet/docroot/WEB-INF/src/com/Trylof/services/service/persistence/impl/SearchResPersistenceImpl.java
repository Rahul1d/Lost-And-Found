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

import com.Trylof.services.exception.NoSuchSearchResException;
import com.Trylof.services.model.SearchRes;
import com.Trylof.services.model.impl.SearchResImpl;
import com.Trylof.services.model.impl.SearchResModelImpl;
import com.Trylof.services.service.persistence.SearchResPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the search res service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Utkarsh
 * @see SearchResPersistence
 * @see com.Trylof.services.service.persistence.SearchResUtil
 * @generated
 */
@ProviderType
public class SearchResPersistenceImpl extends BasePersistenceImpl<SearchRes>
	implements SearchResPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SearchResUtil} to access the search res persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SearchResImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SearchResModelImpl.ENTITY_CACHE_ENABLED,
			SearchResModelImpl.FINDER_CACHE_ENABLED, SearchResImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SearchResModelImpl.ENTITY_CACHE_ENABLED,
			SearchResModelImpl.FINDER_CACHE_ENABLED, SearchResImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SearchResModelImpl.ENTITY_CACHE_ENABLED,
			SearchResModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SearchResPersistenceImpl() {
		setModelClass(SearchRes.class);
	}

	/**
	 * Caches the search res in the entity cache if it is enabled.
	 *
	 * @param searchRes the search res
	 */
	@Override
	public void cacheResult(SearchRes searchRes) {
		entityCache.putResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
			SearchResImpl.class, searchRes.getPrimaryKey(), searchRes);

		searchRes.resetOriginalValues();
	}

	/**
	 * Caches the search reses in the entity cache if it is enabled.
	 *
	 * @param searchReses the search reses
	 */
	@Override
	public void cacheResult(List<SearchRes> searchReses) {
		for (SearchRes searchRes : searchReses) {
			if (entityCache.getResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
						SearchResImpl.class, searchRes.getPrimaryKey()) == null) {
				cacheResult(searchRes);
			}
			else {
				searchRes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all search reses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SearchResImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the search res.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SearchRes searchRes) {
		entityCache.removeResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
			SearchResImpl.class, searchRes.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<SearchRes> searchReses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (SearchRes searchRes : searchReses) {
			entityCache.removeResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
				SearchResImpl.class, searchRes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new search res with the primary key. Does not add the search res to the database.
	 *
	 * @param searchResId the primary key for the new search res
	 * @return the new search res
	 */
	@Override
	public SearchRes create(long searchResId) {
		SearchRes searchRes = new SearchResImpl();

		searchRes.setNew(true);
		searchRes.setPrimaryKey(searchResId);

		return searchRes;
	}

	/**
	 * Removes the search res with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param searchResId the primary key of the search res
	 * @return the search res that was removed
	 * @throws NoSuchSearchResException if a search res with the primary key could not be found
	 */
	@Override
	public SearchRes remove(long searchResId) throws NoSuchSearchResException {
		return remove((Serializable)searchResId);
	}

	/**
	 * Removes the search res with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the search res
	 * @return the search res that was removed
	 * @throws NoSuchSearchResException if a search res with the primary key could not be found
	 */
	@Override
	public SearchRes remove(Serializable primaryKey)
		throws NoSuchSearchResException {
		Session session = null;

		try {
			session = openSession();

			SearchRes searchRes = (SearchRes)session.get(SearchResImpl.class,
					primaryKey);

			if (searchRes == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSearchResException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(searchRes);
		}
		catch (NoSuchSearchResException nsee) {
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
	protected SearchRes removeImpl(SearchRes searchRes) {
		searchRes = toUnwrappedModel(searchRes);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(searchRes)) {
				searchRes = (SearchRes)session.get(SearchResImpl.class,
						searchRes.getPrimaryKeyObj());
			}

			if (searchRes != null) {
				session.delete(searchRes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (searchRes != null) {
			clearCache(searchRes);
		}

		return searchRes;
	}

	@Override
	public SearchRes updateImpl(SearchRes searchRes) {
		searchRes = toUnwrappedModel(searchRes);

		boolean isNew = searchRes.isNew();

		Session session = null;

		try {
			session = openSession();

			if (searchRes.isNew()) {
				session.save(searchRes);

				searchRes.setNew(false);
			}
			else {
				searchRes = (SearchRes)session.merge(searchRes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
			SearchResImpl.class, searchRes.getPrimaryKey(), searchRes, false);

		searchRes.resetOriginalValues();

		return searchRes;
	}

	protected SearchRes toUnwrappedModel(SearchRes searchRes) {
		if (searchRes instanceof SearchResImpl) {
			return searchRes;
		}

		SearchResImpl searchResImpl = new SearchResImpl();

		searchResImpl.setNew(searchRes.isNew());
		searchResImpl.setPrimaryKey(searchRes.getPrimaryKey());

		searchResImpl.setSearchResId(searchRes.getSearchResId());
		searchResImpl.setUserId(searchRes.getUserId());
		searchResImpl.setItemid(searchRes.getItemid());
		searchResImpl.setLocation(searchRes.getLocation());
		searchResImpl.setColor(searchRes.getColor());
		searchResImpl.setSize(searchRes.getSize());
		searchResImpl.setDesc(searchRes.getDesc());
		searchResImpl.setCount(searchRes.getCount());
		searchResImpl.setStatus(searchRes.getStatus());
		searchResImpl.setDate(searchRes.getDate());
		searchResImpl.setCompany(searchRes.getCompany());

		return searchResImpl;
	}

	/**
	 * Returns the search res with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the search res
	 * @return the search res
	 * @throws NoSuchSearchResException if a search res with the primary key could not be found
	 */
	@Override
	public SearchRes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSearchResException {
		SearchRes searchRes = fetchByPrimaryKey(primaryKey);

		if (searchRes == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSearchResException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return searchRes;
	}

	/**
	 * Returns the search res with the primary key or throws a {@link NoSuchSearchResException} if it could not be found.
	 *
	 * @param searchResId the primary key of the search res
	 * @return the search res
	 * @throws NoSuchSearchResException if a search res with the primary key could not be found
	 */
	@Override
	public SearchRes findByPrimaryKey(long searchResId)
		throws NoSuchSearchResException {
		return findByPrimaryKey((Serializable)searchResId);
	}

	/**
	 * Returns the search res with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the search res
	 * @return the search res, or <code>null</code> if a search res with the primary key could not be found
	 */
	@Override
	public SearchRes fetchByPrimaryKey(Serializable primaryKey) {
		SearchRes searchRes = (SearchRes)entityCache.getResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
				SearchResImpl.class, primaryKey);

		if (searchRes == _nullSearchRes) {
			return null;
		}

		if (searchRes == null) {
			Session session = null;

			try {
				session = openSession();

				searchRes = (SearchRes)session.get(SearchResImpl.class,
						primaryKey);

				if (searchRes != null) {
					cacheResult(searchRes);
				}
				else {
					entityCache.putResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
						SearchResImpl.class, primaryKey, _nullSearchRes);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
					SearchResImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return searchRes;
	}

	/**
	 * Returns the search res with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param searchResId the primary key of the search res
	 * @return the search res, or <code>null</code> if a search res with the primary key could not be found
	 */
	@Override
	public SearchRes fetchByPrimaryKey(long searchResId) {
		return fetchByPrimaryKey((Serializable)searchResId);
	}

	@Override
	public Map<Serializable, SearchRes> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, SearchRes> map = new HashMap<Serializable, SearchRes>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			SearchRes searchRes = fetchByPrimaryKey(primaryKey);

			if (searchRes != null) {
				map.put(primaryKey, searchRes);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			SearchRes searchRes = (SearchRes)entityCache.getResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
					SearchResImpl.class, primaryKey);

			if (searchRes == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, searchRes);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SEARCHRES_WHERE_PKS_IN);

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

			for (SearchRes searchRes : (List<SearchRes>)q.list()) {
				map.put(searchRes.getPrimaryKeyObj(), searchRes);

				cacheResult(searchRes);

				uncachedPrimaryKeys.remove(searchRes.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SearchResModelImpl.ENTITY_CACHE_ENABLED,
					SearchResImpl.class, primaryKey, _nullSearchRes);
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
	 * Returns all the search reses.
	 *
	 * @return the search reses
	 */
	@Override
	public List<SearchRes> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the search reses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of search reses
	 * @param end the upper bound of the range of search reses (not inclusive)
	 * @return the range of search reses
	 */
	@Override
	public List<SearchRes> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the search reses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of search reses
	 * @param end the upper bound of the range of search reses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of search reses
	 */
	@Override
	public List<SearchRes> findAll(int start, int end,
		OrderByComparator<SearchRes> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the search reses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SearchResModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of search reses
	 * @param end the upper bound of the range of search reses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of search reses
	 */
	@Override
	public List<SearchRes> findAll(int start, int end,
		OrderByComparator<SearchRes> orderByComparator,
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

		List<SearchRes> list = null;

		if (retrieveFromCache) {
			list = (List<SearchRes>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SEARCHRES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SEARCHRES;

				if (pagination) {
					sql = sql.concat(SearchResModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<SearchRes>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<SearchRes>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the search reses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SearchRes searchRes : findAll()) {
			remove(searchRes);
		}
	}

	/**
	 * Returns the number of search reses.
	 *
	 * @return the number of search reses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SEARCHRES);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SearchResModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the search res persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SearchResImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SEARCHRES = "SELECT searchRes FROM SearchRes searchRes";
	private static final String _SQL_SELECT_SEARCHRES_WHERE_PKS_IN = "SELECT searchRes FROM SearchRes searchRes WHERE searchResId IN (";
	private static final String _SQL_COUNT_SEARCHRES = "SELECT COUNT(searchRes) FROM SearchRes searchRes";
	private static final String _ORDER_BY_ENTITY_ALIAS = "searchRes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No SearchRes exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(SearchResPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"size", "desc"
			});
	private static final SearchRes _nullSearchRes = new SearchResImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<SearchRes> toCacheModel() {
				return _nullSearchResCacheModel;
			}
		};

	private static final CacheModel<SearchRes> _nullSearchResCacheModel = new CacheModel<SearchRes>() {
			@Override
			public SearchRes toEntityModel() {
				return _nullSearchRes;
			}
		};
}