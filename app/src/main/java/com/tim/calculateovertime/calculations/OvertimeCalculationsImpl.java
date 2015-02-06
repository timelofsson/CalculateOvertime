package com.tim.calculateovertime.calculations;

/**
 * Overtime-Calculation-App
 * Created by Tim on 2015-02-06.
 */
public class OvertimeCalculationsImpl implements OvertimeCalculations {

    @Override
    public double calculateOvertimeWithTaxes(double taxes, double amount, double numberOfHours){
        return (1-taxes)*amount*numberOfHours;
    }

    @Override
    public double calculateBeforeTaxes(double amount, double numberOfHours){
        return amount*numberOfHours;
    }

    @Override
    public double totalNumberOfHours(double hours1, double hours2){
        return hours1+hours2;
    }
}
