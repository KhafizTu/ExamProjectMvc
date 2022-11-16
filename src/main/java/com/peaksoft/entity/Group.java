package com.peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
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

    private String groupName;

    private LocalDate dateOfStart;

    private String image;

    @ManyToMany(cascade = {DETACH, REFRESH, MERGE}, fetch = LAZY)
    @JoinTable(name = "courses_and_groups",
            joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "group_id", referencedColumnName = "id"))
    private List<Course> courses;
    public void addCourse(Course course) {
        if (courses == null) courses = new ArrayList<>();
        courses.add(course);
    }



    @OneToMany(cascade = ALL, fetch = LAZY, mappedBy = "group")
    private List<Student> students = new ArrayList<>();
    public void addStudent(Student student) {
        if (students == null) students = new ArrayList<>();
        students.add(student);
    }


}
