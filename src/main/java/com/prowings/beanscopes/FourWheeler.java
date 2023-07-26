package com.prowings.beanscopes;

public class FourWheeler {

	int model;
	String company;
	String type;
	Engine engine;

	public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(Engine engine) {
		super();
		this.engine = engine;
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "FourWheeler [model=" + model + ", company=" + company + ", type=" + type + ", engine=" + engine + "]";
	}

}
