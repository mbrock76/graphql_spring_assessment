package com.revature.graphql.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

//course bean with matching variables
@Table(name = "courses", schema = "walmart")
@Entity(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "course_id")
    private int course_id;

    @Column(name = "course_name")
    private String course_name;

    @Column(name = "description")
    private String description;

    @Column(name = "start")
    private LocalDate start;

    @Column(name = "finish")
    private LocalDate finish;

}
