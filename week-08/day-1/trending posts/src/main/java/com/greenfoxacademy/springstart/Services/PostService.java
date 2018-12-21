package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Post;
import com.greenfoxacademy.springstart.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

  PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public void addPost(Post post) {
    postRepository.save(post);
  }

  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  public void deleteAll() {
    postRepository.deleteAll();
  }

}