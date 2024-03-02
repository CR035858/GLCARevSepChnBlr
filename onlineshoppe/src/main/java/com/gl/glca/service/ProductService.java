package com.gl.glca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.glca.dao.ProductsDao;
import com.gl.glca.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductsDao productDao;
	
	public List <Product> getAllproductsSvc()
	{
		return productDao.getAllProducts();
	}
	
	public Product getProductByIdSvc(int id)
	{
		return productDao.getProductById(id);
	}
	
	public void saveProductSvc(Product product)
	{
		productDao.saveProduct(product);
	}
	public void deleteProductById(int id)
	{
		productDao.deleteProductById(id);
	}
}
