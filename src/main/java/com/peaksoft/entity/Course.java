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
@Setter @Getter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_gen")
    @SequenceGenerator(name = "course_gen", sequenceName = "course_seq", allocationSize = 1)
    private Long id;

    private String courseName;

    private LocalDate duration;

    private String description;

    @ManyToOne(cascade = {DETACH, MERGE, REFRESH}, fetch = EAGER)
    private Company company;

    @ManyToMany(cascade = ALL, fetch = LAZY, mappedBy = "courses")
    private List<Group> groups;
    public void addGroup(Group group) {
        if (groups == null) groups = new ArrayList<>();
        groups.add(group);
    }

    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "course")
    private List<Instructor> instructors;
    public void addInstructor(Instructor instructor) {
        if (instructors == null) instructors = new ArrayList<>();
        instructors.add(instructor);
    }

    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "course")
    private List<Lesson> lessons;
    public void addLesson(Lesson lesson) {
        if (lessons == null) lessons = new ArrayList<>();
        lessons.add(lesson);
    }


}
