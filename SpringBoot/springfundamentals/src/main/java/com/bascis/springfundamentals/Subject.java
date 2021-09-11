package com.bascis.springfundamentals;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
