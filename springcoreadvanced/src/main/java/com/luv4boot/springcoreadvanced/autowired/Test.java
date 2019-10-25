package com.luv4boot.springcoreadvanced.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcoreadvanced/autowired/config.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		((AbstractApplicationContext) context).close();
	}
}
