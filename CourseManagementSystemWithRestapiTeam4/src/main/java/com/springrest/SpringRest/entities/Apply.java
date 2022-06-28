package com.springrest.SpringRest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apply {
	String FirstName;
	String LastName;
	String CourseName;
	@Id
	String CourseId;
	String Fees;
	String Duration;
	public Apply() {
		super();
		
	}
	public Apply(String firstName, String lastName, String courseName, String courseId, String fees, String duration) {
		super();
		FirstName = firstName;
		LastName = lastName;
		CourseName = courseName;
		CourseId = courseId;
		Fees = fees;
		Duration = duration;
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
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getFees() {
		return Fees;
	}
	public void setFees(String fees) {
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
		return "Apply [FirstName=" + FirstName + ", LastName=" + LastName + ", CourseName=" + CourseName + ", CourseId="
				+ CourseId + ", Fees=" + Fees + ", Duration=" + Duration + "]";
	}
	
	

}
