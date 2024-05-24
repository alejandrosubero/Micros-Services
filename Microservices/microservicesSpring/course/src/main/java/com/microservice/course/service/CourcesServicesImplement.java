package com.microservice.course.service;

import com.microservice.course.Http.response.StudentByCourseResponse;
import com.microservice.course.client.StudentCLient;
import com.microservice.course.dto.StudentDTO;
import com.microservice.course.entity.Course;
import com.microservice.course.percitence.CoursesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourcesServicesImplement implements ICourcesServices {

    private CoursesRepository repository;

    private StudentCLient studentCLient;

    public CourcesServicesImplement(CoursesRepository repository, StudentCLient studentCLient) {
        this.repository = repository;
        this.studentCLient = studentCLient;
    }

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        repository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCurse(Long id) {
        Course course = repository.findById(id).orElse(Course.builder().build());
        List<StudentDTO> studentDTOList = (List<StudentDTO>) studentCLient.findAllStudentByCourse(id);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList).build();
    }
}
