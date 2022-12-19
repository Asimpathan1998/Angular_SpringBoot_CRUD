package com.jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.Courier;
 

public interface CourierRepo extends JpaRepository<Courier, Integer>{

	Courier findByName(String name);
	
}
