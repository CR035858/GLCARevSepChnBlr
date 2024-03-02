package com.gl.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.students.model.Student;
import com.gl.students.service.StudentService;

@Controller
@RequestMapping("/greet")
public class HomeController {
	
	
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "welcome";
	}
	
	@RequestMapping("/traindetails")
	public String showTrainsPage()
	{
		return "success";
	}

}
