package com.shopping.mart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.mart.model.Product;
import com.shopping.mart.service.ProductService;

@RestController
@RequestMapping("/emart")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products/list")
	public List<Product> get()
	{
		return productService.getProducts();
	}
	
	@PostMapping("/products/add")
	public List<Product> setProduct(@RequestBody() Product product)
	{
		productService.setProducts(product);
		return productService.getProducts();
	}
	
	

}
