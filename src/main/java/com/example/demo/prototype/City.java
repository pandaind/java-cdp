package com.example.demo.prototype;

public class City extends BaseLevel {
  public City(String name) {
    levelName = name;
  }

  @Override
  public BaseLevel clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
