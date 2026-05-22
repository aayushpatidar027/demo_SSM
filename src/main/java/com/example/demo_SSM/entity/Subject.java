package com.example.demo_SSM.entity;

import jakarta.persistence.OneToMany;

import java.util.List;

@jakarta.persistence.Entity
@lombok.Getter
@lombok.Setter
public class Subject {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String subjectName;

    @OneToMany(mappedBy = "subject")
    List<Marks> marks;
}
