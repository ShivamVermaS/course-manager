package com.springrest.SpringRest.Repository;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Courses;
import com.springrest.SpringRest.entities.NewUser;



public interface UserRepo extends JpaRepository<NewUser, Long> {

	NewUser getByEmail(@Valid String email);

	Optional<NewUser> findByEmail(String email);

	

	

}
