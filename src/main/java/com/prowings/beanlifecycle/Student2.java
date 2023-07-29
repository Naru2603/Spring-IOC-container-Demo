package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student2 {

	int rollNo;
	String name;
	Address2 address2;

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student2(int rollNo, String name, Address2 address2) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address2 = address2;
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

	public Address2 getAddress() {
		return address2;
	}

	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address2 + "]";
	}

	public void customInit() throws Exception {
		System.out.println(">>>>>>>>>>>> Indside custom Init method of student bean  <<<<<<<<<<<<<<<<<<");

	}

	public void customDestroy() throws Exception {
		System.out.println(">>>>>>>>>>>> Indside custom destroy method of student bean <<<<<<<<<<<<<<<<<<");

	}

}
