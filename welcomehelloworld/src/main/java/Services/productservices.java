package Services;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import daoimpl.ProductsDAOImpl;
import Models.Products;





@Service
public class productservices {

	@Autowired
	private ProductsDAOImpl pdi;
	
	//@Autowired
	//private UserDAOimpl udi;
	
	public List<Products> getAll()
	{
		return pdi.viewProducts();
	}
	
	/*public void addProduct(Products p)
	{
		this.pdi.addNewProduct(p);
	}
	
	public void removeProduct(int id)
	{
		this.pdi.deleteProduct(id);
	}
	public void update(int id)
	{
		this.pdi.updateProduct(id);
	}
	public int addPerson(Users u)
	{
		return this.pdi.addNewPerson(u);
	}*/
}
