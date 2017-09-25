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

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ItemLost}.
 * </p>
 *
 * @author Utkarsh
 * @see ItemLost
 * @generated
 */
@ProviderType
public class ItemLostWrapper implements ItemLost, ModelWrapper<ItemLost> {
	public ItemLostWrapper(ItemLost itemLost) {
		_itemLost = itemLost;
	}

	@Override
	public Class<?> getModelClass() {
		return ItemLost.class;
	}

	@Override
	public String getModelClassName() {
		return ItemLost.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemLostId", getItemLostId());
		attributes.put("userId", getUserId());
		attributes.put("LostDate", getLostDate());
		attributes.put("LostLocation", getLostLocation());
		attributes.put("LostCompany", getLostCompany());
		attributes.put("LostColor", getLostColor());
		attributes.put("LostSize", getLostSize());
		attributes.put("LostType", getLostType());
		attributes.put("LostStatus", getLostStatus());
		attributes.put("LostDesc", getLostDesc());
		attributes.put("mimeType", getMimeType());
		attributes.put("blobData", getBlobData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemLostId = (Long)attributes.get("itemLostId");

		if (itemLostId != null) {
			setItemLostId(itemLostId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date LostDate = (Date)attributes.get("LostDate");

		if (LostDate != null) {
			setLostDate(LostDate);
		}

		String LostLocation = (String)attributes.get("LostLocation");

		if (LostLocation != null) {
			setLostLocation(LostLocation);
		}

		String LostCompany = (String)attributes.get("LostCompany");

		if (LostCompany != null) {
			setLostCompany(LostCompany);
		}

		String LostColor = (String)attributes.get("LostColor");

		if (LostColor != null) {
			setLostColor(LostColor);
		}

		String LostSize = (String)attributes.get("LostSize");

		if (LostSize != null) {
			setLostSize(LostSize);
		}

		String LostType = (String)attributes.get("LostType");

		if (LostType != null) {
			setLostType(LostType);
		}

		String LostStatus = (String)attributes.get("LostStatus");

		if (LostStatus != null) {
			setLostStatus(LostStatus);
		}

		String LostDesc = (String)attributes.get("LostDesc");

		if (LostDesc != null) {
			setLostDesc(LostDesc);
		}

		String mimeType = (String)attributes.get("mimeType");

		if (mimeType != null) {
			setMimeType(mimeType);
		}

		Blob blobData = (Blob)attributes.get("blobData");

		if (blobData != null) {
			setBlobData(blobData);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new ItemLostWrapper((ItemLost)_itemLost.clone());
	}

	@Override
	public int compareTo(com.Trylof.services.model.ItemLost itemLost) {
		return _itemLost.compareTo(itemLost);
	}

	/**
	* Returns the blob data of this item lost.
	*
	* @return the blob data of this item lost
	*/
	@Override
	public Blob getBlobData() {
		return _itemLost.getBlobData();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _itemLost.getExpandoBridge();
	}

	/**
	* Returns the item lost ID of this item lost.
	*
	* @return the item lost ID of this item lost
	*/
	@Override
	public long getItemLostId() {
		return _itemLost.getItemLostId();
	}

	/**
	* Returns the lost color of this item lost.
	*
	* @return the lost color of this item lost
	*/
	@Override
	public java.lang.String getLostColor() {
		return _itemLost.getLostColor();
	}

	/**
	* Returns the lost company of this item lost.
	*
	* @return the lost company of this item lost
	*/
	@Override
	public java.lang.String getLostCompany() {
		return _itemLost.getLostCompany();
	}

	/**
	* Returns the lost date of this item lost.
	*
	* @return the lost date of this item lost
	*/
	@Override
	public Date getLostDate() {
		return _itemLost.getLostDate();
	}

	/**
	* Returns the lost desc of this item lost.
	*
	* @return the lost desc of this item lost
	*/
	@Override
	public java.lang.String getLostDesc() {
		return _itemLost.getLostDesc();
	}

	/**
	* Returns the lost location of this item lost.
	*
	* @return the lost location of this item lost
	*/
	@Override
	public java.lang.String getLostLocation() {
		return _itemLost.getLostLocation();
	}

	/**
	* Returns the lost size of this item lost.
	*
	* @return the lost size of this item lost
	*/
	@Override
	public java.lang.String getLostSize() {
		return _itemLost.getLostSize();
	}

	/**
	* Returns the lost status of this item lost.
	*
	* @return the lost status of this item lost
	*/
	@Override
	public java.lang.String getLostStatus() {
		return _itemLost.getLostStatus();
	}

	/**
	* Returns the lost type of this item lost.
	*
	* @return the lost type of this item lost
	*/
	@Override
	public java.lang.String getLostType() {
		return _itemLost.getLostType();
	}

	/**
	* Returns the mime type of this item lost.
	*
	* @return the mime type of this item lost
	*/
	@Override
	public java.lang.String getMimeType() {
		return _itemLost.getMimeType();
	}

	/**
	* Returns the primary key of this item lost.
	*
	* @return the primary key of this item lost
	*/
	@Override
	public long getPrimaryKey() {
		return _itemLost.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemLost.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this item lost.
	*
	* @return the user ID of this item lost
	*/
	@Override
	public long getUserId() {
		return _itemLost.getUserId();
	}

	/**
	* Returns the user uuid of this item lost.
	*
	* @return the user uuid of this item lost
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _itemLost.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _itemLost.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _itemLost.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _itemLost.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _itemLost.isNew();
	}

	@Override
	public void persist() {
		_itemLost.persist();
	}

	/**
	* Sets the blob data of this item lost.
	*
	* @param blobData the blob data of this item lost
	*/
	@Override
	public void setBlobData(Blob blobData) {
		_itemLost.setBlobData(blobData);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_itemLost.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_itemLost.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_itemLost.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_itemLost.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the item lost ID of this item lost.
	*
	* @param itemLostId the item lost ID of this item lost
	*/
	@Override
	public void setItemLostId(long itemLostId) {
		_itemLost.setItemLostId(itemLostId);
	}

	/**
	* Sets the lost color of this item lost.
	*
	* @param LostColor the lost color of this item lost
	*/
	@Override
	public void setLostColor(java.lang.String LostColor) {
		_itemLost.setLostColor(LostColor);
	}

	/**
	* Sets the lost company of this item lost.
	*
	* @param LostCompany the lost company of this item lost
	*/
	@Override
	public void setLostCompany(java.lang.String LostCompany) {
		_itemLost.setLostCompany(LostCompany);
	}

	/**
	* Sets the lost date of this item lost.
	*
	* @param LostDate the lost date of this item lost
	*/
	@Override
	public void setLostDate(Date LostDate) {
		_itemLost.setLostDate(LostDate);
	}

	/**
	* Sets the lost desc of this item lost.
	*
	* @param LostDesc the lost desc of this item lost
	*/
	@Override
	public void setLostDesc(java.lang.String LostDesc) {
		_itemLost.setLostDesc(LostDesc);
	}

	/**
	* Sets the lost location of this item lost.
	*
	* @param LostLocation the lost location of this item lost
	*/
	@Override
	public void setLostLocation(java.lang.String LostLocation) {
		_itemLost.setLostLocation(LostLocation);
	}

	/**
	* Sets the lost size of this item lost.
	*
	* @param LostSize the lost size of this item lost
	*/
	@Override
	public void setLostSize(java.lang.String LostSize) {
		_itemLost.setLostSize(LostSize);
	}

	/**
	* Sets the lost status of this item lost.
	*
	* @param LostStatus the lost status of this item lost
	*/
	@Override
	public void setLostStatus(java.lang.String LostStatus) {
		_itemLost.setLostStatus(LostStatus);
	}

	/**
	* Sets the lost type of this item lost.
	*
	* @param LostType the lost type of this item lost
	*/
	@Override
	public void setLostType(java.lang.String LostType) {
		_itemLost.setLostType(LostType);
	}

	/**
	* Sets the mime type of this item lost.
	*
	* @param mimeType the mime type of this item lost
	*/
	@Override
	public void setMimeType(java.lang.String mimeType) {
		_itemLost.setMimeType(mimeType);
	}

	@Override
	public void setNew(boolean n) {
		_itemLost.setNew(n);
	}

	/**
	* Sets the primary key of this item lost.
	*
	* @param primaryKey the primary key of this item lost
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_itemLost.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_itemLost.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this item lost.
	*
	* @param userId the user ID of this item lost
	*/
	@Override
	public void setUserId(long userId) {
		_itemLost.setUserId(userId);
	}

	/**
	* Sets the user uuid of this item lost.
	*
	* @param userUuid the user uuid of this item lost
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_itemLost.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.Trylof.services.model.ItemLost> toCacheModel() {
		return _itemLost.toCacheModel();
	}

	@Override
	public com.Trylof.services.model.ItemLost toEscapedModel() {
		return new ItemLostWrapper(_itemLost.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _itemLost.toString();
	}

	@Override
	public com.Trylof.services.model.ItemLost toUnescapedModel() {
		return new ItemLostWrapper(_itemLost.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _itemLost.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemLostWrapper)) {
			return false;
		}

		ItemLostWrapper itemLostWrapper = (ItemLostWrapper)obj;

		if (Validator.equals(_itemLost, itemLostWrapper._itemLost)) {
			return true;
		}

		return false;
	}

	@Override
	public ItemLost getWrappedModel() {
		return _itemLost;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _itemLost.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _itemLost.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_itemLost.resetOriginalValues();
	}

	private final ItemLost _itemLost;
}