package com.jpa.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.Courier;
import com.jpa.test.repository.CourierRepo;

@Service
public class CourierServiceImp implements CourierService {

	@Autowired
	private CourierRepo courierRepo;

	List<Courier> list;

	public CourierServiceImp() {
		/*
		 * list = new ArrayList<Courier>(); list.add(new
		 * Courier(1,"asim","Jarud","Amazon",5,1000)); list.add(new
		 * Courier(1,"Aamir","Pune","Amazon",7,2000));
		 */
	}

	@Override
	public List<Courier> getCourier(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Courier> getCouriers() {
		// TODO Auto-generated method stub
		return courierRepo.findAll();
	}

	@Override
	public Courier getCourierbyName(String name) {
		return courierRepo.findByName(name);
	}

	@Override
	public Courier getCourierbyId(int id) {
		// TODO Auto-generated method stub
		return courierRepo.findById(id).get();
	}

	@Override
	public Courier saveCourier(Courier co) {
		// TODO Auto-generated method stub
		return courierRepo.save(co);
	}

	@Override
	public Courier deleteCourier(Courier courier) {
		// TODO Auto-generated method stub
		courierRepo.delete(courier);
		return courier;
	}

	@Override
	public Courier getCourierbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Courier updateCourier(Courier courier) {
	 * 
	 * courier.setName(courier.getName()); courier.setAddress(courier.getAddress());
	 * courier.setProvider(courier.getProvider());
	 * courier.setBoxweight(courier.getBoxweight());
	 * courier.setPrice(courier.getPrice());
	 * 
	 * return courier; }
	 */

	public void deleteUser(int id) {

		courierRepo.deleteById(id);
	}
	
	@Override
	public Courier updateCourier(Courier courier) {
		int id = courier.getId();
		Courier courier2 = courierRepo.findById(id).get();
		
		courier2.setName(courier.getName());
		courier2.setAddress(courier.getAddress());
		courier2.setProvider(courier.getProvider());
		courier2.setBoxweight(courier.getBoxweight());
		courier2.setPrice(courier.getPrice());

		return courierRepo.save(courier2);
	}
	
	
}
