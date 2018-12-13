package com.greenfoxacademy.springstart.Controllers;


import com.greenfoxacademy.springstart.UtilityService.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DIController {

  private UtilityService utilityService;

  @Autowired
  DIController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String use() {
    return "colors";
  }

  @GetMapping("/useful/colored")
  public String useColored(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/red")
  public String useRed() {
    return "red";
  }

  @GetMapping("/useful/blue")
  public String useBlue() {
    return "blue";
  }

  @GetMapping("/useful/yellow")
  public String useYellow() {
    return "yellow";
  }

  @GetMapping("/useful/email")
  public String useEmail(Model model, @RequestParam String email) {
    model.addAttribute("emailValidation", utilityService.validateEmail(email));
    if (utilityService.validateEmail(email).equalsIgnoreCase("this is valid email")) {
      return "validEmail";
    } else {
      return "invalidEmail";
    }

  }


}
