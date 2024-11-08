/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.exception.NoSuchH7G5EntryException;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.SystemException;
import org.osgi.service.component.annotations.Component;

import java.util.Collection;
import java.util.List;


/**
 * @author Brian Wing Shun Chan
 */
 
@Component(
	property = "model.class.name=com.liferay.h7g5.model.H7G5Entry",
	service = AopService.class
)
public abstract class H7G5EntryLocalService extends H7G5EntryLocalServiceBaseImpl {

    public Collection<H7G5Entry> findH7G5EntriesByFolderId(long folderId) throws SystemException {
		return h7g5EntryPersistence.findByH7G5FolderId(folderId);
	}

	@Override
	public H7G5Entry getH7G5EntriesByHDN(long h7g5FolderId, String description, String name) throws NoSuchH7G5EntryException {
		return null;
	}

	@Override
	public H7G5Entry getH7G5EntriesByKey(String key) throws NoSuchH7G5EntryException {
		return null;
	}

	@Override
	public List<H7G5Entry> getH7G5EntriesByName(String name) {
		return null;
	}

	public H7G5Entry getH7G5EntryByKey(String key) throws SystemException, NoSuchH7G5EntryException {
		return h7g5EntryPersistence.findByKey(key);
	}

	public Collection<H7G5Entry> findH7G5EntriesByName(String name) {
		return h7g5EntryPersistence.findByName(name);
	}

	public H7G5Entry getH7G5EntryByHDN(long folderId, String description, String name)
			throws NoSuchH7G5EntryException {
		return h7g5EntryPersistence.findByH_D_N(folderId, description, name);
	}

}
	
	

/*
 *  // Inject the persistence layer or finder methods (assuming you have some persistence object or manager)
    private H7G5EntryPersistence h7g5EntryPersistence;

    // Constructor or setter-based dependency injection for h7g5EntryPersistence
    public H7G5EntryLocalServiceImpl(H7G5EntryPersistence h7g5EntryPersistence) {
        this.h7g5EntryPersistence = h7g5EntryPersistence;
    }

    // Getter method for finder by H7G5FolderId
    public List<H7G5Entry> getEntriesByH7G5FolderId(Long h7g5FolderId) {
        return h7g5EntryPersistence.findByH7G5FolderId(h7g5FolderId);  // Generated finder method
    }

    // Getter method for finder by Key
    public H7G5Entry getEntryByKey(String key) {
        return h7g5EntryPersistence.findByKey(key);  // Generated finder method
    }

    // Getter method for finder by Name
    public List<H7G5Entry> getEntriesByName(String name) {
        return h7g5EntryPersistence.findByName(name);  // Generated finder method
    }

    // Getter method for finder by H7G5FolderId, Description, and Name (H_D_N)
    public H7G5Entry getEntryByFolderIdDescriptionAndName(Long h7g5FolderId, String description, String name) {
        return h7g5EntryPersistence.findByFolderIdDescriptionAndName(h7g5FolderId, description, name);  // Generated finder method
 */