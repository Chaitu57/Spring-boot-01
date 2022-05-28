package com.sky.repository;

import java.util.List;

import com.sky.model.Product;

public interface ProductRespository {

	public void addProduct(Product product) ;

	public List<Product> getProducts() ;
	
	public void  getProductsbyId(Product product);

	 public Product getProductById(String id);
	
	public Product getdeletebyId(String id);
	
	public Product updateById(Product product);
}
