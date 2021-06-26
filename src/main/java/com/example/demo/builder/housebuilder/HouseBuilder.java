package com.example.demo.builder.housebuilder;

public abstract class HouseBuilder {
  public House getHouse() {
    return house;
  }

  private House house;

  public HouseBuilder() {
    house = new House();
  }

  public abstract void addRooms();

  public void addSecuritySystem() {
    System.out.println("adding security system");
  }

  public void addPlumbingSystem() {
    System.out.println("adding plumbing system");
  }

  public void addAirConditionerSystem() {
    System.out.println("adding air conditioning system");
  }

  public void paintHouse(String color) {
    System.out.println("paiting house with color " + color);
    house.setExteriorColor(color);
  }
}
