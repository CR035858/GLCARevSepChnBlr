package com.gl.glca.dao;

import org.springframework.stereotype.Repository;

import com.gl.glca.model.Login;

@Repository
public class LoginDao {
	
	public boolean validateLogin(Login login)
	{
		if(login.getLoginId().equals("admin") && login.getPassword().equals("password"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
