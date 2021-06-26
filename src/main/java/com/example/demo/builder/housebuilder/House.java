package com.example.demo.builder.housebuilder;

import com.example.demo.builder.room.Room;
import java.util.ArrayList;
import java.util.List;

public class House {
  List<Room> rooms = new ArrayList<>();
  private String exteriorColor = "while";

  public String getExteriorColor() {
    return exteriorColor;
  }

  public void setExteriorColor(String exteriorColor) {
    this.exteriorColor = exteriorColor;
  }

  @Override
  public String toString() {
    return "House{" + "rooms=" + rooms + ", exteriorColor='" + exteriorColor + '\'' + '}';
  }
}
