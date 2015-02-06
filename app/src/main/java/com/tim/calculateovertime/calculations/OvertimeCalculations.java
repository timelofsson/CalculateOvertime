package com.tim.calculateovertime.calculations;

/**
 * Overtime-Calculation-App
 * Created by Tim on 2015-02-06.
 */
public interface OvertimeCalculations {
    double calculateOvertimeWithTaxes(double taxes, double amount, double numberOfHours);

    double calculateBeforeTaxes(double amount, double numberOfHours);

    double totalNumberOfHours(double hours1, double hours2);
}
