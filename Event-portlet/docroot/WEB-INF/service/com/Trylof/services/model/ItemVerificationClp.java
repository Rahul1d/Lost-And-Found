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
import com.Trylof.services.service.ItemVerificationLocalServiceUtil;

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

import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class ItemVerificationClp extends BaseModelImpl<ItemVerification>
	implements ItemVerification {
	public ItemVerificationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ItemVerification.class;
	}

	@Override
	public String getModelClassName() {
		return ItemVerification.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _itemVerificationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemVerificationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemVerificationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemVerificationId", getItemVerificationId());
		attributes.put("VerifyDesc", getVerifyDesc());
		attributes.put("Image1", getImage1());
		attributes.put("Image2", getImage2());
		attributes.put("LostItemid", getLostItemid());
		attributes.put("FoundItemid", getFoundItemid());
		attributes.put("UserId", getUserId());
		attributes.put("VerifyStatus", getVerifyStatus());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemVerificationId = (Long)attributes.get("itemVerificationId");

		if (itemVerificationId != null) {
			setItemVerificationId(itemVerificationId);
		}

		String VerifyDesc = (String)attributes.get("VerifyDesc");

		if (VerifyDesc != null) {
			setVerifyDesc(VerifyDesc);
		}

		Blob Image1 = (Blob)attributes.get("Image1");

		if (Image1 != null) {
			setImage1(Image1);
		}

		Blob Image2 = (Blob)attributes.get("Image2");

		if (Image2 != null) {
			setImage2(Image2);
		}

		Long LostItemid = (Long)attributes.get("LostItemid");

		if (LostItemid != null) {
			setLostItemid(LostItemid);
		}

		Long FoundItemid = (Long)attributes.get("FoundItemid");

		if (FoundItemid != null) {
			setFoundItemid(FoundItemid);
		}

		Long UserId = (Long)attributes.get("UserId");

		if (UserId != null) {
			setUserId(UserId);
		}

		String VerifyStatus = (String)attributes.get("VerifyStatus");

		if (VerifyStatus != null) {
			setVerifyStatus(VerifyStatus);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getItemVerificationId() {
		return _itemVerificationId;
	}

	@Override
	public void setItemVerificationId(long itemVerificationId) {
		_itemVerificationId = itemVerificationId;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setItemVerificationId",
						long.class);

				method.invoke(_itemVerificationRemoteModel, itemVerificationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVerifyDesc() {
		return _VerifyDesc;
	}

	@Override
	public void setVerifyDesc(String VerifyDesc) {
		_VerifyDesc = VerifyDesc;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyDesc", String.class);

				method.invoke(_itemVerificationRemoteModel, VerifyDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getImage1() {
		return _Image1;
	}

	@Override
	public void setImage1(Blob Image1) {
		_Image1 = Image1;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setImage1", Blob.class);

				method.invoke(_itemVerificationRemoteModel, Image1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Blob getImage2() {
		return _Image2;
	}

	@Override
	public void setImage2(Blob Image2) {
		_Image2 = Image2;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setImage2", Blob.class);

				method.invoke(_itemVerificationRemoteModel, Image2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLostItemid() {
		return _LostItemid;
	}

	@Override
	public void setLostItemid(long LostItemid) {
		_LostItemid = LostItemid;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setLostItemid", long.class);

				method.invoke(_itemVerificationRemoteModel, LostItemid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFoundItemid() {
		return _FoundItemid;
	}

	@Override
	public void setFoundItemid(long FoundItemid) {
		_FoundItemid = FoundItemid;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setFoundItemid", long.class);

				method.invoke(_itemVerificationRemoteModel, FoundItemid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _UserId;
	}

	@Override
	public void setUserId(long UserId) {
		_UserId = UserId;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_itemVerificationRemoteModel, UserId);
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
	public void setUserUuid(String UserUuid) {
	}

	@Override
	public String getVerifyStatus() {
		return _VerifyStatus;
	}

	@Override
	public void setVerifyStatus(String VerifyStatus) {
		_VerifyStatus = VerifyStatus;

		if (_itemVerificationRemoteModel != null) {
			try {
				Class<?> clazz = _itemVerificationRemoteModel.getClass();

				Method method = clazz.getMethod("setVerifyStatus", String.class);

				method.invoke(_itemVerificationRemoteModel, VerifyStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getItemVerificationRemoteModel() {
		return _itemVerificationRemoteModel;
	}

	public void setItemVerificationRemoteModel(
		BaseModel<?> itemVerificationRemoteModel) {
		_itemVerificationRemoteModel = itemVerificationRemoteModel;
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

		Class<?> remoteModelClass = _itemVerificationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_itemVerificationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			ItemVerificationLocalServiceUtil.addItemVerification(this);
		}
		else {
			ItemVerificationLocalServiceUtil.updateItemVerification(this);
		}
	}

	@Override
	public ItemVerification toEscapedModel() {
		return (ItemVerification)ProxyUtil.newProxyInstance(ItemVerification.class.getClassLoader(),
			new Class[] { ItemVerification.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ItemVerificationClp clone = new ItemVerificationClp();

		clone.setItemVerificationId(getItemVerificationId());
		clone.setVerifyDesc(getVerifyDesc());
		clone.setImage1(getImage1());
		clone.setImage2(getImage2());
		clone.setLostItemid(getLostItemid());
		clone.setFoundItemid(getFoundItemid());
		clone.setUserId(getUserId());
		clone.setVerifyStatus(getVerifyStatus());

		return clone;
	}

	@Override
	public int compareTo(ItemVerification itemVerification) {
		long primaryKey = itemVerification.getPrimaryKey();

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

		if (!(obj instanceof ItemVerificationClp)) {
			return false;
		}

		ItemVerificationClp itemVerification = (ItemVerificationClp)obj;

		long primaryKey = itemVerification.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{itemVerificationId=");
		sb.append(getItemVerificationId());
		sb.append(", VerifyDesc=");
		sb.append(getVerifyDesc());
		sb.append(", Image1=");
		sb.append(getImage1());
		sb.append(", Image2=");
		sb.append(getImage2());
		sb.append(", LostItemid=");
		sb.append(getLostItemid());
		sb.append(", FoundItemid=");
		sb.append(getFoundItemid());
		sb.append(", UserId=");
		sb.append(getUserId());
		sb.append(", VerifyStatus=");
		sb.append(getVerifyStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.Trylof.services.model.ItemVerification");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemVerificationId</column-name><column-value><![CDATA[");
		sb.append(getItemVerificationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>VerifyDesc</column-name><column-value><![CDATA[");
		sb.append(getVerifyDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Image1</column-name><column-value><![CDATA[");
		sb.append(getImage1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Image2</column-name><column-value><![CDATA[");
		sb.append(getImage2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostItemid</column-name><column-value><![CDATA[");
		sb.append(getLostItemid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundItemid</column-name><column-value><![CDATA[");
		sb.append(getFoundItemid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>UserId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>VerifyStatus</column-name><column-value><![CDATA[");
		sb.append(getVerifyStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _itemVerificationId;
	private String _VerifyDesc;
	private Blob _Image1;
	private Blob _Image2;
	private long _LostItemid;
	private long _FoundItemid;
	private long _UserId;
	private String _VerifyStatus;
	private BaseModel<?> _itemVerificationRemoteModel;
	private Class<?> _clpSerializerClass = com.Trylof.services.service.ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}