package com.kell.jpa_and_hibernate.course.jpa;


import org.springframework.stereotype.Repository;

import com.kell.jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CourseJpsRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	// Inserting data to the database
		public void insert(Course course) {
			entityManager.merge(course);
		}
		
		//Deleting course by id
		public void delete(long id) {
			Course course = entityManager.find(Course.class, id);
			entityManager.remove(course);
		}
		
		// Making a query to the database
		public Course findById(long id) {
			return entityManager.find(Course.class, id);
		}

}
