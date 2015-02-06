package com.tim.calculateovertime.calculations;

import junit.framework.TestCase;

public class OvertimeCalculationsImplTest extends TestCase {
    OvertimeCalculations overtimeCalculations = new OvertimeCalculationsImpl();

    public void testCalculateOvertimeWithTaxes() throws Exception {
        assertTrue(overtimeCalculations.calculateOvertimeWithTaxes(0.3,200,2) == 280);
    }

    public void testCalculateBeforeTaxes() throws Exception {

    }

    public void testTotalNumberOfHours() throws Exception {

    }
}