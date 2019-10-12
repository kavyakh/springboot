package com.zensar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Kavya KH
 * @Creation_date  11th Oct 2019 10.11am
 * @modification   12th Oct 2019 3.42pm
 * @version 4.0
 * @copyright ZenSar Technologies. All rights are reserved.
 * @description It is used in persistent layer
 *              It is a DAO class of Product
 */
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate; 

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return (List<Product>) hibernateTemplate.find("from Product");
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}
	
	

	
	
}
