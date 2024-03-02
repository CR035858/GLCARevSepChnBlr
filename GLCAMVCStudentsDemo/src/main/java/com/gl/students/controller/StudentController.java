package com.gl.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.students.model.Student;
import com.gl.students.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/getStudents")
	public String getStudentsData(Model model)
	{
		List <Student> students = studentService.getStudentsSvc();
		model.addAttribute("myStudents", students);
		return "studentsview";
	}

}
