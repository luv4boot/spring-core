package com.luv4boot.springcore.references;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/references/config.xml");
		Student student = ctx.getBean("student", Student.class);
		System.out.println(student);
		ctx.close();
	}

}
