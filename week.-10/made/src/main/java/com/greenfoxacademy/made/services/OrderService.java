package com.greenfoxacademy.made.services;

import com.greenfoxacademy.made.models.Order;

import java.util.List;

public interface OrderService {

  void save(Order order);

  Order getById(long id);

  boolean existsById(long id);

  List<Order> getOrdersByTypeAndStatus(String type, String status);

}
