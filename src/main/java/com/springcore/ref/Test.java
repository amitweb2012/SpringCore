package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/ref/config.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
    }
}
