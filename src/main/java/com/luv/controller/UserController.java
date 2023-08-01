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
import com.luv.entities.User;
import com.luv.repository.UserRepo;

@RestController
public class UserController {
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/profile/{kvch}")
	public User profile(@PathVariable String kvch)
	{
		return userRepo.getById(kvch);
	}
	@PutMapping("updateprofile")
	public User updateProfile(@RequestBody User ob)
	{
		return userRepo.save(ob);
	}
	@PutMapping("/changepassword/{oldpass}/{newpass}/{uemail}")
	public String changepassword(@PathVariable String oldpass,
			@PathVariable String newpass,
			@PathVariable String uemail)
	{
		String name="";
		String contact="";
		String password="";
		String profession="";
		String address="";
		String city="";
		String country="";
		String role="";
		String status="";
		User a=(User)userRepo.getById(uemail);
		//return a.getUpassword();
		name=a.getUname();
		uemail=a.getUemail();
		contact=a.getUcontact();
		password=a.getUpassword();
		profession=a.getUprofession();
		address=a.getUaddress();
		city=a.getUcity();
		country=a.getUcountry();
		role=a.getRole();
		status=a.getStatus();
		if(a.getUpassword().equals(oldpass))
		{
			
			a.setUname(name);
			a.setUcontact(contact);
			a.setUpassword(newpass);
			a.setUprofession(profession);
			a.setUaddress(address);
			a.setUcity(city);
			a.setUcountry(country);
			a.setRole(role);
			a.setStatus(status);
			a.setUemail(uemail);
			userRepo.save(a);
			
		}
		return "password changed";
	}
	@GetMapping("/completeuser")
	public List<User> allUser()
	{
		return userRepo.findAll();
	}
	@DeleteMapping("/deleterecord/{id}")
	public String deleteRecord(@PathVariable String id)
	{
		userRepo.deleteById(id);
		return "data deleted";
	}
	@GetMapping("/loginn/{uemail}/{upassword}")
	public String loginn(@PathVariable String uemail,
			@PathVariable String upassword)
	{
		
		//return uemail+upassword;
		User ob=(User)userRepo.getById(uemail);
		if(ob.getUpassword().equals(upassword))
			return "true";
			else
			return "false";
		
	}
	@PostMapping("/register")
	public User registerUser(@RequestBody User ob)
	{
		return userRepo.save(ob);
	}

}
