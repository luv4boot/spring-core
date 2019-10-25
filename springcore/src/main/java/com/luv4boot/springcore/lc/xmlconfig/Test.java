package com.luv4boot.springcore.lc.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/lc/xmlconfig/config.xml");
		Patient patient = ctx.getBean("patient", Patient.class);
		System.out.println(patient);
		ctx.registerShutdownHook();
		ctx.close();
	}

}
