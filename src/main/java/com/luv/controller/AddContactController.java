package com.luv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luv.entities.AddContact;
import com.luv.repository.AddContactRepo;

@RestController
public class AddContactController {
	@Autowired
	private AddContactRepo addcontactrepo;
	@PostMapping("/addcontact")
	public AddContact addContact(@RequestBody AddContact ob)
	{
	
		return addcontactrepo.save(ob);
		
	}
	@PutMapping("/updatecontact")
	public AddContact updateContact(@RequestBody AddContact ob)
	{
	return addcontactrepo.save(ob);	
	}
	@DeleteMapping("/deletecontact/{id}")
	public String deleteContact(@PathVariable int id)
	{
		addcontactrepo.deleteById(id);
		return "contact deleted";
	}
	@GetMapping("/getcontact/{id}")
	public AddContact getContact(@PathVariable int id)
	{
		return addcontactrepo.getById(id);
	}
	@GetMapping("getAllContact")
	public List<AddContact> getAllContact()
	{
		return addcontactrepo.findAll();
	}
	@GetMapping("/getbyName/{name}")
	public List<AddContact> getByName(@PathVariable String name)
	{
		return addcontactrepo.getByName(name);
	}
	

}
