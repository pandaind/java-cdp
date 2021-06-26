package com.example.demo;

import com.example.demo.abstractfactory.AbstractIceCreamFactory;
import com.example.demo.abstractfactory.FactoryCreator;
import com.example.demo.abstractfactory.icecream.IceCream;
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
  public void run(String... args) {
    log.info("********** abstract factory **********");
    AbstractIceCreamFactory amulFactory = FactoryCreator.getFactory("amul");
    IceCream icecream = amulFactory.createIceCream("Chocolate");
    log.info(
        "Ice cream is of {} brand , {} calories costs {}",
        icecream.getBrand(),
        icecream.getCalories(),
        icecream.getCost());
  }
}
