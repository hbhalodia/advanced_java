package com.bascis.springfundamentals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int rollNo;
    private String email;

    public Student(){

    }

    @Autowired  // 1. Dependency Injection using Annotation using Autowired.
    private Subject sub;

    // 2. Using Constructor Injection.
    public Student( Subject sub ) {
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getYourSubject() {
        System.out.println( this.sub.getSubName() );
    }

    public void message() {
        System.out.println("Hello Students !");
    }
}
