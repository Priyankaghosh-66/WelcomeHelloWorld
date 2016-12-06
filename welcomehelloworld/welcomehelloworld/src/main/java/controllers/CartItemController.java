package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import Models.Cart;
import Models.CartItem;
import Models.Customer;
import Models.Products;
import Services.CartItemService;
import Services.CartService;
import Services.CustomerServices;
import Services.ProductServicesImpl;

@Controller
public class CartItemController {

	@Autowired
	private CustomerServices customerServices;
	@Autowired
	private ProductServicesImpl productServicesImpl;
	@Autowired
	private CartItemService cartItemService;
	@Autowired
	private CartService cartService;
	
	
	public CustomerServices getCustomerServices() {
		return customerServices;
	}

	public void setCustomerServices(CustomerServices customerServices) {
		this.customerServices = customerServices;
	}

	public ProductServicesImpl getProductServicesImpl() {
		return productServicesImpl;
	}

	public void setProductServicesImpl(ProductServicesImpl productServicesImpl) {
		this.productServicesImpl = productServicesImpl;
	}

	public CartItemService getCartItemService() {
		return cartItemService;
	}

	public void setCartItemService(CartItemService cartItemService) {
		this.cartItemService = cartItemService;
	}

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}

	@RequestMapping("/cart/add/{id}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void addCartItem(@PathVariable(value="id")int id){
		User user=(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username=user.getUsername();
		Customer customer=customerServices.getCustomerByUsername(username);
		System.out.println("Customer is"+customer.getCustomerEmail());
		Cart cart=customer.getCart();
		System.out.println(cart.getCartId());
		List<CartItem>cartItems=cart.getCartItems();
		Products product=productServicesImpl.getProductsById(id);
		
		
		for(int i=0;i<cartItems.size();i++){
			CartItem cartItem=cartItems.get(i);
			if(id==cartItem.getProducts().getId()){
				cartItem.setQuantity(cartItem.getQuantity()+1);
				cartItem.setTotalPrice(cartItem.getQuantity()*product.getPrice());
				cartItemService.addCartItem(cartItem);
				return;
			}
		}
		CartItem cartItem=new CartItem();
		cartItem.setProducts(product);
		cartItem.setQuantity(1);
		cartItem.setTotalPrice(cartItem.getQuantity()*product.getPrice());
		cartItem.setCart(cart);
		cartItemService.addCartItem(cartItem);
	}
	
	@RequestMapping("/cart/removecartitem/{cartItemId}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void removeCartItem(@PathVariable(value="cartItemId")int cartItemId){
		cartItemService.removeCartItem(cartItemId);
	}
	
	@RequestMapping("/cart/removeAllItems/{cartItemId}")
	@ResponseStatus(value=HttpStatus.NO_CONTENT)
	public void removeAllCartItems(@PathVariable(value="cartId")int cartId){
		Cart cart=cartService.getCartById(cartId);
		cartItemService.removeAllCartItems(cart);
	}
	
	
}