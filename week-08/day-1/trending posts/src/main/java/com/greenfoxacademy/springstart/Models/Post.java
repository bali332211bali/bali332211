package com.greenfoxacademy.springstart.Models;

import org.hibernate.annotations.Type;
import sun.plugin.dom.core.Text;

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
  private long upvotes;
  private long downvotes;


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

  public long getUpvotes() {
    return upvotes;
  }

  public void setUpvotes(long upvotes) {
    this.upvotes = upvotes;
  }

  public long getDownvotes() {
    return downvotes;
  }

  public void setDownvotes(long downvotes) {
    this.downvotes = downvotes;
  }
}
