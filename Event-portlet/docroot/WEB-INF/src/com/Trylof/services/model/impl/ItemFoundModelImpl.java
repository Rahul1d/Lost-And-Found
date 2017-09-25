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

package com.Trylof.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.Trylof.services.model.ItemFound;
import com.Trylof.services.model.ItemFoundBlobDataBlobModel;
import com.Trylof.services.model.ItemFoundModel;
import com.Trylof.services.model.ItemFoundSoap;
import com.Trylof.services.service.ItemFoundLocalServiceUtil;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ItemFound service. Represents a row in the &quot;LofService_ItemFound&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ItemFoundModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ItemFoundImpl}.
 * </p>
 *
 * @author Utkarsh
 * @see ItemFoundImpl
 * @see ItemFound
 * @see ItemFoundModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class ItemFoundModelImpl extends BaseModelImpl<ItemFound>
	implements ItemFoundModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a item found model instance should use the {@link ItemFound} interface instead.
	 */
	public static final String TABLE_NAME = "LofService_ItemFound";
	public static final Object[][] TABLE_COLUMNS = {
			{ "itemFoundId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "FoundDate", Types.TIMESTAMP },
			{ "FoundLocation", Types.VARCHAR },
			{ "FoundCompany", Types.VARCHAR },
			{ "FoundColor", Types.VARCHAR },
			{ "FoundSize", Types.VARCHAR },
			{ "FoundType", Types.VARCHAR },
			{ "FoundStatus", Types.VARCHAR },
			{ "FoundDesc", Types.VARCHAR },
			{ "LostItem", Types.BIGINT },
			{ "mimeType", Types.VARCHAR },
			{ "blobData", Types.BLOB }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("itemFoundId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("FoundDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("FoundLocation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("FoundCompany", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("FoundColor", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("FoundSize", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("FoundType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("FoundStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("FoundDesc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("LostItem", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("mimeType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("blobData", Types.BLOB);
	}

	public static final String TABLE_SQL_CREATE = "create table LofService_ItemFound (itemFoundId LONG not null primary key,userId LONG,FoundDate DATE null,FoundLocation VARCHAR(75) null,FoundCompany VARCHAR(75) null,FoundColor VARCHAR(75) null,FoundSize VARCHAR(75) null,FoundType VARCHAR(75) null,FoundStatus VARCHAR(75) null,FoundDesc VARCHAR(500) null,LostItem LONG,mimeType VARCHAR(75) null,blobData BLOB)";
	public static final String TABLE_SQL_DROP = "drop table LofService_ItemFound";
	public static final String ORDER_BY_JPQL = " ORDER BY itemFound.itemFoundId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LofService_ItemFound.itemFoundId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.Trylof.services.model.ItemFound"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.Trylof.services.model.ItemFound"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.Trylof.services.model.ItemFound"),
			true);
	public static final long FOUNDTYPE_COLUMN_BITMASK = 1L;
	public static final long ITEMFOUNDID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ItemFound toModel(ItemFoundSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ItemFound model = new ItemFoundImpl();

		model.setItemFoundId(soapModel.getItemFoundId());
		model.setUserId(soapModel.getUserId());
		model.setFoundDate(soapModel.getFoundDate());
		model.setFoundLocation(soapModel.getFoundLocation());
		model.setFoundCompany(soapModel.getFoundCompany());
		model.setFoundColor(soapModel.getFoundColor());
		model.setFoundSize(soapModel.getFoundSize());
		model.setFoundType(soapModel.getFoundType());
		model.setFoundStatus(soapModel.getFoundStatus());
		model.setFoundDesc(soapModel.getFoundDesc());
		model.setLostItem(soapModel.getLostItem());
		model.setMimeType(soapModel.getMimeType());
		model.setBlobData(soapModel.getBlobData());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ItemFound> toModels(ItemFoundSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ItemFound> models = new ArrayList<ItemFound>(soapModels.length);

		for (ItemFoundSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.Trylof.services.model.ItemFound"));

	public ItemFoundModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _itemFoundId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemFoundId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemFoundId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public long getItemFoundId() {
		return _itemFoundId;
	}

	@Override
	public void setItemFoundId(long itemFoundId) {
		_itemFoundId = itemFoundId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public Date getFoundDate() {
		return _FoundDate;
	}

	@Override
	public void setFoundDate(Date FoundDate) {
		_FoundDate = FoundDate;
	}

	@JSON
	@Override
	public String getFoundLocation() {
		if (_FoundLocation == null) {
			return StringPool.BLANK;
		}
		else {
			return _FoundLocation;
		}
	}

	@Override
	public void setFoundLocation(String FoundLocation) {
		_FoundLocation = FoundLocation;
	}

	@JSON
	@Override
	public String getFoundCompany() {
		if (_FoundCompany == null) {
			return StringPool.BLANK;
		}
		else {
			return _FoundCompany;
		}
	}

	@Override
	public void setFoundCompany(String FoundCompany) {
		_FoundCompany = FoundCompany;
	}

	@JSON
	@Override
	public String getFoundColor() {
		if (_FoundColor == null) {
			return StringPool.BLANK;
		}
		else {
			return _FoundColor;
		}
	}

	@Override
	public void setFoundColor(String FoundColor) {
		_FoundColor = FoundColor;
	}

	@JSON
	@Override
	public String getFoundSize() {
		if (_FoundSize == null) {
			return StringPool.BLANK;
		}
		else {
			return _FoundSize;
		}
	}

	@Override
	public void setFoundSize(String FoundSize) {
		_FoundSize = FoundSize;
	}

	@JSON
	@Override
	public String getFoundType() {
		if (_FoundType == null) {
			return StringPool.BLANK;
		}
		else {
			return _FoundType;
		}
	}

	@Override
	public void setFoundType(String FoundType) {
		_columnBitmask |= FOUNDTYPE_COLUMN_BITMASK;

		if (_originalFoundType == null) {
			_originalFoundType = _FoundType;
		}

		_FoundType = FoundType;
	}

	public String getOriginalFoundType() {
		return GetterUtil.getString(_originalFoundType);
	}

	@JSON
	@Override
	public String getFoundStatus() {
		if (_FoundStatus == null) {
			return StringPool.BLANK;
		}
		else {
			return _FoundStatus;
		}
	}

	@Override
	public void setFoundStatus(String FoundStatus) {
		_FoundStatus = FoundStatus;
	}

	@JSON
	@Override
	public String getFoundDesc() {
		if (_FoundDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _FoundDesc;
		}
	}

	@Override
	public void setFoundDesc(String FoundDesc) {
		_FoundDesc = FoundDesc;
	}

	@JSON
	@Override
	public long getLostItem() {
		return _LostItem;
	}

	@Override
	public void setLostItem(long LostItem) {
		_LostItem = LostItem;
	}

	@JSON
	@Override
	public String getMimeType() {
		if (_mimeType == null) {
			return StringPool.BLANK;
		}
		else {
			return _mimeType;
		}
	}

	@Override
	public void setMimeType(String mimeType) {
		_mimeType = mimeType;
	}

	@JSON
	@Override
	public Blob getBlobData() {
		if (_blobDataBlobModel == null) {
			try {
				_blobDataBlobModel = ItemFoundLocalServiceUtil.getBlobDataBlobModel(getPrimaryKey());
			}
			catch (Exception e) {
			}
		}

		Blob blob = null;

		if (_blobDataBlobModel != null) {
			blob = _blobDataBlobModel.getBlobDataBlob();
		}

		return blob;
	}

	@Override
	public void setBlobData(Blob blobData) {
		if (_blobDataBlobModel == null) {
			_blobDataBlobModel = new ItemFoundBlobDataBlobModel(getPrimaryKey(),
					blobData);
		}
		else {
			_blobDataBlobModel.setBlobDataBlob(blobData);
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ItemFound.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ItemFound toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ItemFound)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ItemFoundImpl itemFoundImpl = new ItemFoundImpl();

		itemFoundImpl.setItemFoundId(getItemFoundId());
		itemFoundImpl.setUserId(getUserId());
		itemFoundImpl.setFoundDate(getFoundDate());
		itemFoundImpl.setFoundLocation(getFoundLocation());
		itemFoundImpl.setFoundCompany(getFoundCompany());
		itemFoundImpl.setFoundColor(getFoundColor());
		itemFoundImpl.setFoundSize(getFoundSize());
		itemFoundImpl.setFoundType(getFoundType());
		itemFoundImpl.setFoundStatus(getFoundStatus());
		itemFoundImpl.setFoundDesc(getFoundDesc());
		itemFoundImpl.setLostItem(getLostItem());
		itemFoundImpl.setMimeType(getMimeType());

		itemFoundImpl.resetOriginalValues();

		return itemFoundImpl;
	}

	@Override
	public int compareTo(ItemFound itemFound) {
		long primaryKey = itemFound.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemFound)) {
			return false;
		}

		ItemFound itemFound = (ItemFound)obj;

		long primaryKey = itemFound.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ItemFoundModelImpl itemFoundModelImpl = this;

		itemFoundModelImpl._originalFoundType = itemFoundModelImpl._FoundType;

		itemFoundModelImpl._blobDataBlobModel = null;

		itemFoundModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ItemFound> toCacheModel() {
		ItemFoundCacheModel itemFoundCacheModel = new ItemFoundCacheModel();

		itemFoundCacheModel.itemFoundId = getItemFoundId();

		itemFoundCacheModel.userId = getUserId();

		Date FoundDate = getFoundDate();

		if (FoundDate != null) {
			itemFoundCacheModel.FoundDate = FoundDate.getTime();
		}
		else {
			itemFoundCacheModel.FoundDate = Long.MIN_VALUE;
		}

		itemFoundCacheModel.FoundLocation = getFoundLocation();

		String FoundLocation = itemFoundCacheModel.FoundLocation;

		if ((FoundLocation != null) && (FoundLocation.length() == 0)) {
			itemFoundCacheModel.FoundLocation = null;
		}

		itemFoundCacheModel.FoundCompany = getFoundCompany();

		String FoundCompany = itemFoundCacheModel.FoundCompany;

		if ((FoundCompany != null) && (FoundCompany.length() == 0)) {
			itemFoundCacheModel.FoundCompany = null;
		}

		itemFoundCacheModel.FoundColor = getFoundColor();

		String FoundColor = itemFoundCacheModel.FoundColor;

		if ((FoundColor != null) && (FoundColor.length() == 0)) {
			itemFoundCacheModel.FoundColor = null;
		}

		itemFoundCacheModel.FoundSize = getFoundSize();

		String FoundSize = itemFoundCacheModel.FoundSize;

		if ((FoundSize != null) && (FoundSize.length() == 0)) {
			itemFoundCacheModel.FoundSize = null;
		}

		itemFoundCacheModel.FoundType = getFoundType();

		String FoundType = itemFoundCacheModel.FoundType;

		if ((FoundType != null) && (FoundType.length() == 0)) {
			itemFoundCacheModel.FoundType = null;
		}

		itemFoundCacheModel.FoundStatus = getFoundStatus();

		String FoundStatus = itemFoundCacheModel.FoundStatus;

		if ((FoundStatus != null) && (FoundStatus.length() == 0)) {
			itemFoundCacheModel.FoundStatus = null;
		}

		itemFoundCacheModel.FoundDesc = getFoundDesc();

		String FoundDesc = itemFoundCacheModel.FoundDesc;

		if ((FoundDesc != null) && (FoundDesc.length() == 0)) {
			itemFoundCacheModel.FoundDesc = null;
		}

		itemFoundCacheModel.LostItem = getLostItem();

		itemFoundCacheModel.mimeType = getMimeType();

		String mimeType = itemFoundCacheModel.mimeType;

		if ((mimeType != null) && (mimeType.length() == 0)) {
			itemFoundCacheModel.mimeType = null;
		}

		return itemFoundCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{itemFoundId=");
		sb.append(getItemFoundId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", FoundDate=");
		sb.append(getFoundDate());
		sb.append(", FoundLocation=");
		sb.append(getFoundLocation());
		sb.append(", FoundCompany=");
		sb.append(getFoundCompany());
		sb.append(", FoundColor=");
		sb.append(getFoundColor());
		sb.append(", FoundSize=");
		sb.append(getFoundSize());
		sb.append(", FoundType=");
		sb.append(getFoundType());
		sb.append(", FoundStatus=");
		sb.append(getFoundStatus());
		sb.append(", FoundDesc=");
		sb.append(getFoundDesc());
		sb.append(", LostItem=");
		sb.append(getLostItem());
		sb.append(", mimeType=");
		sb.append(getMimeType());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.Trylof.services.model.ItemFound");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemFoundId</column-name><column-value><![CDATA[");
		sb.append(getItemFoundId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundDate</column-name><column-value><![CDATA[");
		sb.append(getFoundDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundLocation</column-name><column-value><![CDATA[");
		sb.append(getFoundLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundCompany</column-name><column-value><![CDATA[");
		sb.append(getFoundCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundColor</column-name><column-value><![CDATA[");
		sb.append(getFoundColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundSize</column-name><column-value><![CDATA[");
		sb.append(getFoundSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundType</column-name><column-value><![CDATA[");
		sb.append(getFoundType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundStatus</column-name><column-value><![CDATA[");
		sb.append(getFoundStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>FoundDesc</column-name><column-value><![CDATA[");
		sb.append(getFoundDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LostItem</column-name><column-value><![CDATA[");
		sb.append(getLostItem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mimeType</column-name><column-value><![CDATA[");
		sb.append(getMimeType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ItemFound.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ItemFound.class
		};
	private long _itemFoundId;
	private long _userId;
	private Date _FoundDate;
	private String _FoundLocation;
	private String _FoundCompany;
	private String _FoundColor;
	private String _FoundSize;
	private String _FoundType;
	private String _originalFoundType;
	private String _FoundStatus;
	private String _FoundDesc;
	private long _LostItem;
	private String _mimeType;
	private ItemFoundBlobDataBlobModel _blobDataBlobModel;
	private long _columnBitmask;
	private ItemFound _escapedModel;
}