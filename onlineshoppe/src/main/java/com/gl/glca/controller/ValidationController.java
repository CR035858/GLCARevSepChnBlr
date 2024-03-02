package com.gl.glca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.glca.model.Login;
import com.gl.glca.service.ValidationService;

@Controller
@RequestMapping("/login")
public class ValidationController {

	@Autowired
	ValidationService vService;
	
	@RequestMapping("/validatelogin")
	public String validateLogin(Login login)
	{
		if(vService.validateCredentialsSvc(login))
		{
			return "successPage";
		}
		else
		{
			return "failurePage";
		}
		
	}
}
