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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ItemLost service. Represents a row in the &quot;LofService_ItemLost&quot; database table, with each column mapped to a property of this class.
 *
 * @author Utkarsh
 * @see ItemLostModel
 * @see com.Trylof.services.model.impl.ItemLostImpl
 * @see com.Trylof.services.model.impl.ItemLostModelImpl
 * @generated
 */
@ImplementationClassName("com.Trylof.services.model.impl.ItemLostImpl")
@ProviderType
public interface ItemLost extends ItemLostModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.Trylof.services.model.impl.ItemLostImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ItemLost, Long> ITEM_LOST_ID_ACCESSOR = new Accessor<ItemLost, Long>() {
			@Override
			public Long get(ItemLost itemLost) {
				return itemLost.getItemLostId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ItemLost> getTypeClass() {
				return ItemLost.class;
			}
		};
}