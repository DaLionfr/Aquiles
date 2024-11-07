/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.exception.NoSuchH7G5EntryException;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.h7g5.model.H7G5Entry",
	service = AopService.class
)
public class H7G5EntryLocalServiceImpl extends H7G5EntryLocalServiceBaseImpl {

	  public List<H7G5Entry> getH7G5EntriesByFolderId(long h7g5FolderId) {

		System.out.println("Invoking H7G5EntryLocalServiceImpl#getH7G5EntriesByFolderId(" + h7g5FolderId + ")");

		return h7g5EntryPersistence.findByH7G5FolderId(h7g5FolderId);
	}
	

	// 	<finder name="Key" return-type="H7G5Entry">
	// 		<finder-column name="key" />
	// 	</finder>
	
	public H7G5Entry getH7G5EntriesByKey(String key) throws NoSuchH7G5EntryException {

		System.out.println("Invoking H7G5EntryLocalServiceImpl#getH7G5EntriesByKey(" +
		key + ")");

		return h7g5EntryPersistence.findByKey(key);

	}

	// 	<finder name="Name" return-type="Collection">
	// 		<finder-column name="name" />
	// 	</finder>

	public List<H7G5Entry> getH7G5EntriesByName(String name){

		System.out.println("Invoking H7G5EntryLocalServiceImpl#getH7G5EntriesByName(" +
		name + ")");

		return h7g5EntryPersistence.findByName(name);

	}

	// 	<finder name="H_D_N" return-type="H7G5Entry">
	// 		<finder-column name="h7g5FolderId" />
	// 		<finder-column name="description" />
	// 		<finder-column name="name" />
	// 	</finder>

	public H7G5Entry getH7G5EntriesByHDN(long h7g5FolderId, String description, String name) throws NoSuchH7G5EntryException {
		
		System.out.println("Invoking H7G5EntryLocalServiceImpl#getH7G5EntriesByHDN(" +
		h7g5FolderId + " - " + description + " - " +  name + ")");
	
		return h7g5EntryPersistence.findByH_D_N(h7g5FolderId, description, name);

	}

	public static List<H7G5Entry> getH7G5FolderId(long h7g5FolderId) {
		
		throw new UnsupportedOperationException("Unimplemented method 'getH7G5FolderId'");
	}
}