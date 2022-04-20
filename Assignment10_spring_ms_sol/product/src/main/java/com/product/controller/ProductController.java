package com.product.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.product.dao.ProductRepo;
import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "products")
	public List<Product> getAll(){
		return productService.getAllProduct();
	}
	
	@GetMapping(path = "products/{id}")
	public Product getAnProduct(@PathVariable(name = "id") int id){
		return productService.getProductById(id);
	}
}
