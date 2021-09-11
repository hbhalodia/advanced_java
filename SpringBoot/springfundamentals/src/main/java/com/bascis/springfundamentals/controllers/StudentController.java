package com.bascis.springfundamentals.controllers;

import com.bascis.springfundamentals.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private Student std;

    //@GetMapping(value = "/student")
    @GetMapping
    public Student getStudents() {
        std.setEmail("hit@gmail.com");
        std.setRollNo(23);
        std.setName("Hit Bhalodia");

        return std;
    }

    @GetMapping(value = "/{id}")
    public Student getStudent( @PathVariable("id") int id ) {
        std.setEmail("hit@gmail.com");
        std.setRollNo(id);
        std.setName("Hit Bhalodia");

        return std;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student createStudent(@RequestBody Student stdObject){
        std.setEmail(stdObject.getEmail());
        std.setName(stdObject.getName());
        std.setRollNo(stdObject.getRollNo());

        return std;
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/getAnoterStudent/{id}")
//    public Student getAnoterStudent( @PathVariable("id") int id ) {
//        std.setEmail("hit@gmail.com");
//        std.setRollNo(id);
//        std.setName("Hit Bhalodia");
//
//        return std;
//    }


}
