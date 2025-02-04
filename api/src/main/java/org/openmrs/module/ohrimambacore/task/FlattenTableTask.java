package org.openmrs.module.ohrimambacore.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.ohrimambacore.api.FlattenDatabaseService;
import org.openmrs.scheduler.tasks.AbstractTask;

/**
 * @author smallGod
 * date: 26/10/2023
 */
public class FlattenTableTask extends AbstractTask {

    private static Log log = LogFactory.getLog(FlattenTableTask.class);

    @Override
    public void execute() {

        System.out.println("MambaETL FlattenTableTask starting to execute...");
        log.info("MambaETL FlattenTableTask starting to execute!..");

        if (!isExecuting) {

            System.out.println("MambaETL DB FlattenTableTask running...");
            startExecuting();

            try {
                getService().flattenDatabase();
            } catch (Exception e) {
                System.err.println("Error while running MambaETL FlattenTableTask: " + e.getMessage());
                e.printStackTrace();
            } finally {
                stopExecuting();
                System.out.println("MambaETL FlattenTableTask completed & stopped...");
            }
        } else {
            System.err.println("Warning, an instance of MambaETL Flattening Task is still running, try again after");
        }
    }

    private FlattenDatabaseService getService() {
        return Context.getService(FlattenDatabaseService.class);
    }
}
