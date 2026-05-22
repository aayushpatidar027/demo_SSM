package com.example.demo_SSM.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private List<MarksDTO> marks;
}
