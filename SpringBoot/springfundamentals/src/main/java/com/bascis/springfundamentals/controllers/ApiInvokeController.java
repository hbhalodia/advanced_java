package com.bascis.springfundamentals.controllers;

import com.bascis.springfundamentals.Student;
import com.bascis.springfundamentals.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/invokeapi")
public class ApiInvokeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired  // 1. Dependency Injection using Annotation using Autowired.
    private Student std;

    @GetMapping(value="/getstudent/{id}")
    public Student invokeStudent(@PathVariable("id") int id){
        //code to call student api.

        ResponseEntity<Student> response = restTemplate.getForEntity("http://localhost:8080/student/"+id, Student.class);

        return response.getBody();

    }

    @PostMapping(value = "/createstudent")
    public Student createinvokeStudent(@RequestBody Student stdObject) {

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

        std.setEmail(stdObject.getEmail());
        std.setRollNo(stdObject.getRollNo());
        std.setName(stdObject.getName());

        HttpEntity<Student> entity = new HttpEntity<Student>(std, headers);

        ResponseEntity<Student> response = restTemplate.exchange("http://localhost:8080/student", HttpMethod.POST,entity, Student.class );

        return response.getBody();
    }

    @GetMapping(value="/getstudents")
    public Student invokeFaculty(){
        //code to call student api.

        return null;
    }

    @PutMapping(value="/updatestudent")
    public Student invokeUpdateStudent(){

        return null;
    }
}
