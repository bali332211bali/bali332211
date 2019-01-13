package com.greenfoxacademy.anothernew.controllers;

import com.greenfoxacademy.anothernew.models.Order;
import com.greenfoxacademy.anothernew.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class OrderController {

  private OrderService orderService;

  @Autowired
  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("/")
  public String orderNew(@ModelAttribute(value = "orderNew") Order orderNew) {
    return "orders";
  }

  @PostMapping("/order")
  public String orderNew(@ModelAttribute("orderNew") Order orderNew,
                   RedirectAttributes redirectAttributes) {
    orderService.addOrder(orderNew);
    redirectAttributes.addAttribute("orderId", orderNew.getId());
    return "redirect:/orders/{orderId}";
  }

  @GetMapping("/orders/{orderId}")
  public String orderById(@PathVariable(value = "orderId", required = false) long id,
                      Model model) {
    if (!orderService.existsById(id)) {
      return "errorNullId";
    }
    model.addAttribute("orderById", orderService.getById(id));
    return "orderId";
  }

}
