package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Models.Cart;
import Models.CartItem;
import dao.CartItemDAO;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemDAO cartItemDAO;
	
	public void addCartItem(CartItem cartItem) {
		cartItemDAO.addCartItem(cartItem);
		
		// TODO Auto-generated method stub
		
	}

	public void removeCartItem(int cartItemId) {
		// TODO Auto-generated method stub
		cartItemDAO.removeCartItem(cartItemId);
		
	}

	public void removeAllCartItems(Cart cart) {
		// TODO Auto-generated method stub
		cartItemDAO.removeAllCartItems(cart);
		
	}

}
