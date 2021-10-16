package com.lab14.jBcript.modules;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    // represents the id of the author at the database level
    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private UserClass user;

    private String content;

    @CreationTimestamp
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;

    // default constructor
    // AKA
    // no args constructor
    @Autowired
    public Post() {
    }

    public Post(UserClass appUser, String content) {
        this.user = appUser;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public UserClass getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    public void setUser(UserClass appUser) {
        this.user = appUser;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
