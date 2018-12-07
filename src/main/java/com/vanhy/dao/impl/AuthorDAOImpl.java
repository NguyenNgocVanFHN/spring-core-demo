package com.vanhy.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vanhy.dao.AuthorDAO;
import com.vanhy.dao.GenericDao;
import com.vanhy.model.Author;

public class AuthorDAOImpl extends GenericDao<Integer, Author> implements AuthorDAO {

	public AuthorDAOImpl() {
		super(Author.class);
	}
	
	public AuthorDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<Author> loadAuthors() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (List<Author>)session.createQuery("FROM Author").getResultList();
	}

}
