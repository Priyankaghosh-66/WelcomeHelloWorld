package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Models.Products;
import Services.productservices;
import daoimpl.ProductsDAOImpl;
@Controller
public class HomeController {
	
	@Autowired
	private productservices ps;
	
	
	//ProductsDAOImpl pdi;
	
	/*@Autowired
	public HomeController(ProductsDAOImpl pdi) {
		// TODO Auto-generated constructor stub
		
		this.pdi=pdi;
	}*/
	
	@RequestMapping("/")
	public String loadIndex()
	{
		return "index";
	}

	@RequestMapping("Aboutus")
	public String loadAboutus()
	{
		return "Aboutus";
	}
	@RequestMapping("/returnback")
	public String loadHome()
	{
		return "index";
	}
	@RequestMapping("/Select")
	public ModelAndView loadDatatable()
	{
		ModelAndView mv=new ModelAndView("Datatable");
		List<Products> plist=new ArrayList<Products>();
	    plist= ps.getAll();
		
		//ProductsDAOImpl pdi=new ProductsDAOImpl();
		//pdi.addProduct();
		//pdi.viewProducts();
		
		//plist=pdi.viewProducts();
		
		//Products p=new Products();
		//p=(Products)plist.get(0);
		
		//System.out.println(p.getName());
		mv.addObject("listofProducts", plist);
		return mv;
	}
	
	 
}
