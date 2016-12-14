package Services;

import Models.Cart;
import Models.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	void removeCartItem(int cartItemId);
	void removeAllCartItems(Cart cart);
}
