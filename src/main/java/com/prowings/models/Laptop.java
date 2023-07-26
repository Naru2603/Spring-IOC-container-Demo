package com.prowings.models;

public class Laptop {

	String processor;
	String graphicsCard;
	int ram;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String processor, String graphicsCard) {
		super();
		this.processor = processor;
		this.graphicsCard = graphicsCard;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [processor=" + processor + ", graphicsCard=" + graphicsCard + ", ram=" + ram + "]";
	}

}
