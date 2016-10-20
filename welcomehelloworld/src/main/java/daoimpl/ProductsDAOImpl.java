package daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Models.Products;
import dao.ProductDAO;


@Repository
@Transactional
public class ProductsDAOImpl {

	
	
	
		
	
	private static final Logger logger=LoggerFactory.getLogger(ProductsDAOImpl.class);
	
		@Autowired
		public SessionFactory sessionFactory;
		public List<Products> viewProducts() {

			Session session = sessionFactory.openSession();
	        List<Products> productsList = session.createQuery("from Products").list();
			return productsList;
		}
		
		/*public void setSessionFactory(SessionFactory sf){
			
			this.sessionFactory=sf;
		}*/
		
		/*@Override*/
		@Transactional
		public void addProducts(Products p){
			Session session=sessionFactory.getCurrentSession();
			session.save(p);
			logger.info("Product saved successfully,Product details="+p);
		}
		/*@Override*/
		public void updateProducts(Products p){
			Session session=this.sessionFactory.getCurrentSession();
			session.persist(p);
			logger.info("Product updated successfully,Product details="+p);
		}
		
		/*@Override*/
		public List<Products> listProducts(){
			Session session= sessionFactory.openSession();
			@SuppressWarnings("unchecked")
			List<Products> productsList =session.createQuery("from Products").list();
			for (Products p:productsList){
				logger.info("Products List::" +p);
			}
			return productsList;
		}
		
		public Products getProductsById(int id){
			Session session=this.sessionFactory.getCurrentSession();
			Products p=(Products)session.load(Products.class, new Integer (id));
			logger.info("Products loaded successfully,Product Details="+p);
			return p;
		}
		/*@Override*/
		public void removeProducts(int id){
			Session session=this.sessionFactory.getCurrentSession();
			Products p=(Products) session.load(Products.class, new Integer(id));
			if(null!= p){
				session.delete(p);
			}
			logger.info("Products deleted successfully,Product details:"+p);
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
