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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SearchRes}.
 * </p>
 *
 * @author Utkarsh
 * @see SearchRes
 * @generated
 */
@ProviderType
public class SearchResWrapper implements SearchRes, ModelWrapper<SearchRes> {
	public SearchResWrapper(SearchRes searchRes) {
		_searchRes = searchRes;
	}

	@Override
	public Class<?> getModelClass() {
		return SearchRes.class;
	}

	@Override
	public String getModelClassName() {
		return SearchRes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("searchResId", getSearchResId());
		attributes.put("userId", getUserId());
		attributes.put("itemid", getItemid());
		attributes.put("location", getLocation());
		attributes.put("color", getColor());
		attributes.put("size", getSize());
		attributes.put("desc", getDesc());
		attributes.put("count", getCount());
		attributes.put("Status", getStatus());
		attributes.put("Date", getDate());
		attributes.put("Company", getCompany());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long searchResId = (Long)attributes.get("searchResId");

		if (searchResId != null) {
			setSearchResId(searchResId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long itemid = (Long)attributes.get("itemid");

		if (itemid != null) {
			setItemid(itemid);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		String size = (String)attributes.get("size");

		if (size != null) {
			setSize(size);
		}

		String desc = (String)attributes.get("desc");

		if (desc != null) {
			setDesc(desc);
		}

		Integer count = (Integer)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		String Status = (String)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}

		Date Date = (Date)attributes.get("Date");

		if (Date != null) {
			setDate(Date);
		}

		String Company = (String)attributes.get("Company");

		if (Company != null) {
			setCompany(Company);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new SearchResWrapper((SearchRes)_searchRes.clone());
	}

	@Override
	public int compareTo(com.Trylof.services.model.SearchRes searchRes) {
		return _searchRes.compareTo(searchRes);
	}

	/**
	* Returns the color of this search res.
	*
	* @return the color of this search res
	*/
	@Override
	public java.lang.String getColor() {
		return _searchRes.getColor();
	}

	/**
	* Returns the company of this search res.
	*
	* @return the company of this search res
	*/
	@Override
	public java.lang.String getCompany() {
		return _searchRes.getCompany();
	}

	/**
	* Returns the count of this search res.
	*
	* @return the count of this search res
	*/
	@Override
	public int getCount() {
		return _searchRes.getCount();
	}

	/**
	* Returns the date of this search res.
	*
	* @return the date of this search res
	*/
	@Override
	public Date getDate() {
		return _searchRes.getDate();
	}

	/**
	* Returns the desc of this search res.
	*
	* @return the desc of this search res
	*/
	@Override
	public java.lang.String getDesc() {
		return _searchRes.getDesc();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _searchRes.getExpandoBridge();
	}

	/**
	* Returns the itemid of this search res.
	*
	* @return the itemid of this search res
	*/
	@Override
	public long getItemid() {
		return _searchRes.getItemid();
	}

	/**
	* Returns the location of this search res.
	*
	* @return the location of this search res
	*/
	@Override
	public java.lang.String getLocation() {
		return _searchRes.getLocation();
	}

	/**
	* Returns the primary key of this search res.
	*
	* @return the primary key of this search res
	*/
	@Override
	public long getPrimaryKey() {
		return _searchRes.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _searchRes.getPrimaryKeyObj();
	}

	/**
	* Returns the search res ID of this search res.
	*
	* @return the search res ID of this search res
	*/
	@Override
	public long getSearchResId() {
		return _searchRes.getSearchResId();
	}

	/**
	* Returns the size of this search res.
	*
	* @return the size of this search res
	*/
	@Override
	public java.lang.String getSize() {
		return _searchRes.getSize();
	}

	/**
	* Returns the status of this search res.
	*
	* @return the status of this search res
	*/
	@Override
	public java.lang.String getStatus() {
		return _searchRes.getStatus();
	}

	/**
	* Returns the user ID of this search res.
	*
	* @return the user ID of this search res
	*/
	@Override
	public long getUserId() {
		return _searchRes.getUserId();
	}

	/**
	* Returns the user uuid of this search res.
	*
	* @return the user uuid of this search res
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _searchRes.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _searchRes.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _searchRes.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _searchRes.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _searchRes.isNew();
	}

	@Override
	public void persist() {
		_searchRes.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_searchRes.setCachedModel(cachedModel);
	}

	/**
	* Sets the color of this search res.
	*
	* @param color the color of this search res
	*/
	@Override
	public void setColor(java.lang.String color) {
		_searchRes.setColor(color);
	}

	/**
	* Sets the company of this search res.
	*
	* @param Company the company of this search res
	*/
	@Override
	public void setCompany(java.lang.String Company) {
		_searchRes.setCompany(Company);
	}

	/**
	* Sets the count of this search res.
	*
	* @param count the count of this search res
	*/
	@Override
	public void setCount(int count) {
		_searchRes.setCount(count);
	}

	/**
	* Sets the date of this search res.
	*
	* @param Date the date of this search res
	*/
	@Override
	public void setDate(Date Date) {
		_searchRes.setDate(Date);
	}

	/**
	* Sets the desc of this search res.
	*
	* @param desc the desc of this search res
	*/
	@Override
	public void setDesc(java.lang.String desc) {
		_searchRes.setDesc(desc);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_searchRes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_searchRes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_searchRes.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the itemid of this search res.
	*
	* @param itemid the itemid of this search res
	*/
	@Override
	public void setItemid(long itemid) {
		_searchRes.setItemid(itemid);
	}

	/**
	* Sets the location of this search res.
	*
	* @param location the location of this search res
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_searchRes.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_searchRes.setNew(n);
	}

	/**
	* Sets the primary key of this search res.
	*
	* @param primaryKey the primary key of this search res
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_searchRes.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_searchRes.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the search res ID of this search res.
	*
	* @param searchResId the search res ID of this search res
	*/
	@Override
	public void setSearchResId(long searchResId) {
		_searchRes.setSearchResId(searchResId);
	}

	/**
	* Sets the size of this search res.
	*
	* @param size the size of this search res
	*/
	@Override
	public void setSize(java.lang.String size) {
		_searchRes.setSize(size);
	}

	/**
	* Sets the status of this search res.
	*
	* @param Status the status of this search res
	*/
	@Override
	public void setStatus(java.lang.String Status) {
		_searchRes.setStatus(Status);
	}

	/**
	* Sets the user ID of this search res.
	*
	* @param userId the user ID of this search res
	*/
	@Override
	public void setUserId(long userId) {
		_searchRes.setUserId(userId);
	}

	/**
	* Sets the user uuid of this search res.
	*
	* @param userUuid the user uuid of this search res
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_searchRes.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.Trylof.services.model.SearchRes> toCacheModel() {
		return _searchRes.toCacheModel();
	}

	@Override
	public com.Trylof.services.model.SearchRes toEscapedModel() {
		return new SearchResWrapper(_searchRes.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _searchRes.toString();
	}

	@Override
	public com.Trylof.services.model.SearchRes toUnescapedModel() {
		return new SearchResWrapper(_searchRes.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _searchRes.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SearchResWrapper)) {
			return false;
		}

		SearchResWrapper searchResWrapper = (SearchResWrapper)obj;

		if (Validator.equals(_searchRes, searchResWrapper._searchRes)) {
			return true;
		}

		return false;
	}

	@Override
	public SearchRes getWrappedModel() {
		return _searchRes;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _searchRes.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _searchRes.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_searchRes.resetOriginalValues();
	}

	private final SearchRes _searchRes;
}