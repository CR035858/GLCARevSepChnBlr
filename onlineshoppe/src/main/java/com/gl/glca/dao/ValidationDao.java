package com.gl.glca.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.glca.model.Login;
import com.gl.glca.model.Registration;

@Repository
@EnableTransactionManagement
public class ValidationDao {
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	//HQL
	
	
	public ValidationDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	
	public boolean validateCredentials(Login login)
	{
		List <Registration> registrations = getAllregistrations();
		boolean flag = false;
		try
		{
			for(Registration regn:registrations)
			{
				if(regn.getLoginId().equals(login.getLoginId()) && regn.getPassword().equals(login.getPassword()))
				{
					flag = true;
					break;
				}
			}
		}
		catch(Exception ex)
		{
			flag = false;
		}
		return flag;
	}
	
	@Transactional
	public List <Registration> getAllregistrations()
	{
		Transaction tx = session.beginTransaction();
		List <Registration> registrations = session.createQuery("from Registration").list();
		tx.commit();
		return registrations;
	}

}
