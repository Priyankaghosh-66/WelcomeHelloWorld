package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Book;
@Repository
public class BookDaoImpl implements BookDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		
		return session.createQuery("from Book").list();
	}

}
