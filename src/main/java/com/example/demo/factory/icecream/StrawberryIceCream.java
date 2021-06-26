package com.example.demo.factory.icecream;

public class StrawberryIceCream implements IceCream {
  private Integer cost;
  private Integer calories;

  public StrawberryIceCream(int cost, int calories) {
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
