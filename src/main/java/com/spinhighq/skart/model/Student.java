package com.spinhighq.skart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer studentId;
	
	private String studentName;
	
	private String email;
	
	private String dateOfBirth;
	
	private String className;

	private String dateOfJoning;
	
	private String bloodGroup;
	
	private String address;
	
	private String parentName;
	
	private Long mobilePhone;
	
	private String section;
	
	private Float currentAttendance;
	
	private Float overalAttendance;
	
	private Float performanceRating;
	
	private String photo;

	@OneToOne
	@JoinTable(name="student_parent")
	private Parent parent;
	
	

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDateOfJoning() {
		return dateOfJoning;
	}

	public void setDateOfJoning(String dateOfJoning) {
		this.dateOfJoning = dateOfJoning;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Long getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(Long mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Float getCurrentAttendance() {
		return currentAttendance;
	}

	public void setCurrentAttendance(Float currentAttendance) {
		this.currentAttendance = currentAttendance;
	}

	public Float getOveralAttendance() {
		return overalAttendance;
	}

	public void setOveralAttendance(Float overalAttendance) {
		this.overalAttendance = overalAttendance;
	}

	public Float getPerformanceRating() {
		return performanceRating;
	}

	public void setPerformanceRating(Float performanceRating) {
		this.performanceRating = performanceRating;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


}
