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

import com.springrest.SpringRest.entities.NewUser;
import com.springrest.SpringRest.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController 
{
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<Object> getAllUser()
	{
	 return ResponseEntity.ok(userService.getAllUser());
	}
	
	@PostMapping("/saveuser")
	public ResponseEntity<NewUser> saveAllUser(@Valid @RequestBody NewUser newUser) throws Exception
	{
		return new ResponseEntity<NewUser>(userService.saveAllUser(newUser),HttpStatus.OK);
	}
	
	@PostMapping("/userlogin")
	public ResponseEntity<NewUser> getByEmail(@Valid @RequestParam String email)
	{
	   return new ResponseEntity<NewUser>(userService.getByEmail(email),HttpStatus.ACCEPTED);
	}

	
}
