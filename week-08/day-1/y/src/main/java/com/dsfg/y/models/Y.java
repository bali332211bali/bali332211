package com.dsfg.y.models;

import com.dsfg.y.models.User;

import javax.persistence.*;

@Entity
@Table(name = "Ys")
public class Y {

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

    public int getAmount() {
        return amount;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
