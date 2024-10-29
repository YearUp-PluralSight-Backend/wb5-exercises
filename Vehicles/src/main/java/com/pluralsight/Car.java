package com.pluralsight;

public class Car extends Vehicle{

    private int numberOfDoors;
    private boolean acOn;

    public Car() {}

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.acOn = false;
    }

    // Car-specific method
    public void turnOnAC() {
        acOn = true;
        System.out.println("Air conditioning is now on.");
    }

    @Override
    public void honk() {
        System.out.println("Car horn: honk honk!");
    }
}
