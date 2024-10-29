package com.pluralsight;

public class VehicleTest {
    public static void main(String[] args) {
        // Testing Moped
        System.out.println("Testing Moped:");
        Moped moped = new Moped("Yamaha", "Zuma", 2022, true);
        moped.setMake("Honda");
        moped.setModel("Zoomer");
        moped.setYear(2021);
        moped.setHelmetRequired(false);
        moped.start();
        moped.accelerate(15);
        moped.honk();
        moped.doWheelie();
        moped.stop();
        System.out.println();

        // Testing Car
        System.out.println("Testing Car:");
        Car car = new Car("Toyota", "Camry", 2023, 4);
        car.setMake("Ford");
        car.setModel("Focus");
        car.setYear(2022);
        car.setNumberOfDoors(2);
        car.start();
        car.accelerate(60);
        car.turnOnAC();
        car.honk();
        car.stop();
        System.out.println();

        // Testing SemiTruck
        System.out.println("Testing SemiTruck:");
        SemiTruck semiTruck = new SemiTruck("Freightliner", "Cascadia", 2021, 20000);
        semiTruck.setMake("Volvo");
        semiTruck.setModel("VNL");
        semiTruck.setYear(2020);
        semiTruck.setCargoWeight(25000);
        semiTruck.start();
        semiTruck.accelerate(50);
        semiTruck.attachTrailer();
        semiTruck.honk();
        semiTruck.stop();
        System.out.println();

        // Testing Hovercraft
        System.out.println("Testing Hovercraft:");
        Hovercraft hovercraft = new Hovercraft("Neoteric", "Hovertrek", 2020, 10);
        hovercraft.setMake("Griffon");
        hovercraft.setModel("2000TD");
        hovercraft.setYear(2021);
        hovercraft.setHoverHeight(12);
        hovercraft.start();
        hovercraft.accelerate(25);
        hovercraft.hoverOverWater();
        hovercraft.honk();
        hovercraft.stop();
        System.out.println();

        System.out.println("All tests completed.");



        Vehicle car1 = new Car();
    }
}
