package com.luv4boot.springcore.collection.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/collection/properties/props-context.xml");
		CountryAndLangs countryAndLangs = context.getBean("country", CountryAndLangs.class);
		System.out.println(countryAndLangs);
		((AbstractApplicationContext) context).close();
	}
}
