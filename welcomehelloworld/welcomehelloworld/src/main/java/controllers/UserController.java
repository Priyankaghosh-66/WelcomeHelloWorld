package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Models.Products;
import Models.User;
import Services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	/*@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us){
		this.userService=us;
	}
	
	*/
	
	
	@ModelAttribute("User")
	public User create()
	{
		return new User();
	}
	
	@RequestMapping(value="/Registration",method=RequestMethod.GET)
	public String listUsers(Model Models){
		Models.addAttribute("user", new User());
		Models.addAttribute("listUsers", this.userService.listUsers());
		return "user";
	}
	@RequestMapping(value="/user/addition",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user")User u){
		if(u.getId()==0){
			u.setEnabled(true);
			u.setRole("ROLE_USER");
			this.userService.addUser(u);
		}else {
			this.userService.updateUser(u);
		}
		return "redirect:/Register";
	}
	@RequestMapping("/removal/{id}")
	public String removeUser(@PathVariable("id")int id){
		this.userService.removeUser(id);
		return "redirect:/Register";
	}
	
	public String editUser(@PathVariable("id")int id,Model Models){
		Models.addAttribute("User", this.userService.getUserById(id));
		Models.addAttribute("listUsers", this.userService.listUsers());
	
		return "redirect:/Register";
	}
	
	/*@RequestMapping("/Register")
	public ModelAndView loadtable()
	{
		ModelAndView mvu=new ModelAndView("user");
		List<User> ulist=new ArrayList<User>();
	    ulist= userService.getAll();
	    mvu.addObject("listUsers", ulist);
	    return mvu;
	}*/
		
	@RequestMapping("/Register")
		public String loadRegister(){
			return "user";
		}
	
	

}
