package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.BankAccount.Accounts;
import com.greenfoxacademy.springstart.BankAccount.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication {

  public static void main(String[] args) {

    Accounts.bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    Accounts.bankAccounts.add(new BankAccount("Simb", 200, "lio"));
    Accounts.bankAccounts.add(new BankAccount("Sim", 20, "li"));
    Accounts.bankAccounts.add(new BankAccount("Si", 2, "l"));
    Accounts.bankAccounts.add(new BankAccount("S", 1, "b", true, "Good"));


    SpringApplication.run(SpringstartApplication.class, args);
  }
}
