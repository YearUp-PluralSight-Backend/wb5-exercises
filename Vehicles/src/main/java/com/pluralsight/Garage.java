package com.pluralsight;

import com.pluralsight.reflection.Autowired;

public class Garage {

    private Car car;
    private SemiTruck semiTruck;


    public Garage() {
    }

    @Autowired
    public Garage(Car car, SemiTruck semiTruck) {
        this.car = car;
        this.semiTruck = semiTruck;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public SemiTruck getSemiTruck() {
        return semiTruck;
    }

    public void setSemiTruck(SemiTruck semiTruck) {
        this.semiTruck = semiTruck;
    }
}
