package com.dsdf.xc.services;


import com.dsdf.xc.models.Message;
import com.dsdf.xc.models.User;
import com.dsdf.xc.repositories.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

  private MessageRepository messageRepository;

  @Autowired
  public MessageServiceImpl(MessageRepository messageRepository) {
    this.messageRepository = messageRepository;
  }

  public void addMessage(Message message) {
    messageRepository.save(message);
  }

  public List<Message> getAllMessages() {
    return messageRepository.findAll();
  }

  public void deleteAll() {
    messageRepository.deleteAll();
  }

  public void deleteById(long id) {
    messageRepository.deleteById(id);
  }

  public Message getById(long id) {
    return messageRepository.findById(id);
  }

  public void setUser(Message message, User user) {
    message.setUser(user);
  }

  public List<Message> getAllByUser(User user) {
    return messageRepository.findAllByUser(user);
  }

  public List<Message> getAllByUserAndNameContaining(User user, String search) {
    if (search == null || search.equals("")) {
      return messageRepository.findAllByUser(user);
    }
    return messageRepository.findAllByUserAndNameContaining(user, search);
  }

  public boolean isMessageNameAllowed(String name) {
    for (Message messageCurrent : messageRepository.findAll()) {
      if (messageCurrent.getName().equals(name)) {
        return false;
      }
    }
    return true;
  }


//    public List<Message> getAllByUserAndNameContainingOnPage(User user, String search, Integer pageNumber) {
//
//        int xsOnPage = 3;
//        int xsOnPageCurrent = xRepository.findAllByUser(user).size() % getPagesByUser(user).size();
//
//        if(xsOnPageCurrent != 0 && pageNumber == getPagesByUser(user).size()) {
//            xsOnPage = xsOnPageCurrent;
//        }
//
//        List<Message> xs = new ArrayList<>();
//
//        if (search == null || search.equals("")) {
//            if (xsOnPage > xRepository.findAllByUser(user).size()) {
//                return xRepository.findAllByUser(user);
//            }
//            for (int i = 0; i < xsOnPage; i++) {
//                xs.add(xRepository.findAllByUser(user).get(i + (pageNumber - 1) * xsOnPage));
//            }
//            return xs;
//        }
//        if (xsOnPage > xRepository.findAllByUserAndNameContaining(user, search).size()) {
//            return xRepository.findAllByUserAndNameContaining(user, search);
//        }
//        for (int i = 0; i < xsOnPage; i++) {
//            xs.add(xRepository.findAllByUserAndNameContaining(user, search).get(i + (pageNumber - 1) * xsOnPage));
//        }
//        return xs;
//    }
//
//    public List<Integer> getPagesByUser(User user) {
//        List<Integer> pages = new ArrayList<>();
//        int xsOnPage = 3;
//        int numberOfPages = xRepository.findAllByUser(user).size() / xsOnPage;
//
//        if (xRepository.findAllByUser(user).size() % xsOnPage != 0) {
//            numberOfPages += 1;
//        }
//
//        for (int i = 0; i < numberOfPages; i++) {
//            pages.add(i + 1);
//        }
//        return pages;
//    }


}
