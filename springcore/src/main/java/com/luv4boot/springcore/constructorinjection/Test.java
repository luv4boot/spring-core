package com.luv4boot.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/constructorinjection/config.xml");
		Employee employee = ctx.getBean("employee", Employee.class);
		System.out.println(employee);
		ctx.close();
	}

}
