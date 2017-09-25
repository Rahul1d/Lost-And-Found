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

import java.sql.Blob;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.Trylof.services.service.http.ItemVerificationServiceSoap}.
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.http.ItemVerificationServiceSoap
 * @generated
 */
@ProviderType
public class ItemVerificationSoap implements Serializable {
	public static ItemVerificationSoap toSoapModel(ItemVerification model) {
		ItemVerificationSoap soapModel = new ItemVerificationSoap();

		soapModel.setItemVerificationId(model.getItemVerificationId());
		soapModel.setVerifyDesc(model.getVerifyDesc());
		soapModel.setImage1(model.getImage1());
		soapModel.setImage2(model.getImage2());
		soapModel.setLostItemid(model.getLostItemid());
		soapModel.setFoundItemid(model.getFoundItemid());
		soapModel.setUserId(model.getUserId());
		soapModel.setVerifyStatus(model.getVerifyStatus());

		return soapModel;
	}

	public static ItemVerificationSoap[] toSoapModels(ItemVerification[] models) {
		ItemVerificationSoap[] soapModels = new ItemVerificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ItemVerificationSoap[][] toSoapModels(
		ItemVerification[][] models) {
		ItemVerificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ItemVerificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ItemVerificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ItemVerificationSoap[] toSoapModels(
		List<ItemVerification> models) {
		List<ItemVerificationSoap> soapModels = new ArrayList<ItemVerificationSoap>(models.size());

		for (ItemVerification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ItemVerificationSoap[soapModels.size()]);
	}

	public ItemVerificationSoap() {
	}

	public long getPrimaryKey() {
		return _itemVerificationId;
	}

	public void setPrimaryKey(long pk) {
		setItemVerificationId(pk);
	}

	public long getItemVerificationId() {
		return _itemVerificationId;
	}

	public void setItemVerificationId(long itemVerificationId) {
		_itemVerificationId = itemVerificationId;
	}

	public String getVerifyDesc() {
		return _VerifyDesc;
	}

	public void setVerifyDesc(String VerifyDesc) {
		_VerifyDesc = VerifyDesc;
	}

	public Blob getImage1() {
		return _Image1;
	}

	public void setImage1(Blob Image1) {
		_Image1 = Image1;
	}

	public Blob getImage2() {
		return _Image2;
	}

	public void setImage2(Blob Image2) {
		_Image2 = Image2;
	}

	public long getLostItemid() {
		return _LostItemid;
	}

	public void setLostItemid(long LostItemid) {
		_LostItemid = LostItemid;
	}

	public long getFoundItemid() {
		return _FoundItemid;
	}

	public void setFoundItemid(long FoundItemid) {
		_FoundItemid = FoundItemid;
	}

	public long getUserId() {
		return _UserId;
	}

	public void setUserId(long UserId) {
		_UserId = UserId;
	}

	public String getVerifyStatus() {
		return _VerifyStatus;
	}

	public void setVerifyStatus(String VerifyStatus) {
		_VerifyStatus = VerifyStatus;
	}

	private long _itemVerificationId;
	private String _VerifyDesc;
	private Blob _Image1;
	private Blob _Image2;
	private long _LostItemid;
	private long _FoundItemid;
	private long _UserId;
	private String _VerifyStatus;
}