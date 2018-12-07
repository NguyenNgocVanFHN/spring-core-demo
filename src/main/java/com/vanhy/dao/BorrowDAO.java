package com.vanhy.dao;

import java.util.List;

import com.vanhy.model.Borrow;

public interface BorrowDAO extends BaseDao<Integer, Borrow> {
	public List<Borrow> loadBorrows();
}
