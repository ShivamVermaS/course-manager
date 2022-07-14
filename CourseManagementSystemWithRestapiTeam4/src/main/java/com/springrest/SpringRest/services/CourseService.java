package com.springrest.SpringRest.services;



import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.Repository.CourseRepo;
import com.springrest.SpringRest.entities.Courses;


@Service
public class CourseService {
@Autowired
CourseRepo courseRepo;

public List<Courses> getAllCourses() {
	// TODO Auto-generated method stub
	return courseRepo.findAll();
}

public Optional<Courses> getCourseById(long id) {
	// TODO Auto-generated method stub
	return courseRepo.findById(id);
}

public Courses saveAllCourse(@Valid Courses course) {
	// TODO Auto-generated method stub
	return courseRepo.save(course);
}

public Courses updateCourse(@Valid Courses course) {
	// TODO Auto-generated method stub
	Optional<Courses> c= courseRepo.findById(course.getId());
	
	
	return courseRepo.save(course);
	
}

public String deleteCourseById(long id) {
	// TODO Auto-generated method stub

	 courseRepo.deleteById(id);
	 return "Course deleted";
	
	
}

public Courses getCourses(String name) {
	// TODO Auto-generated method stub
	return courseRepo.findByTitle(name);
}

public Object saveCoursesDetail(@Valid Courses course) {
	// TODO Auto-generated method stub
	return null;
}





}
