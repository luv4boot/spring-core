package com.luv4boot.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Service service1 = ctx.getBean(Service.class);
		Service service2 = ctx.getBean(Service.class);
		System.out.println(service1.hashCode());
		System.out.println(service2.hashCode());
		((AbstractApplicationContext) ctx).close();
	}

}
