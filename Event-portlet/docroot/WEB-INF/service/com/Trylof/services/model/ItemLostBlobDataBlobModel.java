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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the blobData column in ItemLost.
 *
 * @author Utkarsh
 * @see ItemLost
 * @generated
 */
@ProviderType
public class ItemLostBlobDataBlobModel {
	public ItemLostBlobDataBlobModel() {
	}

	public ItemLostBlobDataBlobModel(long itemLostId) {
		_itemLostId = itemLostId;
	}

	public ItemLostBlobDataBlobModel(long itemLostId, Blob blobDataBlob) {
		_itemLostId = itemLostId;
		_blobDataBlob = blobDataBlob;
	}

	public long getItemLostId() {
		return _itemLostId;
	}

	public void setItemLostId(long itemLostId) {
		_itemLostId = itemLostId;
	}

	public Blob getBlobDataBlob() {
		return _blobDataBlob;
	}

	public void setBlobDataBlob(Blob blobDataBlob) {
		_blobDataBlob = blobDataBlob;
	}

	private long _itemLostId;
	private Blob _blobDataBlob;
}