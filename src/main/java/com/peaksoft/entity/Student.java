package com.peaksoft.entity;

import com.peaksoft.enums.studentenum.StudyFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;


@Entity
@NoArgsConstructor
@Table(name = "students")
@Setter @Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
    @SequenceGenerator(name = "student_gen", sequenceName = "student_seq", allocationSize = 1)
    private Long id;

    private String firstname;

    private String lastname;

    private Integer phoneNumber;

    private String email;

    private StudyFormat studyFormat;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private Group group;

}
