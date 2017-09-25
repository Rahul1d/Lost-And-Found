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

import com.Trylof.services.model.ItemLost;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ItemLost in entity cache.
 *
 * @author Utkarsh
 * @see ItemLost
 * @generated
 */
@ProviderType
public class ItemLostCacheModel implements CacheModel<ItemLost>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemLostCacheModel)) {
			return false;
		}

		ItemLostCacheModel itemLostCacheModel = (ItemLostCacheModel)obj;

		if (itemLostId == itemLostCacheModel.itemLostId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, itemLostId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{itemLostId=");
		sb.append(itemLostId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", LostDate=");
		sb.append(LostDate);
		sb.append(", LostLocation=");
		sb.append(LostLocation);
		sb.append(", LostCompany=");
		sb.append(LostCompany);
		sb.append(", LostColor=");
		sb.append(LostColor);
		sb.append(", LostSize=");
		sb.append(LostSize);
		sb.append(", LostType=");
		sb.append(LostType);
		sb.append(", LostStatus=");
		sb.append(LostStatus);
		sb.append(", LostDesc=");
		sb.append(LostDesc);
		sb.append(", mimeType=");
		sb.append(mimeType);

		return sb.toString();
	}

	@Override
	public ItemLost toEntityModel() {
		ItemLostImpl itemLostImpl = new ItemLostImpl();

		itemLostImpl.setItemLostId(itemLostId);
		itemLostImpl.setUserId(userId);

		if (LostDate == Long.MIN_VALUE) {
			itemLostImpl.setLostDate(null);
		}
		else {
			itemLostImpl.setLostDate(new Date(LostDate));
		}

		if (LostLocation == null) {
			itemLostImpl.setLostLocation(StringPool.BLANK);
		}
		else {
			itemLostImpl.setLostLocation(LostLocation);
		}

		if (LostCompany == null) {
			itemLostImpl.setLostCompany(StringPool.BLANK);
		}
		else {
			itemLostImpl.setLostCompany(LostCompany);
		}

		if (LostColor == null) {
			itemLostImpl.setLostColor(StringPool.BLANK);
		}
		else {
			itemLostImpl.setLostColor(LostColor);
		}

		if (LostSize == null) {
			itemLostImpl.setLostSize(StringPool.BLANK);
		}
		else {
			itemLostImpl.setLostSize(LostSize);
		}

		if (LostType == null) {
			itemLostImpl.setLostType(StringPool.BLANK);
		}
		else {
			itemLostImpl.setLostType(LostType);
		}

		if (LostStatus == null) {
			itemLostImpl.setLostStatus(StringPool.BLANK);
		}
		else {
			itemLostImpl.setLostStatus(LostStatus);
		}

		if (LostDesc == null) {
			itemLostImpl.setLostDesc(StringPool.BLANK);
		}
		else {
			itemLostImpl.setLostDesc(LostDesc);
		}

		if (mimeType == null) {
			itemLostImpl.setMimeType(StringPool.BLANK);
		}
		else {
			itemLostImpl.setMimeType(mimeType);
		}

		itemLostImpl.resetOriginalValues();

		return itemLostImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemLostId = objectInput.readLong();

		userId = objectInput.readLong();
		LostDate = objectInput.readLong();
		LostLocation = objectInput.readUTF();
		LostCompany = objectInput.readUTF();
		LostColor = objectInput.readUTF();
		LostSize = objectInput.readUTF();
		LostType = objectInput.readUTF();
		LostStatus = objectInput.readUTF();
		LostDesc = objectInput.readUTF();
		mimeType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemLostId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(LostDate);

		if (LostLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LostLocation);
		}

		if (LostCompany == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LostCompany);
		}

		if (LostColor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LostColor);
		}

		if (LostSize == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LostSize);
		}

		if (LostType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LostType);
		}

		if (LostStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LostStatus);
		}

		if (LostDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LostDesc);
		}

		if (mimeType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mimeType);
		}
	}

	public long itemLostId;
	public long userId;
	public long LostDate;
	public String LostLocation;
	public String LostCompany;
	public String LostColor;
	public String LostSize;
	public String LostType;
	public String LostStatus;
	public String LostDesc;
	public String mimeType;
}