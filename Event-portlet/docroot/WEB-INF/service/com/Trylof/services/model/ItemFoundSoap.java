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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.Trylof.services.service.http.ItemFoundServiceSoap}.
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.http.ItemFoundServiceSoap
 * @generated
 */
@ProviderType
public class ItemFoundSoap implements Serializable {
	public static ItemFoundSoap toSoapModel(ItemFound model) {
		ItemFoundSoap soapModel = new ItemFoundSoap();

		soapModel.setItemFoundId(model.getItemFoundId());
		soapModel.setUserId(model.getUserId());
		soapModel.setFoundDate(model.getFoundDate());
		soapModel.setFoundLocation(model.getFoundLocation());
		soapModel.setFoundCompany(model.getFoundCompany());
		soapModel.setFoundColor(model.getFoundColor());
		soapModel.setFoundSize(model.getFoundSize());
		soapModel.setFoundType(model.getFoundType());
		soapModel.setFoundStatus(model.getFoundStatus());
		soapModel.setFoundDesc(model.getFoundDesc());
		soapModel.setLostItem(model.getLostItem());
		soapModel.setMimeType(model.getMimeType());
		soapModel.setBlobData(model.getBlobData());

		return soapModel;
	}

	public static ItemFoundSoap[] toSoapModels(ItemFound[] models) {
		ItemFoundSoap[] soapModels = new ItemFoundSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ItemFoundSoap[][] toSoapModels(ItemFound[][] models) {
		ItemFoundSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ItemFoundSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ItemFoundSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ItemFoundSoap[] toSoapModels(List<ItemFound> models) {
		List<ItemFoundSoap> soapModels = new ArrayList<ItemFoundSoap>(models.size());

		for (ItemFound model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ItemFoundSoap[soapModels.size()]);
	}

	public ItemFoundSoap() {
	}

	public long getPrimaryKey() {
		return _itemFoundId;
	}

	public void setPrimaryKey(long pk) {
		setItemFoundId(pk);
	}

	public long getItemFoundId() {
		return _itemFoundId;
	}

	public void setItemFoundId(long itemFoundId) {
		_itemFoundId = itemFoundId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getFoundDate() {
		return _FoundDate;
	}

	public void setFoundDate(Date FoundDate) {
		_FoundDate = FoundDate;
	}

	public String getFoundLocation() {
		return _FoundLocation;
	}

	public void setFoundLocation(String FoundLocation) {
		_FoundLocation = FoundLocation;
	}

	public String getFoundCompany() {
		return _FoundCompany;
	}

	public void setFoundCompany(String FoundCompany) {
		_FoundCompany = FoundCompany;
	}

	public String getFoundColor() {
		return _FoundColor;
	}

	public void setFoundColor(String FoundColor) {
		_FoundColor = FoundColor;
	}

	public String getFoundSize() {
		return _FoundSize;
	}

	public void setFoundSize(String FoundSize) {
		_FoundSize = FoundSize;
	}

	public String getFoundType() {
		return _FoundType;
	}

	public void setFoundType(String FoundType) {
		_FoundType = FoundType;
	}

	public String getFoundStatus() {
		return _FoundStatus;
	}

	public void setFoundStatus(String FoundStatus) {
		_FoundStatus = FoundStatus;
	}

	public String getFoundDesc() {
		return _FoundDesc;
	}

	public void setFoundDesc(String FoundDesc) {
		_FoundDesc = FoundDesc;
	}

	public long getLostItem() {
		return _LostItem;
	}

	public void setLostItem(long LostItem) {
		_LostItem = LostItem;
	}

	public String getMimeType() {
		return _mimeType;
	}

	public void setMimeType(String mimeType) {
		_mimeType = mimeType;
	}

	public Blob getBlobData() {
		return _blobData;
	}

	public void setBlobData(Blob blobData) {
		_blobData = blobData;
	}

	private long _itemFoundId;
	private long _userId;
	private Date _FoundDate;
	private String _FoundLocation;
	private String _FoundCompany;
	private String _FoundColor;
	private String _FoundSize;
	private String _FoundType;
	private String _FoundStatus;
	private String _FoundDesc;
	private long _LostItem;
	private String _mimeType;
	private Blob _blobData;
}