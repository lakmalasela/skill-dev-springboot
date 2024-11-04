package com.example.demo.service.imp;

import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    public String showName(){
        return "Hi Amal";
    }

}
