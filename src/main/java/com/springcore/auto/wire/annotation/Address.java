package com.springcore.auto.wire.annotation;

public class Address {
	
	private String street_name;
	private String city;
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String street_name, String city) {
		super();
		this.street_name = street_name;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [street_name=" + street_name + ", city=" + city + "]";
	}

}
