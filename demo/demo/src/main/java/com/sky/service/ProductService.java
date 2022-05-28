package com.sky.service;

import java.util.List;

import com.sky.model.Product;

public interface ProductService {

	public void addProduct(Product product);

	public List<Product> getProducts();

	public Product getProductsbyId(String id);

	public Product getdeletebyId(String id);

	public Product updateById(Product product);

	

	

}
