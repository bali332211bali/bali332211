package com.greenfoxacademy.made.services;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService{


  @Override
  public boolean isStatusAllowed(String status) {
    return status.equals("ordered") || status.equals("inprogress") || status.equals("done");
  }

}
