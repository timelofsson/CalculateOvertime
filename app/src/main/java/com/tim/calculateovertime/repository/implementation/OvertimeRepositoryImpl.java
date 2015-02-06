package com.tim.calculateovertime.repository.implementation;

import android.widget.Toast;

import com.tim.calculateovertime.repository.OvertimeRepository;
import com.tim.calculateovertime.repository.dataobjects.OverTimeInfo;

import java.util.Date;

/**
 * Overtime-Calculation-App
 * Created by Tim on 2015-02-06.
 */
public class OvertimeRepositoryImpl implements OvertimeRepository{

    @Override
    public OverTimeInfo OvertimeRepositoryImpl(String ID){
        return new OverTimeInfo(new Date(), new Date(), 2, 3, 274, 350, 0.3);
    }
}
