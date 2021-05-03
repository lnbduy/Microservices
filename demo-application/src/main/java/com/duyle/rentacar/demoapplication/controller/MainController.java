package com.duyle.rentacar.demoapplication.controller;

import com.duyle.rentacar.demoapplication.model.Student;
import com.duyle.rentacar.demoapplication.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/students/{id}")
    public ResponseEntity<Student> fetchStudentById(@PathVariable int id) {
        Student student = studentService.fetchStudentById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(student);
        }
    }
}
