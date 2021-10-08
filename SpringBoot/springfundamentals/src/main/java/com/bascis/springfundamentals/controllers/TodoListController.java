package com.bascis.springfundamentals.controllers;

import com.bascis.springfundamentals.dao.TodoDao;
import com.bascis.springfundamentals.model.SubjectModel;
import com.bascis.springfundamentals.model.TodoModel;
import com.bascis.springfundamentals.response.SubjectResponse;
import com.bascis.springfundamentals.response.TodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoListController {

    @Autowired
    private TodoDao todoDao;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TodoResponse create(@RequestBody TodoModel model){
        return todoDao.save(model);
    }

    @GetMapping(value = "/{id}")
    public TodoResponse getSubject(@PathVariable("id") Long id ) {
        return todoDao.read(id);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TodoResponse updateSubject(@PathVariable("id") Long id, @RequestBody TodoModel model) {
        return todoDao.update(id, model);
    }

    @DeleteMapping(value = "/{id}")
    public TodoResponse deleteSubject(@PathVariable("id") Long id){
        return todoDao.delete(id);
    }
}
