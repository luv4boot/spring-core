package com.luv4boot.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/luv4boot/springcore/config.xml");
		Employee employee = ctx.getBean("emp", Employee.class);
		System.out.println("Employee Id => " + employee.getId());
		System.out.println("Employee Name =>" + employee.getName());
		ctx.close();
	}

}
