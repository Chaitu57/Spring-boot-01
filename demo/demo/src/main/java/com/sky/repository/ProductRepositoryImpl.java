package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRespository {
   private static List<Product> products=new ArrayList<Product>();
	
	
	@Override
	public void addProduct(Product product) {

		System.out.println("in repository");
		products.add(product);
		
	}

	@Override
	public List<Product> getProducts() {
		
		return products;
	}

	@Override
	public void getProductsbyId(Product product) {
		
	}

	@Override
	public Product getProductById(String id) {
		
			for (Product product : products) {
				if(product.getProductId().equals(id))
				{
					return  product;
				}
			}
		return null;
	}

	@Override
	public Product getdeletebyId(String id) {
         int index=0;
		for (Product product : products) {
			if(product.getProductId().equals(id))
			{
				products.remove(index);
				return  product;
			}
			index=index+1;
		}
	return null;
	
	}

	@Override
	public Product updateById(Product newproduct) {
  int index=0;
		for (Product product : products) {
			if(product.getProductId().equals(newproduct.getProductId()))
			{
				products.set(index, newproduct);
				return newproduct;
			}
			index++;
			
		}
		return null;
	}
}
	

