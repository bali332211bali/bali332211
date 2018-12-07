package com.greenfoxacademy.springstart.ShopController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopController {

    ShopController() {
        ShopItem shopItem = new ShopItem("Running Shoes", "running", 5000, 5);
        ShopItem shopItem2 = new ShopItem("Printer", "print", 3000, 5);
        ShopItem shopItem3 = new ShopItem("Cola", "0.5l", 200, 5);
        ShopItem shopItem4 = new ShopItem("Lunch", "with rice", 10000, 5);
        ShopItem shopItem5 = new ShopItem("Shirt", "blue", 7000, 5);
    }

    @RequestMapping("/shop")
    public String greeting(@RequestParam String name, Model model) {

        model.addAttribute("name", " value");
        model.addAttribute("color", "orange");
        model.addAttribute("size", 40);
        return "shop";
    }

//    List<ShopItem> initializeShopItems() {
//
//        List<ShopItem> shopItems = new ArrayList<>();
//
//
//        return shopItems;
//    }



}
