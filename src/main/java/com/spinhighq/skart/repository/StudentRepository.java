package com.spinhighq.skart.repository;

import org.springframework.data.repository.CrudRepository;

import com.spinhighq.skart.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
