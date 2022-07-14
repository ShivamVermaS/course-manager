package com.springrest.SpringRest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.services.AdminService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController 
{
	@Autowired
	AdminService adminService;
	
	@GetMapping("/admin")
	public ResponseEntity<Object> getAllAdmin()
	{
	    return ResponseEntity.ok(adminService.getAllAdmin());
	}
	
	
	@PostMapping("/saveadmin")
	public ResponseEntity<Admin> saveAdmins(@Valid @RequestBody Admin admin)
	{
		return new ResponseEntity<Admin>(adminService.saveAdmins(admin),HttpStatus.ACCEPTED);
	}

}
