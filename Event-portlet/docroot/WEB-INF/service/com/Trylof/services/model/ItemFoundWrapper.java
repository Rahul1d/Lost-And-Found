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
 * This class is a wrapper for {@link ItemFound}.
 * </p>
 *
 * @author Utkarsh
 * @see ItemFound
 * @generated
 */
@ProviderType
public class ItemFoundWrapper implements ItemFound, ModelWrapper<ItemFound> {
	public ItemFoundWrapper(ItemFound itemFound) {
		_itemFound = itemFound;
	}

	@Override
	public Class<?> getModelClass() {
		return ItemFound.class;
	}

	@Override
	public String getModelClassName() {
		return ItemFound.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemFoundId", getItemFoundId());
		attributes.put("userId", getUserId());
		attributes.put("FoundDate", getFoundDate());
		attributes.put("FoundLocation", getFoundLocation());
		attributes.put("FoundCompany", getFoundCompany());
		attributes.put("FoundColor", getFoundColor());
		attributes.put("FoundSize", getFoundSize());
		attributes.put("FoundType", getFoundType());
		attributes.put("FoundStatus", getFoundStatus());
		attributes.put("FoundDesc", getFoundDesc());
		attributes.put("LostItem", getLostItem());
		attributes.put("mimeType", getMimeType());
		attributes.put("blobData", getBlobData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemFoundId = (Long)attributes.get("itemFoundId");

		if (itemFoundId != null) {
			setItemFoundId(itemFoundId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date FoundDate = (Date)attributes.get("FoundDate");

		if (FoundDate != null) {
			setFoundDate(FoundDate);
		}

		String FoundLocation = (String)attributes.get("FoundLocation");

		if (FoundLocation != null) {
			setFoundLocation(FoundLocation);
		}

		String FoundCompany = (String)attributes.get("FoundCompany");

		if (FoundCompany != null) {
			setFoundCompany(FoundCompany);
		}

		String FoundColor = (String)attributes.get("FoundColor");

		if (FoundColor != null) {
			setFoundColor(FoundColor);
		}

		String FoundSize = (String)attributes.get("FoundSize");

		if (FoundSize != null) {
			setFoundSize(FoundSize);
		}

		String FoundType = (String)attributes.get("FoundType");

		if (FoundType != null) {
			setFoundType(FoundType);
		}

		String FoundStatus = (String)attributes.get("FoundStatus");

		if (FoundStatus != null) {
			setFoundStatus(FoundStatus);
		}

		String FoundDesc = (String)attributes.get("FoundDesc");

		if (FoundDesc != null) {
			setFoundDesc(FoundDesc);
		}

		Long LostItem = (Long)attributes.get("LostItem");

		if (LostItem != null) {
			setLostItem(LostItem);
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
		return new ItemFoundWrapper((ItemFound)_itemFound.clone());
	}

	@Override
	public int compareTo(com.Trylof.services.model.ItemFound itemFound) {
		return _itemFound.compareTo(itemFound);
	}

	/**
	* Returns the blob data of this item found.
	*
	* @return the blob data of this item found
	*/
	@Override
	public Blob getBlobData() {
		return _itemFound.getBlobData();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _itemFound.getExpandoBridge();
	}

	/**
	* Returns the found color of this item found.
	*
	* @return the found color of this item found
	*/
	@Override
	public java.lang.String getFoundColor() {
		return _itemFound.getFoundColor();
	}

	/**
	* Returns the found company of this item found.
	*
	* @return the found company of this item found
	*/
	@Override
	public java.lang.String getFoundCompany() {
		return _itemFound.getFoundCompany();
	}

	/**
	* Returns the found date of this item found.
	*
	* @return the found date of this item found
	*/
	@Override
	public Date getFoundDate() {
		return _itemFound.getFoundDate();
	}

	/**
	* Returns the found desc of this item found.
	*
	* @return the found desc of this item found
	*/
	@Override
	public java.lang.String getFoundDesc() {
		return _itemFound.getFoundDesc();
	}

	/**
	* Returns the found location of this item found.
	*
	* @return the found location of this item found
	*/
	@Override
	public java.lang.String getFoundLocation() {
		return _itemFound.getFoundLocation();
	}

	/**
	* Returns the found size of this item found.
	*
	* @return the found size of this item found
	*/
	@Override
	public java.lang.String getFoundSize() {
		return _itemFound.getFoundSize();
	}

	/**
	* Returns the found status of this item found.
	*
	* @return the found status of this item found
	*/
	@Override
	public java.lang.String getFoundStatus() {
		return _itemFound.getFoundStatus();
	}

	/**
	* Returns the found type of this item found.
	*
	* @return the found type of this item found
	*/
	@Override
	public java.lang.String getFoundType() {
		return _itemFound.getFoundType();
	}

	/**
	* Returns the item found ID of this item found.
	*
	* @return the item found ID of this item found
	*/
	@Override
	public long getItemFoundId() {
		return _itemFound.getItemFoundId();
	}

	/**
	* Returns the lost item of this item found.
	*
	* @return the lost item of this item found
	*/
	@Override
	public long getLostItem() {
		return _itemFound.getLostItem();
	}

	/**
	* Returns the mime type of this item found.
	*
	* @return the mime type of this item found
	*/
	@Override
	public java.lang.String getMimeType() {
		return _itemFound.getMimeType();
	}

	/**
	* Returns the primary key of this item found.
	*
	* @return the primary key of this item found
	*/
	@Override
	public long getPrimaryKey() {
		return _itemFound.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemFound.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this item found.
	*
	* @return the user ID of this item found
	*/
	@Override
	public long getUserId() {
		return _itemFound.getUserId();
	}

	/**
	* Returns the user uuid of this item found.
	*
	* @return the user uuid of this item found
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _itemFound.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _itemFound.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _itemFound.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _itemFound.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _itemFound.isNew();
	}

	@Override
	public void persist() {
		_itemFound.persist();
	}

	/**
	* Sets the blob data of this item found.
	*
	* @param blobData the blob data of this item found
	*/
	@Override
	public void setBlobData(Blob blobData) {
		_itemFound.setBlobData(blobData);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_itemFound.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_itemFound.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_itemFound.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_itemFound.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the found color of this item found.
	*
	* @param FoundColor the found color of this item found
	*/
	@Override
	public void setFoundColor(java.lang.String FoundColor) {
		_itemFound.setFoundColor(FoundColor);
	}

	/**
	* Sets the found company of this item found.
	*
	* @param FoundCompany the found company of this item found
	*/
	@Override
	public void setFoundCompany(java.lang.String FoundCompany) {
		_itemFound.setFoundCompany(FoundCompany);
	}

	/**
	* Sets the found date of this item found.
	*
	* @param FoundDate the found date of this item found
	*/
	@Override
	public void setFoundDate(Date FoundDate) {
		_itemFound.setFoundDate(FoundDate);
	}

	/**
	* Sets the found desc of this item found.
	*
	* @param FoundDesc the found desc of this item found
	*/
	@Override
	public void setFoundDesc(java.lang.String FoundDesc) {
		_itemFound.setFoundDesc(FoundDesc);
	}

	/**
	* Sets the found location of this item found.
	*
	* @param FoundLocation the found location of this item found
	*/
	@Override
	public void setFoundLocation(java.lang.String FoundLocation) {
		_itemFound.setFoundLocation(FoundLocation);
	}

	/**
	* Sets the found size of this item found.
	*
	* @param FoundSize the found size of this item found
	*/
	@Override
	public void setFoundSize(java.lang.String FoundSize) {
		_itemFound.setFoundSize(FoundSize);
	}

	/**
	* Sets the found status of this item found.
	*
	* @param FoundStatus the found status of this item found
	*/
	@Override
	public void setFoundStatus(java.lang.String FoundStatus) {
		_itemFound.setFoundStatus(FoundStatus);
	}

	/**
	* Sets the found type of this item found.
	*
	* @param FoundType the found type of this item found
	*/
	@Override
	public void setFoundType(java.lang.String FoundType) {
		_itemFound.setFoundType(FoundType);
	}

	/**
	* Sets the item found ID of this item found.
	*
	* @param itemFoundId the item found ID of this item found
	*/
	@Override
	public void setItemFoundId(long itemFoundId) {
		_itemFound.setItemFoundId(itemFoundId);
	}

	/**
	* Sets the lost item of this item found.
	*
	* @param LostItem the lost item of this item found
	*/
	@Override
	public void setLostItem(long LostItem) {
		_itemFound.setLostItem(LostItem);
	}

	/**
	* Sets the mime type of this item found.
	*
	* @param mimeType the mime type of this item found
	*/
	@Override
	public void setMimeType(java.lang.String mimeType) {
		_itemFound.setMimeType(mimeType);
	}

	@Override
	public void setNew(boolean n) {
		_itemFound.setNew(n);
	}

	/**
	* Sets the primary key of this item found.
	*
	* @param primaryKey the primary key of this item found
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_itemFound.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_itemFound.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this item found.
	*
	* @param userId the user ID of this item found
	*/
	@Override
	public void setUserId(long userId) {
		_itemFound.setUserId(userId);
	}

	/**
	* Sets the user uuid of this item found.
	*
	* @param userUuid the user uuid of this item found
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_itemFound.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.Trylof.services.model.ItemFound> toCacheModel() {
		return _itemFound.toCacheModel();
	}

	@Override
	public com.Trylof.services.model.ItemFound toEscapedModel() {
		return new ItemFoundWrapper(_itemFound.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _itemFound.toString();
	}

	@Override
	public com.Trylof.services.model.ItemFound toUnescapedModel() {
		return new ItemFoundWrapper(_itemFound.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _itemFound.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemFoundWrapper)) {
			return false;
		}

		ItemFoundWrapper itemFoundWrapper = (ItemFoundWrapper)obj;

		if (Validator.equals(_itemFound, itemFoundWrapper._itemFound)) {
			return true;
		}

		return false;
	}

	@Override
	public ItemFound getWrappedModel() {
		return _itemFound;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _itemFound.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _itemFound.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_itemFound.resetOriginalValues();
	}

	private final ItemFound _itemFound;
}