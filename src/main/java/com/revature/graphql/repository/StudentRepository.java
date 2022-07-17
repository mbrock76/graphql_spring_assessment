package com.revature.graphql.repository;

import com.revature.graphql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//an extension of the jpa repo for interacting with a database
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
