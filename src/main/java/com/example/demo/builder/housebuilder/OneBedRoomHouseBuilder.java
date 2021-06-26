package com.example.demo.builder.housebuilder;

import com.example.demo.builder.room.BathRoom;
import com.example.demo.builder.room.BedRoom;
import com.example.demo.builder.room.LivingRoom;

public class OneBedRoomHouseBuilder extends HouseBuilder {
  @Override
  public void addRooms() {
    getHouse().rooms.add(new BathRoom());
    getHouse().rooms.add(new BedRoom());
    getHouse().rooms.add(new LivingRoom());
  }
}
