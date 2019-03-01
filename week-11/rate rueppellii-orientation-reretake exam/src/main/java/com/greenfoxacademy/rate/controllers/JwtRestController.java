package com.greenfoxacademy.rate.controllers;

import com.greenfoxacademy.rate.models.JwtUser;
import com.greenfoxacademy.rate.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
public class JwtRestController {

    private JwtGenerator jwtGenerator;

  public JwtRestController(JwtGenerator jwtGenerator) {
      this.jwtGenerator = jwtGenerator;
    }

    @GetMapping("/login")
    public String login() {
      return "Successfully authenticated";
    }

    @PostMapping("/token")
    public String generate(@RequestBody JwtUser jwtUser) {
    return jwtGenerator.generate(jwtUser);
  }
}
