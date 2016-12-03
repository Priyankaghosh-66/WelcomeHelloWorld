package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Cart;
import Models.CartItem;
import Models.CustomerOrder;
import dao.CustomerOrderDAO;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

	@Autowired
	private CustomerOrderDAO customerOrderDAO;
	@Autowired
	private CartService cartService;
	public void addCustomerOrder(CustomerOrder customerOrder) {
		customerOrderDAO.addCustomerOrder(customerOrder);
		
		// TODO Auto-generated method stub
		
	}

	public double getCustomerOrderGrandTotal(int cartId) {
		// TODO Auto-generated method stub
		double grandTotal=0;
		Cart cart=cartService.getCartById(cartId);
		List<CartItem>cartItems=cart.getCartItems();
		for(CartItem item:cartItems){
			grandTotal+=item.getTotalPrice();
		}
		return grandTotal;
	}

}
