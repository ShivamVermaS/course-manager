package com.springrest.SpringRest.services;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.Repository.AdminRepo;
import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Courses;

@Service
public class AdminService {

	@Autowired
	AdminRepo adminRepo;

	public Object getAllAdmin() {

		return adminRepo.findAll();
	}

	public Admin saveAdmins(@Valid Admin admin) {

		Optional<Admin> ad = adminRepo.findByEmail(admin.getEmail());
		try {
			if (ad.isPresent()) {

				throw new IllegalArgumentException("Not Present");
			} else {

				return adminRepo.save(admin);
			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Not Present");
		}

	}

}
