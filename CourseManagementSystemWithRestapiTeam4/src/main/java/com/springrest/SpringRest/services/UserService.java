package com.springrest.SpringRest.services;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.SpringRest.Repository.UserRepo;
import com.springrest.SpringRest.entities.Courses;
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
		Optional<NewUser> ad = userRepo.findByEmail(newUser.getEmail());
//		try {
//			if (ad.isPresent()) {

				return userRepo.save(newUser);
//			} else {
//
//				throw new IllegalArgumentException("Not Present");
//			}
//		} catch (IllegalArgumentException e) {
//			throw new IllegalArgumentException("Not Present");
//		}

	}
		
	

	public Optional<NewUser> getByEmail(@Valid String email) {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(email);
	}



}
