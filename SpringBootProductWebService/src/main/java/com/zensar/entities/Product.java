package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

/**
 * @author Kavya KH
 * @Creation_date 26th sep 2019 4.01pm
 * @modification   12th Oct 2019 3.41pm
 * @version 3.0
 * @copyright ZenSar Technologies. All rights are reserved.
 * @description It is persistent class
 *              It represents database table PRODUCT
 *              It is POJO class
 */
@Component
@Entity
public class Product {
	@Id
	@Column(name="id")
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
