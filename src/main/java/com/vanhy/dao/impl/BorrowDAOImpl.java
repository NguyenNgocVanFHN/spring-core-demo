package com.vanhy.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vanhy.dao.BorrowDAO;
import com.vanhy.dao.GenericDao;
import com.vanhy.model.Borrow;

public class BorrowDAOImpl extends GenericDao<Integer, Borrow> implements BorrowDAO {

	public BorrowDAOImpl() {
		super(Borrow.class);
	}
	
	public BorrowDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<Borrow> loadBorrows() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (List<Borrow>) session.createQuery("FROM Borrow");
	}
	
}
