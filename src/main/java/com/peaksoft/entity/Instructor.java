package com.peaksoft.entity;

import com.peaksoft.enums.instructorenum.Specialization;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;

@Entity
@NoArgsConstructor
@Table(name = "instructors")
@Setter @Getter
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructor_gen")
    @SequenceGenerator(name = "instructor_gen", sequenceName = "instructor_seq", allocationSize = 1)
    private Long id;

    private String firstname;

    private String lastname;

    private Integer phoneNumber;

    private String email;

    private Specialization specialization;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private Course course;



}
