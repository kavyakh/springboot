package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;
/**
 * @author Kavya KH
 * @Creation_date  12th Oct 2019 3:45pm
 * @modification   12th Oct 2019 3.45pm
 * @version 1.0
 * @copyright ZenSar Technologies. All rights are reserved.
 * @description It is Restfulwebservice to access entity.
 *              It is a controller class of Product
 */
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
    public List<Product> getAllProducts() {
    return productService.findAllProducts();
    	
    }
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id")int productId) {
		return productService.findProductById(productId);
	}
	
	@PostMapping("/products/add")
	public String add(@RequestBody Product product) {
		productService.addProduct(product);
		return "new product" + product.getProductId() + "is added successful";
		
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestParam("id")int productId,@RequestParam("name")String name,@RequestParam("brand")String brand,@RequestParam("price")float price) {
		Product product = new Product(productId, name, brand, price);
		productService.addProduct(product);
		return "new product" + product.getProductId() + "is added successful";
	}
	
	@PutMapping("/product/update")
	public String update(@RequestBody Product product) {
		if(productService.findProductById(product.getProductId())!=null) {
		productService.updateProduct(product);
		return "product" + product.getProductId() + "is updated successful";
		}
		else {
			return "sorry!Product not found";
		}
	}
	
	@DeleteMapping("/product/delete")
	public String delete(@RequestBody Product product) {
		if(productService.findProductById(product.getProductId())!=null) {
		productService.removeProduct(product);
		return "product" + product.getProductId() + "is deleted successful";
		}
		else {
			return "sorry!Product not found";
		}
	}
}
