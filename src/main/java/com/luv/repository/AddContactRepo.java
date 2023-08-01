package com.luv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv.entities.AddContact;

public interface AddContactRepo extends JpaRepository<AddContact, Integer> {

	List<AddContact> getByName(String name);

}
