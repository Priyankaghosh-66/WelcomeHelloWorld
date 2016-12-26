package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/webgate")
	public ModelAndView userPasswordChecking(HttpServletRequest request)
	{
		String username=request.getParameter("usrname");
		System.out.println(username);
		String password=loginService.getUserPassword(username);
		String givenPassword=request.getParameter("psw");
		
		ModelAndView mv=new ModelAndView("Cart");
		ModelAndView loginFail=new ModelAndView("index");
		
		if(password.equals(givenPassword))
		{
			System.out.println(password);
			return mv;
		
		}
		else{
			ModelMap m=new ModelMap();
			m.addAttribute("error","invalid Credentials");
			return loginFail;
		}
	}
	

}
