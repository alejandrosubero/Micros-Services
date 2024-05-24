package com.microservice.course.service;

import com.microservice.course.Http.response.StudentByCourseResponse;
import com.microservice.course.entity.Course;

import java.util.List;

public interface ICourcesServices {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByIdCurse(Long id);
}
