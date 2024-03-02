package com.gl.glca.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.glca.model.Product;

@Repository
@EnableTransactionManagement
public class ProductsDao {

	@Autowired
	SessionFactory sessionFactory;
	Session session;

	public ProductsDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	
	@Transactional
	public List <Product> getAllProducts()
	{
		Transaction tx = session.beginTransaction();
		List <Product> products = session.createQuery("from Product").list();
		tx.commit();
		return products;
		
	}
	
	@Transactional
	public void saveProduct(Product product)
	{
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
	}
	
	@Transactional
	public Product getProductById(int id)
	{
		Transaction tx = session.beginTransaction();
		Product product = session.get(Product.class, id);
		tx.commit();
		return product;
	}
	
	@Transactional
	public void deleteProductById(int id)
	{
		//Transaction tx = session.beginTransaction();
		Product product = getProductById(id);
		session.delete(product);
		//tx.commit();
	}
}
