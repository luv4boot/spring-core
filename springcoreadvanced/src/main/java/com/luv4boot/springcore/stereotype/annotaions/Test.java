package com.luv4boot.springcore.stereotype.annotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/stereotype/annotaions/config.xml");
		
		Instructor instructor = ctx.getBean("instructor", Instructor.class);
		System.out.println(instructor);
		
		Instructor instructor1 = ctx.getBean("instructor", Instructor.class);
		System.out.println(instructor1);
		
		((AbstractApplicationContext) ctx).close();
	}
}
