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

package com.Trylof.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.Trylof.services.model.SearchRes;
import com.Trylof.services.model.SearchResModel;
import com.Trylof.services.model.SearchResSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SearchRes service. Represents a row in the &quot;LofService_SearchRes&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link SearchResModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SearchResImpl}.
 * </p>
 *
 * @author Utkarsh
 * @see SearchResImpl
 * @see SearchRes
 * @see SearchResModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class SearchResModelImpl extends BaseModelImpl<SearchRes>
	implements SearchResModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a search res model instance should use the {@link SearchRes} interface instead.
	 */
	public static final String TABLE_NAME = "LofService_SearchRes";
	public static final Object[][] TABLE_COLUMNS = {
			{ "searchResId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "itemid", Types.BIGINT },
			{ "location", Types.VARCHAR },
			{ "color", Types.VARCHAR },
			{ "size_", Types.VARCHAR },
			{ "desc_", Types.VARCHAR },
			{ "count", Types.INTEGER },
			{ "Status", Types.VARCHAR },
			{ "Date", Types.TIMESTAMP },
			{ "Company", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("searchResId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("itemid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("location", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("color", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("size_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("desc_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("count", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("Status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("Date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("Company", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table LofService_SearchRes (searchResId LONG not null primary key,userId LONG,itemid LONG,location VARCHAR(75) null,color VARCHAR(75) null,size_ VARCHAR(75) null,desc_ VARCHAR(500) null,count INTEGER,Status VARCHAR(75) null,Date DATE null,Company VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table LofService_SearchRes";
	public static final String ORDER_BY_JPQL = " ORDER BY searchRes.count DESC";
	public static final String ORDER_BY_SQL = " ORDER BY LofService_SearchRes.count DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.Trylof.services.model.SearchRes"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.Trylof.services.model.SearchRes"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static SearchRes toModel(SearchResSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SearchRes model = new SearchResImpl();

		model.setSearchResId(soapModel.getSearchResId());
		model.setUserId(soapModel.getUserId());
		model.setItemid(soapModel.getItemid());
		model.setLocation(soapModel.getLocation());
		model.setColor(soapModel.getColor());
		model.setSize(soapModel.getSize());
		model.setDesc(soapModel.getDesc());
		model.setCount(soapModel.getCount());
		model.setStatus(soapModel.getStatus());
		model.setDate(soapModel.getDate());
		model.setCompany(soapModel.getCompany());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<SearchRes> toModels(SearchResSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SearchRes> models = new ArrayList<SearchRes>(soapModels.length);

		for (SearchResSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.Trylof.services.model.SearchRes"));

	public SearchResModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _searchResId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSearchResId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _searchResId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SearchRes.class;
	}

	@Override
	public String getModelClassName() {
		return SearchRes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("searchResId", getSearchResId());
		attributes.put("userId", getUserId());
		attributes.put("itemid", getItemid());
		attributes.put("location", getLocation());
		attributes.put("color", getColor());
		attributes.put("size", getSize());
		attributes.put("desc", getDesc());
		attributes.put("count", getCount());
		attributes.put("Status", getStatus());
		attributes.put("Date", getDate());
		attributes.put("Company", getCompany());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long searchResId = (Long)attributes.get("searchResId");

		if (searchResId != null) {
			setSearchResId(searchResId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long itemid = (Long)attributes.get("itemid");

		if (itemid != null) {
			setItemid(itemid);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		String size = (String)attributes.get("size");

		if (size != null) {
			setSize(size);
		}

		String desc = (String)attributes.get("desc");

		if (desc != null) {
			setDesc(desc);
		}

		Integer count = (Integer)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		String Status = (String)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}

		Date Date = (Date)attributes.get("Date");

		if (Date != null) {
			setDate(Date);
		}

		String Company = (String)attributes.get("Company");

		if (Company != null) {
			setCompany(Company);
		}
	}

	@JSON
	@Override
	public long getSearchResId() {
		return _searchResId;
	}

	@Override
	public void setSearchResId(long searchResId) {
		_searchResId = searchResId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public long getItemid() {
		return _itemid;
	}

	@Override
	public void setItemid(long itemid) {
		_itemid = itemid;
	}

	@JSON
	@Override
	public String getLocation() {
		if (_location == null) {
			return StringPool.BLANK;
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		_location = location;
	}

	@JSON
	@Override
	public String getColor() {
		if (_color == null) {
			return StringPool.BLANK;
		}
		else {
			return _color;
		}
	}

	@Override
	public void setColor(String color) {
		_color = color;
	}

	@JSON
	@Override
	public String getSize() {
		if (_size == null) {
			return StringPool.BLANK;
		}
		else {
			return _size;
		}
	}

	@Override
	public void setSize(String size) {
		_size = size;
	}

	@JSON
	@Override
	public String getDesc() {
		if (_desc == null) {
			return StringPool.BLANK;
		}
		else {
			return _desc;
		}
	}

	@Override
	public void setDesc(String desc) {
		_desc = desc;
	}

	@JSON
	@Override
	public int getCount() {
		return _count;
	}

	@Override
	public void setCount(int count) {
		_count = count;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_Status == null) {
			return StringPool.BLANK;
		}
		else {
			return _Status;
		}
	}

	@Override
	public void setStatus(String Status) {
		_Status = Status;
	}

	@JSON
	@Override
	public Date getDate() {
		return _Date;
	}

	@Override
	public void setDate(Date Date) {
		_Date = Date;
	}

	@JSON
	@Override
	public String getCompany() {
		if (_Company == null) {
			return StringPool.BLANK;
		}
		else {
			return _Company;
		}
	}

	@Override
	public void setCompany(String Company) {
		_Company = Company;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			SearchRes.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SearchRes toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SearchRes)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SearchResImpl searchResImpl = new SearchResImpl();

		searchResImpl.setSearchResId(getSearchResId());
		searchResImpl.setUserId(getUserId());
		searchResImpl.setItemid(getItemid());
		searchResImpl.setLocation(getLocation());
		searchResImpl.setColor(getColor());
		searchResImpl.setSize(getSize());
		searchResImpl.setDesc(getDesc());
		searchResImpl.setCount(getCount());
		searchResImpl.setStatus(getStatus());
		searchResImpl.setDate(getDate());
		searchResImpl.setCompany(getCompany());

		searchResImpl.resetOriginalValues();

		return searchResImpl;
	}

	@Override
	public int compareTo(SearchRes searchRes) {
		int value = 0;

		if (getCount() < searchRes.getCount()) {
			value = -1;
		}
		else if (getCount() > searchRes.getCount()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SearchRes)) {
			return false;
		}

		SearchRes searchRes = (SearchRes)obj;

		long primaryKey = searchRes.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<SearchRes> toCacheModel() {
		SearchResCacheModel searchResCacheModel = new SearchResCacheModel();

		searchResCacheModel.searchResId = getSearchResId();

		searchResCacheModel.userId = getUserId();

		searchResCacheModel.itemid = getItemid();

		searchResCacheModel.location = getLocation();

		String location = searchResCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			searchResCacheModel.location = null;
		}

		searchResCacheModel.color = getColor();

		String color = searchResCacheModel.color;

		if ((color != null) && (color.length() == 0)) {
			searchResCacheModel.color = null;
		}

		searchResCacheModel.size = getSize();

		String size = searchResCacheModel.size;

		if ((size != null) && (size.length() == 0)) {
			searchResCacheModel.size = null;
		}

		searchResCacheModel.desc = getDesc();

		String desc = searchResCacheModel.desc;

		if ((desc != null) && (desc.length() == 0)) {
			searchResCacheModel.desc = null;
		}

		searchResCacheModel.count = getCount();

		searchResCacheModel.Status = getStatus();

		String Status = searchResCacheModel.Status;

		if ((Status != null) && (Status.length() == 0)) {
			searchResCacheModel.Status = null;
		}

		Date Date = getDate();

		if (Date != null) {
			searchResCacheModel.Date = Date.getTime();
		}
		else {
			searchResCacheModel.Date = Long.MIN_VALUE;
		}

		searchResCacheModel.Company = getCompany();

		String Company = searchResCacheModel.Company;

		if ((Company != null) && (Company.length() == 0)) {
			searchResCacheModel.Company = null;
		}

		return searchResCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{searchResId=");
		sb.append(getSearchResId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", itemid=");
		sb.append(getItemid());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", color=");
		sb.append(getColor());
		sb.append(", size=");
		sb.append(getSize());
		sb.append(", desc=");
		sb.append(getDesc());
		sb.append(", count=");
		sb.append(getCount());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append(", Date=");
		sb.append(getDate());
		sb.append(", Company=");
		sb.append(getCompany());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.Trylof.services.model.SearchRes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>searchResId</column-name><column-value><![CDATA[");
		sb.append(getSearchResId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemid</column-name><column-value><![CDATA[");
		sb.append(getItemid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>color</column-name><column-value><![CDATA[");
		sb.append(getColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>size</column-name><column-value><![CDATA[");
		sb.append(getSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>desc</column-name><column-value><![CDATA[");
		sb.append(getDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>count</column-name><column-value><![CDATA[");
		sb.append(getCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Company</column-name><column-value><![CDATA[");
		sb.append(getCompany());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = SearchRes.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			SearchRes.class
		};
	private long _searchResId;
	private long _userId;
	private long _itemid;
	private String _location;
	private String _color;
	private String _size;
	private String _desc;
	private int _count;
	private String _Status;
	private Date _Date;
	private String _Company;
	private SearchRes _escapedModel;
}