package com.greenfoxacademy.springstart.ShopController;

import java.util.ArrayList;
import java.util.List;

public class ShopItem {

    static List<ShopItem> shopItems = new ArrayList<>();

    String name;
    String description;
    int price;
    int quantity;

    ShopItem(String name, String description, int price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    static void initializeShopItems() {
        shopItems.add(new ShopItem("Running Shoes", "running", 5000, 5));
        shopItems.add(new ShopItem("Printer", "print", 3000, 5));
        shopItems.add(new ShopItem("Cola", "0.5l", 200, 5));
        shopItems.add(new ShopItem("Lunch", "with rice", 10000, 5));
        shopItems.add(new ShopItem("Shirt", "blue", 7000, 5));
    }

    static public List<ShopItem> getShopItems() {
        return shopItems;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
