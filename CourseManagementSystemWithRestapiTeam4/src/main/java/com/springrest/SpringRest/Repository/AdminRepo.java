/**
 * 
 */
package com.springrest.SpringRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.SpringRest.entities.Admin;


public interface AdminRepo extends JpaRepository<Admin, String> {

}
