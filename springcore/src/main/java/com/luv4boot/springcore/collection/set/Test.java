package com.luv4boot.springcore.collection.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/collection/set/set-context.xml");

		CarDealer delaer = context.getBean("dealer", CarDealer.class);
		System.out.println(delaer.getName());
		System.out.println(delaer.getModels());

		((AbstractApplicationContext) context).close();
	}
}
