package com.example.demo.objectpool;

public class ObjectPoolClient {
  public static void run() {
    SimpleObject pool = new SimpleObject("test");
    pool.takeIn("One");
    pool.takeIn("Two");
    pool.takeIn("Three");

    System.out.println("Object out " + pool.takeOut());
  }
}
