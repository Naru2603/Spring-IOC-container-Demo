package com.prowings.beanscopes;

public class Engine {

	int capacity;
	String type;
	int powerHp;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPowerHp() {
		return powerHp;
	}

	public void setPowerHp(int powerHp) {
		this.powerHp = powerHp;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + ", powerHp=" + powerHp + "]";
	}

}
