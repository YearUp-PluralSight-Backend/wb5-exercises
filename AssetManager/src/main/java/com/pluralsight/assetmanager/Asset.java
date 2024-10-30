package com.pluralsight.assetmanager;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// parents
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asset {

    private String description;
    private String dataAcquired;
    private double originalCost;


    public double getValue() {
        return originalCost;
    }

}
