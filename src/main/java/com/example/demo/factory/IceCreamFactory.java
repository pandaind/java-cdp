package com.example.demo.factory;

import com.example.demo.factory.icecream.ChocolateIceCream;
import com.example.demo.factory.icecream.IceCream;
import com.example.demo.factory.icecream.StrawberryIceCream;

public class IceCreamFactory {
    public  static IceCream createIceCream(String iceCreamChoice){
        IceCream iceCream = null;

        if (iceCreamChoice.equalsIgnoreCase("Strawberry")){
            iceCream = new StrawberryIceCream(2,120);

        }else if (iceCreamChoice.equalsIgnoreCase("Chocolate")){
            iceCream = new ChocolateIceCream(2,250);
        }

        return iceCream;
    }
}
