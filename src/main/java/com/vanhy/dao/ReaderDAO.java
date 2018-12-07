package com.vanhy.dao;

import java.util.List;

import com.vanhy.model.Reader;

public interface ReaderDAO extends BaseDao<Integer, Reader> {
	
	public List<Reader> loadReader();
}
