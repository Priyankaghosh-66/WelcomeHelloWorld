package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Models.CustomUserDetail;
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
	
	@RequestMapping(value="/Register",method=RequestMethod.GET)
	public String listUsers(Model Models){
		Models.addAttribute("user", new User());
		Models.addAttribute("listUsers", this.userService.listUsers());
		return "user";
	}
	@RequestMapping(value="/freshuser",method=RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("User") User user,BindingResult result){
		
		if(result.hasErrors()){
			return "user";
		}
		
		if(user.getId()==0){
			user.setEnabled(true);
			user.setRole("ROLE_USER");
			this.userService.addUser(user);
		}else {
			this.userService.updateUser(user);
		}
		return "redirect:/Userview";
	}
	@RequestMapping("/removal/{id}")
	public String removeUser(@PathVariable("id")int id){
		this.userService.removeUser(id);
		return "redirect:/Register";
	}
	
	/*public String editUser(@PathVariable("id")int id,Model Models){
		Models.addAttribute("User", this.userService.getUserById(id));
		Models.addAttribute("listUsers", this.userService.listUsers());
	
		return "redirect:/Register";
	}*/
	
	/*@RequestMapping("/Register")
	public ModelAndView loadtable()
	{
		ModelAndView mvu=new ModelAndView("user");
		List<User> ulist=new ArrayList<User>();
	    ulist= userService.getAll();
	    mvu.addObject("listUsers", ulist);
	    return mvu;
	}*/
		
	/*@RequestMapping("/Register")
		public String loadRegister(){
			return "user";
		}*/
	
	

}