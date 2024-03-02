package com.gl.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.students.model.Login;
import com.gl.students.service.LoginService;

@Controller
@RequestMapping("/logins")
public class LoginController {
	
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/loginpage")
	public String showLoginPage(Model model)
	{
		Login login1 = new Login();
		model.addAttribute("login", login1);
		return "loginform";
		
	}
	
	@RequestMapping("/authenticate")
	public String authenticateLogin(@ModelAttribute Login login)
	{
		if(loginService.authenticateSvc(login))
		{
			return "success";
		}
		else
		{
			return "invalid";
		}
	}

}
