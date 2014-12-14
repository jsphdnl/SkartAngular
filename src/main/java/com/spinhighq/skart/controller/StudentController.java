package com.spinhighq.skart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spinhighq.skart.model.Student;
import com.spinhighq.skart.service.StudentService;
import com.spinhighq.skart.utils.RestResponse;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	/**
	 * Post method for Student
	 * 
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/student/", method = RequestMethod.POST)
	public RestResponse createStudent(@RequestBody Student student) {

		studentService.createStudent(student);
		return new RestResponse(student.getStudentId(), "Student", "POST");
	}

	/**
	 * Update method for Student
	 * 
	 * @param studentId
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "/student/{studentId}", method = RequestMethod.PUT)
	public RestResponse updateStudent(
			@PathVariable("studentId") long studentId,
			@RequestBody Student student) {

		studentService.updateStudent(studentId, student);
		return new RestResponse(student.getStudentId(), "Student", "PUT");
	}

	/**
	 * 
	 * DELETE Method for Student
	 * 
	 * @param studentId
	 * @return
	 */
	@RequestMapping(value = "/student/{studentId}", method = RequestMethod.DELETE)
	public RestResponse deleteStudent(
			@PathVariable("studentId") long studentId) {

		studentService.deleteStudent(studentId);
		return new RestResponse(studentId, "Student", "DELETE");
	}

	
}
