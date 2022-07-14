package com.springrest.SpringRest.Repository;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Courses;

public interface CourseRepo extends JpaRepository<Courses, Long> {

	

	String deleteById(long id);

	Courses findByTitle(String name);


}