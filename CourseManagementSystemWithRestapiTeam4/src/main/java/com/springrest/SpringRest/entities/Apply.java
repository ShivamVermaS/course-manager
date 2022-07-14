package com.springrest.SpringRest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Apply {
	
	@NotEmpty
	@Size(min=1, max=30, message="Name Should not be empty")
	String First_name;
	@NotEmpty
	@Size(min=1, max=30, message="Name Should not be empty")
	String Last_name;
	@NotEmpty
	@Size(min=1, max=30, message="Name Should not be empty")
	String Course_name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Course_id;
	
	int Fees;
	@NotEmpty
	@Size(min=1, max=30, message="Name Should not be empty")
	String Duration;
	public Apply() {
		super();
	}
	
	public Apply(@NotEmpty @Size(min = 1, max = 30, message = "Name Should not be empty") String first_name,
			@NotEmpty @Size(min = 1, max = 30, message = "Name Should not be empty") String last_name,
			@NotEmpty @Size(min = 1, max = 30, message = "Name Should not be empty") String course_name, int course_id,
			 int fees,
			@NotEmpty @Size(min = 1, max = 50, message = "Name Should not be empty") String duration) {
		super();
		First_name = first_name;
		Last_name = last_name;
		Course_name = course_name;
		Course_id = course_id;
		Fees = fees;
		Duration = duration;
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
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public int getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Apply [First_name=" + First_name + ", Last_name=" + Last_name + ", Course_name=" + Course_name
				+ ", Course_id=" + Course_id + ", Fees=" + Fees + ", Duration=" + Duration + "]";
	}
	
}
