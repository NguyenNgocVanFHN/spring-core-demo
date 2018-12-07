package com.vanhy.dao;

import java.io.Serializable;

public interface BaseDao<PK, T> {
	T findById(Serializable key);
	
	T saveOrUpdate(T entity);
	
	void delete(T entity);
}
