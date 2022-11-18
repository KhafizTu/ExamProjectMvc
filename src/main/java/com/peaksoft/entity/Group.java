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
@Table(name = "groups")
@Setter @Getter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_gen")
    @SequenceGenerator(name = "group_gen", sequenceName = "group_seq", allocationSize = 1)
    private Long id;

    @Column(length = 500, name = "group_name")
    private String groupName;

    @Column(name = "date_of_start")
    private LocalDate dateOfStart;

    @Column(name = "image")
    private String image;

    public Group(String groupName, LocalDate dateOfStart, String image) {
        this.groupName = groupName;
        this.dateOfStart = dateOfStart;
        this.image = image;
    }

    @ManyToMany(cascade = {DETACH, REFRESH, MERGE}, fetch = LAZY)
    @JoinTable(name = "groups_courses",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private List<Course> courses;
    @OneToMany(cascade = ALL,fetch = EAGER, mappedBy = "group")
    private List<Student> students = new ArrayList<>();


    public void addCourse(Course course) {
        if (courses == null) courses = new ArrayList<>();
        courses.add(course);
    }
    public void addStudent(Student student) {
        if (students == null) students = new ArrayList<>();
        students.add(student);
    }


}
