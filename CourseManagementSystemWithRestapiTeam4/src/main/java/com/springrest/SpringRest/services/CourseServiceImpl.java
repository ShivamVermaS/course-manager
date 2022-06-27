package com.springrest.SpringRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.dao.CourseDao;
import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.entities.NewUser;



@Service

public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	@Autowired
	UserRepo userRepo;
	public CourseServiceImpl() 
	{
		

	 }
		@Override
		public List<Courses> getCourses() {
			
			return courseDao.findAll();
		}
		
		
		@Override
		public Courses getcourse(long courseId) {
			Courses entity =new Courses();
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
//		@Override
//		public void deleteUser(long parseLong) {
//			NewUser us = userRepo.getOne(parseLong);
//			userRepo.delete(us);
//			
//		}
			
}
	
	

