package com.example.demo.controller;


import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    //http:localhost:8082/student/showname
    @GetMapping(value = "/showname")
    public String getName(){
        return "Hi Saman";
    }


    @GetMapping("/showstudent")
    public ResponseEntity<String> getStudent() {
        try {
            String student = studentService.showName();
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
