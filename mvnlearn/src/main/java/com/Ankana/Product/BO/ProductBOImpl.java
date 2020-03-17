package com.Ankana.Product.BO;

import com.Ankana.Product.dao.ProductDao;
import com.Ankana.Product.dto.Product;

public class ProductBOImpl implements ProductBO {
    ProductDao dao;
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
      dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

}
