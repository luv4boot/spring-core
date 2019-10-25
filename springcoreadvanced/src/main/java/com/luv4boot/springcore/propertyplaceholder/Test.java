package com.luv4boot.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/luv4boot/springcore/propertyplaceholder/config.xml");
		MyDAO dao = ctx.getBean("dao", MyDAO.class);
		System.out.println(dao);
		((AbstractApplicationContext) ctx).close();
	}
}
