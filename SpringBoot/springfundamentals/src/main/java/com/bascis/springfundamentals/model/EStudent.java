package com.bascis.springfundamentals.model;

import javax.persistence.*;

@Entity
@Table( name = "student" )
public class EStudent {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String Name;

    private String RollNo;

    public EStudent() {
    }
}
