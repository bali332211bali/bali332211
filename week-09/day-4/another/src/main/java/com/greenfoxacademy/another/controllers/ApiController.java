package com.greenfoxacademy.another.controllers;

import com.greenfoxacademy.another.models.Xcy;
import com.greenfoxacademy.another.services.XcyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class ApiController {

  private XcyService xcyService;

  @Autowired
  ApiController(XcyService xcyService) {
    this.xcyService = xcyService;
  }

  @GetMapping("/api/xcys")
  public ResponseEntity<List<Xcy>> apiByTypeAndVariant(@RequestParam(value = "typeToppingxcy") String typeToppingxcy,
                                                       @RequestParam(value = "variantStatusxcy") String variantStatusxcy) {
    if (typeToppingxcy == null || variantStatusxcy == null) {
      return new ResponseEntity<>(Collections.emptyList(), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(xcyService.getAllWithTypeToppingxcyAndVariantStatusxcyForApi(typeToppingxcy, variantStatusxcy), HttpStatus.OK);
  }

  @PatchMapping("/api/xcys/{xcyId}")
  public ResponseEntity<Xcy> apiById(@PathVariable(value = "xcyId") long xcyId,
                                     @RequestBody StatusxcyDto statusxcyDto) {
    if (!xcyService.existsById(xcyId)) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    xcyService.getById(xcyId).setStatusxcy(statusxcyDto.getStatus());
    xcyService.addXcy(xcyService.getById(xcyId));
    return new ResponseEntity<>(HttpStatus.OK);
  }

}

