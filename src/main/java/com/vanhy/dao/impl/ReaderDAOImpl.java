package com.vanhy.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vanhy.dao.GenericDao;
import com.vanhy.dao.ReaderDAO;
import com.vanhy.model.Reader;

public class ReaderDAOImpl extends GenericDao<Integer, Reader> implements ReaderDAO {

	public ReaderDAOImpl() {
		super(Reader.class);
	}
	
	public ReaderDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<Reader> loadReader() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (List<Reader>) session.createQuery("FROM Reader").getResultList();
	}

}
