package com.greenfoxacademy.springstart.Controllers;


import com.greenfoxacademy.springstart.BankAccount.Accounts;
import com.greenfoxacademy.springstart.BankAccount.BankAccount;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBankAccount(Model model) {
    model.addAttribute("bankAccount", bankAccount);
    model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "fields";
  }

  BankAccount bankAccount2 = new BankAccount();

  @RequestMapping(path = "/table", method = RequestMethod.GET)
  public String showTable(Model model) {
    model.addAttribute("bankAccounts", Accounts.bankAccounts);
    return "table";
  }

  @RequestMapping(path = "/table/add", method = RequestMethod.PUT)
  public String addBalance(@RequestBody MultiValueMap<String, String> formData) {

    for (int i = 0; i < Accounts.bankAccounts.size(); i++) {
      if (formData.toSingleValueMap().get("bankAccountName")
          .equalsIgnoreCase(Accounts.bankAccounts.get(i).getName())) {
        Accounts.bankAccounts.get(i).balance += 100;
      }
    }
    return "redirect:/table";
  }


//    for (int i = 0; i < Accounts.bankAccounts.size(); i++) {
//      if (bankAccount2.getName()
//          .equalsIgnoreCase(Accounts.bankAccounts.get(i).getName())) {
//        if (Accounts.bankAccounts.get(i).isKing()) {
//          Accounts.bankAccounts.get(i).balance += 100;
//        } else {
//          Accounts.bankAccounts.get(i).balance += 10;
//        }
//      }
//    }
//
//    return "redirect:/table";
//  }



}
