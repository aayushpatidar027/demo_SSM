package com.example.demo_SSM.repository;

import com.example.demo_SSM.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
