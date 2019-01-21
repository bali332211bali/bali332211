package com.greenfoxacademy.rate.services;

import com.greenfoxacademy.rate.models.Mentor;
import com.greenfoxacademy.rate.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorServiceImpl implements MentorService {

  private MentorRepository mentorRepository;

  @Autowired
  public MentorServiceImpl(MentorRepository mentorRepository) {
    this.mentorRepository = mentorRepository;
  }

  @Override
  public List<Mentor> getAll() {
    return mentorRepository.findAll();
  }

  @Override
  public Mentor getById(long id) {
    return mentorRepository.findById(id);
  }

  @Override
  public void saveMentor(Mentor mentor) {
    mentorRepository.save(mentor);
  }

  @Override
  public void deleteMentor(Mentor mentor) {
    mentorRepository.delete(mentor);
  }
}
