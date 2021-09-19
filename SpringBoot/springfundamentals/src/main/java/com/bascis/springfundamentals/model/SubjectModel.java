package com.bascis.springfundamentals.model;

public class SubjectModel {

    private Long id;

    private String name;

    private String subCode;

    public SubjectModel() {
        super();
    }

    public SubjectModel(Long id, String name, String subCode) {
        this.id = id;
        this.name = name;
        this.subCode = subCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

}
