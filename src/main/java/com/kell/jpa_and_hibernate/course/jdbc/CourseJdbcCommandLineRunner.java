package com.kell.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kell.jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert( new Course(1, "Learn JPA", "With Kell"));
		repository.insert( new Course(2, "Learn JPA", "With Kell"));
		repository.insert( new Course(3, "Learn VAIII Meu Aparceiro", "With Kell"));
		
		// delete a course by id 
		repository.delete(1);
		
		//Long the select query from repository
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
	}

}
