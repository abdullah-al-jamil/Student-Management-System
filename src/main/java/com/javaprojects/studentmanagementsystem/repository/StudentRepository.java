package com.javaprojects.studentmanagementsystem.repository;

import com.javaprojects.studentmanagementsystem.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
