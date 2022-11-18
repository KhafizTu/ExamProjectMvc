package com.peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@Table(name = "courses")
@Setter
@Getter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_gen")
    @SequenceGenerator(name = "course_gen", sequenceName = "course_seq", allocationSize = 1)
    private Long id;

    @Column(length = 500, name = "course_name")
    private String courseName;

    @Column(length = 500, name = "duration")
    private LocalDate duration;

    @Column(length = 500, name = "description")
    private String description;

    public Course(String courseName, LocalDate duration, String description) {
        this.courseName = courseName;
        this.duration = duration;
        this.description = description;
    }

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = LAZY)
    private Company company;
    @ManyToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE, PERSIST}, fetch = LAZY, mappedBy = "courses")
    private List<Group> groups;
    @OneToMany(cascade = ALL, mappedBy = "course")
    private List<Instructor> instructors;
    @OneToMany(cascade = {DETACH, MERGE, REFRESH, REMOVE, PERSIST}, fetch = EAGER, mappedBy = "course")
    private List<Lesson> lessons;


    public void addGroup(Group group) {
        if (groups == null) groups = new ArrayList<>();
        groups.add(group);
    }

    public void addInstructor(Instructor instructor) {
        if (instructors == null) instructors = new ArrayList<>();
        instructors.add(instructor);
    }

    public void addLesson(Lesson lesson) {
        if (lessons == null) lessons = new ArrayList<>();
        lessons.add(lesson);
    }


}
