package com.bascis.springfundamentals.entity;

import javax.persistence.*;

@Entity
@Table( name = "subject" )
public class ESubject {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String subcode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubCode() {
        return subcode;
    }

    public void setSubCode(String subCode) {
        this.subcode = subCode;
    }

    public ESubject() {
        super();
    }
}
