package com.greenfoxacademy.anothernew.repositories;

import com.greenfoxacademy.anothernew.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

  List<Order> findAll();

  Order findById(long id);

  List<Order> findAllByToppingAndStatus(String topping, String status);

  List<Order> findAllByStatus(String status);

}
