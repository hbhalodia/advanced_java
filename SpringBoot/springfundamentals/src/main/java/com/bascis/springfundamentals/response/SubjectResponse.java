package com.bascis.springfundamentals.response;

import com.bascis.springfundamentals.model.SubjectModel;
import org.springframework.http.HttpStatus;

public class SubjectResponse {

    private ApiStatus apiStatus;
    private SubjectModel subjectModel;
    private int statusCode;

    public SubjectResponse(ApiStatus apiStatus,int statusCode,SubjectModel subjectModel) {
        super();
        this.subjectModel = subjectModel;
        this.statusCode = statusCode;
        this.apiStatus = apiStatus;
    }

    public ApiStatus getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(ApiStatus apiStatus) {
        this.apiStatus = apiStatus;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public SubjectModel getSubjectModel() {
        return subjectModel;
    }

    public void setSubjectModel(SubjectModel subjectModel) {
        this.subjectModel = subjectModel;
    }
}
