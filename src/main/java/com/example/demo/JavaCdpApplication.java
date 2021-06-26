package com.example.demo;

import com.example.demo.abstractfactory.AbstractIceCreamFactory;
import com.example.demo.abstractfactory.FactoryCreator;
import com.example.demo.abstractfactory.icecream.IceCream;
import com.example.demo.builder.Architect;
import com.example.demo.builder.housebuilder.House;
import com.example.demo.builder.housebuilder.OneBedRoomHouseBuilder;
import com.example.demo.factory.IceCreamFactory;
import com.example.demo.objectpool.ObjectPoolClient;
import com.example.demo.prototype.PrototypeClient;
import com.example.demo.singleton.SingletonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCdpApplication implements CommandLineRunner {
  private final Logger log = LoggerFactory.getLogger(this.getClass());

  public static void main(String[] args) {
    SpringApplication.run(JavaCdpApplication.class, args);
  }

  @Override
  public void run(String... args) throws CloneNotSupportedException {
    log.info("********** abstract factory **********");
    AbstractIceCreamFactory amulFactory = FactoryCreator.getFactory("amul");
    IceCream icecream = amulFactory.createIceCream("Chocolate");
    log.info(
        "Ice cream is of {} brand , {} calories costs {}",
        icecream.getBrand(),
        icecream.getCalories(),
        icecream.getCost());

    log.info("********** builder **********");
    Architect architect = new Architect();
    architect.setHouseBuilder(new OneBedRoomHouseBuilder());
    architect.buildHouse();
    House oneBhk = architect.getFinishedHouse();
    log.info("Your house is ready {}", oneBhk);

    log.info("********** factory **********");
    com.example.demo.factory.icecream.IceCream iceCream =
        IceCreamFactory.createIceCream("Strawberry");
    log.info("Ice cream is {} calories costs {}", icecream.getCalories(), icecream.getCost());

    log.info("********** prototype **********");
    PrototypeClient.run();

    log.info("********** singleton **********");
    SingletonClient.run();

    log.info("********** object pool incomplete **********");
    ObjectPoolClient.run();
  }
}
