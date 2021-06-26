package com.example.demo.abstractfactory;

import com.example.demo.abstractfactory.icecream.IceCream;
import com.example.demo.abstractfactory.milkshake.MilkShake;

public abstract class AbstractIceCreamFactory {
  public abstract IceCream createIceCream(String choice);

  public abstract MilkShake createMilkShake(String choice);
}
