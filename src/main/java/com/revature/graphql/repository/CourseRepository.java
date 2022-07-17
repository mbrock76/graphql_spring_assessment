package com.revature.graphql.repository;

import com.revature.graphql.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//an extension of the jpa repo for interacting with a database
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
