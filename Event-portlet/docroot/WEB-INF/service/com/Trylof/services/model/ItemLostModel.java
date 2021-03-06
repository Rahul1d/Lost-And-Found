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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.sql.Blob;

import java.util.Date;

/**
 * The base model interface for the ItemLost service. Represents a row in the &quot;LofService_ItemLost&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.Trylof.services.model.impl.ItemLostModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.Trylof.services.model.impl.ItemLostImpl}.
 * </p>
 *
 * @author Utkarsh
 * @see ItemLost
 * @see com.Trylof.services.model.impl.ItemLostImpl
 * @see com.Trylof.services.model.impl.ItemLostModelImpl
 * @generated
 */
@ProviderType
public interface ItemLostModel extends BaseModel<ItemLost> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a item lost model instance should use the {@link ItemLost} interface instead.
	 */

	/**
	 * Returns the primary key of this item lost.
	 *
	 * @return the primary key of this item lost
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this item lost.
	 *
	 * @param primaryKey the primary key of this item lost
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the item lost ID of this item lost.
	 *
	 * @return the item lost ID of this item lost
	 */
	public long getItemLostId();

	/**
	 * Sets the item lost ID of this item lost.
	 *
	 * @param itemLostId the item lost ID of this item lost
	 */
	public void setItemLostId(long itemLostId);

	/**
	 * Returns the user ID of this item lost.
	 *
	 * @return the user ID of this item lost
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this item lost.
	 *
	 * @param userId the user ID of this item lost
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this item lost.
	 *
	 * @return the user uuid of this item lost
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this item lost.
	 *
	 * @param userUuid the user uuid of this item lost
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the lost date of this item lost.
	 *
	 * @return the lost date of this item lost
	 */
	public Date getLostDate();

	/**
	 * Sets the lost date of this item lost.
	 *
	 * @param LostDate the lost date of this item lost
	 */
	public void setLostDate(Date LostDate);

	/**
	 * Returns the lost location of this item lost.
	 *
	 * @return the lost location of this item lost
	 */
	@AutoEscape
	public String getLostLocation();

	/**
	 * Sets the lost location of this item lost.
	 *
	 * @param LostLocation the lost location of this item lost
	 */
	public void setLostLocation(String LostLocation);

	/**
	 * Returns the lost company of this item lost.
	 *
	 * @return the lost company of this item lost
	 */
	@AutoEscape
	public String getLostCompany();

	/**
	 * Sets the lost company of this item lost.
	 *
	 * @param LostCompany the lost company of this item lost
	 */
	public void setLostCompany(String LostCompany);

	/**
	 * Returns the lost color of this item lost.
	 *
	 * @return the lost color of this item lost
	 */
	@AutoEscape
	public String getLostColor();

	/**
	 * Sets the lost color of this item lost.
	 *
	 * @param LostColor the lost color of this item lost
	 */
	public void setLostColor(String LostColor);

	/**
	 * Returns the lost size of this item lost.
	 *
	 * @return the lost size of this item lost
	 */
	@AutoEscape
	public String getLostSize();

	/**
	 * Sets the lost size of this item lost.
	 *
	 * @param LostSize the lost size of this item lost
	 */
	public void setLostSize(String LostSize);

	/**
	 * Returns the lost type of this item lost.
	 *
	 * @return the lost type of this item lost
	 */
	@AutoEscape
	public String getLostType();

	/**
	 * Sets the lost type of this item lost.
	 *
	 * @param LostType the lost type of this item lost
	 */
	public void setLostType(String LostType);

	/**
	 * Returns the lost status of this item lost.
	 *
	 * @return the lost status of this item lost
	 */
	@AutoEscape
	public String getLostStatus();

	/**
	 * Sets the lost status of this item lost.
	 *
	 * @param LostStatus the lost status of this item lost
	 */
	public void setLostStatus(String LostStatus);

	/**
	 * Returns the lost desc of this item lost.
	 *
	 * @return the lost desc of this item lost
	 */
	@AutoEscape
	public String getLostDesc();

	/**
	 * Sets the lost desc of this item lost.
	 *
	 * @param LostDesc the lost desc of this item lost
	 */
	public void setLostDesc(String LostDesc);

	/**
	 * Returns the mime type of this item lost.
	 *
	 * @return the mime type of this item lost
	 */
	@AutoEscape
	public String getMimeType();

	/**
	 * Sets the mime type of this item lost.
	 *
	 * @param mimeType the mime type of this item lost
	 */
	public void setMimeType(String mimeType);

	/**
	 * Returns the blob data of this item lost.
	 *
	 * @return the blob data of this item lost
	 */
	public Blob getBlobData();

	/**
	 * Sets the blob data of this item lost.
	 *
	 * @param blobData the blob data of this item lost
	 */
	public void setBlobData(Blob blobData);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.Trylof.services.model.ItemLost itemLost);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.Trylof.services.model.ItemLost> toCacheModel();

	@Override
	public com.Trylof.services.model.ItemLost toEscapedModel();

	@Override
	public com.Trylof.services.model.ItemLost toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}