package com.cognizant.spring;

public class Student {
	 private String name;
	 private Address address;
	public Student(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	 
	}
