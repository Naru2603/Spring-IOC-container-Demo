package com.prowings.models;

public class Student {

	private int rollNo;
	private String name;
	private Address address;

	public Student() {
		super();
		System.out.println("No arg constructor is called");
	}

	public Student(int rollNo, String name, Address address) {
		super();
		System.out.println("All arg constructor is called");
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("setter for roll no is called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setter for name is called");
	}

	public Address getAddress() {
		return address;
		
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter for Address is called");
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}



}
