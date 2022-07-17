package com.revature.graphql.resolver;


import com.revature.graphql.model.Student;
import com.revature.graphql.repository.StudentRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

// endoint for the student object/table
@Controller
public class StudentQuery implements GraphQLQueryResolver {

    @Autowired
    StudentRepository studentRepository;

    // retrieves a list of all student records in the students table
    @QueryMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // gets a student record where the primary key equals the supplied argument
    @QueryMapping
    public Student getStudentById(@Argument int id){
        return studentRepository.findById(id).orElse(new Student());
    }
}
