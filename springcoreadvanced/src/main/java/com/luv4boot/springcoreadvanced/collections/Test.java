package com.luv4boot.springcoreadvanced.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcoreadvanced/collections/context.xml");
		ProductList productList = ctx.getBean("product", ProductList.class);
		System.out.println(productList);
		((AbstractApplicationContext) ctx).close();
	}
}
