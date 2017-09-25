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

package com.Trylof.services.service.messaging;

import aQute.bnd.annotation.ProviderType;

import com.Trylof.services.service.ClpSerializer;
import com.Trylof.services.service.ItemFoundLocalServiceUtil;
import com.Trylof.services.service.ItemFoundServiceUtil;
import com.Trylof.services.service.ItemLostLocalServiceUtil;
import com.Trylof.services.service.ItemLostServiceUtil;
import com.Trylof.services.service.ItemVerificationLocalServiceUtil;
import com.Trylof.services.service.ItemVerificationServiceUtil;
import com.Trylof.services.service.SearchResLocalServiceUtil;
import com.Trylof.services.service.SearchResServiceUtil;
import com.Trylof.services.service.UserMasterLocalServiceUtil;
import com.Trylof.services.service.UserMasterServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author Utkarsh
 */
@ProviderType
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			ItemFoundLocalServiceUtil.clearService();

			ItemFoundServiceUtil.clearService();
			ItemLostLocalServiceUtil.clearService();

			ItemLostServiceUtil.clearService();
			ItemVerificationLocalServiceUtil.clearService();

			ItemVerificationServiceUtil.clearService();
			SearchResLocalServiceUtil.clearService();

			SearchResServiceUtil.clearService();
			UserMasterLocalServiceUtil.clearService();

			UserMasterServiceUtil.clearService();
		}
	}
}