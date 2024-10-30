package com.pluralsight.assetmanager;

import java.util.ArrayList;
import java.util.List;

public class AssetManager {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota Sedan", "2021-01-15", 22000.00, "Toyota Camry", 5, 35000);
        Vehicle vehicle2 = new Vehicle("Compact Car", "2022-05-10", 25000.00, "Honda Civic", 9, 15000);

        Home home1 = new Home("Family Home", "2020-03-21", 300000.00, "123 Maple Street", 2, 1500, 5000);
        Home home2 = new Home("Vacation Cabin", "2018-08-12", 250000.00, "456 Oak Avenue", 3, 2000, 4000);

        List<Asset> assets = new ArrayList<>();
        assets.add(vehicle1);
        assets.add(vehicle2);
        assets.add(home1);
        assets.add(home2);

        for (Asset asset : assets) {
            System.out.println("Asset Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDataAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());

            if (asset instanceof Vehicle vehicle) {
                System.out.println("Make & Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Odometer: " + vehicle.getOdometer());
            } else if (asset instanceof Home home) {
                System.out.println("Address: " + home.getAddress());
                System.out.println("Condition: " + home.getCondition());
                System.out.println("Square Footage: " + home.getSquareFoot());
                System.out.println("Lot Size: " + home.getLotSize());
            }

            System.out.println("Calculated Value: $" + asset.getValue());
            System.out.println("--------------------------------------------------");
        }
    }
}