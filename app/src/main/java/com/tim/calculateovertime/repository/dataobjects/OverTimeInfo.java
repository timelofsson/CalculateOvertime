package com.tim.calculateovertime.repository.dataobjects;

import java.util.Date;

/**
 * Overtime-Calculation-App
 * Created by Tim on 2015-02-06.
 */
public class OverTimeInfo {
    private final Date fromDate;
    private final Date tomDate;
    private final double numberOfHoursEarly;
    private final double numberOfHoursLate;
    private final double pricePerHourEarly;
    private final double pricePerHourLate;
    private final double taxMultiplyer;

    public OverTimeInfo(Date fromDate, Date tomDate, double numberOfHoursEarly, double numberOfHoursLate, double pricePerHourEarly, double pricePerHourLate, double taxMultiplyer) {
        this.fromDate = fromDate;
        this.tomDate = tomDate;
        this.numberOfHoursEarly = numberOfHoursEarly;
        this.numberOfHoursLate = numberOfHoursLate;
        this.pricePerHourEarly = pricePerHourEarly;
        this.pricePerHourLate = pricePerHourLate;
        this.taxMultiplyer = taxMultiplyer;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getTomDate() {
        return tomDate;
    }

    public double getNumberOfHoursEarly() {
        return numberOfHoursEarly;
    }

    public double getNumberOfHoursLate() {
        return numberOfHoursLate;
    }

    public double getPricePerHourEarly() {
        return pricePerHourEarly;
    }

    public double getPricePerHourLate() {
        return pricePerHourLate;
    }

    public double getTaxMultiplyer() {
        return taxMultiplyer;
    }
}
