package com.luv4boot.springcore.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/injecting/interfaces/config.xml");
		OrderBO bo = ctx.getBean("bo", OrderBO.class);
		bo.placeOrder();
		((AbstractApplicationContext) ctx).close();
	}
}
