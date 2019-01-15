package com.greenfoxacademy.made.controllers;

import com.greenfoxacademy.made.dtos.StatusDto;
import com.greenfoxacademy.made.models.Order;
import com.greenfoxacademy.made.services.OrderService;
import com.greenfoxacademy.made.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

  private OrderService orderService;
  private ValidationService validationService;

  @Autowired
  ApiController(OrderService orderService, ValidationService validationService) {
    this.orderService = orderService;
    this.validationService = validationService;
  }

  @GetMapping("/orders")
  public ResponseEntity<List<Order>> ordersApi(@RequestParam(value = "type") String type,
                                               @RequestParam(value = "status") String status) {
    if(type == null || status == null || !validationService.isStatusAllowed(status)) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(orderService.getOrdersByTypeAndStatus(type, status), HttpStatus.OK);
  }

  @PatchMapping("/orders/{id}")
  public ResponseEntity<Order> ordersStatusPatch(@PathVariable(value = "id") long id,
                                  @RequestBody StatusDto statusDto) {
    if(!orderService.existsById(id) || !validationService.isStatusAllowed(statusDto.getStatus())) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    orderService.getById(id).setStatus(statusDto.getStatus());
    orderService.save(orderService.getById(id));
    return new ResponseEntity<>(HttpStatus.OK);
  }



}
