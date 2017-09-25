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

import com.Trylof.services.model.SearchRes;

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
 * The cache model class for representing SearchRes in entity cache.
 *
 * @author Utkarsh
 * @see SearchRes
 * @generated
 */
@ProviderType
public class SearchResCacheModel implements CacheModel<SearchRes>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SearchResCacheModel)) {
			return false;
		}

		SearchResCacheModel searchResCacheModel = (SearchResCacheModel)obj;

		if (searchResId == searchResCacheModel.searchResId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, searchResId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{searchResId=");
		sb.append(searchResId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", itemid=");
		sb.append(itemid);
		sb.append(", location=");
		sb.append(location);
		sb.append(", color=");
		sb.append(color);
		sb.append(", size=");
		sb.append(size);
		sb.append(", desc=");
		sb.append(desc);
		sb.append(", count=");
		sb.append(count);
		sb.append(", Status=");
		sb.append(Status);
		sb.append(", Date=");
		sb.append(Date);
		sb.append(", Company=");
		sb.append(Company);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SearchRes toEntityModel() {
		SearchResImpl searchResImpl = new SearchResImpl();

		searchResImpl.setSearchResId(searchResId);
		searchResImpl.setUserId(userId);
		searchResImpl.setItemid(itemid);

		if (location == null) {
			searchResImpl.setLocation(StringPool.BLANK);
		}
		else {
			searchResImpl.setLocation(location);
		}

		if (color == null) {
			searchResImpl.setColor(StringPool.BLANK);
		}
		else {
			searchResImpl.setColor(color);
		}

		if (size == null) {
			searchResImpl.setSize(StringPool.BLANK);
		}
		else {
			searchResImpl.setSize(size);
		}

		if (desc == null) {
			searchResImpl.setDesc(StringPool.BLANK);
		}
		else {
			searchResImpl.setDesc(desc);
		}

		searchResImpl.setCount(count);

		if (Status == null) {
			searchResImpl.setStatus(StringPool.BLANK);
		}
		else {
			searchResImpl.setStatus(Status);
		}

		if (Date == Long.MIN_VALUE) {
			searchResImpl.setDate(null);
		}
		else {
			searchResImpl.setDate(new Date(Date));
		}

		if (Company == null) {
			searchResImpl.setCompany(StringPool.BLANK);
		}
		else {
			searchResImpl.setCompany(Company);
		}

		searchResImpl.resetOriginalValues();

		return searchResImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		searchResId = objectInput.readLong();

		userId = objectInput.readLong();

		itemid = objectInput.readLong();
		location = objectInput.readUTF();
		color = objectInput.readUTF();
		size = objectInput.readUTF();
		desc = objectInput.readUTF();

		count = objectInput.readInt();
		Status = objectInput.readUTF();
		Date = objectInput.readLong();
		Company = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(searchResId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(itemid);

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (color == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(color);
		}

		if (size == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(size);
		}

		if (desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(desc);
		}

		objectOutput.writeInt(count);

		if (Status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Status);
		}

		objectOutput.writeLong(Date);

		if (Company == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Company);
		}
	}

	public long searchResId;
	public long userId;
	public long itemid;
	public String location;
	public String color;
	public String size;
	public String desc;
	public int count;
	public String Status;
	public long Date;
	public String Company;
}