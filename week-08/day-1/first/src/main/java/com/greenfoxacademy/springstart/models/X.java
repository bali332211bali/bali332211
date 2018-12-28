package com.greenfoxacademy.springstart.models;

import javax.persistence.*;

@Entity
@Table(name = "Xs")
public class X {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public String getName() {
        return name;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
