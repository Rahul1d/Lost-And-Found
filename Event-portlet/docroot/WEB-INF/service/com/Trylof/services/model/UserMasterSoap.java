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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.Trylof.services.service.http.UserMasterServiceSoap}.
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.http.UserMasterServiceSoap
 * @generated
 */
@ProviderType
public class UserMasterSoap implements Serializable {
	public static UserMasterSoap toSoapModel(UserMaster model) {
		UserMasterSoap soapModel = new UserMasterSoap();

		soapModel.setUserMasterId(model.getUserMasterId());
		soapModel.setUserName(model.getUserName());
		soapModel.setUserEmail(model.getUserEmail());
		soapModel.setUserPass(model.getUserPass());
		soapModel.setUserAddress(model.getUserAddress());
		soapModel.setUserPhoneno(model.getUserPhoneno());
		soapModel.setUserType(model.getUserType());
		soapModel.setUserOrganization(model.getUserOrganization());

		return soapModel;
	}

	public static UserMasterSoap[] toSoapModels(UserMaster[] models) {
		UserMasterSoap[] soapModels = new UserMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserMasterSoap[][] toSoapModels(UserMaster[][] models) {
		UserMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserMasterSoap[] toSoapModels(List<UserMaster> models) {
		List<UserMasterSoap> soapModels = new ArrayList<UserMasterSoap>(models.size());

		for (UserMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserMasterSoap[soapModels.size()]);
	}

	public UserMasterSoap() {
	}

	public long getPrimaryKey() {
		return _userMasterId;
	}

	public void setPrimaryKey(long pk) {
		setUserMasterId(pk);
	}

	public long getUserMasterId() {
		return _userMasterId;
	}

	public void setUserMasterId(long userMasterId) {
		_userMasterId = userMasterId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getUserEmail() {
		return _userEmail;
	}

	public void setUserEmail(String userEmail) {
		_userEmail = userEmail;
	}

	public String getUserPass() {
		return _userPass;
	}

	public void setUserPass(String userPass) {
		_userPass = userPass;
	}

	public String getUserAddress() {
		return _userAddress;
	}

	public void setUserAddress(String userAddress) {
		_userAddress = userAddress;
	}

	public int getUserPhoneno() {
		return _userPhoneno;
	}

	public void setUserPhoneno(int userPhoneno) {
		_userPhoneno = userPhoneno;
	}

	public String getUserType() {
		return _userType;
	}

	public void setUserType(String userType) {
		_userType = userType;
	}

	public String getUserOrganization() {
		return _userOrganization;
	}

	public void setUserOrganization(String userOrganization) {
		_userOrganization = userOrganization;
	}

	private long _userMasterId;
	private String _userName;
	private String _userEmail;
	private String _userPass;
	private String _userAddress;
	private int _userPhoneno;
	private String _userType;
	private String _userOrganization;
}