package com.frontend.rest.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.is;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(DoublingController.class)
public class DoublingControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void arrays() throws Exception {
    mockMvc.perform(post("/arrays")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"what\": \"sum\", \"numbers\": [1, 2, 3, 4, 5]}"))
        .andExpect(content().contentType(contentType))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void doubling() throws Exception {
    this.mockMvc.perform(get("/doubling"))
        .andExpect(status().isOk());
  }

}
