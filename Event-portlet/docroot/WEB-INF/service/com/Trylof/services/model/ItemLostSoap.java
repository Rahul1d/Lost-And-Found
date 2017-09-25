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
 * This class is used by SOAP remote services, specifically {@link com.Trylof.services.service.http.ItemLostServiceSoap}.
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.http.ItemLostServiceSoap
 * @generated
 */
@ProviderType
public class ItemLostSoap implements Serializable {
	public static ItemLostSoap toSoapModel(ItemLost model) {
		ItemLostSoap soapModel = new ItemLostSoap();

		soapModel.setItemLostId(model.getItemLostId());
		soapModel.setUserId(model.getUserId());
		soapModel.setLostDate(model.getLostDate());
		soapModel.setLostLocation(model.getLostLocation());
		soapModel.setLostCompany(model.getLostCompany());
		soapModel.setLostColor(model.getLostColor());
		soapModel.setLostSize(model.getLostSize());
		soapModel.setLostType(model.getLostType());
		soapModel.setLostStatus(model.getLostStatus());
		soapModel.setLostDesc(model.getLostDesc());
		soapModel.setMimeType(model.getMimeType());
		soapModel.setBlobData(model.getBlobData());

		return soapModel;
	}

	public static ItemLostSoap[] toSoapModels(ItemLost[] models) {
		ItemLostSoap[] soapModels = new ItemLostSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ItemLostSoap[][] toSoapModels(ItemLost[][] models) {
		ItemLostSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ItemLostSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ItemLostSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ItemLostSoap[] toSoapModels(List<ItemLost> models) {
		List<ItemLostSoap> soapModels = new ArrayList<ItemLostSoap>(models.size());

		for (ItemLost model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ItemLostSoap[soapModels.size()]);
	}

	public ItemLostSoap() {
	}

	public long getPrimaryKey() {
		return _itemLostId;
	}

	public void setPrimaryKey(long pk) {
		setItemLostId(pk);
	}

	public long getItemLostId() {
		return _itemLostId;
	}

	public void setItemLostId(long itemLostId) {
		_itemLostId = itemLostId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getLostDate() {
		return _LostDate;
	}

	public void setLostDate(Date LostDate) {
		_LostDate = LostDate;
	}

	public String getLostLocation() {
		return _LostLocation;
	}

	public void setLostLocation(String LostLocation) {
		_LostLocation = LostLocation;
	}

	public String getLostCompany() {
		return _LostCompany;
	}

	public void setLostCompany(String LostCompany) {
		_LostCompany = LostCompany;
	}

	public String getLostColor() {
		return _LostColor;
	}

	public void setLostColor(String LostColor) {
		_LostColor = LostColor;
	}

	public String getLostSize() {
		return _LostSize;
	}

	public void setLostSize(String LostSize) {
		_LostSize = LostSize;
	}

	public String getLostType() {
		return _LostType;
	}

	public void setLostType(String LostType) {
		_LostType = LostType;
	}

	public String getLostStatus() {
		return _LostStatus;
	}

	public void setLostStatus(String LostStatus) {
		_LostStatus = LostStatus;
	}

	public String getLostDesc() {
		return _LostDesc;
	}

	public void setLostDesc(String LostDesc) {
		_LostDesc = LostDesc;
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

	private long _itemLostId;
	private long _userId;
	private Date _LostDate;
	private String _LostLocation;
	private String _LostCompany;
	private String _LostColor;
	private String _LostSize;
	private String _LostType;
	private String _LostStatus;
	private String _LostDesc;
	private String _mimeType;
	private Blob _blobData;
}