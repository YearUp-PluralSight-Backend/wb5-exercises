package com.pluralsight;

public class Moped extends Vehicle{


    private boolean helmetRequired;

    public Moped() {}

    public Moped(String make, String model, int year, boolean helmetRequired) {
        super(make, model, year);
        this.helmetRequired = helmetRequired;
    }

    // Moped-specific method
    public void doWheelie() {
        System.out.println("Doing a wheelie!");
    }

    public boolean isHelmetRequired() {
        return helmetRequired;
    }

    public void setHelmetRequired(boolean helmetRequired) {
        this.helmetRequired = helmetRequired;
    }

    @Override
    public void honk() {
        System.out.println("Moped horn: beep beep!");
    }
}
