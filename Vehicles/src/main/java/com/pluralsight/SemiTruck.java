package com.pluralsight;

public class SemiTruck extends Vehicle{


    private double cargoWeight;
    private boolean trailerAttached;

    public SemiTruck() {}

    public SemiTruck(String make, String model, int year, double cargoWeight) {
        super(make, model, year);
        this.cargoWeight = cargoWeight;
        this.trailerAttached = false;
    }

    public void attachTrailer() {
        trailerAttached = true;
        System.out.println("Trailer attached.");
    }

    @Override
    public void honk() {
        System.out.println("SemiTruck horn: honnnnnk!");
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }
}
