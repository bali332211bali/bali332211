package com.greenfoxacademy.anothernew.controllers;

import com.greenfoxacademy.anothernew.models.Order;
import com.greenfoxacademy.anothernew.services.ValidationService;
import com.greenfoxacademy.anothernew.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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

  @GetMapping("/api/orders")
  public ResponseEntity<List<Order>> apiByTypeAndVariant(@RequestParam(value = "type") String type,
                                                         @RequestParam(value = "status") String status) {
    if (type == null || status == null || !validationService.statusAllowed(status)) {
      return new ResponseEntity<>(Collections.emptyList(), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(orderService.getAllWithtypeAndstatusForApi(type, status), HttpStatus.OK);
  }

  @PatchMapping("/api/orders/{orderId}")
  public ResponseEntity<Order> apiById(@PathVariable(value = "orderId") long orderId,
                                       @RequestBody StatusDto statusDto) {
    if (!orderService.existsById(orderId) || !validationService.statusAllowed(statusDto.getStatus())) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    orderService.getById(orderId).setStatus(statusDto.getStatus());
    orderService.addOrder(orderService.getById(orderId));
    return new ResponseEntity<>(HttpStatus.OK);
  }

}

