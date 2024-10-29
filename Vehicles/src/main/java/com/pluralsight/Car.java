package com.pluralsight;

public class Car extends Vehicle{

    private int numberOfDoors;
    private boolean acOn;


    public Car() {
        super.year = 2000;
    }

    public Car(String make, String model, int year, int numberOfDoors) {

        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.acOn = false;

    }

    public void turnOnAC() {
        acOn = true;
        System.out.println("Air conditioning is now on.");
    }

    @Override
    public void honk() {
        System.out.println("Car horn: honk honk!");
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isAcOn() {
        return acOn;
    }

    public void setAcOn(boolean acOn) {
        this.acOn = acOn;
    }
}
