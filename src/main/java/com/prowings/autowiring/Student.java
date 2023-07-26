package com.prowings.autowiring;

public class Student {

	int rollNo;
	String name;
	Address address;

	public Student() {
		super();
	}

	public Student(Address address) {
		super();

		System.out.println("Setting address via constructor");
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		System.out.println("Setting roll no via setter");
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name via setter");
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting address via setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

}
