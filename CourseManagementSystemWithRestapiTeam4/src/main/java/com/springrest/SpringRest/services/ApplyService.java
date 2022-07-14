package com.springrest.SpringRest.services;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.SpringRest.Repository.ApplyRepo;
import com.springrest.SpringRest.entities.Apply;


@Service
public class ApplyService {
	
	@Autowired
	ApplyRepo applyRepo;

	public Object getAllAdmin() {
		// TODO Auto-generated method stub
		return applyRepo.findAll();
	}


	public Apply saveApplyDetail(@Valid Apply apply) {
		
		return applyRepo.save(apply);
	}




	
}
