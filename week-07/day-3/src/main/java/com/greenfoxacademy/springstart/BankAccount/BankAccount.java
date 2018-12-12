package com.greenfoxacademy.springstart.BankAccount;

public class BankAccount {

  String name;
  public int balance;
  String animalType;
  boolean king;
  String goodOrBad;

  public BankAccount() {

  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = false;
    this.goodOrBad = "Bad";
  }

  public BankAccount(String name, int balance, String animalType, boolean king, String goodOrBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.goodOrBad = goodOrBad;
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

  public String goodOrBad() {
    return this.goodOrBad;
  }

  public void setBalance(int balance) {
    this.balance += balance;
  }
}
