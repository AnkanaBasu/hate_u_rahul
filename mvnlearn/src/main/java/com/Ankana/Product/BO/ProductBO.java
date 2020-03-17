package com.Ankana.Product.BO;

import com.Ankana.Product.dto.Product;

public interface ProductBO {
   public void create(Product product);
   public Product findProduct(int id);
}
