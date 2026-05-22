package com.example.demo_SSM.controller;

import com.example.demo_SSM.dto.StudentDTO;
import com.example.demo_SSM.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO) {
        StudentDTO student = studentService.createStudent(studentDTO);
        return new ResponseEntity<>(student, ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), ResponseEntity.ok().build().getStatusCode());
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id) {
        StudentDTO student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, ResponseEntity.ok().build().getStatusCode());
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable Long id,@RequestBody StudentDTO studentDTO)
    {
        StudentDTO studentDTO1 = studentService.updateStudent(id, studentDTO);
        return new ResponseEntity<>(studentDTO1, ResponseEntity.ok().build().getStatusCode());
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(ResponseEntity.ok().build().getStatusCode());
    }
}
