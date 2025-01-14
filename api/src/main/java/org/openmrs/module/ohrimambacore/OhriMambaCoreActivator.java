/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * <p>
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.ohrimambacore;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class OhriMambaCoreActivator extends BaseModuleActivator {

    private static Log log = LogFactory.getLog(OhriMambaCoreActivator.class);

    public OhriMambaCoreActivator() {
        super();
    }

    /**
     * @see #started()
     */
    public void started() {
        System.out.println("Started MambaETL base Module");
    }

    /**
     * @see #shutdown()
     */

    public void shutdown() {
        System.out.println("Shutdown MambaETL base Module");
    }

    @Override
    public void stopped() {
        System.out.println("MambaETL base Module stopped");
        super.stopped();
    }

    @Override
    public void willRefreshContext() {
        System.out.println("MambaETL base Module willRefreshContext");
        super.willRefreshContext();
    }

    @Override
    public void willStart() {
        System.out.println("MambaETL base Module willStart");
        super.willStart();
    }

    @Override
    public void willStop() {
        System.out.println("MambaETL base Module willStop");
        super.willStop();
    }
}
