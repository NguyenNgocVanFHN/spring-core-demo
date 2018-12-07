package com.vanhy.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public abstract class GenericDao<PK extends Serializable, T> extends HibernateDaoSupport {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public GenericDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}
	
	public GenericDao(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}
	
	//---------------
	public T findById(Serializable key) {
		
		return (T) getSession().get(persistentClass, key);
	}
	
	
	public void delete(T entity) {
		Session session = getSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.delete(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	public T saveOrUpdate(T entity) {
		System.out.println("In save or update");
		Session session = getSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		return entity;
	}
	
	// -------------
	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	protected Session getSession() {
		return sessionFactory.openSession();
	}
}
