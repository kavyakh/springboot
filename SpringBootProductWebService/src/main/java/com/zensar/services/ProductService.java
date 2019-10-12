package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Kavya KH
 * @Creation_date  10th Oct 2019 5.22pm
 * @modification   12th Oct 2019 3.43pm
 * @version 4.0
 * @copyright ZenSar Technologies. All rights are reserved.
 * @description It is used in Business layer
 *              It is a service class of Product
 */
public interface ProductService {
	List<Product>findAllProducts();
	Product findProductById(int productId);
	void addProduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	
	List<Product>findProductByPriceRange(float minprice,float maxprice);
    List<Product>findProductByName(String name);
    List<Product>findProductByBrand(String brand);
    long getProductCount();
}
