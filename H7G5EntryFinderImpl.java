package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.H7G5EntryLocalServiceUtil;
import com.liferay.h7g5.service.persistence.H7G5EntryPersistence;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import java.util.Collection;
@Component(service = H7G5EntryFinder.class)
public class H7G5EntryFinderImpl extends H7G5EntryFinderBaseImpl implements H7G5EntryFinder {
  public Collection<H7G5Entry> findByH7G5FolderId(long folderId) {

    Session session = null;
    try {
      session = openSession();

      ClassLoader classLoader = getClass().getClassLoader();

      DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader);
      entryQuery.add(RestrictionsFactoryUtil.eq("h7g5FolderId", folderId));
      entryQuery.setProjection(PropertyFactoryUtil.forName("h7g5FolderId"));

      List<H7G5Entry> entries = H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);

      return entries;
    } catch (Exception e) {
      try {
        throw new SystemException(e);
      } catch (SystemException se) {
        se.printStackTrace();
      }
    } finally {
      closeSession(session);
    }

    return null;

  }

  public H7G5Entry getByKey(String key) {

    Session session = null;
    try {
      session = openSession();

      ClassLoader classLoader = getClass().getClassLoader();

      DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
          .add(RestrictionsFactoryUtil.eq("key", key))
          .setProjection(ProjectionFactoryUtil.property("key"));

      H7G5Entry entries = (H7G5Entry) EventLocalServiceUtil.dynamicQuery(entryQuery);

      return entries;
    } catch (Exception e) {
      try {
        throw new SystemException(e);
      } catch (SystemException se) {
        se.printStackTrace();
      }
    } finally {
      closeSession(session);
    }

    return null;

  }

  public Collection<H7G5Entry> findByName(String name) {

    Session session = null;
    try {
      session = openSession();

      ClassLoader classLoader = getClass().getClassLoader();

      DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
          .add(RestrictionsFactoryUtil.eq("name", name))
          .setProjection(ProjectionFactoryUtil.property("name"));

      List<H7G5Entry> entries = EventLocalServiceUtil.dynamicQuery(entryQuery);

      return entries;
    } catch (Exception e) {
      try {
        throw new SystemException(e);
      } catch (SystemException se) {
        se.printStackTrace();
      }
    } finally {
      closeSession(session);
    }

    return null;

  }

  public H7G5Entry findByHDN(long folderId, String description, String name) {

    Session session = null;
    try {
      session = openSession();

      ClassLoader classLoader = getClass().getClassLoader();

      DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
          .add(RestrictionsFactoryUtil.eq("h7g5FolderId", folderId))
          .add(RestrictionsFactoryUtil.eq("description", description))
          .add(RestrictionsFactoryUtil.eq("name", name))
          .setProjection(ProjectionFactoryUtil.property("h7g5FolderId"))
          .setProjection(ProjectionFactoryUtil.property("description"))
          .setProjection(ProjectionFactoryUtil.property("name"));

      Collection<H7G5Entry> entries = EventLocalServiceUtil.dynamicQuery(entryQuery);

      return (H7G5Entry) entries;
    } catch (Exception e) {
      try {
        throw new SystemException(e);
      } catch (SystemException se) {
        se.printStackTrace();
      }
    } finally {
      closeSession(session);
    }

    return null;

  }
}