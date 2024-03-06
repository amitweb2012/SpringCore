package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/constructor/configci.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}

}
