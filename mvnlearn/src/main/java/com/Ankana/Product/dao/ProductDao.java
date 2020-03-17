package com.Ankana.Product.dao;

import com.Ankana.Product.dto.Product;

public interface ProductDao {
 public void create(Product product);
 public Product read(int id);
 public void update(Product product);
 public void delete(int id);
}
