package com.luv4boot.springorm.product.dao;

import java.util.List;

import com.luv4boot.springorm.product.entity.Product;

public interface ProductDAO {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findAll();
}
