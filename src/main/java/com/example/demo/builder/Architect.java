package com.example.demo.builder;

import com.example.demo.builder.housebuilder.House;
import com.example.demo.builder.housebuilder.HouseBuilder;

public class Architect {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder (HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.addRooms();
        houseBuilder.addPlumbingSystem();
        houseBuilder.addAirConditionerSystem();
        houseBuilder.addSecuritySystem();
        houseBuilder.paintHouse("white");
    }

    public House getFinishedHouse(){
        return houseBuilder.getHouse();
    }
}
