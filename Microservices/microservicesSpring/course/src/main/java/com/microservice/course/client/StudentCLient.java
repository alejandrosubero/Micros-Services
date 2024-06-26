package com.microservice.course.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "${feign.clients.msvc-student.name}", url = "${feign.clients.msvc-student.url}")
//@FeignClient(name = "msvc-student", url = "localhost:8998/api/student")
public interface StudentCLient {
    @GetMapping("/search-by-course/{idCourse}")
    List<?> findAllStudentByCourse(@PathVariable Long idCourse);
}

