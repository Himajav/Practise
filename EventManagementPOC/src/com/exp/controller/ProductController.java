package com.exp.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.RestClient;

 
@Controller
public class ProductController {
	
	@RequestMapping(value="/saveProduct",method = RequestMethod.GET,headers="Accept=application/json")
	//public @ResponseBody String fetchInitalData() {
	public @ResponseBody String fetchInitalData(@ModelAttribute("bottleBean")
	ProductBean productBean,BindingResult result,HttpServletRequest request) {
		System.out.println("hello");
		RestClient restclient = new RestClient();
		int productid = productBean.getProductid();
		String productName= productBean.getProductName();
		String resourceName = "http://localhost:8088/EPFRestConsumer/rest/UserService/users?productid="+productid+"&productName="+productName;
		System.out.println("resourceName -->"+resourceName);
		restclient.getProductData(resourceName);
		
		return null;	
		
	}
	
	

}