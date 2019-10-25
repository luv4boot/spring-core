package com.luv4boot.springcoreadvanced.autowired.annotations.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcoreadvanced/autowired/annotations/assignment/config.xml");
		Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer);
		((AbstractApplicationContext) context).close();
	}
}
