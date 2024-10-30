package com.pluralsight.assetmanager;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Consumer;
import java.util.function.Supplier;

// child
@Data
public class Home extends Asset{


    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;
    private Consumer<String> print = System.out::println;


    public Home() {
    }

    public Home(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public Home(String description, String dataAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dataAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double value = 0;

        try {
            switch (this.condition) {
                case 1 -> value = (180 * this.squareFoot);
                case 2 -> value = (130 * this.squareFoot);
                case 3 -> value = (90 * this.squareFoot);
                case 4 -> value = (80 * this.squareFoot);
                default -> System.out.println("Out of conditions");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            value += (this.lotSize * 0.25);
        }
        return value;


    }
}
