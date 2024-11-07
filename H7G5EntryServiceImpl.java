/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

 package com.liferay.h7g5.service.impl;

 import com.liferay.h7g5.service.base.H7G5EntryServiceBaseImpl;
 import com.liferay.portal.aop.AopService;
 import org.osgi.service.component.annotations.Component;
 import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.model.H7G5Folder;
import com.liferay.portal.kernel.exception.PortalException;
 import com.liferay.portal.kernel.model.User;
 import com.liferay.portal.kernel.security.auth.PrincipalException;
 import java.util.Objects;
 //import org.osgi.service.component.annotations.Component;
 import java.util.Collection;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=ohqiwtsfhl",
		"json.web.service.context.path=H7G5Entry"
	},
	service = AopService.class
)
public class H7G5EntryServiceImpl extends H7G5EntryServiceBaseImpl {

  /* Get By Folder Id Original Method 

    public Collection<H7G5Entry> getH7G5EntriesFoldersByIdWithPermissionCheckCollection(
 		long h7g5FolderId)
	throws PortalException {

	User user = getUser();

	if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
		throw new PrincipalException("You are not test@liferay.com");
	}
 
 	return h7g5EntryLocalService.getH7G5EntriesByFolderId(h7g5FolderId);
 }
  */

  public Collection<H7G5Entry> getH7G5EntriesByFolderIdUsingDynamicQuery(long folderId)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.getH7G5EntriesByFolderId(folderId);
	}

/* Get By Name Original Method 

 	public Collection<H7G5Entry> getH7G5EntriesByNameWithPermissionCheckCollection(
 			String name)
 		throws PortalException {

 		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
 			throw new PrincipalException("Your email doesnt correspond");
		}

 		return h7g5EntryLocalService.getH7G5EntriesByName(name);
 	}

	*/

	public Collection<H7G5Entry> getH7G5EntriesByNameWithDynamicQuery(String name)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.getH7G5EntriesByName(name);
	}

	/* Get By Key Original Method  

	  public H7G5Entry getH7g5EntriesByKeyWithPermissionCheck(
		String key)
 	throws PortalException {

	User user = getUser();

 	if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
		throw new PrincipalException("You are not test@liferay.com");
	}

 	return h7g5EntryLocalService.getH7G5EntriesByKey(key);
 }

	*/

	public H7G5Entry getH7G5EntryByKeyWithDynamicQuery(String key)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.getH7G5EntriesByKey(key);
	}

	/* Get By HDN Original Method 

	 	public H7G5Entry getH7G5EntriesByHDNWithPermissionCheck(long h7g5FolderId, String description, String name)
	throws PortalException {

		User user = getUser();

	if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
 		throw new PrincipalException("You are not test@liferay.com");
	}

 		return h7g5EntryLocalService.getH7G5EntriesByHDN(h7g5FolderId, name, description);

 	}

	@Override
	public H7G5Entry getH7g5EntriesByNameWithPermissionCheck(String name) throws PortalException {
		
		throw new UnsupportedOperationException("Unimplemented method 'getH7g5EntriesByNameWithPermissionCheck'");
	}

	@Override
	public H7G5Folder getH7g5EntriesFoldersByIdWithPermissionCheck(long h7g5FolderId) throws PortalException {
		
		throw new UnsupportedOperationException("Unimplemented method 'getH7g5EntriesFoldersByIdWithPermissionCheck'");
	}

}

	*/

	public H7G5Entry getH7G5EntryByHDNWithDynamicQuery(long folderId, String description, String name)
			throws PortalException {

		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}

		return h7g5EntryLocalService.getH7G5EntryByHDN(folderId, description, name);
	}

	/*@Override
	public H7G5Entry getH7G5EntriesByHDNWithPermissionCheck(long h7g5FolderId, String description, String name)
			throws PortalException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getH7G5EntriesByHDNWithPermissionCheck'");
	}

	@Override
	public H7G5Entry getH7g5EntriesByKeyWithPermissionCheck(String key) throws PortalException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getH7g5EntriesByKeyWithPermissionCheck'");
	}

	@Override
	public H7G5Entry getH7g5EntriesByNameWithPermissionCheck(String name) throws PortalException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getH7g5EntriesByNameWithPermissionCheck'");
	}

	@Override
	public Collection<H7G5Entry> getH7G5EntriesByNameWithPermissionCheckCollection(String name) throws PortalException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getH7G5EntriesByNameWithPermissionCheckCollection'");
	}

	@Override
	public H7G5Folder getH7g5EntriesFoldersByIdWithPermissionCheck(long h7g5FolderId) throws PortalException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getH7g5EntriesFoldersByIdWithPermissionCheck'");
	}

	@Override
	public Collection<H7G5Entry> getH7G5EntriesFoldersByIdWithPermissionCheckCollection(long h7g5FolderId)
			throws PortalException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getH7G5EntriesFoldersByIdWithPermissionCheckCollection'");
	} */

	}

 	
