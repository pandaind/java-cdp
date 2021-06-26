package com.example.demo.abstractfactory;

public class FactoryCreator {
  public static AbstractIceCreamFactory getFactory(String brand) {
    if (brand.equalsIgnoreCase("amul")) {
      return new AmulIceCreamFactory();
    } else {
      return new DairyQueenCreamFactory();
    }
  }
}
