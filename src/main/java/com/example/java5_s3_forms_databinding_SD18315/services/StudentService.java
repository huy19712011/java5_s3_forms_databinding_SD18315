package com.example.java5_s3_forms_databinding_SD18315.services;

import com.example.java5_s3_forms_databinding_SD18315.entities.Student;
import com.example.java5_s3_forms_databinding_SD18315.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    final
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.getStudents();
    }
}
