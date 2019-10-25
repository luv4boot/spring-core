package com.luv4boot.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/luv4boot/springjdbc/config.xml");
		JdbcTemplate template = ctx.getBean("template", JdbcTemplate.class);
		String sql = "insert into employee values(?,?,?)";
		int result = template.update(sql, new Integer(1001), "Madhav", "Ponnana");
		System.out.println("No of records are inserted =>"+result);
		((AbstractApplicationContext) ctx).close();
	}

}
