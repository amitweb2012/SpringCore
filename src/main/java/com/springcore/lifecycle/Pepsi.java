package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{

	private String price;

	public Pepsi(String price) {
		super();
		this.price = price;
	}
	

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initilization");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}
	
}
