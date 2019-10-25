package com.luv4boot.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv4boot.springaop.ProductService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/luv4boot/springaop/test/config.xml");
		ProductService service = ctx.getBean("productService", ProductService.class);
		int result = service.multiply(4, 5);
		System.out.println(result);
		((AbstractApplicationContext) ctx).close();
	}
}
