package com.tim.calculateovertime.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import com.tim.calculateovertime.R;

/**
 * Overtime-Calculation-App
 * Created by Tim on 2015-02-05.
 */
public class createNewOvertime extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_overtime);
    }
}
