package com.duyle.rentacar.demoapplication.controller;

import com.duyle.rentacar.demoapplication.model.Student;
import com.duyle.rentacar.demoapplication.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private StudentService studentService;

    public MainController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/hello")
    public String greeting() {
        return "Hello Springboot";
    }

    @PostMapping(value = "/students")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }
}
