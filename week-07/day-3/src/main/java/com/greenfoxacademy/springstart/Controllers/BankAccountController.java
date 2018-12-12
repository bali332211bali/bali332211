package com.greenfoxacademy.springstart.Controllers;


import com.greenfoxacademy.springstart.BankAccount.Accounts;
import com.greenfoxacademy.springstart.BankAccount.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBankAccount(Model model) {
    model.addAttribute("bankAccount", bankAccount);
    model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "fields";
  }

  @RequestMapping(path = "/table", method = RequestMethod.GET)
  public String showTable(Model model) {
    model.addAttribute("bankAccounts", Accounts.bankAccounts);
    return "table";
  }


}
