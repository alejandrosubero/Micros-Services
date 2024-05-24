package com.microservice.student.service;

import com.microservice.student.entitys.Student;

import java.util.List;

public interface IStudenService {

    public List<Student> findAll();
    public Student findById(Long id);
    void save(Student student);
    public List<Student> findByCourseId(Long id);

}
