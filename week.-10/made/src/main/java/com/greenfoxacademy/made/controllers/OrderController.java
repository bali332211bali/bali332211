package com.greenfoxacademy.made.controllers;

import com.greenfoxacademy.made.models.Order;
import com.greenfoxacademy.made.models.User;
import com.greenfoxacademy.made.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class OrderController {

  private OrderService orderService;

  @Autowired
  OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("/")
  public String ordersNew(@ModelAttribute(value = "orderNew") Order orderNew) {
    return "ordersNew";
  }

  @PostMapping("/")
  public String ordersNew(@ModelAttribute(value = "orderNew")Order orderNew,
                          RedirectAttributes redirectAttributes,
                          HttpSession session) {
    orderNew.setUser((User) session.getAttribute("userCurrent"));
    orderService.save(orderNew);
    redirectAttributes.addAttribute("orderNewId", orderNew.getId());
    return "redirect:/orders/{orderNewId}";
  }

  @GetMapping("/orders/{orderNewId}")
  public String ordersNewId(@PathVariable(value = "orderNewId") long orderNewId,
                            Model model) {
    if(orderService.existsById(orderNewId)) {
      model.addAttribute("orderById", orderService.getById(orderNewId));
      return "ordersNewId";
    }
    return "errorId";

  }



}
