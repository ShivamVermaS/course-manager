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
String FirstName;
@NotEmpty
String LastName;

@javax.validation.constraints.Email(message="Invalid Email")
@Column(length=30, unique = true)
String Email;

@NotNull
String Password;
String Gender;
@NotEmpty
String Mobile_No;

public NewUser() {
	
	
}
public NewUser(long uid, String firstName, String lastName, String email, String password, String gender,
		String mobile_No) {
	super();
	this.uid = uid;
	FirstName = firstName;
	LastName = lastName;
	Email = email;
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



public String getFirstName() {
	return FirstName;
}



public void setFirstName(String firstName) {
	FirstName = firstName;
}



public String getLastName() {
	return LastName;
}



public void setLastName(String lastName) {
	LastName = lastName;
}



public String getEmail() {
	return Email;
}



public void setEmail(String email) {
	Email = email;
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



public void setJendra(String gender) {
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
	return "NewUser [Uid=" + uid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
			+ ", Password=" + Password + ", Gender=" + Gender + ", Mobile_No=" + Mobile_No + "]";
}


}
