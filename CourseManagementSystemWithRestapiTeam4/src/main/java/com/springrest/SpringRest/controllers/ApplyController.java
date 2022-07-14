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

import com.springrest.SpringRest.entities.Apply;
import com.springrest.SpringRest.services.ApplyService;

@RestController
@CrossOrigin(origins = "*")
public class ApplyController {

	
	@Autowired
	ApplyService applyService;
	
	
	@GetMapping("/apply")
	public ResponseEntity<Object> getAllAdmin()
	{
	    return ResponseEntity.ok(applyService.getAllAdmin());
	}
	
	
	@PostMapping("/saveapply")
	public ResponseEntity<Apply> getByEmail(@Valid @RequestBody Apply apply)
	{
		return new ResponseEntity<Apply>(applyService.saveApplyDetail(apply),HttpStatus.ACCEPTED);
	}
}
