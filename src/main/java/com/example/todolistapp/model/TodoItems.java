package com.example.todolistapp.model;


import jakarta.persistence.*;

@Entity
public class TodoItems {

    private Long id;
    private String title;
    private boolean done;

    public TodoItems() {
    }

    public TodoItems(Long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
