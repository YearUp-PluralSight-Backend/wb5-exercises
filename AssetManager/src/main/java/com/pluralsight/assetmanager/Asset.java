package com.pluralsight.assetmanager;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// parents
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Asset {

    private String description;
    private String dataAcquired;
    private double originalCost;


    public abstract double getValue();

}
