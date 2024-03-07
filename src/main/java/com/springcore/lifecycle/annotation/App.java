package com.springcore.lifecycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/annotation/config.xml");
		CocaCola coke = (CocaCola) context.getBean("cocacola");
		System.out.println(coke);
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
