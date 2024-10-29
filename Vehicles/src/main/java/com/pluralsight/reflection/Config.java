package com.pluralsight.reflection;

import com.pluralsight.Car;
import com.pluralsight.Hovercraft;
import com.pluralsight.Moped;
import com.pluralsight.SemiTruck;

public class Config {


    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Moped moped() {
        return new Moped();
    }

    @Bean
    public SemiTruck semiTruck() {
        return new SemiTruck();
    }

    public Hovercraft hovercraft() {
        return new Hovercraft();
    }
}
