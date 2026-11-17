package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        House house1 = new House("Large house",
                "2025-06-11",
                new BigDecimal("180000.00"),
                "1234, large st",
                2,
                1800,
                6000);
        System.out.println(house1.getValue());

        Vehicle vehicle1 = new Vehicle("newish",
                "2026-06-11",
                new BigDecimal("20000"),
                "Honda Accord",
                2024,
                10000);
        System.out.println(vehicle1.getValue());
    }
}
