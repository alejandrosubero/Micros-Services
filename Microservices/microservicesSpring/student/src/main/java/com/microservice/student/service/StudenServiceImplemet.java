package com.microservice.student.service;

import com.microservice.student.entitys.Student;
import com.microservice.student.persistence.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudenServiceImplemet implements IStudenService {

    private StudentRepository studentRepository;

    public StudenServiceImplemet(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findByCourseId(Long id) {
        return studentRepository.findAllByCourseId(id);
    }
}
