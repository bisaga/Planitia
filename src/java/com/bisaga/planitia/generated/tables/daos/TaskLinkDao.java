/**
 * This class is generated by jOOQ
 */
package com.bisaga.planitia.generated.tables.daos;


import com.bisaga.planitia.generated.tables.TaskLink;
import com.bisaga.planitia.generated.tables.records.TaskLinkRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskLinkDao extends DAOImpl<TaskLinkRecord, com.bisaga.planitia.generated.tables.pojos.TaskLink, Integer> {

    /**
     * Create a new TaskLinkDao without any configuration
     */
    public TaskLinkDao() {
        super(TaskLink.TASK_LINK, com.bisaga.planitia.generated.tables.pojos.TaskLink.class);
    }

    /**
     * Create a new TaskLinkDao with an attached configuration
     */
    public TaskLinkDao(Configuration configuration) {
        super(TaskLink.TASK_LINK, com.bisaga.planitia.generated.tables.pojos.TaskLink.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.bisaga.planitia.generated.tables.pojos.TaskLink object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bisaga.planitia.generated.tables.pojos.TaskLink> fetchById(Integer... values) {
        return fetch(TaskLink.TASK_LINK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bisaga.planitia.generated.tables.pojos.TaskLink fetchOneById(Integer value) {
        return fetchOne(TaskLink.TASK_LINK.ID, value);
    }

    /**
     * Fetch records that have <code>task_id IN (values)</code>
     */
    public List<com.bisaga.planitia.generated.tables.pojos.TaskLink> fetchByTaskId(Integer... values) {
        return fetch(TaskLink.TASK_LINK.TASK_ID, values);
    }

    /**
     * Fetch records that have <code>subtask_id IN (values)</code>
     */
    public List<com.bisaga.planitia.generated.tables.pojos.TaskLink> fetchBySubtaskId(Integer... values) {
        return fetch(TaskLink.TASK_LINK.SUBTASK_ID, values);
    }
}