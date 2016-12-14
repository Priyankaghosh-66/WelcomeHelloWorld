package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import Models.Cart;
import Models.Customer;
import Services.CartService;
import Services.CustomerServices;

@Controller
public class CartController {
	@Autowired(required=true)
	private CustomerServices customerServices;
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/cart/getCartId")
	    public String getCartId(Model Models){
		User user=(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username=user.getUsername();
		Customer customer=customerServices.getCustomerByUsername(username);
		Cart cart=customer.getCart();
		int cartId=cart.getCartId();
		Models.addAttribute("cartId", cartId);
		return "cart";
		
	}
	@RequestMapping("/cart/getCart/{cartId}")
	public @ResponseBody Cart getCart(@PathVariable(value="cartId")int cartId){
		System.out.println("Get cart in cartcontroller");
		Cart cart=cartService.getCartById(cartId);
		System.out.println("cart id"+cart.getCartId());
		System.out.println("list of items"+cart.getCartItems());
		return cart;
	}

}
