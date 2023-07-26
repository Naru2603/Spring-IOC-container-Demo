package com.prowings.circulardependancy;

public class Address {

	String city;
	String country;
	Person person;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String country, Person person) {
		super();
		this.city = city;
		this.country = country;
		this.person = person;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Inside setter of city");
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		System.out.println("Inside setter of country");
		this.country = country;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		System.out.println("Inside setter of person");
		this.person = person;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", person=" + person + "]";
	}

}
