package com.jpa.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.jpa.test.Courier;
import com.jpa.test.repository.CourierRepo;
import com.jpa.test.service.CourierService;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CourierController {
	@Autowired
	private CourierService courierService;

	@RequestMapping("/test")
	@ResponseBody
	public String firstHandler() {
		return "This is project using angular";
	}

	@GetMapping("/courierDetail")
	public List<Courier> getCouriers() {
		return this.courierService.getCouriers();
	}

	@PostMapping("/addCourierDetail")
	public Courier addCourier(@RequestBody Courier co) {
		Courier courier = this.courierService.getCourierbyName(co.getName());

		if (courier == null) {
			return this.courierService.saveCourier(co);
		}

		return null;
	}

	@DeleteMapping("/deleteCourier/{id}")

	public Courier deleteCourier(@PathVariable("id") int id) {
		System.out.println("****************  " + id);
		Courier courier = this.courierService.getCourierbyId(id);
		if (courier != null) {
			return this.courierService.deleteCourier(courier);
		}
		return null;
	}

	// Update
	@PutMapping("/updateCourierDetail")
	public Courier updateCourier(@RequestBody Courier courier) {
		//Courier saveCourier = courierService.saveCourier(courier);

		 return courierService.updateCourier(courier);
	}

	// get Courier
	@GetMapping("/getCourierDetail/{id}")
	public Courier getCourier(@PathVariable("id") int id) {
		Courier courier = this.courierService.getCourierbyId(id);

		if (courier != null) {
			return this.courierService.getCourierbyId(id);
		}
		System.out.println("id is invalid" + id);
		return null;
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestParam int id) {
		courierService.deleteUser(id);
	}

}
