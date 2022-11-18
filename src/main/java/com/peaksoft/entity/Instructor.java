package com.peaksoft.entity;

import com.peaksoft.enums.instructorenum.Specialization;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@Table(name = "instructors")
@Setter @Getter
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "instructor_gen")
    @SequenceGenerator(name = "instructor_gen", sequenceName = "instructor_seq", allocationSize = 1)
    private Long id;

    @Column(length = 500, name = "first_name")
    private String firstname;

    @Column(length = 500, name = "last_name")
    private String lastname;

    @Column(length = 500, name = "phone_number")
    private Integer phoneNumber;

    @Column(length = 500, name = "email")
    private String email;

    @Column(name = "specialization")
    private Specialization specialization;

    public Instructor(String firstname, String lastname, Integer phoneNumber, String email, Specialization specialization) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.specialization = specialization;
    }

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH},fetch = LAZY)
    private Course course;



}
