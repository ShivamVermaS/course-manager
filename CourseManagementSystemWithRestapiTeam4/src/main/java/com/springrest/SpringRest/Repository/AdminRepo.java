/**
 * 
 */
package com.springrest.SpringRest.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Courses;


public interface AdminRepo extends JpaRepository<Admin, String> {

	Optional<Admin> findByEmail(String email);

}
