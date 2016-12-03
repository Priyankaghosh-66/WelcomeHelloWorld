package controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
	public void setproductservicesImpl(ProductServicesImpl ps){
		this.ps=ps;
	}
	*/
	
	@Autowired
	/*@Qualifier("psi")*/
	private ProductServicesImpl psi;

	
	
	/*public void setPsi(ProductServicesImpl psi) {
		this.psi = psi;
	}*/

	@ModelAttribute("products")
	public Products create()
	{
		return new Products();
	}
	
	
	@RequestMapping(value="/products", method= RequestMethod.GET)
	public String listProducts(Model Models){
	Models.addAttribute("products", new Products());
	Models.addAttribute("listofProducts",this.psi.listofProducts());
	return "Product";
	}
	@RequestMapping(value="/products/add",method=RequestMethod.POST)
	public String addProducts(@ModelAttribute("products") Products p,BindingResult result,HttpServletRequest request){
		{
			String filename=null;
			byte[]bytes;
			if(!p.getImage().isEmpty())
			{
				try
				{
					bytes=p.getImage().getBytes();
					psi.addProducts(p);
					System.out.println("DATA INSERTED");
					
					
					String path=request.getSession().getServletContext().getRealPath("/resources/Images/"+p.getId()+".jpg");
					System.out.println("Path="+path);
					System.out.println("File Name="+p.getImage().getOriginalFilename());
					File f=new File(path);
					BufferedOutputStream bs=new BufferedOutputStream(new FileOutputStream(f));
					bs.write(bytes);
					bs.close();
					System.out.println("Image Uploaded");
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
		}
		
		if(p.getId()==0){
			this.psi.addProducts(p);
		}else {
			this.psi.updateProducts(p);
		}
		return "redirect:/Demean";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeProducts(@PathVariable("id")int id){
		this.psi.removeProducts(id);
		return "redirect:/Demean";
	}
	
	/*@RequestMapping("/edit/{id}")
	public String updateProducts(@PathVariable("id") int id,Model models){
		
		models.addAttribute("products",this.psi.getProductsById(id));
		models.addAttribute("listofProducts",this.psi.listofProducts());
		return "Product";
	}*/
	//ProductsDAOImpl pdi;
	
	/*@Autowired
	public HomeController(ProductsDAOImpl pdi) {
		// TODO Auto-generated constructor stub
		
		this.pdi=pdi;
	}*/
	

	@RequestMapping(value="/edit/{id}")
	public ModelAndView getEditForm(@PathVariable(value="id")int id,Model models){
		models.addAttribute("products", this.psi.getProductsById(id));
		Products p=this.psi.getProductsById(id);
		System.out.println("in edit method");
		return new ModelAndView("EditProductsForm","EditProductsObj",p);
	}
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String updateProducts(@ModelAttribute(value="EditProductsObj")Products p){
		this.psi.updateProducts(p);
		System.out.println("in edit method2");
		return "redirect:/Demean";
	}
	
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
	@RequestMapping("/login")
	public String loadlogin()
	{
		return "login";
	}
	@RequestMapping("/Demean")
	public ModelAndView loadDatatable()
	{
		ModelAndView mv=new ModelAndView("Product");
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
	

	//@RequestMapping("/Demean")
	public String loadProducts(){
		return "redirect:/Product";
	}
	
	@RequestMapping("/loginError")
	public String loadErrorPage()
	{
		return "loginError";
	}
	@RequestMapping("/Userview")
	public ModelAndView loadUserview()
	{
		ModelAndView mv=new ModelAndView("Userview");
		List<Products> ulist=new ArrayList<Products>();
	    ulist= psi.getAll();
	    mv.addObject("listofProducts", ulist);
		return mv;
	
	}
	@RequestMapping("/example")
	public String loadexample()
	{
		return "example";
	}
	@RequestMapping("/Details")
	public String detailProducts(@RequestParam("id") int id,
			                     @RequestParam("name") String name,
			                     @RequestParam("status") String status,
			                     @RequestParam("description") String description,
			                     @RequestParam("price") String price,
			                     @RequestParam("category") String category,Model models){
		/*Products product=this.psi.getProductsById(id);
		models.addAttribute("product",product);*/
		return "Details";
	}
	@RequestMapping("modal")
	public String loadaddtocart()
	{
		return "modal";
	}
	
}
	
	 
