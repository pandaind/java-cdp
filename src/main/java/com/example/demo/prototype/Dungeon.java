package com.example.demo.prototype;

public class Dungeon extends BaseLevel {
  public Dungeon(String name) {
    levelName = name;
  }

  @Override
  public BaseLevel clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
