 package com.kell.jpa_and_hibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	//constructor call
		public Course() {} 
		
	
	// database tables
	@Id
	private long id;
//	@Column(name="name") this can be used but its not mandatory, its just a specification of a field 
	private String name;
//	@Column(name="author")
	private String author;
	
	
	
	
	
	// Constructor
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	
	//Getter & Setter
	public long getId() {
		return id;
	}






	public void setId(long id) {
		this.id = id;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getAuthor() {
		return author;
	}






	public void setAuthor(String author) {
		this.author = author;
	}





	//toString
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
