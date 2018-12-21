package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Post;
import java.util.Comparator;

public class SortByScore implements Comparator<Post> {

    @Override
    public int compare(Post a, Post b) {

      long aScore = a.getUpvotes() - a.getDownvotes();
      long bScore = b.getUpvotes() - b.getDownvotes();

      return -1*((int) aScore - (int) bScore);
    }
}
