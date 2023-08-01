package com.luv.entities;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="addcontact")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AddContact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String contact;
	private String profession;
	private String organisation;
	private String address;
	private String city;
	private String uemail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public AddContact(int id, String name, String email, String contact, String profession, String organisation,
			String address, String city, String uemail) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.profession = profession;
		this.organisation = organisation;
		this.address = address;
		this.city = city;
		this.uemail = uemail;
	}
	public AddContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AddContact [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", profession="
				+ profession + ", organisation=" + organisation + ", address=" + address + ", city=" + city
				+ ", uemail=" + uemail + "]";
	}
	
	

}
