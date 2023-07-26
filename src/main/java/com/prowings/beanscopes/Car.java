package com.prowings.beanscopes;

public class Car {

	int model;
	String company;
	String type;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int model, String company, String type) {
		super();
		this.model = model;
		this.company = company;
		this.type = type;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + ", type=" + type + "]";
	}

}
