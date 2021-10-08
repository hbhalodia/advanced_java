package com.bascis.springfundamentals.dao;

import com.bascis.springfundamentals.model.TodoModel;
import com.bascis.springfundamentals.response.TodoResponse;

public interface TodoDao {

    public TodoResponse save(TodoModel model);

    public TodoResponse read(Long id);

    public TodoResponse update(Long id, TodoModel model);

    public TodoResponse delete(Long id);
}
