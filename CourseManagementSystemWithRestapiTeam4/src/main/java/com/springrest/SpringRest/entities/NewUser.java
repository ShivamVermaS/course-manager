package com.springrest.SpringRest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class NewUser {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long uid;

@NotEmpty
@Size(min=1, max=20, message="Name Should not be empty")
String First_name;
@NotEmpty
String Last_name;
@NotEmpty
@javax.validation.constraints.Email(message="Invalid Email")
@Column(length=30, unique = true)
String email;

@NotNull
String Password;
String Gender;
@NotEmpty
String Mobile_No;

public NewUser() {
	
	
}

public NewUser(long uid, @NotEmpty @Size(min = 1, max = 20, message = "Name Should not be empty") String first_name,
		@NotEmpty String last_name,
		@NotEmpty @javax.validation.constraints.Email(message = "Invalid Email") String email, @NotNull String password,
		String gender, @NotEmpty String mobile_No) {
	super();
	this.uid = uid;
	First_name = first_name;
	Last_name = last_name;
	this.email = email;
	Password = password;
	Gender = gender;
	Mobile_No = mobile_No;
}

public long getUid() {
	return uid;
}

public void setUid(long uid) {
	this.uid = uid;
}

public String getFirst_name() {
	return First_name;
}

public void setFirst_name(String first_name) {
	First_name = first_name;
}

public String getLast_name() {
	return Last_name;
}

public void setLast_name(String last_name) {
	Last_name = last_name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}

public String getMobile_No() {
	return Mobile_No;
}

public void setMobile_No(String mobile_No) {
	Mobile_No = mobile_No;
}

@Override
public String toString() {
	return "NewUser [uid=" + uid + ", First_name=" + First_name + ", Last_name=" + Last_name + ", Email=" + email
			+ ", Password=" + Password + ", Gender=" + Gender + ", Mobile_No=" + Mobile_No + "]";
}



}
