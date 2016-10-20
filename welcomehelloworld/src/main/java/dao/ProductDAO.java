package dao;

import java.util.List;
//import java.util.List;

import Models.Products;

public interface ProductDAO {
	
	/*public void addProduct();*/
	
	
	public List<Products> listProducts();
	void addProducts(Products p);
	void updateProducts(Products p);
	void removeProducts(int id);
	Products getProductsById(int id);
	public List<Products> viewProducts();
	

}
