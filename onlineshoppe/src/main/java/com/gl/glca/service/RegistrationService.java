package com.gl.glca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.glca.dao.RegistrationDao;
import com.gl.glca.model.Registration;

@Service
public class RegistrationService {
	
	@Autowired
	RegistrationDao regnDao;
	
	public void saveRegistrationSvc(Registration registration)
	{
		regnDao.saveRegistrationDao(registration);
	}
	
	public List <Registration> getAllRegistrationsSvc()
	{
		return regnDao.getAllregistrations();
	}

}
