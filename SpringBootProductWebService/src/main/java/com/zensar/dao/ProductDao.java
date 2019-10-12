package com.zensar.dao;

import java.util.List;
import com.zensar.entities.Product;

/**
 * @author Kavya KH
 * @Creation_date  10th Oct 2019 4.05pm
 * @modification   12th Oct 2019 3.41pm
 * @version 4.0
 * @copyright ZenSar Technologies. All rights are reserved.
 * @description It is persistent class
 *              It represents database table PRODUCT
 *              It is a DAO interface
 */

public interface ProductDao {
  
   List<Product> getAll();
   Product getById(int productId);
   void update(Product product);
   void insert(Product product);
   void delete(Product product);
}
