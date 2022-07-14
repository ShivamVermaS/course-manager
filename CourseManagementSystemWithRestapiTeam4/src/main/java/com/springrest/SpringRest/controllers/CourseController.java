package com.springrest.SpringRest.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.services.CourseService;

@RestController
@CrossOrigin(origins = "*")
public class CourseController 
{
	@Autowired
	CourseService courseService;
	
	@GetMapping("/course")
	public ResponseEntity<List<Courses>> getAllCourses()
	{
		return ResponseEntity.ok(courseService.getAllCourses());
	}

	@GetMapping("/courses/{id}")
	public ResponseEntity<Optional<Courses>> getCoursesById(@PathVariable("id") long id)
	{
		return ResponseEntity.ok(courseService.getCourseById(id));	
	}

	@PostMapping("/course")
	public ResponseEntity<Courses> saveAllCourse(@RequestBody Courses course)
	{
		return new ResponseEntity<>(courseService.saveAllCourse(course), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Courses> updateCourse(@Valid  @RequestBody Courses course)
	{
		Courses updateCourse=this.courseService.updateCourse(course);
		return ResponseEntity.ok(updateCourse);
		
	}
	
	@DeleteMapping("/course/{id}")
	public String deleteCourseById(@PathVariable long id)
	{	
	 return courseService.deleteCourseById(id);       
		
	}
		
	@GetMapping("/course/{name}")
	public Optional<Courses> getCourses(@PathVariable("name") String name) 
	{
		return courseService.getCourses(name);
	}

}
