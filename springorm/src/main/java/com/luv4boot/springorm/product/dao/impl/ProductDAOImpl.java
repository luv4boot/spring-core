package com.luv4boot.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.luv4boot.springorm.product.dao.ProductDAO;
import com.luv4boot.springorm.product.entity.Product;

@Component("productDao")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	HibernateTemplate hibernateTempalate;

	public HibernateTemplate getHibernateTempalate() {
		return hibernateTempalate;
	}

	public void setHibernateTempalate(HibernateTemplate hibernateTempalate) {
		this.hibernateTempalate = hibernateTempalate;
	}

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTempalate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTempalate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTempalate.delete(product);
	}

	@Override
	public Product find(int id) {
		Product product = hibernateTempalate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> products = hibernateTempalate.loadAll(Product.class);
		return products;
	}

}
