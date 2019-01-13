package com.greenfoxacademy.anothernew.services;

import com.greenfoxacademy.anothernew.models.Order;
import com.greenfoxacademy.anothernew.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;

  @Autowired
  public OrderServiceImpl(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public void addOrder(Order order) {
    orderRepository.save(order);
  }

  @Override
  public List<Order> getAllOrders() {
    return orderRepository.findAll();
  }

  @Override
  public Order getById(long id) {
    return orderRepository.findById(id);
  }

  @Override
  public boolean existsById(long id) {
    return orderRepository.findById(id) != null;
  }

  @Override
  public List<Order> getAllWithtypeAndstatusForApi(String type, String status) {
    if (type.equalsIgnoreCase("vegetarian")) {
      return orderRepository.findAllByToppingAndStatus("Smoked tofu", status);
    } else if (type.equalsIgnoreCase("all")) {
      return orderRepository.findAllByStatus(status);
    }
    return Collections.emptyList();
  }

}
