package com.vrx.SpringMvcProject.controller;

import com.vrx.SpringMvcProject.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/student")
public class StudentController {

    //create student
    //java--> java object = deserialization
    @PostMapping("/create")
    public Student createUser(@RequestBody Student student) {
        System.out.println("StudentData:" + student);
        student.setBranch("ECE");
        System.out.println(student);
        return student;
        //we have to create student
    }
}
