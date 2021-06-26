package com.example.demo.abstractfactory.icecream;

public class StrawberryIceCream implements IceCream {
  private String brand;
  private Integer cost;
  private Integer calories;

  public StrawberryIceCream(String brand, int cost, int calories) {
    this.brand = brand;
    this.cost = cost;
    this.calories = calories;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  @Override
  public Integer getCost() {
    return cost;
  }

  @Override
  public Integer getCalories() {
    return calories;
  }
}
