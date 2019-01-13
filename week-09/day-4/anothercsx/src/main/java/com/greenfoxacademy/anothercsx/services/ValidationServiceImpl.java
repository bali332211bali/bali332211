package com.greenfoxacademy.anothercsx.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService {


  @Override
  public boolean variantStatusxcyAllowed(String variantStatusxcy) {
    List<String> allowedVariants = Arrays.asList("variantFirst", "variantSecond", "variantThird");

    for (String allowedVariantCurrent : allowedVariants) {
      if(variantStatusxcy.equals(allowedVariantCurrent)) {
        return true;
      }
    }
    return false;
  }
}
