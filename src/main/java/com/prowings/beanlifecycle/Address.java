package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean{

	int pin;
	String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">>>>>>>>>>>> before destruction of address bean <<<<<<<<<<<<<<<<<<");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(">>>>>>>>>>>> Initializing the address bean <<<<<<<<<<<<<<<<<<");
		
	} 
}
