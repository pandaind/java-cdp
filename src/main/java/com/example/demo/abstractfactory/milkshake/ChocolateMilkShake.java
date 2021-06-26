package com.example.demo.abstractfactory.milkshake;

public class ChocolateMilkShake implements MilkShake {
  public String brand;
  public Integer iceCubes;

  public ChocolateMilkShake(String brand, Integer iceCubes) {
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

  @Override
  public String toString() {
    return super.toString();
  }
}
