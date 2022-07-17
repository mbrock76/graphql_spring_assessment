package com.revature.graphql.model;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.time.LocalDate;

//student bean with matching variables
@Table(name = "students", schema = "walmart")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "student_id")
    private int student_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private int age;

    @Column(name = "dob")
    private LocalDate dob;


}
