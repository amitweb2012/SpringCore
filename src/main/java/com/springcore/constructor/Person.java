package com.springcore.constructor;

public class Person {

	private Certi certi;
	private String name;
	
	public Person(Certi certi, String name){
		this.certi=certi;
		this.name=name;
	}
	public Certi getCerti() {
		return certi;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Person [certi=" + this.certi.getCityName() + ", name=" + this.name + "]";
	}
	
}
