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
 * The Blob model class for lazy loading the blobData column in ItemFound.
 *
 * @author Utkarsh
 * @see ItemFound
 * @generated
 */
@ProviderType
public class ItemFoundBlobDataBlobModel {
	public ItemFoundBlobDataBlobModel() {
	}

	public ItemFoundBlobDataBlobModel(long itemFoundId) {
		_itemFoundId = itemFoundId;
	}

	public ItemFoundBlobDataBlobModel(long itemFoundId, Blob blobDataBlob) {
		_itemFoundId = itemFoundId;
		_blobDataBlob = blobDataBlob;
	}

	public long getItemFoundId() {
		return _itemFoundId;
	}

	public void setItemFoundId(long itemFoundId) {
		_itemFoundId = itemFoundId;
	}

	public Blob getBlobDataBlob() {
		return _blobDataBlob;
	}

	public void setBlobDataBlob(Blob blobDataBlob) {
		_blobDataBlob = blobDataBlob;
	}

	private long _itemFoundId;
	private Blob _blobDataBlob;
}