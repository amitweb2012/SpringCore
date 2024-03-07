package com.springcore.lifecycle;

public class Samosa {
	
	private int price;

	public Samosa(int price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public static void initMethod() {
		System.out.println("init menthod");
	}
	
	public static void destroyMethod() {
		System.out.println("destroy method");
	}

}
