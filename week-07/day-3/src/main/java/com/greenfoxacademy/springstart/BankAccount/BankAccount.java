package com.greenfoxacademy.springstart.BankAccount;

public class BankAccount {

  String name;
  int balance;
  String animalType;
  boolean king;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = false;
  }

  public BankAccount(String name, int balance, String animalType, boolean king) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public int getIndexOf() {
    return Accounts.bankAccounts.indexOf(this);
  }

  public boolean isKing() {
    return king;
  }
}
