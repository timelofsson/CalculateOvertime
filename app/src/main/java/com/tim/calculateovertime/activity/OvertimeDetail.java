package com.tim.calculateovertime.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.tim.calculateovertime.R;
import com.tim.calculateovertime.calculations.OvertimeCalculations;
import com.tim.calculateovertime.calculations.OvertimeCalculationsImpl;
import com.tim.calculateovertime.repository.OvertimeRepository;
import com.tim.calculateovertime.repository.dataobjects.OverTimeInfo;
import com.tim.calculateovertime.repository.implementation.OvertimeRepositoryImpl;

/**
 * Overtime-Calculation-App
 * Created by Tim on 2015-02-05.
 */
public class OvertimeDetail extends ActionBarActivity {

    private OvertimeRepository overtimeRepository = new OvertimeRepositoryImpl();
    private OvertimeCalculations overtimeCalculations = new OvertimeCalculationsImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_overtime);
        String id = this.getIntent().getStringExtra("ID");

        Toast.makeText(this, id, Toast.LENGTH_LONG).show();
        OverTimeInfo overTimeInfo = overtimeRepository.OvertimeRepositoryImpl(id);


        /*Set from date*/
        final TextView fromDate = (TextView) findViewById(R.id.menuFrom);
        fromDate.setText(overTimeInfo.getFromDate().toString());
        final TextView tomDate = (TextView) findViewById(R.id.menueTom);
        tomDate.setText(overTimeInfo.getTomDate().toString());

        /*Set price per hour*/
        final TextView pricePerHour = (TextView) findViewById(R.id.textSekperH);
        pricePerHour.setText(String.valueOf(overTimeInfo.getPricePerHourEarly()));

        /*Set hours*/
        final TextView totalTime = (TextView) findViewById(R.id.textTotalTime);
        totalTime.setText(String.valueOf(overTimeInfo.getNumberOfHoursEarly()));

        /*Set before taxes*/
        final TextView beforeTaxes = (TextView) findViewById(R.id.textBeforeTaxes);
        beforeTaxes.setText(String.valueOf(
                overtimeCalculations.calculateBeforeTaxes(
                        overTimeInfo.getNumberOfHoursEarly(),
                        overTimeInfo.getPricePerHourEarly())));

        /*Set After taxes*/
        final TextView afterTaxes = (TextView) findViewById(R.id.textAfterTaxes);
        afterTaxes.setText(String.valueOf(
                overtimeCalculations.calculateOvertimeWithTaxes(
                        overTimeInfo.getTaxMultiplyer(),
                        overTimeInfo.getNumberOfHoursEarly(),
                        overTimeInfo.getPricePerHourEarly())));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_new, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.createNew) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
