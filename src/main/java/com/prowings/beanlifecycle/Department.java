package com.prowings.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Department {

	int deptId;
	String deptName;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@PostConstruct
	public void customInit() throws Exception {
		System.out.println(">>>>>>>>>>>> Inside custom init method of Department bean <<<<<<<<<<<<<<<<<<");
		
	}

	@PreDestroy
	public void customDestroy() throws Exception {
		System.out.println(">>>>>>>>>>>> Inside custom Destroy method of  Department bean <<<<<<<<<<<<<<<<<<");
		
	} 
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}
