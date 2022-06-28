package com.springrest.SpringRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Apply;

public interface ApplyRepo extends JpaRepository<Apply, String> {

}
