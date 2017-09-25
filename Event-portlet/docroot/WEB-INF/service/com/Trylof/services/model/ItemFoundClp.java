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
import com.Trylof.services.service.ItemFoundLocalServiceUtil;

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
public class ItemFoundClp extends BaseModelImpl<ItemFound> implements ItemFound {
	public ItemFoundClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ItemFound.class;
	}

	@Override
	public String getModelClassName() {
		return ItemFound.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _itemFoundId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemFoundId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemFoundId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemFoundId", getItemFoundId());
		attributes.put("userId", getUserId());
		attributes.put("FoundDate", getFoundDate());
		attributes.put("FoundLocation", getFoundLocation());
		attributes.put("FoundCompany", getFoundCompany());
		attributes.put("FoundColor", getFoundColor());
		attributes.put("FoundSize", getFoundSize());
		attributes.put("FoundType", getFoundType());
		attributes.put("FoundStatus", getFoundStatus());
		attributes.put("FoundDesc", getFoundDesc());
		attributes.put("LostItem", getLostItem());
		attributes.put("mimeType", getMimeType());
		attributes.put("blobData", getBlobData());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemFoundId = (Long)attributes.get("itemFoundId");

		if (itemFoundId != null) {
			setItemFoundId(itemFoundId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date FoundDate = (Date)attributes.get("FoundDate");

		if (FoundDate != null) {
			setFoundDate(FoundDate);
		}

		String FoundLocation = (String)attributes.get("FoundLocation");

		if (FoundLocation != null) {
			setFoundLocation(FoundLocation);
		}

		String FoundCompany = (String)attributes.get("FoundCompany");

		if (FoundCompany != null) {
			setFoundCompany(FoundCompany);
		}

		String FoundColor = (String)attributes.get("FoundColor");

		if (FoundColor != null) {
			setFoundColor(FoundColor);
		}

		String FoundSize = (String)attributes.get("FoundSize");

		if (FoundSize != null) {
			setFoundSize(FoundSize);
		}

		String FoundType = (String)attributes.get("FoundType");

		if (FoundType != null) {
			setFoundType(FoundType);
		}

		String FoundStatus = (String)attributes.get("FoundStatus");

		if (FoundStatus != null) {
			setFoundStatus(FoundStatus);
		}

		String FoundDesc = (String)attributes.get("FoundDesc");

		if (FoundDesc != null) {
			setFoundDesc(FoundDesc);
		}

		Long LostItem = (Long)attributes.get("LostItem");

		if (LostItem != null) {
			setLostItem(LostItem);
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
	public long getItemFoundId() {
		return _itemFoundId;
	}

	@Override
	public void setItemFoundId(long itemFoundId) {
		_itemFoundId = itemFoundId;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setItemFoundId", long.class);

				method.invoke(_itemFoundRemoteModel, itemFoundId);
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

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_itemFoundRemoteModel, userId);
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
	public Date getFoundDate() {
		return _FoundDate;
	}

	@Override
	public void setFoundDate(Date FoundDate) {
		_FoundDate = FoundDate;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundDate", Date.class);

				method.invoke(_itemFoundRemoteModel, FoundDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFoundLocation() {
		return _FoundLocation;
	}

	@Override
	public void setFoundLocation(String FoundLocation) {
		_FoundLocation = FoundLocation;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundLocation", String.class);

				method.invoke(_itemFoundRemoteModel, FoundLocation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFoundCompany() {
		return _FoundCompany;
	}

	@Override
	public void setFoundCompany(String FoundCompany) {
		_FoundCompany = FoundCompany;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundCompany", String.class);

				method.invoke(_itemFoundRemoteModel, FoundCompany);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFoundColor() {
		return _FoundColor;
	}

	@Override
	public void setFoundColor(String FoundColor) {
		_FoundColor = FoundColor;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundColor", String.class);

				method.invoke(_itemFoundRemoteModel, FoundColor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFoundSize() {
		return _FoundSize;
	}

	@Override
	public void setFoundSize(String FoundSize) {
		_FoundSize = FoundSize;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundSize", String.class);

				method.invoke(_itemFoundRemoteModel, FoundSize);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFoundType() {
		return _FoundType;
	}

	@Override
	public void setFoundType(String FoundType) {
		_FoundType = FoundType;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundType", String.class);

				method.invoke(_itemFoundRemoteModel, FoundType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFoundStatus() {
		return _FoundStatus;
	}

	@Override
	public void setFoundStatus(String FoundStatus) {
		_FoundStatus = FoundStatus;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundStatus", String.class);

				method.invoke(_itemFoundRemoteModel, FoundStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFoundDesc() {
		return _FoundDesc;
	}

	@Override
	public void setFoundDesc(String FoundDesc) {
		_FoundDesc = FoundDesc;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundDesc", String.class);

				method.invoke(_itemFoundRemoteModel, FoundDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLostItem() {
		return _LostItem;
	}

	@Override
	public void setLostItem(long LostItem) {
		_LostItem = LostItem;

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setLostItem", long.class);

				method.invoke(_itemFoundRemoteModel, LostItem);
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

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setMimeType", String.class);

				method.invoke(_itemFoundRemoteModel, mimeType);
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

		if (_itemFoundRemoteModel != null) {
			try {
				Class<?> clazz = _itemFoundRemoteModel.getClass();

				Method method = clazz.getMethod("setBlobData", Blob.class);

				method.invoke(_itemFoundRemoteModel, blobData);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getItemFoundRemoteModel() {
		return _itemFoundRemoteModel;
	}

	public void setItemFoundRemoteModel(BaseModel<?> itemFoundRemoteModel) {
		_itemFoundRemoteModel = itemFoundRemoteModel;
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

		Class<?> remoteModelClass = _itemFoundRemoteModel.getClass();

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

		Object returnValue = method.invoke(_itemFoundRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			ItemFoundLocalServiceUtil.addItemFound(this);
		}
		else {
			ItemFoundLocalServiceUtil.updateItemFound(this);
		}
	}

	@Override
	public ItemFound toEscapedModel() {
		return (ItemFound)ProxyUtil.newProxyInstance(ItemFound.class.getClassLoader(),
			new Class[] { ItemFound.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ItemFoundClp clone = new ItemFoundClp();

		clone.setItemFoundId(getItemFoundId());
		clone.setUserId(getUserId());
		clone.setFoundDate(getFoundDate());
		clone.setFoundLocation(getFoundLocation());
		clone.setFoundCompany(getFoundCompany());
		clone.setFoundColor(getFoundColor());
		clone.setFoundSize(getFoundSize());
		clone.setFoundType(getFoundType());
		clone.setFoundStatus(getFoundStatus());
		clone.setFoundDesc(getFoundDesc());
		clone.setLostItem(getLostItem());
		clone.setMimeType(getMimeType());
		clone.setBlobData(getBlobData());

		return clone;
	}

	@Override
	public int compareTo(ItemFound itemFound) {
		long primaryKey = itemFound.getPrimaryKey();

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

		if (!(obj instanceof ItemFoundClp)) {
			return false;
		}

		ItemFoundClp itemFound = (ItemFoundClp)obj;

		long primaryKey = itemFound.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{itemFoundId=");
		sb.append(getItemFoundId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", FoundDate=");
		sb.append(getFoundDate());
		sb.append(", FoundLocation=");
		sb.append(getFoundLocation());
		sb.append(", FoundCompany=");
		sb.append(getFoundCompany());
		sb.append(", FoundColor=");
		sb.append(getFoundColor());
		sb.append(", FoundSize=");
		sb.append(getFoundSize());
		sb.append(", FoundType=");
		sb.append(getFoundType());
		sb.append(", FoundStatus=");
		sb.append(getFoundStatus());
		sb.append(", FoundDesc=");
		sb.append(getFoundDesc());
		sb.append(", LostItem=");
		sb.append(getLostItem());
		sb.append(", mimeType=");
		sb.append(getMimeType());
		sb.append(", blobData=");
		sb.append(getBlobData());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.Trylof.services.model.ItemFound");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemFoundId</column-name><column-value><![CDATA[");
		sb.append(getItemFoundId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundDate</column-name><column-value><![CDATA[");
		sb.append(getFoundDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundLocation</column-name><column-value><![CDATA[");
		sb.append(getFoundLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundCompany</column-name><column-value><![CDATA[");
		sb.append(getFoundCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundColor</column-name><column-value><![CDATA[");
		sb.append(getFoundColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundSize</column-name><column-value><![CDATA[");
		sb.append(getFoundSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundType</column-name><column-value><![CDATA[");
		sb.append(getFoundType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundStatus</column-name><column-value><![CDATA[");
		sb.append(getFoundStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundDesc</column-name><column-value><![CDATA[");
		sb.append(getFoundDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostItem</column-name><column-value><![CDATA[");
		sb.append(getLostItem());
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

	private long _itemFoundId;
	private long _userId;
	private Date _FoundDate;
	private String _FoundLocation;
	private String _FoundCompany;
	private String _FoundColor;
	private String _FoundSize;
	private String _FoundType;
	private String _FoundStatus;
	private String _FoundDesc;
	private long _LostItem;
	private String _mimeType;
	private Blob _blobData;
	private BaseModel<?> _itemFoundRemoteModel;
	private Class<?> _clpSerializerClass = com.Trylof.services.service.ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}