package com.springrest.SpringRest.Repository;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Admin;
import com.springrest.SpringRest.entities.Apply;

public interface ApplyRepo extends JpaRepository<Apply, String> {

	//Admin saveByEmail(@Valid String email);

}
