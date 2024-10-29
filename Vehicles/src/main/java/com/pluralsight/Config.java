package com.pluralsight;

public class Config {


    public Car car() {
        return new Car();
    }

    public Moped moped() {
        return new Moped();
    }

    public SemiTruck semiTruck() {
        return new SemiTruck();
    }

    public Hovercraft hovercraft() {
        return new Hovercraft();
    }
}
