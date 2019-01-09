package com.dsdf.xc.services;

import com.dsdf.xc.models.Message;
import com.dsdf.xc.models.User;

import java.util.List;

public interface MessageService {

  void addMessage(Message message);

  List<Message> getAllMessages();

  void deleteAll();

  void deleteById(long id);

  Message getById(long id);

  void setUser(Message message, User user);

  List<Message> getAllByUser(User user);

  List<Message> getAllByUserAndNameContaining(User user, String search);

  boolean isMessageNameAllowed(String name);

}
