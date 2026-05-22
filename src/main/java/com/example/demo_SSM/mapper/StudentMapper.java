package com.example.demo_SSM.mapper;


import com.example.demo_SSM.dto.StudentDTO;
import com.example.demo_SSM.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentMapper {
    public StudentDTO toDTO(Student student) {
        if(student == null) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setClassName(student.getClassName());
        studentDTO.setCreateAt(student.getCreateAt());
        studentDTO.setUpdateAt(student.getUpdateAt());
        return studentDTO;
    }


    public Student toEntity(StudentDTO studentDTO) {
        if(studentDTO == null) {
            return null;
        }

        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setClassName(studentDTO.getClassName());
        student.setCreateAt(studentDTO.getCreateAt());
        student.setUpdateAt(studentDTO.getUpdateAt());
        return student;
    }
}
