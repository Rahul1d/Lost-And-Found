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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.Trylof.services.service.http.SearchResServiceSoap}.
 *
 * @author Utkarsh
 * @see com.Trylof.services.service.http.SearchResServiceSoap
 * @generated
 */
@ProviderType
public class SearchResSoap implements Serializable {
	public static SearchResSoap toSoapModel(SearchRes model) {
		SearchResSoap soapModel = new SearchResSoap();

		soapModel.setSearchResId(model.getSearchResId());
		soapModel.setUserId(model.getUserId());
		soapModel.setItemid(model.getItemid());
		soapModel.setLocation(model.getLocation());
		soapModel.setColor(model.getColor());
		soapModel.setSize(model.getSize());
		soapModel.setDesc(model.getDesc());
		soapModel.setCount(model.getCount());
		soapModel.setStatus(model.getStatus());
		soapModel.setDate(model.getDate());
		soapModel.setCompany(model.getCompany());

		return soapModel;
	}

	public static SearchResSoap[] toSoapModels(SearchRes[] models) {
		SearchResSoap[] soapModels = new SearchResSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SearchResSoap[][] toSoapModels(SearchRes[][] models) {
		SearchResSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SearchResSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SearchResSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SearchResSoap[] toSoapModels(List<SearchRes> models) {
		List<SearchResSoap> soapModels = new ArrayList<SearchResSoap>(models.size());

		for (SearchRes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SearchResSoap[soapModels.size()]);
	}

	public SearchResSoap() {
	}

	public long getPrimaryKey() {
		return _searchResId;
	}

	public void setPrimaryKey(long pk) {
		setSearchResId(pk);
	}

	public long getSearchResId() {
		return _searchResId;
	}

	public void setSearchResId(long searchResId) {
		_searchResId = searchResId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getItemid() {
		return _itemid;
	}

	public void setItemid(long itemid) {
		_itemid = itemid;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public String getSize() {
		return _size;
	}

	public void setSize(String size) {
		_size = size;
	}

	public String getDesc() {
		return _desc;
	}

	public void setDesc(String desc) {
		_desc = desc;
	}

	public int getCount() {
		return _count;
	}

	public void setCount(int count) {
		_count = count;
	}

	public String getStatus() {
		return _Status;
	}

	public void setStatus(String Status) {
		_Status = Status;
	}

	public Date getDate() {
		return _Date;
	}

	public void setDate(Date Date) {
		_Date = Date;
	}

	public String getCompany() {
		return _Company;
	}

	public void setCompany(String Company) {
		_Company = Company;
	}

	private long _searchResId;
	private long _userId;
	private long _itemid;
	private String _location;
	private String _color;
	private String _size;
	private String _desc;
	private int _count;
	private String _Status;
	private Date _Date;
	private String _Company;
}