package com.example.demo.singleton;

public class BankAccount {
  private static BankAccount newAccount;

  private BankAccount() {}

  public static BankAccount getNewAccount() {
    if (newAccount == null) {
      newAccount = new BankAccount();
      System.out.println("New Account created.");
    } else {
      System.out.println("Account already opened.");
    }
    return newAccount;
  }
}
