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

package com.Trylof.services.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.Trylof.services.exception.NoSuchItemVerificationException;
import com.Trylof.services.model.ItemVerification;
import com.Trylof.services.service.base.ItemVerificationLocalServiceBaseImpl;

/**
 * The implementation of the item verification local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.Trylof.services.service.ItemVerificationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Utkarsh
 * @see ItemVerificationLocalServiceBaseImpl
 * @see com.Trylof.services.service.ItemVerificationLocalServiceUtil
 */
@ProviderType
public class ItemVerificationLocalServiceImpl
	extends ItemVerificationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.Trylof.services.service.ItemVerificationLocalServiceUtil} to access the item verification local service.
	 */
	public ItemVerification getDetailsByStatusMatch (long lostid){
		//return itemLostPersistence.findByitemLostUserid(id);
		//return itemLostPersistence.findByItemStatusMatch(match);
		 try {
			return itemVerificationPersistence.findByLostItemIdMatch(lostid);
		} catch (NoSuchItemVerificationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	 }
	public List<ItemVerification> getDetailsByUser (long user,String Status){
		return itemVerificationPersistence.findByUserMatch(user,Status);
		//return null;
	 }
	
}