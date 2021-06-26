package com.example.demo.prototype;

public class Forest extends BaseLevel {
  public Forest(String name) {
    levelName = name;
  }

  @Override
  public BaseLevel clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
