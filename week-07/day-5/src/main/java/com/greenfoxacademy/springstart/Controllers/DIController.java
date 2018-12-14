package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DIController {

  String nameOfFox = "fox";
  String food = "food";
  Img img;

  @Autowired
  DIController(Img img) {
    this.img = img;
  }


  @GetMapping("fox")
  public String fox(Model model) {
    model.addAttribute("name", nameOfFox);
    model.addAttribute("img", img.getImg().get(0));
    model.addAttribute("food", food);
    return "fox";
  }

  @PostMapping("fox")
  public String foxName(Model model, @RequestParam String namef) {
    nameOfFox = namef;
    return "redirect:/fox";
  }

  @GetMapping("fox/dead")
  public String foxDead(Model model) {
    img.changeImg("dead");
    return "redirect:/fox";
  }

  @GetMapping("fox/sleep")
  public String foxSleep(Model model) {
    img.changeImg("sleep");
    return "redirect:/fox";
  }

  @GetMapping("fox/fox")
  public String foxFox(Model model) {
    img.changeImg("fox");
    return "redirect:/fox";
  }

  @PostMapping("fox/food")
  public String foxFood(Model model, @RequestParam String food) {
    this.food = food;
    return "redirect:/fox";
  }


}
