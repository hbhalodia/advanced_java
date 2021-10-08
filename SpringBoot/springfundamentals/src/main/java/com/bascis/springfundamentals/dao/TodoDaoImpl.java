package com.bascis.springfundamentals.dao;

import com.bascis.springfundamentals.convertor.ModelEntityConvertor;
import com.bascis.springfundamentals.entity.ETodo;
import com.bascis.springfundamentals.model.TodoModel;
import com.bascis.springfundamentals.repository.TodoRepository;
import com.bascis.springfundamentals.response.ApiStatus;
import com.bascis.springfundamentals.response.TodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoDaoImpl implements TodoDao {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoResponse save(TodoModel todoModel) {

        ETodo todoEntity =  ModelEntityConvertor.convertTodoModelToEntity(todoModel);
        ETodo savedEntity      = todoRepository.save(todoEntity);

        System.out.println("Data Saved Succesfully "+ savedEntity.getId());
        return new TodoResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertTodoEntityToModel(savedEntity));
    }

    @Override
    public TodoResponse read(Long id) {
        Optional<ETodo> todoEntity = todoRepository.findById(id);
        return new TodoResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertTodoEntityToModel(todoEntity.get()));
    }

    @Override
    public TodoResponse update(Long id, TodoModel model) {
        Optional<ETodo> savedEntity = todoRepository.findById(id);

        savedEntity.get().setTodonote(model.getTodonote());

        return new TodoResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertTodoEntityToModel(savedEntity.get()));
    }

    @Override
    public TodoResponse delete(Long id) {
        Optional<ETodo> deletedEntity = todoRepository.findById(id);
        todoRepository.deleteById(id);

        return new TodoResponse(ApiStatus.SUCESS, HttpStatus.OK.value(), ModelEntityConvertor.convertTodoEntityToModel(deletedEntity.get()));
    }
}
