package com.gl.glca.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.glca.model.Registration;

@Repository
@EnableTransactionManagement
public class RegistrationDao {
	
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	//HQL
	public RegistrationDao(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		this.session = sessionFactory.openSession();
	}
	
	@Transactional
	public void saveRegistrationDao(Registration registration)
	{
		Transaction tx = session.beginTransaction();
		session.save(registration);
		tx.commit();
	}
	
	@Transactional
	public List <Registration> getAllregistrations()
	{
		Transaction tx = session.beginTransaction();
		List <Registration> registrations =	session.createQuery("from Registration").list();
		tx.commit();
		return registrations;
	}
	

}
