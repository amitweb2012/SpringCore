package com.springcore.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CocaCola {

	private int price;

	public CocaCola(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public CocaCola() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CocaCola [price=" + price + "]";
	}
	
	@PostConstruct
	public void customStart() {
		System.out.println("init method");
	}
	
	@PreDestroy
	public void customEnd() {
		System.out.println("Destroy method");
	}
}
