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

import com.Trylof.services.model.UserMaster;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UserMaster in entity cache.
 *
 * @author Utkarsh
 * @see UserMaster
 * @generated
 */
@ProviderType
public class UserMasterCacheModel implements CacheModel<UserMaster>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserMasterCacheModel)) {
			return false;
		}

		UserMasterCacheModel userMasterCacheModel = (UserMasterCacheModel)obj;

		if (userMasterId == userMasterCacheModel.userMasterId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userMasterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{userMasterId=");
		sb.append(userMasterId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", userEmail=");
		sb.append(userEmail);
		sb.append(", userPass=");
		sb.append(userPass);
		sb.append(", userAddress=");
		sb.append(userAddress);
		sb.append(", userPhoneno=");
		sb.append(userPhoneno);
		sb.append(", userType=");
		sb.append(userType);
		sb.append(", userOrganization=");
		sb.append(userOrganization);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserMaster toEntityModel() {
		UserMasterImpl userMasterImpl = new UserMasterImpl();

		userMasterImpl.setUserMasterId(userMasterId);

		if (userName == null) {
			userMasterImpl.setUserName(StringPool.BLANK);
		}
		else {
			userMasterImpl.setUserName(userName);
		}

		if (userEmail == null) {
			userMasterImpl.setUserEmail(StringPool.BLANK);
		}
		else {
			userMasterImpl.setUserEmail(userEmail);
		}

		if (userPass == null) {
			userMasterImpl.setUserPass(StringPool.BLANK);
		}
		else {
			userMasterImpl.setUserPass(userPass);
		}

		if (userAddress == null) {
			userMasterImpl.setUserAddress(StringPool.BLANK);
		}
		else {
			userMasterImpl.setUserAddress(userAddress);
		}

		userMasterImpl.setUserPhoneno(userPhoneno);

		if (userType == null) {
			userMasterImpl.setUserType(StringPool.BLANK);
		}
		else {
			userMasterImpl.setUserType(userType);
		}

		if (userOrganization == null) {
			userMasterImpl.setUserOrganization(StringPool.BLANK);
		}
		else {
			userMasterImpl.setUserOrganization(userOrganization);
		}

		userMasterImpl.resetOriginalValues();

		return userMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userMasterId = objectInput.readLong();
		userName = objectInput.readUTF();
		userEmail = objectInput.readUTF();
		userPass = objectInput.readUTF();
		userAddress = objectInput.readUTF();

		userPhoneno = objectInput.readInt();
		userType = objectInput.readUTF();
		userOrganization = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userMasterId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (userEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userEmail);
		}

		if (userPass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userPass);
		}

		if (userAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userAddress);
		}

		objectOutput.writeInt(userPhoneno);

		if (userType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userType);
		}

		if (userOrganization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userOrganization);
		}
	}

	public long userMasterId;
	public String userName;
	public String userEmail;
	public String userPass;
	public String userAddress;
	public int userPhoneno;
	public String userType;
	public String userOrganization;
}