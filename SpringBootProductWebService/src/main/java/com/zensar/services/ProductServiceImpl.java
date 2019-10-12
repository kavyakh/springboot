package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.dao.ProductDao;
import com.zensar.entities.Product;

/**
 * @author Kavya KH
 * @Creation_date  10th Oct 2019 5.21pm
 * @modification   12th Oct 2019 3.43pm
 * @version 4.0
 * @copyright ZenSar Technologies. All rights are reserved.
 * @description It is used in Business layer
 *              It is a service class of Product
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
    private ProductDao productDao;
   
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return  productDao.getAll();
			
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getById(productId);
		
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
            productDao.insert(product);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
            productDao.update(product);
	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
              productDao.delete(product);
	}

	@Override
	public List<Product> findProductByPriceRange(float minprice, float maxprice) {
		// TODO Auto-generated method stub
		List<Product> productByRange=new ArrayList<Product>();
		productByRange=productDao.getAll();
		List<Product> productAll=productDao.getAll();
		for(Product p:productByRange)
		{
			if(p.getPrice()<=maxprice && p.getPrice()>=minprice)
			{
				 productAll.add(p);
			}					
	}
		return productAll;
	}
	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product> productByName=new ArrayList<Product>();
		List<Product> productAll=productDao.getAll();
		for(Product p:productByName) 
		{
			if(p.equals(name))
			{
				productAll.add(p);
			}
						
		}
		return productByName;		
		
	}	

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> productByBrand=new ArrayList<Product>();
		List<Product> productAll=productDao.getAll();
		for(Product p:productByBrand)
		if(p.equals(brand))
		{
			productAll.add(p);
	}
    return productByBrand;
	}
	
	@Override
	public long getProductCount() {
		// TODO Auto-generated method stub
		return findAllProducts().size();
	}

}
