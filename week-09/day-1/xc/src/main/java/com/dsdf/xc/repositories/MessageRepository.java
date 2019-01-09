package com.dsdf.xc.repositories;

import com.dsdf.xc.models.Message;
import com.dsdf.xc.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

  List<Message> findAll();

  Message findById(long id);

  List<Message> findAllByUser(User user);

  List<Message> findAllByNameContaining(String search);

  List<Message> findAllByUserAndNameContaining(User user, String search);


}
