package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Models.Cart;
import Models.Customer;
import Models.CustomerOrder;
import Services.CartService;
import Services.CustomerOrderService;

@Controller
public class OrderController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private CustomerOrderService customerOrderService;
	
	@RequestMapping("/order/{cartId}")
	public String createOrder(@PathVariable("cartId")int cartId){
		CustomerOrder customerOrder=new CustomerOrder();
		Cart cart=cartService.getCartById(cartId);
		customerOrder.setCart(cart);
		Customer customer=cart.getCustomer();
		customerOrder.setBillingAddress(customer.getBillingAddress());
		customerOrder.setShippingAddress(customer.getShippingAddress());
		customerOrderService.addCustomerOrder(customerOrder);
		return "redirect:/checkout?cartId=" + cartId ;
	}

}
