package com.example.demo_SSM.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private String className;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
