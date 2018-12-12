package com.greenfoxacademy.springstart.BankAccount;

public class BankAccount {

  String name;
  int balance;
  String animalType;


  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
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
}
