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
 * The Blob model class for lazy loading the Image2 column in ItemVerification.
 *
 * @author Utkarsh
 * @see ItemVerification
 * @generated
 */
@ProviderType
public class ItemVerificationImage2BlobModel {
	public ItemVerificationImage2BlobModel() {
	}

	public ItemVerificationImage2BlobModel(long itemVerificationId) {
		_itemVerificationId = itemVerificationId;
	}

	public ItemVerificationImage2BlobModel(long itemVerificationId,
		Blob Image2Blob) {
		_itemVerificationId = itemVerificationId;
		_Image2Blob = Image2Blob;
	}

	public long getItemVerificationId() {
		return _itemVerificationId;
	}

	public void setItemVerificationId(long itemVerificationId) {
		_itemVerificationId = itemVerificationId;
	}

	public Blob getImage2Blob() {
		return _Image2Blob;
	}

	public void setImage2Blob(Blob Image2Blob) {
		_Image2Blob = Image2Blob;
	}

	private long _itemVerificationId;
	private Blob _Image2Blob;
}