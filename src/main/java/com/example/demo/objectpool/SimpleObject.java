package com.example.demo.objectpool;

public class SimpleObject extends ObjectPool<String> {
  private String simple;

  public SimpleObject(String simple) {
    this.simple = simple;
  }

  @Override
  String create() {
    return this.simple;
  }

  @Override
  boolean validate(String o) {
    return false;
  }

  @Override
  void dead(String o) {}
}
