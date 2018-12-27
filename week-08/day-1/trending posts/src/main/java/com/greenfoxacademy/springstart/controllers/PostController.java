package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Post;
import com.greenfoxacademy.springstart.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("")
  public String trendingPosts(Model model) {
    model.addAttribute("posts", postService.getPostsSortByScore());
    return "trending";
  }

  @GetMapping("/submit")
  public String submit(Model model, @ModelAttribute Post postNew) {
    model.addAttribute("postNew", postNew);
    model.addAttribute("upvoteStart", 0);
    model.addAttribute("downvoteStart", 0);
    return "submit";
  }

  @PostMapping("/submit")
  public String submit(@ModelAttribute Post postNew) {
    postService.addPost(postNew);
    return "redirect:/posts";
  }

  @GetMapping("/delete")
  public String deleteAll() {
    postService.deleteAll();
    return "redirect:";
  }

  @GetMapping("/addUpvote")
  public String addUpvote(@RequestParam long postId) {
    postService.addUpvote(postId);
    return "redirect:/posts";
  }

  @GetMapping("/addDownvote")
  public String addDownvote(@RequestParam long postId) {
    postService.addDownvote(postId);
    return "redirect:/posts";
  }







}
