package com.gl.glca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.glca.model.Login;
import com.gl.glca.service.LoginService;

@Controller
@RequestMapping("/greet")
public class HomeController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/hello")
	public String sayHello(Model model)
	{
		String greeting = "Welcome to Maven Based Project with Configuration - Thymeleaf,CRUD";
		model.addAttribute("greetings", greeting);
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String showLoginForm(Model model)
	{
		Login login = new Login();
		model.addAttribute("login", login);
		return "loginPage";
	}
	
	@RequestMapping("/validate")
	public String validateLogin(@ModelAttribute("login") Login login)
	{
		if(loginService.validateLoginSvc(login))
		{
			return "successPage";
		}
		else
		{
			return "failurePage";
		}
	}

}
