package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Models.Cart;
import dao.CartDAO;

@Service
@Transactional
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDAO cartDAO;
	
	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		
		return cartDAO.getCartByCartId(cartId);
	}

}
