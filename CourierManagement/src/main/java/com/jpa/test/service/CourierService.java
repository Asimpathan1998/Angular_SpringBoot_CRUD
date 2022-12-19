package com.jpa.test.service;

import java.util.List;

import com.jpa.test.Courier;

public interface CourierService {
	
	public List<Courier> getCourier(int id);

	public Courier getCourierbyid(int id);
	
	List<Courier> getCouriers();

	public Courier getCourierbyName(String name);

	public Courier saveCourier(Courier co);

	public Courier getCourierbyId(int id);

	public Courier deleteCourier(Courier courier);

	public Courier updateCourier(Courier courier);
	
	public void deleteUser(int id);
	 
}
