package com.shopping.mart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.mart.entity.ProductEntity;
import com.shopping.mart.model.Product;
import com.shopping.mart.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public void setProducts(Product product)
	{
		ProductEntity productEntity = new ProductEntity();
		productEntity.setName(product.getName());
		productEntity.setCategory(product.getCategory());
		productEntity.setPrice(product.getPrice());
		productEntity.setQuantity(product.getQuantity());
		productEntity.setType(product.getType());
		
		productRepo.save(productEntity);
		
	}
	
	public List<Product> getProducts()
	{
		List<ProductEntity> productEntityList = productRepo.findAll();
		List<Product>  productList = new ArrayList<>();

		for(ProductEntity productEntity : productEntityList )
		{
			Product product = new Product();
			
			product.setName(productEntity.getName());
			product.setCategory(productEntity.getCategory());
			product.setPrice(productEntity.getPrice());
			product.setQuantity(productEntity.getQuantity());
			product.setRating(productEntity.getRating());
			product.setType(productEntity.getType());
			
			productList.add(product);
			
		}
		return productList; 
	}
	

}
