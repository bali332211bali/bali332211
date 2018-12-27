package com.greenfoxacademy.springstart.services;

import com.greenfoxacademy.springstart.models.Post;
import java.util.Comparator;

public class SortByScore implements Comparator<Post> {

    @Override
    public int compare(Post a, Post b) {

      long aScore = a.getUpvotes() - a.getDownvotes();
      long bScore = b.getUpvotes() - b.getDownvotes();

      return -1*((int) aScore - (int) bScore);
    }
}
