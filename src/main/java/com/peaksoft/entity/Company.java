package com.peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;


@Entity
@NoArgsConstructor
@Table(name = "companies")
@Setter @Getter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_gen")
    @SequenceGenerator(name = "company_gen", sequenceName = "company_seq", allocationSize = 1)
    private Long id;

    @Column(length = 500, name = "company_name")
    private String companyName;

    @Column(length = 500, name = "located_country")
    private String locatedCountry;

    public Company(String companyName, String locatedCountry) {
        this.companyName = companyName;
        this.locatedCountry = locatedCountry;
    }

    @OneToMany(cascade = ALL, mappedBy = "company")
    private List<Course> courses;
    public void addCourse(Course course) {
        if (courses == null) courses = new ArrayList<>();
        courses.add(course);
    }

}
