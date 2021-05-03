package com.duyle.rentacar.demoapplication.repository;

import com.duyle.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
