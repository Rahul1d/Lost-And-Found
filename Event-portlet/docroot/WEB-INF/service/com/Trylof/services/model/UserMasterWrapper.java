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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserMaster}.
 * </p>
 *
 * @author Utkarsh
 * @see UserMaster
 * @generated
 */
@ProviderType
public class UserMasterWrapper implements UserMaster, ModelWrapper<UserMaster> {
	public UserMasterWrapper(UserMaster userMaster) {
		_userMaster = userMaster;
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
	}

	@Override
	public java.lang.Object clone() {
		return new UserMasterWrapper((UserMaster)_userMaster.clone());
	}

	@Override
	public int compareTo(com.Trylof.services.model.UserMaster userMaster) {
		return _userMaster.compareTo(userMaster);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _userMaster.getExpandoBridge();
	}

	/**
	* Returns the primary key of this user master.
	*
	* @return the primary key of this user master
	*/
	@Override
	public long getPrimaryKey() {
		return _userMaster.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userMaster.getPrimaryKeyObj();
	}

	/**
	* Returns the user address of this user master.
	*
	* @return the user address of this user master
	*/
	@Override
	public java.lang.String getUserAddress() {
		return _userMaster.getUserAddress();
	}

	/**
	* Returns the user email of this user master.
	*
	* @return the user email of this user master
	*/
	@Override
	public java.lang.String getUserEmail() {
		return _userMaster.getUserEmail();
	}

	/**
	* Returns the user master ID of this user master.
	*
	* @return the user master ID of this user master
	*/
	@Override
	public long getUserMasterId() {
		return _userMaster.getUserMasterId();
	}

	/**
	* Returns the user name of this user master.
	*
	* @return the user name of this user master
	*/
	@Override
	public java.lang.String getUserName() {
		return _userMaster.getUserName();
	}

	/**
	* Returns the user organization of this user master.
	*
	* @return the user organization of this user master
	*/
	@Override
	public java.lang.String getUserOrganization() {
		return _userMaster.getUserOrganization();
	}

	/**
	* Returns the user pass of this user master.
	*
	* @return the user pass of this user master
	*/
	@Override
	public java.lang.String getUserPass() {
		return _userMaster.getUserPass();
	}

	/**
	* Returns the user phoneno of this user master.
	*
	* @return the user phoneno of this user master
	*/
	@Override
	public int getUserPhoneno() {
		return _userMaster.getUserPhoneno();
	}

	/**
	* Returns the user type of this user master.
	*
	* @return the user type of this user master
	*/
	@Override
	public java.lang.String getUserType() {
		return _userMaster.getUserType();
	}

	@Override
	public int hashCode() {
		return _userMaster.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _userMaster.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _userMaster.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _userMaster.isNew();
	}

	@Override
	public void persist() {
		_userMaster.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userMaster.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_userMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_userMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_userMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_userMaster.setNew(n);
	}

	/**
	* Sets the primary key of this user master.
	*
	* @param primaryKey the primary key of this user master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userMaster.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_userMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user address of this user master.
	*
	* @param userAddress the user address of this user master
	*/
	@Override
	public void setUserAddress(java.lang.String userAddress) {
		_userMaster.setUserAddress(userAddress);
	}

	/**
	* Sets the user email of this user master.
	*
	* @param userEmail the user email of this user master
	*/
	@Override
	public void setUserEmail(java.lang.String userEmail) {
		_userMaster.setUserEmail(userEmail);
	}

	/**
	* Sets the user master ID of this user master.
	*
	* @param userMasterId the user master ID of this user master
	*/
	@Override
	public void setUserMasterId(long userMasterId) {
		_userMaster.setUserMasterId(userMasterId);
	}

	/**
	* Sets the user name of this user master.
	*
	* @param userName the user name of this user master
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_userMaster.setUserName(userName);
	}

	/**
	* Sets the user organization of this user master.
	*
	* @param userOrganization the user organization of this user master
	*/
	@Override
	public void setUserOrganization(java.lang.String userOrganization) {
		_userMaster.setUserOrganization(userOrganization);
	}

	/**
	* Sets the user pass of this user master.
	*
	* @param userPass the user pass of this user master
	*/
	@Override
	public void setUserPass(java.lang.String userPass) {
		_userMaster.setUserPass(userPass);
	}

	/**
	* Sets the user phoneno of this user master.
	*
	* @param userPhoneno the user phoneno of this user master
	*/
	@Override
	public void setUserPhoneno(int userPhoneno) {
		_userMaster.setUserPhoneno(userPhoneno);
	}

	/**
	* Sets the user type of this user master.
	*
	* @param userType the user type of this user master
	*/
	@Override
	public void setUserType(java.lang.String userType) {
		_userMaster.setUserType(userType);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.Trylof.services.model.UserMaster> toCacheModel() {
		return _userMaster.toCacheModel();
	}

	@Override
	public com.Trylof.services.model.UserMaster toEscapedModel() {
		return new UserMasterWrapper(_userMaster.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userMaster.toString();
	}

	@Override
	public com.Trylof.services.model.UserMaster toUnescapedModel() {
		return new UserMasterWrapper(_userMaster.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _userMaster.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserMasterWrapper)) {
			return false;
		}

		UserMasterWrapper userMasterWrapper = (UserMasterWrapper)obj;

		if (Validator.equals(_userMaster, userMasterWrapper._userMaster)) {
			return true;
		}

		return false;
	}

	@Override
	public UserMaster getWrappedModel() {
		return _userMaster;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _userMaster.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _userMaster.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_userMaster.resetOriginalValues();
	}

	private final UserMaster _userMaster;
}