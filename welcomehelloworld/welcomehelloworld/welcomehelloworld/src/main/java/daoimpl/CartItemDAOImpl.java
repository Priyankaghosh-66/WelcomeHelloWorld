package daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Models.Cart;
import Models.CartItem;
import dao.CartItemDAO;

@Repository
@Transactional
public class CartItemDAOImpl implements CartItemDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void addCartItem(CartItem cartItem) {
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(cartItem);
		session.flush();
		session.close();
		// TODO Auto-generated method stub
		
	}

	public void removeCartItem(int cartItemId) {
		Session session=sessionFactory.openSession();
		CartItem cartItem=(CartItem) session.get(CartItem.class, cartItemId);
		session.delete(cartItem);
		Cart cart=cartItem.getCart();
		List<CartItem>cartItems=cart.getCartItems();
		cartItems.remove(cartItem);
		session.flush();
		session.close();
		
		// TODO Auto-generated method stub
		
	}

	public void removeAllCartItems(Cart cart) {
		List<CartItem>cartItems=cart.getCartItems();
		for(CartItem cartItem:cartItems){
			removeCartItem(cartItem.getCartItemId());
		}
		// TODO Auto-generated method stub
		
	}

}
