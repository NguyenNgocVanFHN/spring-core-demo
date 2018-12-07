package com.vanhy.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.vanhy.dao.BookDAO;
import com.vanhy.dao.GenericDao;
import com.vanhy.model.Book;

public class BookDAOImpl extends GenericDao<Integer, Book> implements BookDAO {

	public BookDAOImpl() {
		super(Book.class);
	}
	
	@Override
	public List<Book> loadBooks() {
		Session session = getSessionFactory().openSession();
		try {
			session.beginTransaction();
			return (List<Book>) session.createQuery("FROM Book").getResultList();
		} finally {
			session.getTransaction().commit();
		}
	}
	
}
