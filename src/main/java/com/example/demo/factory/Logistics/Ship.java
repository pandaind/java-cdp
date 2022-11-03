package com.example.demo.factory.Logistics;

/**
 * Ship
 */
public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Package will be delivered by Ship!");
    }
}