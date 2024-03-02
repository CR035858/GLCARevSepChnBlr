package com.gl.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.students.dao.StudentDao;
import com.gl.students.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public List <Student> getStudentsSvc()
	{
		List <Student> students = studentDao.getStudentsDao();
		return students;
	}
}
