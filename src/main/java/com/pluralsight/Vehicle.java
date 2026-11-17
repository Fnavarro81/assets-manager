package com.pluralsight;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private double odometer;


    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, double odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        if (age > 10) {
            return new BigDecimal("1000.00");
        }

        double depreciationPercent = 0.0;

        if (age <= 3) {
            depreciationPercent = age * 0.03;
        } else if (age <= 6) {
            depreciationPercent = (3 * 0.03) + ((age - 3) * 0.06);
        } else {
            depreciationPercent = (3 * 0.03) + (3 * 0.06) + ((age - 6) * 0.08);
        }

        if (depreciationPercent > 1.0) {
            depreciationPercent = 1.0;
        }

        BigDecimal multiplier = BigDecimal.valueOf(1.0 - depreciationPercent);
        return getOriginalCost().multiply(multiplier);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }
}
