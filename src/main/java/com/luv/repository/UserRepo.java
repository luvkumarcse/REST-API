package com.luv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv.entities.User;
@Repository
public interface UserRepo extends JpaRepository<User, String>{

	

	

}
