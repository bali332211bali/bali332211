package com.greenfoxacademy.springstart.ShopController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {


    ShopController() {
        ShopItem.initializeShopItems();

    }

    @RequestMapping(value="/shop")
    public String shop(Model model) {

        model.addAttribute("items", ShopItem.getShopItems());

//        @RequestParam String name, Model model
//        model.addAttribute("name", " value");
//        model.addAttribute("color", "orange");
//        model.addAttribute("size", 40);
        return "shop";
    }


}
