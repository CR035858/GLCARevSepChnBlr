package com.gl.glca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.glca.dao.ValidationDao;
import com.gl.glca.model.Login;

@Service
public class ValidationService {

	@Autowired
	ValidationDao validationDao;
	
	public boolean validateCredentialsSvc(Login login)
	{
		return validationDao.validateCredentials(login);
	}
}
