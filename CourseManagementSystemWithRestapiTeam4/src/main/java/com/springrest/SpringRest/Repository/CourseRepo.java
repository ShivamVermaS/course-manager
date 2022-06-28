package com.springrest.SpringRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Courses;

public interface CourseRepo extends JpaRepository<Courses, Long> {

}
