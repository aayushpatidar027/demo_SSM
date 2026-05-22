package com.example.demo_SSM.dto;


import lombok.Data;

import java.util.List;

@Data
public class SubjectDTO {
    private Long id;
    private String subjectName;
    private List<MarksDTO> marks;
}
