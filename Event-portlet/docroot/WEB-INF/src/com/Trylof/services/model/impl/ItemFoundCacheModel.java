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

import com.Trylof.services.model.ItemFound;

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
 * The cache model class for representing ItemFound in entity cache.
 *
 * @author Utkarsh
 * @see ItemFound
 * @generated
 */
@ProviderType
public class ItemFoundCacheModel implements CacheModel<ItemFound>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemFoundCacheModel)) {
			return false;
		}

		ItemFoundCacheModel itemFoundCacheModel = (ItemFoundCacheModel)obj;

		if (itemFoundId == itemFoundCacheModel.itemFoundId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, itemFoundId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{itemFoundId=");
		sb.append(itemFoundId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", FoundDate=");
		sb.append(FoundDate);
		sb.append(", FoundLocation=");
		sb.append(FoundLocation);
		sb.append(", FoundCompany=");
		sb.append(FoundCompany);
		sb.append(", FoundColor=");
		sb.append(FoundColor);
		sb.append(", FoundSize=");
		sb.append(FoundSize);
		sb.append(", FoundType=");
		sb.append(FoundType);
		sb.append(", FoundStatus=");
		sb.append(FoundStatus);
		sb.append(", FoundDesc=");
		sb.append(FoundDesc);
		sb.append(", LostItem=");
		sb.append(LostItem);
		sb.append(", mimeType=");
		sb.append(mimeType);

		return sb.toString();
	}

	@Override
	public ItemFound toEntityModel() {
		ItemFoundImpl itemFoundImpl = new ItemFoundImpl();

		itemFoundImpl.setItemFoundId(itemFoundId);
		itemFoundImpl.setUserId(userId);

		if (FoundDate == Long.MIN_VALUE) {
			itemFoundImpl.setFoundDate(null);
		}
		else {
			itemFoundImpl.setFoundDate(new Date(FoundDate));
		}

		if (FoundLocation == null) {
			itemFoundImpl.setFoundLocation(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setFoundLocation(FoundLocation);
		}

		if (FoundCompany == null) {
			itemFoundImpl.setFoundCompany(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setFoundCompany(FoundCompany);
		}

		if (FoundColor == null) {
			itemFoundImpl.setFoundColor(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setFoundColor(FoundColor);
		}

		if (FoundSize == null) {
			itemFoundImpl.setFoundSize(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setFoundSize(FoundSize);
		}

		if (FoundType == null) {
			itemFoundImpl.setFoundType(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setFoundType(FoundType);
		}

		if (FoundStatus == null) {
			itemFoundImpl.setFoundStatus(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setFoundStatus(FoundStatus);
		}

		if (FoundDesc == null) {
			itemFoundImpl.setFoundDesc(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setFoundDesc(FoundDesc);
		}

		itemFoundImpl.setLostItem(LostItem);

		if (mimeType == null) {
			itemFoundImpl.setMimeType(StringPool.BLANK);
		}
		else {
			itemFoundImpl.setMimeType(mimeType);
		}

		itemFoundImpl.resetOriginalValues();

		return itemFoundImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemFoundId = objectInput.readLong();

		userId = objectInput.readLong();
		FoundDate = objectInput.readLong();
		FoundLocation = objectInput.readUTF();
		FoundCompany = objectInput.readUTF();
		FoundColor = objectInput.readUTF();
		FoundSize = objectInput.readUTF();
		FoundType = objectInput.readUTF();
		FoundStatus = objectInput.readUTF();
		FoundDesc = objectInput.readUTF();

		LostItem = objectInput.readLong();
		mimeType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemFoundId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(FoundDate);

		if (FoundLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FoundLocation);
		}

		if (FoundCompany == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FoundCompany);
		}

		if (FoundColor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FoundColor);
		}

		if (FoundSize == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FoundSize);
		}

		if (FoundType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FoundType);
		}

		if (FoundStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FoundStatus);
		}

		if (FoundDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FoundDesc);
		}

		objectOutput.writeLong(LostItem);

		if (mimeType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mimeType);
		}
	}

	public long itemFoundId;
	public long userId;
	public long FoundDate;
	public String FoundLocation;
	public String FoundCompany;
	public String FoundColor;
	public String FoundSize;
	public String FoundType;
	public String FoundStatus;
	public String FoundDesc;
	public long LostItem;
	public String mimeType;
}