package com.bascis.springfundamentals.response;

import com.bascis.springfundamentals.model.TodoModel;

public class TodoResponse {

    private ApiStatus apiStatus;
    private TodoModel todoModel;
    private int statusCode;

    public TodoResponse(ApiStatus apiStatus,int statusCode,TodoModel todoModel) {
        super();
        this.todoModel = todoModel;
        this.statusCode = statusCode;
        this.apiStatus = apiStatus;
    }

    public ApiStatus getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(ApiStatus apiStatus) {
        this.apiStatus = apiStatus;
    }

    public TodoModel getTodoModel() {
        return todoModel;
    }

    public void setTodoModel(TodoModel todoModel) {
        this.todoModel = todoModel;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
