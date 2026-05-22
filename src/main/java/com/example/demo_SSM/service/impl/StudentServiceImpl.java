package com.example.demo_SSM.service.impl;

import com.example.demo_SSM.dto.StudentDTO;
import com.example.demo_SSM.entity.Student;
import com.example.demo_SSM.exception.NotFoundException;
import com.example.demo_SSM.mapper.StudentMapper;
import com.example.demo_SSM.repository.StudentRepository;
import com.example.demo_SSM.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {

        private final StudentRepository studentRepository;
        private final StudentMapper studentMapper;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        studentDTO.setCreateAt(java.time.LocalDateTime.now());
        studentDTO.setUpdateAt(java.time.LocalDateTime.now());
        Student savedStudent =studentRepository.save(studentMapper.toEntity(studentDTO));
        return studentMapper.toDTO(savedStudent);
    }

    @Override
    public StudentDTO getStudentById(Long id) {
     Student student = studentRepository.findById(id).orElseThrow(()-> new NotFoundException("Student not found with id: " + id));
        return studentMapper.toDTO(student);
    }

    @Override
    public StudentDTO updateStudent(Long id, StudentDTO studentDTO) {

        Student student = studentRepository.findById(id).orElseThrow(() -> new NotFoundException("Student not found with id: " + id));


        student.setName(studentDTO.getName());
        student.setClassName(studentDTO.getClassName());
        student.setUpdateAt(java.time.LocalDateTime.now());

        Student saved = studentRepository.save(student);
return studentMapper.toDTO(saved);
    }

    @Override
    public void deleteStudent(Long id) {
    studentRepository.deleteById(id);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students=studentRepository.findAll();
        if(students.isEmpty()){
            throw new NotFoundException("No students found");
        }
        List<StudentDTO> studentDTOS=new ArrayList<>();
            for(Student student:students){
                studentDTOS.add(studentMapper.toDTO(student));
            }

            return studentDTOS;
    }
}
