package com.prowings.models;

import java.util.List;
import java.util.Set;

public class Person {

	int id;
	String name;
	List<Integer> mobileNumbers;
	
	Set<String> emailId;
	
	public Person() {
		super();
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

	public List<Integer> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setMobileNumbers(List<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public Set<String> getEmailId() {
		return emailId;
	}

	public void setEmailId(Set<String> emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileNumbers=" + mobileNumbers + ", emailId=" + emailId
				+ "]";
	}

	
	
}
