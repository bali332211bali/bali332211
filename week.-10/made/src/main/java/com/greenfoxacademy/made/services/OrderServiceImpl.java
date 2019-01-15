package com.greenfoxacademy.made.services;

import com.greenfoxacademy.made.models.Order;
import com.greenfoxacademy.made.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

  private OrderRepository orderRepository;

  @Autowired
  public OrderServiceImpl(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public void save(Order order) {
    orderRepository.save(order);
  }

  @Override
  public Order getById(long id) {
    return orderRepository.findById(id);
  }

  @Override
  public boolean existsById(long id) {
    return !(orderRepository.findById(id) == null);
  }

  @Override
  public List<Order> getOrdersByTypeAndStatus(String type, String status) {
    if(type.equals("vegetarian")) {
     return orderRepository.findAllByToppingAndStatus("Smoked tofu", status);
    } else if(type.equals("all")) {
      return orderRepository.findAllByStatus(status);
    }
    return Collections.emptyList();
  }

}
