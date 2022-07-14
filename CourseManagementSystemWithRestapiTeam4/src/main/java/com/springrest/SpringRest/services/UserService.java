package com.springrest.SpringRest.services;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.SpringRest.Repository.UserRepo;
import com.springrest.SpringRest.entities.NewUser;


@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;

	public Object getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public NewUser saveAllUser(@Valid NewUser newUser) {
		// TODO Auto-generated method stub
		return userRepo.saveAndFlush(newUser);
	}

	public NewUser getByEmail(@Valid String email) {
		// TODO Auto-generated method stub
		return userRepo.getByEmail(email);
	}



}
