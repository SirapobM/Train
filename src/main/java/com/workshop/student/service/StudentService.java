package com.workshop.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.student.entity.StudentEntity;
import com.workshop.student.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> getStudentAll() {
        return studentRepository.findAll();
    }

    public StudentEntity getstudentById(Integer studentId) {
        Optional<StudentEntity> student = studentRepository.findById(studentId);
        if (student.isPresent()) {
            return student.get();
        }
        return null;
    }

    public StudentEntity saveStudent(StudentEntity StudentEntity) {
        StudentEntity student = studentRepository.save(StudentEntity);
        return student;
    }

    public void deletestudentById(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}