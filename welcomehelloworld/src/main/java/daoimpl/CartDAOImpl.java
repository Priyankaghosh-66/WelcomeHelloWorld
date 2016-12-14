package daoimpl;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Models.Cart;
import Services.CustomerOrderService;
import dao.CartDAO;

@Repository
@Transactional
public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private CustomerOrderService customerOrderService;
	
	public Cart getCartByCartId(int CartId) {
		Session session=sessionFactory.openSession();
		Cart cart=(Cart) session.get(Cart.class, CartId);
		session.close();
		// TODO Auto-generated method stub
		return cart;
	}

	public Cart validate(int CartId) throws IOException {
		Cart cart=getCartByCartId(CartId);
		if(cart==null||cart.getCartItems().size()==0){
			throw new IOException(CartId+"");
		}
		update(cart);
		// TODO Auto-generated method stub
		return cart;
	}

	public void update(Cart cart) {

		int cartId=cart.getCartId();
		double grandTotal=customerOrderService.getCustomerOrderGrandTotal(cartId);
		cart.setGrandTotal(grandTotal);
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(cart);
		session.flush();
		session.close();
		// TODO Auto-generated method stub
		
	}
	

}
