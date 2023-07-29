package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	int rollNo;
	String name;
	Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">>>>>>>>>>>> before destruction of student bean <<<<<<<<<<<<<<<<<<");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(">>>>>>>>>>>> Initializing the student bean <<<<<<<<<<<<<<<<<<");
		
	} 

}
