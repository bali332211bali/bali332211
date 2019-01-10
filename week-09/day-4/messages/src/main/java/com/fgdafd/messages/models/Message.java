package com.fgdafd.messages.models;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String usernameMessage;
  private String textMessage;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsernameMessage() {
    return usernameMessage;
  }

  public void setUsernameMessage(String usernameMessage) {
    this.usernameMessage = usernameMessage;
  }

  public String getTextMessage() {
    return textMessage;
  }

  public void setTextMessage(String textMessage) {
    this.textMessage = textMessage;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
