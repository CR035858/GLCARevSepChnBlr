package com.gl.glca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.glca.model.Login;
import com.gl.glca.model.Registration;
import com.gl.glca.service.RegistrationService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	RegistrationService regnSvc;
	
	@RequestMapping("/register")
	public String showRegistrationForm(Model model)
	{
		Registration registration = new Registration();
		
		String[] occupations = {"Govt Employee","Pvt Employee","Self Employed","Quasi Employee"};
		model.addAttribute("registration", registration);
		model.addAttribute("occupations", occupations);
		return "registrationPage";
	}
	
	@RequestMapping("/save")
	public String saveRegistration(@ModelAttribute("registration") Registration registration,Model model)
	{
		Login login  = new Login();
		regnSvc.saveRegistrationSvc(registration);
		model.addAttribute("login", login);
		return "loginPage";
	}
	
}
