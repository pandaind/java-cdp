package com.example.demo.abstractfactory;

import com.example.demo.abstractfactory.icecream.ChocolateIceCream;
import com.example.demo.abstractfactory.icecream.IceCream;
import com.example.demo.abstractfactory.icecream.StrawberryIceCream;
import com.example.demo.abstractfactory.milkshake.ChocolateMilkShake;
import com.example.demo.abstractfactory.milkshake.MilkShake;
import com.example.demo.abstractfactory.milkshake.StrawberryMilkShake;

public class AmulIceCreamFactory extends AbstractIceCreamFactory {
  @Override
  public IceCream createIceCream(String iceCreamChoice) {
    IceCream iceCream = null;

    if (iceCreamChoice.equalsIgnoreCase("Strawberry")) {
      iceCream = new StrawberryIceCream("Amul", 2, 120);

    } else if (iceCreamChoice.equalsIgnoreCase("Chocolate")) {
      iceCream = new ChocolateIceCream("Amul", 2, 250);
    }
    return iceCream;
  }

  @Override
  public MilkShake createMilkShake(String choice) {
    MilkShake milkShake = null;

    if (choice.equalsIgnoreCase("Strawberry")) {
      milkShake = new StrawberryMilkShake("Amul", 2);

    } else if (choice.equalsIgnoreCase("Chocolate")) {
      milkShake = new ChocolateMilkShake("Amul", 2);
    }
    return milkShake;
  }
}
