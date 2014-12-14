package com.spinhighq.skart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.spinhighq.skart.model.Users;

@Service
public interface UsersRepository extends CrudRepository<Users, Long>{

	Users findByUserName(String userName);

}
