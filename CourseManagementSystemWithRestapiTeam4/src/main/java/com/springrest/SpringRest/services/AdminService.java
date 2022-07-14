package com.springrest.SpringRest.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.Repository.AdminRepo;
import com.springrest.SpringRest.entities.Admin;

@Service
public class AdminService {
	
	@Autowired
	AdminRepo adminRepo;

	public Object getAllAdmin() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

	public Admin saveAdmins(@Valid Admin admin) {
		return adminRepo.save(admin);
	}

}
