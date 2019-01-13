package com.greenfoxacademy.anothernew.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService {


  @Override
  public boolean statusAllowed(String status) {
    List<String> allowedVariants = Arrays.asList("ordered", "inprogress", "done");

    for (String allowedVariantCurrent : allowedVariants) {
      if(status.equals(allowedVariantCurrent)) {
        return true;
      }
    }
    return false;
  }
}
