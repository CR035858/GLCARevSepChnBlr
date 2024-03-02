package com.gl.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.students.dao.LoginDao;
import com.gl.students.model.Login;

@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	public boolean authenticateSvc(Login login)
	{
		return loginDao.authenticateDao(login);
	}
	

}
