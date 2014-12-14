package com.spinhighq.skart.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spinhighq.skart.exceptions.NotFoundException;
import com.spinhighq.skart.model.Student;
import com.spinhighq.skart.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	/**
	 * Get all Students
	 * 
	 * @return
	 */
	public List<Student> getStudents() {
		List<Student> studentList = (List<Student>) studentRepo.findAll();
		return studentList;
	}

	/**
	 * get method for student
	 * 
	 * @param studentId
	 * @return
	 */
	public Student getStudent(long studentId) {
		Student student = new Student();

		student = studentRepo.findOne(studentId);

		if (null == student) {
			throw new NotFoundException("Student with studentId :" + studentId);
		}

		return student;
	}

	/**
	 * method for creating Student
	 * 
	 * @param student
	 */
	public void createStudent(Student student) {
		studentRepo.save(student);
	}

	/**
	 * 
	 * update method for updating Student
	 * 
	 * @param studentId
	 * @param studentData
	 */
	public void updateStudent(long studentId, Student studentData) {

		Student student = studentRepo.findOne(studentId);

		if (null == student) {
			throw new NotFoundException("Student with Student ID:" + studentId);
		}

		BeanUtils.copyProperties(studentData, student);
		studentRepo.save(student);
	}

	/**
	 * 
	 * Delete method for Student
	 * @param studentId
	 */
	public void deleteStudent(long studentId) {

		Student student = studentRepo.findOne(studentId);

		if (null == student) {
			throw new NotFoundException("Student with Student ID:" + studentId);
		}
		studentRepo.delete(student);
	}

}
