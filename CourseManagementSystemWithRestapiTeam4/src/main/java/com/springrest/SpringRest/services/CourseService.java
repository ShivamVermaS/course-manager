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
		Optional<Courses> course = courseRepo.findById(id);
		try {
			if (!course.isPresent()) {

				throw new IllegalArgumentException("Not Present");
			} else {

				return course;
			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Not Present");
		}
	}

	public Courses saveAllCourse(@Valid Courses course) {

		Optional<Courses> c = courseRepo.findById(course.getId());
		try {
			if (!c.isPresent()) {
				
				throw new IllegalArgumentException("Not Present");
			} else {
				return courseRepo.save(course);

			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Not Present");
		}
	}

	public Courses updateCourse(@Valid Courses course) {
		
		Optional<Courses> c = courseRepo.findById(course.getId());
		try {
			if (!c.isPresent()) {
				
				throw new IllegalArgumentException("Not Present");
			} else {
				return courseRepo.save(course);

			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Not Present");
		}

		

	}

	public String deleteCourseById(long id) {
		Optional<Courses> course = courseRepo.findById(id);
		try {
			if (!course.isPresent()) {

				throw new IllegalArgumentException("Not Present");
			} else {
				courseRepo.deleteById(id);
				return "Deleted";

			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Not Present");
		}

	}

	public Optional<Courses> getCourses(String name) {
		
		Optional<Courses> course =courseRepo.findByTitle(name);
		try {
			if (!course.isPresent()) {

				throw new IllegalArgumentException("Not Present");
			} else {
				
				return course;

			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Not Present");
		}
	}

	
}
