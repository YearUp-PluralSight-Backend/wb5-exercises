package com.pluralsight;

public abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;
    protected double speed;

    public Vehicle() {}

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;  // default speed is 0
    }

    public void start() {
        System.out.println("Vehicle starting...");
    }

    public void stop() {
        System.out.println("Vehicle stopping...");
        speed = 0;
    }

    public void accelerate(double increase) {
        speed += increase;
        System.out.println("Accelerating. New speed: " + speed + " mph");
    }

    public abstract void honk();


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
