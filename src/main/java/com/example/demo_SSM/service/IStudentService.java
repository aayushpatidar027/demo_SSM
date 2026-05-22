package com.example.demo_SSM.service;

import com.example.demo_SSM.dto.StudentDTO;

public interface IStudentService {
    StudentDTO createStudent(StudentDTO studentDTO);
   StudentDTO getStudentById(Long id);
    StudentDTO updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
    java.util.List<StudentDTO> getAllStudents();
}
