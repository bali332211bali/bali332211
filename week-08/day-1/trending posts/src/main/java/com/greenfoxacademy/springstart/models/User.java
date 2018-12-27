package com.greenfoxacademy.springstart.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String password;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "todo_id")
    private List<Url> urlsOfUser;

    public User() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Url> getUrlsOfUser() {
        return urlsOfUser;
    }

    public void setUrlsOfUser(List<Url> urlsOfUserUrl) {
        this.urlsOfUser = urlsOfUserUrl;
    }
}
