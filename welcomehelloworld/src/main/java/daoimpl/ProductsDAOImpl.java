package daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Models.Products;
import dao.ProductDAO;

@Repository
public class ProductsDAOImpl implements ProductDAO {

	/*ArrayList<Products> ProductsList=new ArrayList<Products>();
	
	@Override
	public void addProduct() {
		Products p1=new Products(001, "Chocovilla", "Chocolate", 499, "candy texture", "Available");
		ProductsList.add(p1);
		Products p2=new Products(002, "Cone","icecream", 599," dairy", "Available");
		ProductsList.add(p2);
		Products p3=new Products(003," Fruitjuice", "Beverages", 699, "Liquid packaged", "Available");
		ProductsList.add(p3);
		Products p4=new Products(004, "Dry Foods", "Processed", 599, "Hard", "Available");
		ProductsList.add(p4);
		Products p5=new Products(005, "Biscuits & cookies", "Bakery", 399, "easily handled", "Available");
		ProductsList.add(p5);*/
		
		
		@Autowired
		public SessionFactory sessionFactory;
		
		
		
		

	public List<Products> viewProducts() {

		Session session = sessionFactory.openSession();
        List<Products> productsList = session.createQuery("from Products").list();
		return productsList;
	}
		// TODO Auto-generated method stub
		
		/*Products p=new Products();
		p=(Products)ProductsList.get(0);*/
		//System.out.println(p.getName());

	/*public void addNewProduct(Products p) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	public void addNewProduct1(Products p) {
		// TODO Auto-generated method stub
		
	}*/

}
