package com.spinhighq.skart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long parentId;
	private String name;
	
	
	@OneToOne(mappedBy ="parent")
	private Student student;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
