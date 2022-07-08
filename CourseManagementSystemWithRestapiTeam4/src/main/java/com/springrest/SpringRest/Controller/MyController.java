package com.springrest.SpringRest.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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

import com.springrest.SpringRest.Repository.CourseRepo;
import com.springrest.SpringRest.Repository.UserRepo;
import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Apply;
import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.entities.NewUser;
import com.springrest.SpringRest.services.CourseService;

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
		final List<Courses> courses = cService.getCourses();
		try {
			if(!courses.isEmpty()) {
				  
				return courses;
			}
		}catch (Exception e) {
		System.out.println("No Data Available");	
		}
		return null;
	}

	@GetMapping("/courses/{courseId}")
	public Optional<Courses> getCourse(@PathVariable ("courseId") final Long courseId) {
		Optional<Courses> course= courserepo.findById(courseId);
		try {
			if(course != (null)) {
				return course;
			}
			
		}catch(Exception e) {
			System.out.println("no Courses Are Available With This Id" +courseId);
		}
		return null;
	}

	@PostMapping("/courses")
	public Courses addCourse(@RequestBody final Courses course) {
	 ((CourseService) this.cService).addCourse(course);
		try {
			if (course !=(null)) {
				return course;
			}
			
		} catch (Exception e) {
			System.out.println("no Courses Are Available With This Id" +course);
		}
		return null;
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
		//	throw new RuntimeException(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

//=======================NewUser====================

	@PostMapping("/saveuser")
	public NewUser saveusers(@Valid @RequestBody NewUser user) {
		 userRepo.save(user);
		 
		 try {
				if (user !=(null)) {
					return user;
				}
				
			} catch (Exception e) {
				System.out.println("no User Are Available With This Id" +user);
			}
			return user ;
		 
	}

	@GetMapping("/users")
	public List<NewUser> getusers() {
	final List<NewUser> newuser = userRepo.findAll();
		try {
			if (!newuser.isEmpty()) {
				return newuser;
			}
			
		} catch (Exception e) {
			System.out.println("No Data Available");
		}
		
		return null;
	}

	@PutMapping("/updateuser")
	public NewUser updateuser(@RequestBody NewUser user) {
		 
			return userRepo.save(user);
		 
	}

	@DeleteMapping("/user/{uid}")
	public String deleteUsers(@PathVariable("uid") long uid) {
		userRepo.deleteById(uid);
		return "User deleted";
	}

//======api for Admin======

	@PostMapping("/saveadmin")
	public Admin saveAdmins(@RequestBody Admin admin) {
		return cService.saveAllAdmins(admin);
	}
	
	 @GetMapping("/admin")
	   public List<Admin> getAllAdmin()
	   {
	       return cService.getAllAdmins();
	   }
	 
	//===================api of apply for new course=======
	   
	   
	   @PostMapping("/saveapply")
	    public String saveApplies(@RequestBody Apply apply)
	    {
		   cService.saveApplies(apply);
	         return "Admin Add Successfully";
	    }
	    
	   @GetMapping("/apply")
	   public List<Apply> getAllApplies()
	   {
	       return cService.getAllApplies();
	   }
}