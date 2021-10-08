package com.bascis.springfundamentals.controllers;

import com.bascis.springfundamentals.Student;
import com.bascis.springfundamentals.dao.SubjectDao;
import com.bascis.springfundamentals.model.SubjectModel;
import com.bascis.springfundamentals.response.SubjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectDao subjectDao;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SubjectResponse create(@RequestBody SubjectModel model){
        return subjectDao.save(model);
    }

    @GetMapping(value = "/{id}")
    public SubjectResponse getSubject(@PathVariable("id") Long id ) {
        return subjectDao.read(id);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public SubjectResponse updateSubject(@PathVariable("id") Long id, @RequestBody SubjectModel model) {
        return subjectDao.update(id, model);
    }

    @DeleteMapping(value = "/{id}")
    public SubjectResponse deleteSubject(@PathVariable("id") Long id){
        return subjectDao.delete(id);
    }
}
