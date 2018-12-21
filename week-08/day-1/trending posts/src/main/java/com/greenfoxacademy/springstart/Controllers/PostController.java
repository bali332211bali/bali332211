package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.Post;
import com.greenfoxacademy.springstart.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    model.addAttribute("posts", postService.getPosts());
    return "trending";
  }

  @GetMapping("/submit")
  public String submit(Model model, @ModelAttribute Post postNew) {
    model.addAttribute("postNew", postNew);
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





}
