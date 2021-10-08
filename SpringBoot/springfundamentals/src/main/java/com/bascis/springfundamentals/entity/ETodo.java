package com.bascis.springfundamentals.entity;

import javax.persistence.*;

@Entity
@Table( name = "todo" )
public class ETodo {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String todonote;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTodonote() {
        return todonote;
    }

    public void setTodonote(String todonote) {
        this.todonote = todonote;
    }
}
