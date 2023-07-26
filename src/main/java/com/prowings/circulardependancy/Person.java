package com.prowings.circulardependancy;

public class Person {

	int age;
	String name;
	Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Inside setter of age");
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Inside setter of name");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Inside setter of address");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}
