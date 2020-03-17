package com.Ankana.Product.dao;

import java.util.HashMap;
import java.util.Map;
import com.Ankana.Product.dto.Product;

public class ProductDaoImpl implements ProductDao {
    Map<Integer,Product> products=new HashMap<>();
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
      products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
