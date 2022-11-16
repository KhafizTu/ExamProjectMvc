package com.peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.EAGER;

@Entity
@NoArgsConstructor
@Table(name = "tasks")
@Setter
@Getter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_gen")
    @SequenceGenerator(name = "company_gen", sequenceName = "company_seq", allocationSize = 1)
    private Long id;

    private String taskName;

    private String taskText;

    private LocalDate deadLine;

    @ManyToOne(cascade = {DETACH, REFRESH, MERGE}, fetch = EAGER)
    private Lesson lesson;
}
