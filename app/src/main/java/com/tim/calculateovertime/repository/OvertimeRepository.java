package com.tim.calculateovertime.repository;

import com.tim.calculateovertime.repository.dataobjects.OverTimeInfo;

/**
 * Overtime-Calculation-App
 * Created by Tim on 2015-02-06.
 */
public interface OvertimeRepository {
    /**
     * Used to get the Data-object from repository, might be file or database later. For now its a hardcoded return
     */
    OverTimeInfo OvertimeRepositoryImpl(String ID);
}
