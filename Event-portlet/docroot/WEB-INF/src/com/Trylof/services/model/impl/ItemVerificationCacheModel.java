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

import com.Trylof.services.model.ItemVerification;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ItemVerification in entity cache.
 *
 * @author Utkarsh
 * @see ItemVerification
 * @generated
 */
@ProviderType
public class ItemVerificationCacheModel implements CacheModel<ItemVerification>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemVerificationCacheModel)) {
			return false;
		}

		ItemVerificationCacheModel itemVerificationCacheModel = (ItemVerificationCacheModel)obj;

		if (itemVerificationId == itemVerificationCacheModel.itemVerificationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, itemVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{itemVerificationId=");
		sb.append(itemVerificationId);
		sb.append(", VerifyDesc=");
		sb.append(VerifyDesc);
		sb.append(", LostItemid=");
		sb.append(LostItemid);
		sb.append(", FoundItemid=");
		sb.append(FoundItemid);
		sb.append(", UserId=");
		sb.append(UserId);
		sb.append(", VerifyStatus=");
		sb.append(VerifyStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ItemVerification toEntityModel() {
		ItemVerificationImpl itemVerificationImpl = new ItemVerificationImpl();

		itemVerificationImpl.setItemVerificationId(itemVerificationId);

		if (VerifyDesc == null) {
			itemVerificationImpl.setVerifyDesc(StringPool.BLANK);
		}
		else {
			itemVerificationImpl.setVerifyDesc(VerifyDesc);
		}

		itemVerificationImpl.setLostItemid(LostItemid);
		itemVerificationImpl.setFoundItemid(FoundItemid);
		itemVerificationImpl.setUserId(UserId);

		if (VerifyStatus == null) {
			itemVerificationImpl.setVerifyStatus(StringPool.BLANK);
		}
		else {
			itemVerificationImpl.setVerifyStatus(VerifyStatus);
		}

		itemVerificationImpl.resetOriginalValues();

		return itemVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemVerificationId = objectInput.readLong();
		VerifyDesc = objectInput.readUTF();

		LostItemid = objectInput.readLong();

		FoundItemid = objectInput.readLong();

		UserId = objectInput.readLong();
		VerifyStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemVerificationId);

		if (VerifyDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(VerifyDesc);
		}

		objectOutput.writeLong(LostItemid);

		objectOutput.writeLong(FoundItemid);

		objectOutput.writeLong(UserId);

		if (VerifyStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(VerifyStatus);
		}
	}

	public long itemVerificationId;
	public String VerifyDesc;
	public long LostItemid;
	public long FoundItemid;
	public long UserId;
	public String VerifyStatus;
}