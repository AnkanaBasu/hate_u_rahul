package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Address address = context.getBean(Address.class, "address");
		System.out.println(address);
		Student student=(Student) context.getBean("student");
		System.out.println(student);
	}

}