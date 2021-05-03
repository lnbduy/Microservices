package com.duyle.rentacar.demoapplication.service;

import com.duyle.rentacar.demoapplication.model.Student;
import com.duyle.rentacar.demoapplication.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Student fetchStudentById(int id) {
        return repository.findById(id).orElse(null);
    }
}
