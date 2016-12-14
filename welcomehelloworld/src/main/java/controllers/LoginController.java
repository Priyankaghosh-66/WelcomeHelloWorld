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
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView userPasswordChecking(HttpServletRequest request)
	{
		String usrname=request.getParameter("usrname");
		String passwrd=loginService.getUserPassword(usrname);
		String givenPassword=request.getParameter("psw");
		
		ModelAndView mv=new ModelAndView("Userview");
		ModelAndView loginFail=new ModelAndView("index");
		
		if(passwrd.equals(givenPassword))
		{
			System.out.println(passwrd);
			return mv;
		
		}
		else{
			ModelMap m=new ModelMap();
			m.addAttribute("error","invalid Credentials");
			return loginFail;
		}
	}
	

}
