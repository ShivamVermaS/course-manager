package com.springrest.SpringRest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
@Entity
public class Admin {
	@NotEmpty
	@Size(min=1, max=20, message="Name Should not be empty")
	String name;
	@NotEmpty
	@Size(min=1, max=20, message="Name Should not be empty")
	String username;
	@NotEmpty
	@Id
	@javax.validation.constraints.Email(message="Invalid Email")
	@Column(length=30, unique = true)
	String email;
	@NotEmpty
	@Size(min=1, max=20, message="Name Should not be empty")
	String password;
	
	
	
		public Admin(String name, String username, String email, String password) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public Admin() {
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	

}
