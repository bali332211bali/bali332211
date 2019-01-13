package com.greenfoxacademy.anothercsx.controllers;

import com.greenfoxacademy.anothercsx.models.Xcy;
import com.greenfoxacademy.anothercsx.services.ValidationService;
import com.greenfoxacademy.anothercsx.services.XcyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class ApiController {

  private XcyService xcyService;
  private ValidationService validationService;

  @Autowired
  ApiController(XcyService xcyService, ValidationService validationService) {
    this.xcyService = xcyService;
    this.validationService = validationService;
  }

  @GetMapping("/api/xcys")
  public ResponseEntity<List<Xcy>> apiByTypeAndVariant(@RequestParam(value = "typeToppingxcy") String typeToppingxcy,
                                                       @RequestParam(value = "variantStatusxcy") String variantStatusxcy) {
    if (typeToppingxcy == null || variantStatusxcy == null || !validationService.variantStatusxcyAllowed(variantStatusxcy)) {
      return new ResponseEntity<>(Collections.emptyList(), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(xcyService.getAllWithTypeToppingxcyAndVariantStatusxcyForApi(typeToppingxcy, variantStatusxcy), HttpStatus.OK);
  }

  @PatchMapping("/api/xcys/{xcyId}")
  public ResponseEntity<Xcy> apiById(@PathVariable(value = "xcyId") long xcyId,
                                     @RequestBody StatusxcyDto statusxcyDto) {
    if (!xcyService.existsById(xcyId) || !validationService.variantStatusxcyAllowed(statusxcyDto.getStatusxcy())) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    xcyService.getById(xcyId).setStatusxcy(statusxcyDto.getStatusxcy());
    xcyService.addXcy(xcyService.getById(xcyId));
    return new ResponseEntity<>(HttpStatus.OK);
  }

}

