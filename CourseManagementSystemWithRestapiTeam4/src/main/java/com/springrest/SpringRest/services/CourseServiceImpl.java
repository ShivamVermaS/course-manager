package com.springrest.SpringRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.Repository.AdminRepo;
import com.springrest.SpringRest.Repository.ApplyRepo;
import com.springrest.SpringRest.Repository.UserRepo;
import com.springrest.SpringRest.dao.CourseDao;
import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Apply;
import com.springrest.SpringRest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	@Autowired
	UserRepo userRepo;
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	ApplyRepo applyRepo;

	public CourseServiceImpl() {

	}

	@Override
	public List<Courses> getCourses() {

		return courseDao.findAll();
	}

//	@Override
//	public List<Courses> getCourses(Courses courses) {
//		 List<Courses>  course= courseDao.findAll();
//		 if(course.contains(courses))
//		 {
//			 return course;
//		 }
//		 throw new RuntimeException("Course Not Available yet Now");
//	}
	
	@Override
	public Courses getcourse(long courseId) {
		Courses entity = new Courses();
		entity = courseDao.getById(courseId);

		return entity;

	}

	@Override
	public Courses addCourse(Courses course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		Courses entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

	@Override
	public Admin saveAllAdmins(Admin admin) {

		return adminRepo.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() {

		return adminRepo.findAll();
	}

	@Override
		public void saveApplies(Apply apply) {
			 applyRepo.save(apply);
			
		}

	@Override
		public List<Apply> getAllApplies() {
			return applyRepo.findAll();
		}

}
