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
 * The Blob model class for lazy loading the Image1 column in ItemVerification.
 *
 * @author Utkarsh
 * @see ItemVerification
 * @generated
 */
@ProviderType
public class ItemVerificationImage1BlobModel {
	public ItemVerificationImage1BlobModel() {
	}

	public ItemVerificationImage1BlobModel(long itemVerificationId) {
		_itemVerificationId = itemVerificationId;
	}

	public ItemVerificationImage1BlobModel(long itemVerificationId,
		Blob Image1Blob) {
		_itemVerificationId = itemVerificationId;
		_Image1Blob = Image1Blob;
	}

	public long getItemVerificationId() {
		return _itemVerificationId;
	}

	public void setItemVerificationId(long itemVerificationId) {
		_itemVerificationId = itemVerificationId;
	}

	public Blob getImage1Blob() {
		return _Image1Blob;
	}

	public void setImage1Blob(Blob Image1Blob) {
		_Image1Blob = Image1Blob;
	}

	private long _itemVerificationId;
	private Blob _Image1Blob;
}