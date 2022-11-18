package com.peaksoft.entity;

import com.peaksoft.enums.studentenum.StudyFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;


@Entity
@NoArgsConstructor
@Table(name = "students")
@Setter @Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
    @SequenceGenerator(name = "student_gen", sequenceName = "student_seq", allocationSize = 1)
    private Long id;

    @Column(length = 500, name = "first_name")
    private String firstname;

    @Column(length = 500, name = "last_name")
    private String lastname;

    @Column(length = 500, name = "phone_number")
    private Integer phoneNumber;

    @Column(length = 500, name = "email")
    private String email;

    @Column(name = "study_format")
    private StudyFormat studyFormat;

    public Student(String firstname, String lastname, Integer phoneNumber, String email, StudyFormat studyFormat) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.studyFormat = studyFormat;
    }

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = LAZY)
    private Group group;

}
