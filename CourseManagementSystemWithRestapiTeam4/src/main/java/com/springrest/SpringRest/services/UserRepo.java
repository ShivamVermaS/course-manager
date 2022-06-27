package com.springrest.SpringRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springrest.SpringRest.entities.NewUser;

public interface UserRepo extends JpaRepository<NewUser, Long> {



	//NewUser getOne(long parseLong);

	//void deleteUser(long parseLong);
	

	//NewUser updateuser();
	
	//method that retrieve all users from the list  


}
