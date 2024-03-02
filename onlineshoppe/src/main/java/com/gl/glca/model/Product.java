package com.gl.glca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="productId")
	String productId;
	
	@Column(name="productName")
	String productName;
	
	@Column(name="productCategory")
	String productCategory;
	
	@Column(name="pricePerUnit")
	int pricePerUnit;
	
	@Column(name="quantityOnHand")
	int quantityOnHand;
	

	public Product() {
		super();
	}


	public Product(int id, String productId, String productName, String productCategory, int pricePerUnit,
			int quantityOnHand) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.pricePerUnit = pricePerUnit;
		this.quantityOnHand = quantityOnHand;
	}

	

	public Product(String productId, String productName, String productCategory, int pricePerUnit, int quantityOnHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.pricePerUnit = pricePerUnit;
		this.quantityOnHand = quantityOnHand;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


	public int getPricePerUnit() {
		return pricePerUnit;
	}


	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}


	public int getQuantityOnHand() {
		return quantityOnHand;
	}


	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", pricePerUnit=" + pricePerUnit + ", quantityOnHand=" + quantityOnHand + "]";
	}
	
	
	

}
