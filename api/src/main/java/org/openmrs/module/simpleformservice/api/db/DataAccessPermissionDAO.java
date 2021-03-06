/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.simpleformservice.api.db;

import org.hibernate.SessionFactory;
import org.openmrs.Patient;
import org.openmrs.Person;
import org.openmrs.User;
import org.openmrs.module.simpleformservice.DataAccessPermission;

import java.util.List;

public interface DataAccessPermissionDAO {

    /**
     * Set Hibernate session factory
     *
     * @param sessionFactory Hibernate session factory object
     */
    void setSessionFactory(SessionFactory sessionFactory);

    /**
     */
    DataAccessPermission getDataAccessPermission(String uuid);

    /**
     */
    DataAccessPermission saveDataAccessPermission(DataAccessPermission dataAccessPermission);

    /**
     */
    void deleteDataAccessPermission(DataAccessPermission dataAccessPermission);

    /**
     */
    List<DataAccessPermission> getAllDataAccessPermission();

    /**
     */
    List<DataAccessPermission> getDataAccessPermissionByGrantedToPerson(Person grantedToPerson);
    
    /**
     */
    DataAccessPermission getDataAccessPermission(Person accessToPerson, Person grantedToPerson, String encounterType, String permissionType);
}
