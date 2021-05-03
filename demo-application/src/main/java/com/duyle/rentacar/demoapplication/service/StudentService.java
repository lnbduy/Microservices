package com.duyle.rentacar.demoapplication.service;

import com.duyle.rentacar.demoapplication.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
}
