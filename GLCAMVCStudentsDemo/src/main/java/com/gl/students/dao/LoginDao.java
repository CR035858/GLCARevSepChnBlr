package com.gl.students.dao;

import org.springframework.stereotype.Repository;

import com.gl.students.model.Login;

@Repository
public class LoginDao {
	
	//WE ARE SIMULATING DATA BY HARDCODING
	// ACTUALLY THIS LAYER SHOULD COMMUNICATE TO DB
	//WHICH WE DO IN FORTH COMING SESSIONS USING HIBERNATE
	
	public boolean authenticateDao(Login login)
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
