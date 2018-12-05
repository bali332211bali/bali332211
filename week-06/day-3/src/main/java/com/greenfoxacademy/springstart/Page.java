package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Page {

  @RequestMapping(value="/page")
  @ResponseBody
  public String page() {
    return "string";
  }

}
