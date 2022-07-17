package com.revature.graphql.resolver;


import com.revature.graphql.model.Course;
import com.revature.graphql.repository.CourseRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

// endoint for the course object/table
@Controller
public class CourseQuery implements GraphQLQueryResolver {

    @Autowired
    CourseRepository courseRepository;

    // retrieves a list of all course records in the students table
    @QueryMapping
    public List<Course> getAllCourses(){
        System.out.println("Course all");
        return courseRepository.findAll();
    }

    // gets a course record where the primary key equals the supplied argument
    @QueryMapping
    public Course getCourseById(@Argument int id){
        System.out.println("Course " + id);
        return courseRepository.findById(id).orElse(new Course());
    }
}
