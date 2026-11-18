package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assetList = new ArrayList<>();

        assetList.add(new House("Large house",
                "2025-06-11",
                new BigDecimal("180000.00"),
                "1234, large st",
                2,
                1800,
                6000));

        assetList.add(new House("Vacation cabin",
                "2022-08-10",
                new BigDecimal("145000.00"),
                "456 Lake Rd",
                1, // Condition: Excellent
                1200.0,
                8000.0));

        assetList.add(new Vehicle("New car",
                "2026-06-11",
                new BigDecimal("20000"),
                "Honda Accord",
                2024,
                10000));

        assetList.add(new Vehicle("Daily commuter",
                "2021-01-10",
                new BigDecimal("23000.00"),
                "Toyota Corolla",
                2021,
                45000.0));

        assetList.add(new Cash("Apocalypse reserves", new BigDecimal("10000.00")));

        for (Asset asset : assetList) {
            System.out.println("Description   : " + asset.getDescription());
            System.out.println("Date Acquired : " + asset.getDateAcquired());
            System.out.println("What Paid     : $" + asset.getOriginalCost());
            System.out.println("Current Value : $" + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address       : " + house.getAddress());
            }
            else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle       : " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }
            else if (asset instanceof Cash) {
            System.out.println("Category      : Cash");
            }
            System.out.println("------------------------------------------");
        }



    }

}
