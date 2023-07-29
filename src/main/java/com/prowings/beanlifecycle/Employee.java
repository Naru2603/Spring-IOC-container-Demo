package com.prowings.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	int id;
	String name;
	Department department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Department department) {
		super();
		this.department = department;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@PostConstruct
	public void customInit() throws Exception{
		System.out.println(">>>>>>>>>>>> Inside custom init method of Employee bean <<<<<<<<<<<<<<<<<<");
		
	}

	@PreDestroy
	public void customDestroy() throws Exception {
		System.out.println(">>>>>>>>>>>> Inside custom Destroy Employee bean <<<<<<<<<<<<<<<<<<");
		
	} 

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}
