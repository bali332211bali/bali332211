package com.greenfoxacademy.rate.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService {

  @Override
  public boolean isClassNameAllowed(String className) {
    List<String> allowedVariants = Arrays.asList("Really", "TipTop", "Seadog", "Roboto");

    for (String allowedVariantCurrent : allowedVariants) {
      if(className.equals(allowedVariantCurrent)) {
        return true;
      }
    }
    return false;
  }
}
