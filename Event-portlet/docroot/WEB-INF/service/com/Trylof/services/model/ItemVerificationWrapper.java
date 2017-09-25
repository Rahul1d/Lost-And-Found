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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ItemVerification}.
 * </p>
 *
 * @author Utkarsh
 * @see ItemVerification
 * @generated
 */
@ProviderType
public class ItemVerificationWrapper implements ItemVerification,
	ModelWrapper<ItemVerification> {
	public ItemVerificationWrapper(ItemVerification itemVerification) {
		_itemVerification = itemVerification;
	}

	@Override
	public Class<?> getModelClass() {
		return ItemVerification.class;
	}

	@Override
	public String getModelClassName() {
		return ItemVerification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemVerificationId", getItemVerificationId());
		attributes.put("VerifyDesc", getVerifyDesc());
		attributes.put("Image1", getImage1());
		attributes.put("Image2", getImage2());
		attributes.put("LostItemid", getLostItemid());
		attributes.put("FoundItemid", getFoundItemid());
		attributes.put("UserId", getUserId());
		attributes.put("VerifyStatus", getVerifyStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemVerificationId = (Long)attributes.get("itemVerificationId");

		if (itemVerificationId != null) {
			setItemVerificationId(itemVerificationId);
		}

		String VerifyDesc = (String)attributes.get("VerifyDesc");

		if (VerifyDesc != null) {
			setVerifyDesc(VerifyDesc);
		}

		Blob Image1 = (Blob)attributes.get("Image1");

		if (Image1 != null) {
			setImage1(Image1);
		}

		Blob Image2 = (Blob)attributes.get("Image2");

		if (Image2 != null) {
			setImage2(Image2);
		}

		Long LostItemid = (Long)attributes.get("LostItemid");

		if (LostItemid != null) {
			setLostItemid(LostItemid);
		}

		Long FoundItemid = (Long)attributes.get("FoundItemid");

		if (FoundItemid != null) {
			setFoundItemid(FoundItemid);
		}

		Long UserId = (Long)attributes.get("UserId");

		if (UserId != null) {
			setUserId(UserId);
		}

		String VerifyStatus = (String)attributes.get("VerifyStatus");

		if (VerifyStatus != null) {
			setVerifyStatus(VerifyStatus);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new ItemVerificationWrapper((ItemVerification)_itemVerification.clone());
	}

	@Override
	public int compareTo(
		com.Trylof.services.model.ItemVerification itemVerification) {
		return _itemVerification.compareTo(itemVerification);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _itemVerification.getExpandoBridge();
	}

	/**
	* Returns the found itemid of this item verification.
	*
	* @return the found itemid of this item verification
	*/
	@Override
	public long getFoundItemid() {
		return _itemVerification.getFoundItemid();
	}

	/**
	* Returns the image1 of this item verification.
	*
	* @return the image1 of this item verification
	*/
	@Override
	public Blob getImage1() {
		return _itemVerification.getImage1();
	}

	/**
	* Returns the image2 of this item verification.
	*
	* @return the image2 of this item verification
	*/
	@Override
	public Blob getImage2() {
		return _itemVerification.getImage2();
	}

	/**
	* Returns the item verification ID of this item verification.
	*
	* @return the item verification ID of this item verification
	*/
	@Override
	public long getItemVerificationId() {
		return _itemVerification.getItemVerificationId();
	}

	/**
	* Returns the lost itemid of this item verification.
	*
	* @return the lost itemid of this item verification
	*/
	@Override
	public long getLostItemid() {
		return _itemVerification.getLostItemid();
	}

	/**
	* Returns the primary key of this item verification.
	*
	* @return the primary key of this item verification
	*/
	@Override
	public long getPrimaryKey() {
		return _itemVerification.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemVerification.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this item verification.
	*
	* @return the user ID of this item verification
	*/
	@Override
	public long getUserId() {
		return _itemVerification.getUserId();
	}

	/**
	* Returns the user uuid of this item verification.
	*
	* @return the user uuid of this item verification
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _itemVerification.getUserUuid();
	}

	/**
	* Returns the verify desc of this item verification.
	*
	* @return the verify desc of this item verification
	*/
	@Override
	public java.lang.String getVerifyDesc() {
		return _itemVerification.getVerifyDesc();
	}

	/**
	* Returns the verify status of this item verification.
	*
	* @return the verify status of this item verification
	*/
	@Override
	public java.lang.String getVerifyStatus() {
		return _itemVerification.getVerifyStatus();
	}

	@Override
	public int hashCode() {
		return _itemVerification.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _itemVerification.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _itemVerification.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _itemVerification.isNew();
	}

	@Override
	public void persist() {
		_itemVerification.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_itemVerification.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_itemVerification.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_itemVerification.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_itemVerification.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the found itemid of this item verification.
	*
	* @param FoundItemid the found itemid of this item verification
	*/
	@Override
	public void setFoundItemid(long FoundItemid) {
		_itemVerification.setFoundItemid(FoundItemid);
	}

	/**
	* Sets the image1 of this item verification.
	*
	* @param Image1 the image1 of this item verification
	*/
	@Override
	public void setImage1(Blob Image1) {
		_itemVerification.setImage1(Image1);
	}

	/**
	* Sets the image2 of this item verification.
	*
	* @param Image2 the image2 of this item verification
	*/
	@Override
	public void setImage2(Blob Image2) {
		_itemVerification.setImage2(Image2);
	}

	/**
	* Sets the item verification ID of this item verification.
	*
	* @param itemVerificationId the item verification ID of this item verification
	*/
	@Override
	public void setItemVerificationId(long itemVerificationId) {
		_itemVerification.setItemVerificationId(itemVerificationId);
	}

	/**
	* Sets the lost itemid of this item verification.
	*
	* @param LostItemid the lost itemid of this item verification
	*/
	@Override
	public void setLostItemid(long LostItemid) {
		_itemVerification.setLostItemid(LostItemid);
	}

	@Override
	public void setNew(boolean n) {
		_itemVerification.setNew(n);
	}

	/**
	* Sets the primary key of this item verification.
	*
	* @param primaryKey the primary key of this item verification
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_itemVerification.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_itemVerification.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this item verification.
	*
	* @param UserId the user ID of this item verification
	*/
	@Override
	public void setUserId(long UserId) {
		_itemVerification.setUserId(UserId);
	}

	/**
	* Sets the user uuid of this item verification.
	*
	* @param UserUuid the user uuid of this item verification
	*/
	@Override
	public void setUserUuid(java.lang.String UserUuid) {
		_itemVerification.setUserUuid(UserUuid);
	}

	/**
	* Sets the verify desc of this item verification.
	*
	* @param VerifyDesc the verify desc of this item verification
	*/
	@Override
	public void setVerifyDesc(java.lang.String VerifyDesc) {
		_itemVerification.setVerifyDesc(VerifyDesc);
	}

	/**
	* Sets the verify status of this item verification.
	*
	* @param VerifyStatus the verify status of this item verification
	*/
	@Override
	public void setVerifyStatus(java.lang.String VerifyStatus) {
		_itemVerification.setVerifyStatus(VerifyStatus);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.Trylof.services.model.ItemVerification> toCacheModel() {
		return _itemVerification.toCacheModel();
	}

	@Override
	public com.Trylof.services.model.ItemVerification toEscapedModel() {
		return new ItemVerificationWrapper(_itemVerification.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _itemVerification.toString();
	}

	@Override
	public com.Trylof.services.model.ItemVerification toUnescapedModel() {
		return new ItemVerificationWrapper(_itemVerification.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _itemVerification.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemVerificationWrapper)) {
			return false;
		}

		ItemVerificationWrapper itemVerificationWrapper = (ItemVerificationWrapper)obj;

		if (Validator.equals(_itemVerification,
					itemVerificationWrapper._itemVerification)) {
			return true;
		}

		return false;
	}

	@Override
	public ItemVerification getWrappedModel() {
		return _itemVerification;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _itemVerification.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _itemVerification.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_itemVerification.resetOriginalValues();
	}

	private final ItemVerification _itemVerification;
}