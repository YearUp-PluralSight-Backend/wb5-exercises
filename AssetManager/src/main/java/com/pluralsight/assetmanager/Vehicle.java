package com.pluralsight.assetmanager;

import java.time.LocalDate;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle() {
    }

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
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

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {

        double value = super.getOriginalCost();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - this.year;

        if (age >= 1 && age <= 3) {
            value *= Math.pow(0.97, age);
            /*
            //          value = value * Math.pw(base, exponent)
            Params:  a – the base.
                    b – the exponent.
            Returns:
                            the value a^b.
             */
        } else if (age >= 3 &&  age <= 6) {
            value *= Math.pow(0.94, age - 3) * Math.pow(0.97, 3);
        } else if (age >= 7 && age <= 10) {
            value *= Math.pow(0.92, age - 6) * Math.pow(0.94, 3) * Math.pow(0.97, 3);
        } else {
            value = 1000.0;
        }

        if (this.odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }

        return Math.round(value * 100.0) / 100.0;
    }
}
