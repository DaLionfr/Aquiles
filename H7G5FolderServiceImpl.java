
/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.model.H7G5Folder;
import com.liferay.h7g5.service.base.H7G5FolderServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.model.User;

import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=ohqiwtsfhl",
		"json.web.service.context.path=H7G5Folder"
	},
	service = AopService.class
)
public class H7G5FolderServiceImpl extends H7G5FolderServiceBaseImpl {

	public H7G5Folder addMyCustomH7G5Folder(String description, String name) {
		System.out.println(
			"Invoking H7G5FolderServiceImpl#addMyCustomH7G5Folder(" +
				description + ", " + name + ")");
	
		H7G5Folder h7g5Folder = h7g5FolderLocalService.createH7G5Folder(
			System.currentTimeMillis());
	
		h7g5Folder.setDescription(description);
		h7g5Folder.setName(name);
	
		h7g5FolderLocalService.addH7G5Folder(h7g5Folder);
	
		return h7g5Folder;
	}

	public H7G5Folder addMyCustomH7G5FolderWithPermissionCheck(
		String description, String name)
	throws PortalException {

	/*long userId = PrincipalThreadLocal.getUserId();

	User user = UserLocalServiceUtil.getUserById(userId); */
	User user = getUser();

	if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
		throw new PrincipalException("You are not test@liferay.com");
	}

	return addMyCustomH7G5Folder(description, name);
}
	
}


/*public H7G5Folder addMyCustomH7G5Folder(String description, String name) {
	System.out.println(
		"Invoking H7G5FolderServiceImpl#addMyCustomH7G5Folder(" +
			description + ", " + name + ")");

	H7G5Folder h7g5Folder = h7g5FolderLocalService.createH7G5Folder(
		System.currentTimeMillis());

	h7g5Folder.setDescription(description);
	h7g5Folder.setName(name);

	h7g5FolderLocalService.addH7G5Folder(h7g5Folder);

	return h7g5Folder;
} */