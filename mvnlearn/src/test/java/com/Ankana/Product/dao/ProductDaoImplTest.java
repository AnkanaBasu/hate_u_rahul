package com.Ankana.Product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Ankana.Product.dto.Product;

public class ProductDaoImplTest {

	@Test
	public void createshouldcreateproduct() {
		ProductDao p=new ProductDaoImpl();
		Product product=new Product();
		product.setId(1);
		product.setName("Mobile");
		product.setDescription("upgraded");
		product.setPrice(15000);
		p.create(product);
		Product result=p.read(1);
		assertNotNull(result);
		assertEquals("Mobile", result.getName());
	
	}

}
