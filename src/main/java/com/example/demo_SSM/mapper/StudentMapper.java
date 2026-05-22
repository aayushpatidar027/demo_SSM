package com.example.demo_SSM.mapper;


import com.example.demo_SSM.dto.StudentDTO;
import com.example.demo_SSM.entity.Student;
import org.springframework.stereotype.Service;


@Service
public class StudentMapper {
    public StudentDTO toDTO(Student student) {
        if(student == null) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());

        return studentDTO;
    }
}
