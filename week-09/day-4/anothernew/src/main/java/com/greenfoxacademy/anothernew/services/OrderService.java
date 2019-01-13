package com.greenfoxacademy.anothernew.services;

import com.greenfoxacademy.anothernew.models.Order;

import java.util.List;

public interface OrderService {

  void addOrder(Order order);

  List<Order> getAllOrders();

  Order getById(long id);

  boolean existsById(long id);

  List<Order> getAllWithTypeAndStatusForApi(String type, String status);
}
