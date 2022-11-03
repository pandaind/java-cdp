package com.example.demo.factory;

import com.example.demo.factory.Logistics.Logistics;
import com.example.demo.factory.Logistics.RoadLogistics;
import com.example.demo.factory.Logistics.SeaLogistics;

/**
 * LogisticsRunner
 */
public class LogisticsRunner {

    private static Logistics logistics;

    public static void main(String[] args) {
        logistics = configure("ROAD");
        logistics.planLogistics();
    }

    private static Logistics configure(String logisticChannel){
        switch(logisticChannel){
            case "ROAD":
                return new RoadLogistics();
            case "WATER":
                return new SeaLogistics();
            default:
                throw new IllegalArgumentException("Proper Channel Not Found");    
        }
    }
}