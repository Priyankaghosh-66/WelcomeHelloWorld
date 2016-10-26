package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Models.Products;
import daoimpl.ProductsDAOImpl;

@Service
@Transactional
/*@Component("psi")*/
public class ProductServicesImpl {
	
	@Autowired
	public ProductsDAOImpl pdi;

	/*public void setpdi(ProductsDAOImpl pdi){
		this.pdi=pdi;
	}
*/	
	
	public void addProducts(Products p) {
		// TODO Auto-generated method stub
		this.pdi.addProducts(p);
		
	}

	
	
	public void updateProducts(Products p) {
		// TODO Auto-generated method stub
		this.pdi.updateProducts(p);
		
	}

	
	
	public List<Products> listProducts() {
		// TODO Auto-generated method stub
		return this.pdi.listProducts();
	}

	
	
	public Products getProductsById(int id) {
		// TODO Auto-generated method stub
		return this.pdi.getProductsById(id);
	}

	
	
	public void removeProducts(int id) {
		// TODO Auto-generated method stub
		 this.pdi.removeProducts(id);
		
	}
	
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return pdi.viewProducts();
	}
	
	
}

