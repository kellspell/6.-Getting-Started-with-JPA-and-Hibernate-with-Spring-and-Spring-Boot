package com.kell.jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kell.jpa_and_hibernate.course.Course;
import com.kell.jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJpsRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert( new Course(1, "Learn Java", "With Kell"));
//		repository.insert( new Course(2, "Learn Rust", "With Kell"));
//		repository.insert( new Course(3, "Learn Dart", "With Kell"));
		
		repository.save( new Course(1, "Learn Java", "With Kell"));
		repository.save( new Course(2, "Learn Rust", "With Kell"));
		repository.save( new Course(3, "Learn Dart", "With Kell"));
		
		// delete a course by id 
//		repository.delete(1l);
		
		//Long the select query from repository
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
	}

}
