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
 * The extended model interface for the UserMaster service. Represents a row in the &quot;LofService_UserMaster&quot; database table, with each column mapped to a property of this class.
 *
 * @author Utkarsh
 * @see UserMasterModel
 * @see com.Trylof.services.model.impl.UserMasterImpl
 * @see com.Trylof.services.model.impl.UserMasterModelImpl
 * @generated
 */
@ImplementationClassName("com.Trylof.services.model.impl.UserMasterImpl")
@ProviderType
public interface UserMaster extends UserMasterModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.Trylof.services.model.impl.UserMasterImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<UserMaster, Long> USER_MASTER_ID_ACCESSOR = new Accessor<UserMaster, Long>() {
			@Override
			public Long get(UserMaster userMaster) {
				return userMaster.getUserMasterId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UserMaster> getTypeClass() {
				return UserMaster.class;
			}
		};
}