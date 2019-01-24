package com.greenfoxacademy.made.repositories;

import com.greenfoxacademy.made.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

  Order findById(long id);

  List<Order> findAllByStatus(String status);

  List<Order> findAllByToppingAndStatus(String topping, String status);
}
