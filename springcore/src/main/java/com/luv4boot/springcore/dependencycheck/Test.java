package com.luv4boot.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/dependencycheck/config.xml");
		Prescription prescription = ctx.getBean("prescription", Prescription.class);
		System.out.println(prescription);
		ctx.close();
	}

}
