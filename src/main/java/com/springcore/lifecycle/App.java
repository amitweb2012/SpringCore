package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
	}

}
