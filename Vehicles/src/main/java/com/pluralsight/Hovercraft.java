package com.pluralsight;

public class Hovercraft extends Vehicle{

    private double hoverHeight; // hover height in inches

    public Hovercraft() {}
    public Hovercraft(String make, String model, int year, double hoverHeight) {
        super(make, model, year);
        this.hoverHeight = hoverHeight;
    }

    // Hovercraft-specific method
    public void hoverOverWater() {
        System.out.println("Hovercraft is hovering over water at " + hoverHeight + " inches.");
    }

    @Override
    public void honk() {
        System.out.println("Hovercraft horn: honk honk!");
    }
}
