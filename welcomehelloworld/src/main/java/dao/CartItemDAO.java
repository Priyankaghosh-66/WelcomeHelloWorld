package dao;

import Models.Cart;
import Models.CartItem;

public interface CartItemDAO {
	void addCartItem(CartItem cartItem);
	void removeCartItem(int cartItemId);
	void removeAllCartItems(Cart cart);
	/*CartItem getCartItemByProductId(int ProductId);*/

}
