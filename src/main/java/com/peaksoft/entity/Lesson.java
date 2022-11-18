package com.peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@Table(name = "lessons")
@Setter @Getter
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lesson_gen")
    @SequenceGenerator(name = "lesson_gen", sequenceName = "lesson_seq", allocationSize = 1)
    private Long id;
    @Column(length = 500, name = "lesson_name")
    private String lessonName;

    public Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE},fetch = LAZY)
    private Course course;

    @OneToMany(cascade = ALL, fetch = EAGER, mappedBy = "lesson")
    private List<Task> tasks = new ArrayList<>();



    public void addTask(Task task) {
        if (tasks == null) tasks = new ArrayList<>();
        tasks.add(task);
    }

}
