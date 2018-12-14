package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Img {

  List<String> img = new ArrayList<>();

  Img() {
    img.add("fox");
  }

  public void changeImg(String imgName) {
    img.clear();
    img.add(imgName);

  }

  public List<String> getImg() {
    return img;
  }

}
