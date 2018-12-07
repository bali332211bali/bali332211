package com.greenfoxacademy.springstart.ShopController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class ShopController {


    ShopController() {
        ShopItem.initializeShopItems();
    }

    @RequestMapping(value="/shop")
    public String shop(Model model) {
        model.addAttribute("itemsAttr", ShopItem.getShopItems());
//        @RequestParam String name, Model model
        return "shop";
    }

    @RequestMapping(value="/shopavailable")
    public String shopAvailable(Model model) {
        List<ShopItem> availableShopItems = new ArrayList<>();
            for (int i = 0; i < ShopItem.getShopItems().size(); i++) {
                if (ShopItem.getShopItems().get(i).quantity > 0) {
                    availableShopItems.add(ShopItem.getShopItems().get(i));
                }
            }
        model.addAttribute("itemsAttr", availableShopItems);
        return "shop";
    }

    @RequestMapping(value="/shopcheapestfirst")
    public String shopFirst(Model model) {
        List<ShopItem> cheapestFirstShopItems = new ArrayList<>();
        for (int i = 0; i < ShopItem.getShopItems().size(); i++) {
            cheapestFirstShopItems.add(ShopItem.getShopItems().get(i));
        }

        Collections.sort(cheapestFirstShopItems, new SortByQuantity());

        model.addAttribute("itemsAttr", cheapestFirstShopItems);

        return "shop";
    }

}
