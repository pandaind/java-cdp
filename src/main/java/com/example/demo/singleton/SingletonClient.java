package com.example.demo.singleton;

public class SingletonClient {
  public static void run() {
    System.out.println("Bank Account Number Generation System");
    // create new account
    BankAccount account1 = BankAccount.getNewAccount();
    // create second account
    BankAccount account2 = BankAccount.getNewAccount();
  }
}
