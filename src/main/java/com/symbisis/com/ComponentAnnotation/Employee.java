package com.symbisis.com.ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component

public class Employee {
	
	private Address address;

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void config()
	{
		System.out.println("Show Address...");
	}
	
}
