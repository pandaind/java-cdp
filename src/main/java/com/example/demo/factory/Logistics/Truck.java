package com.example.demo.factory.Logistics;

/**
 * Truck
 */
public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Package will be delivered by Truck!");
    }
}