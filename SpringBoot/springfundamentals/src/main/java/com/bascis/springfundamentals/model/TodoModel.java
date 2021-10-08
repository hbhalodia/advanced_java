package com.bascis.springfundamentals.model;

public class TodoModel {

    private Long id;

    private String todonote;

    public TodoModel() {
        super();
    }

    public TodoModel(Long id, String todonote) {
        this.id = id;
        this.todonote = todonote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodonote() {
        return todonote;
    }

    public void setTodonote(String todonote) {
        this.todonote = todonote;
    }
}
