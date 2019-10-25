package com.luv4boot.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv4boot.springorm.product.dao.ProductDAO;
import com.luv4boot.springorm.product.entity.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/luv4boot/springorm/product/test/config.xml");
		ProductDAO dao = ctx.getBean("productDao", ProductDAO.class);

		/*
		 * Product product = new Product();
		 * 
		 * product.setId(1002); product.setName("Samsung-M30");
		 * product.setDescription("It constains long lasting battery!");
		 * product.setPrice(15000);
		 * 
		 * // dao.create(product); // dao.update(product); dao.delete(product);
		 */

		// Product product = dao.find(1002);
		// System.out.println(product);

		List<Product> products = dao.findAll();

		for (Product product : products) {
			System.out.println(product);
		}

		((AbstractApplicationContext) ctx).close();
	}
}
