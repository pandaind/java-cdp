package com.example.demo.factory.Logistics;

/**
 * RoadLogistics
 */
public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}