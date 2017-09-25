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

import com.Trylof.services.exception.NoSuchItemLostException;
import com.Trylof.services.model.ItemLost;
import com.Trylof.services.service.base.ItemLostLocalServiceBaseImpl;

/**
 * The implementation of the item lost local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.Trylof.services.service.ItemLostLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Utkarsh
 * @see ItemLostLocalServiceBaseImpl
 * @see com.Trylof.services.service.ItemLostLocalServiceUtil
 */
@ProviderType
public class ItemLostLocalServiceImpl extends ItemLostLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.Trylof.services.service.ItemLostLocalServiceUtil} to access the item lost local service.
	 */
	 public ItemLost getdetails(long id) throws NoSuchItemLostException
	   {
		   return itemLostPersistence.findByPrimaryKey(id);
	   }
	 public List<ItemLost> getDetailsByUserid (long id){
		return itemLostPersistence.findByitemLostUserid(id);
		
		
	 }
	 
	 public List<ItemLost> getDetailsByStatusMatch (String match){
			//return itemLostPersistence.findByitemLostUserid(id);
			return itemLostPersistence.findByItemStatusMatch(match);
			
		 }
	 public List<ItemLost> getDetailsByStatusMatchAndUser (String match,long userid){
			//return itemLostPersistence.findByitemLostUserid(id);
			return itemLostPersistence.findByItemStstausAndUser(match, userid);
			
		 }

}