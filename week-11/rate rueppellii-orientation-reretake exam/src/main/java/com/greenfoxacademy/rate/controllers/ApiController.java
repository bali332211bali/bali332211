package com.greenfoxacademy.rate.controllers;

import com.greenfoxacademy.rate.dtos.MentorDto;
import com.greenfoxacademy.rate.models.Mentor;
import com.greenfoxacademy.rate.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

  private MentorService mentorService;

  @Autowired
  public ApiController(MentorService mentorService) {
    this.mentorService = mentorService;
  }

  @PutMapping("/api/mentors/{mentorId}")
  public ResponseEntity mentorsApi(@RequestBody MentorDto mentorDto,
                                   @PathVariable(value = "mentorId") long id) {

    if(mentorService.getById(id) == null) {
      return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    Mentor mentorById = mentorService.getById(id);
    mentorById.setName(mentorDto.name);
    mentorById.setClassName(mentorDto.className);
    mentorService.saveMentor(mentorById);

    return new ResponseEntity(HttpStatus.OK);
  }

  @DeleteMapping("/api/mentors/{mentorId}")
  public ResponseEntity deleteMentor(@PathVariable(value = "mentorId") long id) {

    if(mentorService.getById(id) == null) {
      return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    mentorService.deleteMentor(mentorService.getById(id));
    return new ResponseEntity(HttpStatus.OK);
  }
}
