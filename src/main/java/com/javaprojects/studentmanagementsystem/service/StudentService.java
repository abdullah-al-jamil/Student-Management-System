package com.javaprojects.studentmanagementsystem.service;

import java.util.List;

import com.javaprojects.studentmanagementsystem.model.Student;

public interface StudentService {
    public List<Student>getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
