package com.example.demo.abstractfactory.milkshake;

public class StrawberryMilkShake implements MilkShake {
  public String brand;
  public Integer iceCubes;

  public StrawberryMilkShake(String brand, Integer iceCubes) {
    this.brand = brand;
    this.iceCubes = iceCubes;
  }

  @Override
  public Integer getIceAmount() {
    return this.iceCubes;
  }

  @Override
  public String getBrand() {
    return this.brand;
  }
}
