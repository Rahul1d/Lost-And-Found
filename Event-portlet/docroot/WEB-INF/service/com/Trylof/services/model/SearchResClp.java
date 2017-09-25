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

package com.Trylof.services.model;

import aQute.bnd.annotation.ProviderType;

import com.Trylof.services.service.ClpSerializer;
import com.Trylof.services.service.SearchResLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class SearchResClp extends BaseModelImpl<SearchRes> implements SearchRes {
	public SearchResClp() {
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

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getSearchResId() {
		return _searchResId;
	}

	@Override
	public void setSearchResId(long searchResId) {
		_searchResId = searchResId;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setSearchResId", long.class);

				method.invoke(_searchResRemoteModel, searchResId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_searchResRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
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

	@Override
	public long getItemid() {
		return _itemid;
	}

	@Override
	public void setItemid(long itemid) {
		_itemid = itemid;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setItemid", long.class);

				method.invoke(_searchResRemoteModel, itemid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocation() {
		return _location;
	}

	@Override
	public void setLocation(String location) {
		_location = location;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_searchResRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getColor() {
		return _color;
	}

	@Override
	public void setColor(String color) {
		_color = color;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setColor", String.class);

				method.invoke(_searchResRemoteModel, color);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSize() {
		return _size;
	}

	@Override
	public void setSize(String size) {
		_size = size;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setSize", String.class);

				method.invoke(_searchResRemoteModel, size);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesc() {
		return _desc;
	}

	@Override
	public void setDesc(String desc) {
		_desc = desc;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setDesc", String.class);

				method.invoke(_searchResRemoteModel, desc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCount() {
		return _count;
	}

	@Override
	public void setCount(int count) {
		_count = count;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setCount", int.class);

				method.invoke(_searchResRemoteModel, count);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _Status;
	}

	@Override
	public void setStatus(String Status) {
		_Status = Status;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_searchResRemoteModel, Status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDate() {
		return _Date;
	}

	@Override
	public void setDate(Date Date) {
		_Date = Date;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", Date.class);

				method.invoke(_searchResRemoteModel, Date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompany() {
		return _Company;
	}

	@Override
	public void setCompany(String Company) {
		_Company = Company;

		if (_searchResRemoteModel != null) {
			try {
				Class<?> clazz = _searchResRemoteModel.getClass();

				Method method = clazz.getMethod("setCompany", String.class);

				method.invoke(_searchResRemoteModel, Company);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSearchResRemoteModel() {
		return _searchResRemoteModel;
	}

	public void setSearchResRemoteModel(BaseModel<?> searchResRemoteModel) {
		_searchResRemoteModel = searchResRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _searchResRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_searchResRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			SearchResLocalServiceUtil.addSearchRes(this);
		}
		else {
			SearchResLocalServiceUtil.updateSearchRes(this);
		}
	}

	@Override
	public SearchRes toEscapedModel() {
		return (SearchRes)ProxyUtil.newProxyInstance(SearchRes.class.getClassLoader(),
			new Class[] { SearchRes.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SearchResClp clone = new SearchResClp();

		clone.setSearchResId(getSearchResId());
		clone.setUserId(getUserId());
		clone.setItemid(getItemid());
		clone.setLocation(getLocation());
		clone.setColor(getColor());
		clone.setSize(getSize());
		clone.setDesc(getDesc());
		clone.setCount(getCount());
		clone.setStatus(getStatus());
		clone.setDate(getDate());
		clone.setCompany(getCompany());

		return clone;
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

		if (!(obj instanceof SearchResClp)) {
			return false;
		}

		SearchResClp searchRes = (SearchResClp)obj;

		long primaryKey = searchRes.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
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
	private BaseModel<?> _searchResRemoteModel;
	private Class<?> _clpSerializerClass = com.Trylof.services.service.ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}