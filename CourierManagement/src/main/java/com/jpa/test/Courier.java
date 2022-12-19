package com.jpa.test;

import org.springframework.boot.autoconfigure.AutoConfiguration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@AutoConfiguration

public class Courier {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String provider;
	private int boxweight;
	private int price;
	
	public int getBoxweight() {
		return boxweight;
	}

	public void setBoxweight(int boxweight) {
		this.boxweight = boxweight;
	} 

	public Courier() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Courier(int id, String name, String address, String provider, int boxweight, int price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.provider = provider;
		this.boxweight = boxweight;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Courier [id=" + id + ", name=" + name + ", address=" + address + ", provider=" + provider
				+ ", boxweight=" + boxweight + ", price=" + price + "]";
	}

	 

}
