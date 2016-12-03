package dao;

import java.io.IOException;

import Models.Cart;

public interface CartDAO {
	Cart getCartByCartId(int CartId);
	Cart validate(int CartId)throws IOException;
	
	void update(Cart cart);

}
