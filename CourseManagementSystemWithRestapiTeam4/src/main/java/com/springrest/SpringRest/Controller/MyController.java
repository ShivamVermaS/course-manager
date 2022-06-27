package com.springrest.SpringRest.Controller;

import java.util.List;
import java.util.Optional;

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
import com.springrest.SpringRest.entities.NewUser;
import com.springrest.SpringRest.services.CourseRepo;
import com.springrest.SpringRest.services.CourseService;
import com.springrest.SpringRest.services.UserRepo;

@RestController
@CrossOrigin(origins = "*")
public class MyController {
	@Autowired
	CourseService cService;
	@Autowired
	CourseRepo courserepo;
	@Autowired
	UserRepo userRepo;

	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.cService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Optional<Courses> getCourse(@PathVariable("courseId") Long courseId) {
		return courserepo.findById(courseId);
	}

	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return ((CourseService) this.cService).addCourse(course);
	}

	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course) {
		return this.cService.updateCourse(course);
	}

	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {

		try {
			this.cService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}

		catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
//=======================user====================
	
	
	@PostMapping("/saveuser")
	public NewUser saveusers(@RequestBody NewUser user) {
		return userRepo.save(user);
	}

@GetMapping("/users")
public List<NewUser> getusers() {
return userRepo.findAll();	}


@PutMapping("/updateuser")
public NewUser updateuser(@RequestBody NewUser user){
	return userRepo.save(user);
	}

//@DeleteMapping("/user/{userId}")
//public ResponseEntity<NewUser> deleteUser(@PathVariable String uid) {
//
//	try {
//		this.cService.deleteUser(Long.parseLong(uid));
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//
//	catch (Exception e) {
//
//		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//}
// 
//@DeleteMapping("/courses/{userId}")
//public ResponseEntity<HttpStatus> deleteUser(@PathVariable String uid) {
//
//	try {
//		this.userRepo.deleteUser(Long.parseLong(uid));
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
//
//	catch (Exception e) {
//
//		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//}

@DeleteMapping("/user{uid}")
public NewUser deleteUser(@PathVariable("uid") Long uid) {
	 userRepo.deleteById(uid);
	 return null;
	
	 
}
}