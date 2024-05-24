package com.microservice.course.Http.response;


import com.microservice.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentByCourseResponse {
    private  String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;


}
