package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Post;
import com.greenfoxacademy.springstart.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

  public void addUpvote(long id) {
    Post post = postRepository.findById(id).orElse(null);
    long upvotes;
    if (post != null) {
      upvotes = post.getUpvotes();
      post.setUpvotes(upvotes + 1);
      addPost(post);
    }
  }

  public void addDownvote(long id) {
    Post post = postRepository.findById(id).orElse(null);
    long downvotes;
    if (post != null) {
      downvotes = post.getDownvotes();
      post.setDownvotes(downvotes + 1);
      addPost(post);
    }
  }

  public List<Post> getPostsSortByScore() {
    List<Post> posts = postRepository.findAll();
    Collections.sort(posts, new SortByScore());
    return posts;
  }




}
