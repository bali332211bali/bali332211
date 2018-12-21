package com.greenfoxacademy.springstart.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;
  private String text;
  private long upvote;
  private long downvote;


  public Post() {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public long getUpvote() {
    return upvote;
  }

  public void setUpvote(long upvote) {
    this.upvote = upvote;
  }

  public long getDownvote() {
    return downvote;
  }

  public void setDownvote(long downvote) {
    this.downvote = downvote;
  }
}