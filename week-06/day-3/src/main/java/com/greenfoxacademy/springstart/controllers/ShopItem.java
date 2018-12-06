package com.greenfoxacademy.springstart.controllers;

public class ShopItem {

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
}
