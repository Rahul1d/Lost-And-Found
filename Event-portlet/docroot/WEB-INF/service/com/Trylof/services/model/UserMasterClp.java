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
import com.Trylof.services.service.UserMasterLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class UserMasterClp extends BaseModelImpl<UserMaster>
	implements UserMaster {
	public UserMasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return UserMaster.class;
	}

	@Override
	public String getModelClassName() {
		return UserMaster.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _userMasterId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserMasterId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userMasterId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userMasterId", getUserMasterId());
		attributes.put("userName", getUserName());
		attributes.put("userEmail", getUserEmail());
		attributes.put("userPass", getUserPass());
		attributes.put("userAddress", getUserAddress());
		attributes.put("userPhoneno", getUserPhoneno());
		attributes.put("userType", getUserType());
		attributes.put("userOrganization", getUserOrganization());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userMasterId = (Long)attributes.get("userMasterId");

		if (userMasterId != null) {
			setUserMasterId(userMasterId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String userEmail = (String)attributes.get("userEmail");

		if (userEmail != null) {
			setUserEmail(userEmail);
		}

		String userPass = (String)attributes.get("userPass");

		if (userPass != null) {
			setUserPass(userPass);
		}

		String userAddress = (String)attributes.get("userAddress");

		if (userAddress != null) {
			setUserAddress(userAddress);
		}

		Integer userPhoneno = (Integer)attributes.get("userPhoneno");

		if (userPhoneno != null) {
			setUserPhoneno(userPhoneno);
		}

		String userType = (String)attributes.get("userType");

		if (userType != null) {
			setUserType(userType);
		}

		String userOrganization = (String)attributes.get("userOrganization");

		if (userOrganization != null) {
			setUserOrganization(userOrganization);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getUserMasterId() {
		return _userMasterId;
	}

	@Override
	public void setUserMasterId(long userMasterId) {
		_userMasterId = userMasterId;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserMasterId", long.class);

				method.invoke(_userMasterRemoteModel, userMasterId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_userMasterRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserEmail() {
		return _userEmail;
	}

	@Override
	public void setUserEmail(String userEmail) {
		_userEmail = userEmail;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserEmail", String.class);

				method.invoke(_userMasterRemoteModel, userEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserPass() {
		return _userPass;
	}

	@Override
	public void setUserPass(String userPass) {
		_userPass = userPass;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserPass", String.class);

				method.invoke(_userMasterRemoteModel, userPass);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserAddress() {
		return _userAddress;
	}

	@Override
	public void setUserAddress(String userAddress) {
		_userAddress = userAddress;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserAddress", String.class);

				method.invoke(_userMasterRemoteModel, userAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUserPhoneno() {
		return _userPhoneno;
	}

	@Override
	public void setUserPhoneno(int userPhoneno) {
		_userPhoneno = userPhoneno;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserPhoneno", int.class);

				method.invoke(_userMasterRemoteModel, userPhoneno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserType() {
		return _userType;
	}

	@Override
	public void setUserType(String userType) {
		_userType = userType;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserType", String.class);

				method.invoke(_userMasterRemoteModel, userType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserOrganization() {
		return _userOrganization;
	}

	@Override
	public void setUserOrganization(String userOrganization) {
		_userOrganization = userOrganization;

		if (_userMasterRemoteModel != null) {
			try {
				Class<?> clazz = _userMasterRemoteModel.getClass();

				Method method = clazz.getMethod("setUserOrganization",
						String.class);

				method.invoke(_userMasterRemoteModel, userOrganization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserMasterRemoteModel() {
		return _userMasterRemoteModel;
	}

	public void setUserMasterRemoteModel(BaseModel<?> userMasterRemoteModel) {
		_userMasterRemoteModel = userMasterRemoteModel;
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

		Class<?> remoteModelClass = _userMasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_userMasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			UserMasterLocalServiceUtil.addUserMaster(this);
		}
		else {
			UserMasterLocalServiceUtil.updateUserMaster(this);
		}
	}

	@Override
	public UserMaster toEscapedModel() {
		return (UserMaster)ProxyUtil.newProxyInstance(UserMaster.class.getClassLoader(),
			new Class[] { UserMaster.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserMasterClp clone = new UserMasterClp();

		clone.setUserMasterId(getUserMasterId());
		clone.setUserName(getUserName());
		clone.setUserEmail(getUserEmail());
		clone.setUserPass(getUserPass());
		clone.setUserAddress(getUserAddress());
		clone.setUserPhoneno(getUserPhoneno());
		clone.setUserType(getUserType());
		clone.setUserOrganization(getUserOrganization());

		return clone;
	}

	@Override
	public int compareTo(UserMaster userMaster) {
		long primaryKey = userMaster.getPrimaryKey();

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

		if (!(obj instanceof UserMasterClp)) {
			return false;
		}

		UserMasterClp userMaster = (UserMasterClp)obj;

		long primaryKey = userMaster.getPrimaryKey();

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

		sb.append("{userMasterId=");
		sb.append(getUserMasterId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", userEmail=");
		sb.append(getUserEmail());
		sb.append(", userPass=");
		sb.append(getUserPass());
		sb.append(", userAddress=");
		sb.append(getUserAddress());
		sb.append(", userPhoneno=");
		sb.append(getUserPhoneno());
		sb.append(", userType=");
		sb.append(getUserType());
		sb.append(", userOrganization=");
		sb.append(getUserOrganization());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.Trylof.services.model.UserMaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userMasterId</column-name><column-value><![CDATA[");
		sb.append(getUserMasterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userEmail</column-name><column-value><![CDATA[");
		sb.append(getUserEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userPass</column-name><column-value><![CDATA[");
		sb.append(getUserPass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAddress</column-name><column-value><![CDATA[");
		sb.append(getUserAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userPhoneno</column-name><column-value><![CDATA[");
		sb.append(getUserPhoneno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userType</column-name><column-value><![CDATA[");
		sb.append(getUserType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userOrganization</column-name><column-value><![CDATA[");
		sb.append(getUserOrganization());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userMasterId;
	private String _userName;
	private String _userEmail;
	private String _userPass;
	private String _userAddress;
	private int _userPhoneno;
	private String _userType;
	private String _userOrganization;
	private BaseModel<?> _userMasterRemoteModel;
	private Class<?> _clpSerializerClass = com.Trylof.services.service.ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}