package com.revature.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// starts up the microservice and points to the controllers
@SpringBootApplication
@ComponentScan(basePackages = "com.revature.graphql.resolver")
public class GraphqlApplication  {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);

	}


}