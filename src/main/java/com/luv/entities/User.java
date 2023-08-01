package com.luv.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
	private String uname;
	@Id
	private String uemail;
	private String ucontact;
	private String upassword;
	private String uprofession;
	private String uaddress;
	private String ucity;
	private String ucountry;
	private String role;
	private String status;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUcontact() {
		return ucontact;
	}
	public void setUcontact(String ucontact) {
		this.ucontact = ucontact;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUprofession() {
		return uprofession;
	}
	public void setUprofession(String uprofession) {
		this.uprofession = uprofession;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	public String getUcountry() {
		return ucountry;
	}
	public void setUcountry(String ucountry) {
		this.ucountry = ucountry;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User(String uname, String uemail, String ucontact, String upassword, String uprofession, String uaddress,
			String ucity, String ucountry, String role, String status) {
		super();
		this.uname = uname;
		this.uemail = uemail;
		this.ucontact = ucontact;
		this.upassword = upassword;
		this.uprofession = uprofession;
		this.uaddress = uaddress;
		this.ucity = ucity;
		this.ucountry = ucountry;
		this.role = role;
		this.status = status;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", uemail=" + uemail + ", ucontact=" + ucontact + ", upassword=" + upassword
				+ ", uprofession=" + uprofession + ", uaddress=" + uaddress + ", ucity=" + ucity + ", ucountry="
				+ ucountry + ", role=" + role + ", status=" + status + "]";
	}
	
	

}
