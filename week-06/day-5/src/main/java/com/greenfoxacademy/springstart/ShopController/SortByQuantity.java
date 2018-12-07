package com.greenfoxacademy.springstart.ShopController;

import java.util.Comparator;

class SortByQuantity implements Comparator<ShopItem> {

  @Override
  public int compare(ShopItem a, ShopItem b) {
    return a.quantity - b.quantity;
  }

}
