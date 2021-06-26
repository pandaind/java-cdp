package com.example.demo.factory.icecream;

public class ChocolateIceCream implements IceCream {
  private Integer cost;
  private Integer calories;

  public ChocolateIceCream(int cost, int calories) {
    this.cost = cost;
    this.calories = calories;
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
