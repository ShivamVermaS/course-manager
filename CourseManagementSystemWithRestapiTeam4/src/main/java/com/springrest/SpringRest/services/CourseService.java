package com.springrest.SpringRest.services;

import java.util.List;

import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Apply;
import com.springrest.SpringRest.entities.Courses;

public interface CourseService {

		public List<Courses> getCourses();
	public Courses getcourse(long courseId);
	
	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);
	
	public void deleteCourse(long parseLong);

	public Admin saveAllAdmins(Admin admin);

	public List<Admin> getAllAdmins();

	public void saveApplies(Apply apply);

	public List<Apply> getAllApplies();

	

}
