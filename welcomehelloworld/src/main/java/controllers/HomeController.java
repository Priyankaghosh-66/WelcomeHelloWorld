package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Models.Products;
//import Services.productservices;
import Services.ProductServicesImpl;
import daoimpl.ProductsDAOImpl;
@Controller
public class HomeController {
	
	/*@Autowired(required=false)
	private ProductServicesImpl ps;
	
	
	
	@Qualifier(value="ps")
	public void setproductservices(ProductServicesImpl ps){
		this.ps=ps;
	}
	*/
	
	@Autowired
	/*@Qualifier("psi")*/
	public ProductServicesImpl psi;

	
	
	/*public void setPsi(ProductServicesImpl psi) {
		this.psi = psi;
	}*/

	@ModelAttribute("products")
	public Products create()
	{
		return new Products();
	}
	
	@RequestMapping(value="/product", method= RequestMethod.GET)
	public String listProducts(Model Models){
	Models.addAttribute("product", new Products());
	Models.addAttribute("listProduct",this.psi.listProducts());
	return "product";
	}
	@RequestMapping(value="/product/add",method=RequestMethod.POST)
	public String addProducts(@ModelAttribute("product") Products p){
		if(p.getId()==0){
			this.psi.addProducts(p);
		}else {
			this.psi.updateProducts(p);
		}
		return "redirect:/product";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeProducts(@PathVariable("id")int id){
		this.psi.removeProducts(id);
		return "redirect:/product";
	}
	
	@RequestMapping("/edit/{id}")
	public String editProduct(@PathVariable("id") int id,Model models){
		models.addAttribute("product",this.psi.getProductsById(id));
		models.addAttribute("listProduct",this.psi.listProducts());
		return "product";
	}
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
	    plist= psi.getAll();
		
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
	

	@RequestMapping("/Demean")
	public String loadProducts(){
		return "Product";
	}


}
	
	 
