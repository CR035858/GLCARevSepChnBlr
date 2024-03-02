package com.gl.glca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.glca.model.Product;
import com.gl.glca.service.ProductService;

@Controller
//@RequestMapping("/products/list")
@RequestMapping("/products")
public class ProductController {
	

	@Autowired
	ProductService productSvc;
	
	@RequestMapping("/list")
	public String getAllProducts(Model model)
	{
		List <Product> products = productSvc.getAllproductsSvc();
		System.out.println(products);
		model.addAttribute("products", products);
		return "productsListPage";
	}
	
	@RequestMapping("/addProduct")
	public String showFormToAdd(Model model)
	{
		
		Product product = new Product();
		model.addAttribute("product", product);
		return "addProductPage";
	}
	//prodId
	@RequestMapping("/showUpdateForm")
	public String showFormToUpdate(@ModelAttribute("prodId") int id,Model model)
	{
		Product product = productSvc.getProductByIdSvc(id);
		model.addAttribute("product", product);
		return "addProductPage";
	}
	
	@RequestMapping("/save")
	public String saveProduct(@ModelAttribute("product") Product product)
	{
		if(product.getId() == 0)
		{
			productSvc.saveProductSvc(product);
		}
		else
		{
			Product productU = productSvc.getProductByIdSvc(product.getId());
			productU.setProductId(product.getProductId());
			productU.setProductName(product.getProductName());
			productU.setProductCategory(product.getProductCategory());
			productU.setPricePerUnit(product.getPricePerUnit());
			productU.setQuantityOnHand(product.getQuantityOnHand());
			productSvc.saveProductSvc(productU);
		}
		return "redirect:/products/list";
	}
	
	@RequestMapping("/delete")
	public String deleteProductById(@ModelAttribute("prodId") int id)
	{
		productSvc.deleteProductById(id);
		return "redirect:/products/list";
	}

}
