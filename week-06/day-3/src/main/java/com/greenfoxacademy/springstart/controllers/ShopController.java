package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopController {

    ShopController() {

    }

    @RequestMapping("/shop/greeting")
    public String greeting(@RequestParam String name, Model model) {
        Greetings greetings = new Greetings();

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        model.addAttribute("hello", hellos[(int) (Math.random() * hellos.length)]);
        model.addAttribute("name", " value");
        model.addAttribute("color", "orange");
        model.addAttribute("size", 40);
        model.addAttribute("load", Greetings.id);
        return "greeting";
    }

    List<ShopItem> initializeShopItems() {

        List<ShopItem> shopItems = new ArrayList<>();
        ShopItem shopItem = new ShopItem("Running Shoes", "running", 5000, 5);
        ShopItem shopItem2 = new ShopItem("Printer", "print", 3000, 5);
        ShopItem shopItem3 = new ShopItem("Cola", "0.5l", 200, 5);
        ShopItem shopItem4 = new ShopItem("Lunch", "with rice", 10000, 5);
        ShopItem shopItem5 = new ShopItem("Shirt", "blue", 7000, 5);

        return shopItems;
    }



}