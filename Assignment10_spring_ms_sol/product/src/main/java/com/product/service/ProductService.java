package com.product.service;
import java.util.*;

import com.product.entity.Product;
public interface ProductService {
	public List<Product> getAllProduct();
	public Product addProduct(Product customer);
	public Product getProductById(int id);
	
}
