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
import com.Trylof.services.service.ItemLostLocalServiceUtil;

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

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class ItemLostClp extends BaseModelImpl<ItemLost> implements ItemLost {
	public ItemLostClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ItemLost.class;
	}

	@Override
	public String getModelClassName() {
		return ItemLost.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _itemLostId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemLostId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemLostId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemLostId", getItemLostId());
		attributes.put("userId", getUserId());
		attributes.put("LostDate", getLostDate());
		attributes.put("LostLocation", getLostLocation());
		attributes.put("LostCompany", getLostCompany());
		attributes.put("LostColor", getLostColor());
		attributes.put("LostSize", getLostSize());
		attributes.put("LostType", getLostType());
		attributes.put("LostStatus", getLostStatus());
		attributes.put("LostDesc", getLostDesc());
		attributes.put("mimeType", getMimeType());
		attributes.put("blobData", getBlobData());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemLostId = (Long)attributes.get("itemLostId");

		if (itemLostId != null) {
			setItemLostId(itemLostId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date LostDate = (Date)attributes.get("LostDate");

		if (LostDate != null) {
			setLostDate(LostDate);
		}

		String LostLocation = (String)attributes.get("LostLocation");

		if (LostLocation != null) {
			setLostLocation(LostLocation);
		}

		String LostCompany = (String)attributes.get("LostCompany");

		if (LostCompany != null) {
			setLostCompany(LostCompany);
		}

		String LostColor = (String)attributes.get("LostColor");

		if (LostColor != null) {
			setLostColor(LostColor);
		}

		String LostSize = (String)attributes.get("LostSize");

		if (LostSize != null) {
			setLostSize(LostSize);
		}

		String LostType = (String)attributes.get("LostType");

		if (LostType != null) {
			setLostType(LostType);
		}

		String LostStatus = (String)attributes.get("LostStatus");

		if (LostStatus != null) {
			setLostStatus(LostStatus);
		}

		String LostDesc = (String)attributes.get("LostDesc");

		if (LostDesc != null) {
			setLostDesc(LostDesc);
		}

		String mimeType = (String)attributes.get("mimeType");

		if (mimeType != null) {
			setMimeType(mimeType);
		}

		Blob blobData = (Blob)attributes.get("blobData");

		if (blobData != null) {
			setBlobData(blobData);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getItemLostId() {
		return _itemLostId;
	}

	@Override
	public void setItemLostId(long itemLostId) {
		_itemLostId = itemLostId;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setItemLostId", long.class);

				method.invoke(_itemLostRemoteModel, itemLostId);
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

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_itemLostRemoteModel, userId);
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
	public Date getLostDate() {
		return _LostDate;
	}

	@Override
	public void setLostDate(Date LostDate) {
		_LostDate = LostDate;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostDate", Date.class);

				method.invoke(_itemLostRemoteModel, LostDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLostLocation() {
		return _LostLocation;
	}

	@Override
	public void setLostLocation(String LostLocation) {
		_LostLocation = LostLocation;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostLocation", String.class);

				method.invoke(_itemLostRemoteModel, LostLocation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLostCompany() {
		return _LostCompany;
	}

	@Override
	public void setLostCompany(String LostCompany) {
		_LostCompany = LostCompany;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostCompany", String.class);

				method.invoke(_itemLostRemoteModel, LostCompany);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLostColor() {
		return _LostColor;
	}

	@Override
	public void setLostColor(String LostColor) {
		_LostColor = LostColor;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostColor", String.class);

				method.invoke(_itemLostRemoteModel, LostColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLostSize() {
		return _LostSize;
	}

	@Override
	public void setLostSize(String LostSize) {
		_LostSize = LostSize;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostSize", String.class);

				method.invoke(_itemLostRemoteModel, LostSize);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLostType() {
		return _LostType;
	}

	@Override
	public void setLostType(String LostType) {
		_LostType = LostType;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostType", String.class);

				method.invoke(_itemLostRemoteModel, LostType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLostStatus() {
		return _LostStatus;
	}

	@Override
	public void setLostStatus(String LostStatus) {
		_LostStatus = LostStatus;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostStatus", String.class);

				method.invoke(_itemLostRemoteModel, LostStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLostDesc() {
		return _LostDesc;
	}

	@Override
	public void setLostDesc(String LostDesc) {
		_LostDesc = LostDesc;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setLostDesc", String.class);

				method.invoke(_itemLostRemoteModel, LostDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMimeType() {
		return _mimeType;
	}

	@Override
	public void setMimeType(String mimeType) {
		_mimeType = mimeType;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setMimeType", String.class);

				method.invoke(_itemLostRemoteModel, mimeType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getBlobData() {
		return _blobData;
	}

	@Override
	public void setBlobData(Blob blobData) {
		_blobData = blobData;

		if (_itemLostRemoteModel != null) {
			try {
				Class<?> clazz = _itemLostRemoteModel.getClass();

				Method method = clazz.getMethod("setBlobData", Blob.class);

				method.invoke(_itemLostRemoteModel, blobData);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getItemLostRemoteModel() {
		return _itemLostRemoteModel;
	}

	public void setItemLostRemoteModel(BaseModel<?> itemLostRemoteModel) {
		_itemLostRemoteModel = itemLostRemoteModel;
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

		Class<?> remoteModelClass = _itemLostRemoteModel.getClass();

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

		Object returnValue = method.invoke(_itemLostRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			ItemLostLocalServiceUtil.addItemLost(this);
		}
		else {
			ItemLostLocalServiceUtil.updateItemLost(this);
		}
	}

	@Override
	public ItemLost toEscapedModel() {
		return (ItemLost)ProxyUtil.newProxyInstance(ItemLost.class.getClassLoader(),
			new Class[] { ItemLost.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ItemLostClp clone = new ItemLostClp();

		clone.setItemLostId(getItemLostId());
		clone.setUserId(getUserId());
		clone.setLostDate(getLostDate());
		clone.setLostLocation(getLostLocation());
		clone.setLostCompany(getLostCompany());
		clone.setLostColor(getLostColor());
		clone.setLostSize(getLostSize());
		clone.setLostType(getLostType());
		clone.setLostStatus(getLostStatus());
		clone.setLostDesc(getLostDesc());
		clone.setMimeType(getMimeType());
		clone.setBlobData(getBlobData());

		return clone;
	}

	@Override
	public int compareTo(ItemLost itemLost) {
		long primaryKey = itemLost.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemLostClp)) {
			return false;
		}

		ItemLostClp itemLost = (ItemLostClp)obj;

		long primaryKey = itemLost.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{itemLostId=");
		sb.append(getItemLostId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", LostDate=");
		sb.append(getLostDate());
		sb.append(", LostLocation=");
		sb.append(getLostLocation());
		sb.append(", LostCompany=");
		sb.append(getLostCompany());
		sb.append(", LostColor=");
		sb.append(getLostColor());
		sb.append(", LostSize=");
		sb.append(getLostSize());
		sb.append(", LostType=");
		sb.append(getLostType());
		sb.append(", LostStatus=");
		sb.append(getLostStatus());
		sb.append(", LostDesc=");
		sb.append(getLostDesc());
		sb.append(", mimeType=");
		sb.append(getMimeType());
		sb.append(", blobData=");
		sb.append(getBlobData());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.Trylof.services.model.ItemLost");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemLostId</column-name><column-value><![CDATA[");
		sb.append(getItemLostId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostDate</column-name><column-value><![CDATA[");
		sb.append(getLostDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostLocation</column-name><column-value><![CDATA[");
		sb.append(getLostLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostCompany</column-name><column-value><![CDATA[");
		sb.append(getLostCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostColor</column-name><column-value><![CDATA[");
		sb.append(getLostColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostSize</column-name><column-value><![CDATA[");
		sb.append(getLostSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostType</column-name><column-value><![CDATA[");
		sb.append(getLostType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostStatus</column-name><column-value><![CDATA[");
		sb.append(getLostStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostDesc</column-name><column-value><![CDATA[");
		sb.append(getLostDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mimeType</column-name><column-value><![CDATA[");
		sb.append(getMimeType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>blobData</column-name><column-value><![CDATA[");
		sb.append(getBlobData());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _itemLostId;
	private long _userId;
	private Date _LostDate;
	private String _LostLocation;
	private String _LostCompany;
	private String _LostColor;
	private String _LostSize;
	private String _LostType;
	private String _LostStatus;
	private String _LostDesc;
	private String _mimeType;
	private Blob _blobData;
	private BaseModel<?> _itemLostRemoteModel;
	private Class<?> _clpSerializerClass = com.Trylof.services.service.ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}