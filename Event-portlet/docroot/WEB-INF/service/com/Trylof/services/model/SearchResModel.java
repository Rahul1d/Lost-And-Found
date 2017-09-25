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

import java.util.Date;

/**
 * The base model interface for the SearchRes service. Represents a row in the &quot;LofService_SearchRes&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.Trylof.services.model.impl.SearchResModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.Trylof.services.model.impl.SearchResImpl}.
 * </p>
 *
 * @author Utkarsh
 * @see SearchRes
 * @see com.Trylof.services.model.impl.SearchResImpl
 * @see com.Trylof.services.model.impl.SearchResModelImpl
 * @generated
 */
@ProviderType
public interface SearchResModel extends BaseModel<SearchRes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a search res model instance should use the {@link SearchRes} interface instead.
	 */

	/**
	 * Returns the primary key of this search res.
	 *
	 * @return the primary key of this search res
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this search res.
	 *
	 * @param primaryKey the primary key of this search res
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the search res ID of this search res.
	 *
	 * @return the search res ID of this search res
	 */
	public long getSearchResId();

	/**
	 * Sets the search res ID of this search res.
	 *
	 * @param searchResId the search res ID of this search res
	 */
	public void setSearchResId(long searchResId);

	/**
	 * Returns the user ID of this search res.
	 *
	 * @return the user ID of this search res
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this search res.
	 *
	 * @param userId the user ID of this search res
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this search res.
	 *
	 * @return the user uuid of this search res
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this search res.
	 *
	 * @param userUuid the user uuid of this search res
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the itemid of this search res.
	 *
	 * @return the itemid of this search res
	 */
	public long getItemid();

	/**
	 * Sets the itemid of this search res.
	 *
	 * @param itemid the itemid of this search res
	 */
	public void setItemid(long itemid);

	/**
	 * Returns the location of this search res.
	 *
	 * @return the location of this search res
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this search res.
	 *
	 * @param location the location of this search res
	 */
	public void setLocation(String location);

	/**
	 * Returns the color of this search res.
	 *
	 * @return the color of this search res
	 */
	@AutoEscape
	public String getColor();

	/**
	 * Sets the color of this search res.
	 *
	 * @param color the color of this search res
	 */
	public void setColor(String color);

	/**
	 * Returns the size of this search res.
	 *
	 * @return the size of this search res
	 */
	@AutoEscape
	public String getSize();

	/**
	 * Sets the size of this search res.
	 *
	 * @param size the size of this search res
	 */
	public void setSize(String size);

	/**
	 * Returns the desc of this search res.
	 *
	 * @return the desc of this search res
	 */
	@AutoEscape
	public String getDesc();

	/**
	 * Sets the desc of this search res.
	 *
	 * @param desc the desc of this search res
	 */
	public void setDesc(String desc);

	/**
	 * Returns the count of this search res.
	 *
	 * @return the count of this search res
	 */
	public int getCount();

	/**
	 * Sets the count of this search res.
	 *
	 * @param count the count of this search res
	 */
	public void setCount(int count);

	/**
	 * Returns the status of this search res.
	 *
	 * @return the status of this search res
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this search res.
	 *
	 * @param Status the status of this search res
	 */
	public void setStatus(String Status);

	/**
	 * Returns the date of this search res.
	 *
	 * @return the date of this search res
	 */
	public Date getDate();

	/**
	 * Sets the date of this search res.
	 *
	 * @param Date the date of this search res
	 */
	public void setDate(Date Date);

	/**
	 * Returns the company of this search res.
	 *
	 * @return the company of this search res
	 */
	@AutoEscape
	public String getCompany();

	/**
	 * Sets the company of this search res.
	 *
	 * @param Company the company of this search res
	 */
	public void setCompany(String Company);

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
	public int compareTo(com.Trylof.services.model.SearchRes searchRes);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.Trylof.services.model.SearchRes> toCacheModel();

	@Override
	public com.Trylof.services.model.SearchRes toEscapedModel();

	@Override
	public com.Trylof.services.model.SearchRes toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}