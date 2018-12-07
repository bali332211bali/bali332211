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
        ShopItem.initializeShopItems();
        ShopItem.getShopItems();

    }

    @RequestMapping(value="/shop")
    public String shop() {

//        model.addAttribute("items", shopItems);

//        @RequestParam String name, Model model
//        model.addAttribute("name", " value");
//        model.addAttribute("color", "orange");
//        model.addAttribute("size", 40);
        return "shop";
    }


}
