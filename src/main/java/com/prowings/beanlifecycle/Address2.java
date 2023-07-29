package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address2 {

	int pin;
	String city;

	public Address2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address2(int pin, String city) {
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

	public void customInit() throws Exception {
		System.out.println(">>>>>>>>>>>> Indside custom Init method of Address bean  <<<<<<<<<<<<<<<<<<");

	}

	public void customDestroy() throws Exception {
		System.out.println(">>>>>>>>>>>> Indside custom destroy method of Address bean <<<<<<<<<<<<<<<<<<");

	}
}
