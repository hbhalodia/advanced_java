package com.bascis.springfundamentals;

import org.springframework.stereotype.Component;

@Component
public class Subject {
    private int subCode;
    private String subName;

    public int getSubCode() {
        return subCode;
    }

    public void setSubCode(int subCode) {
        this.subCode = subCode;
    }

    public String getSubName() {
        return "ICT";
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

}
