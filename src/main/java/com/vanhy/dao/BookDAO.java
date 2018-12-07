package com.vanhy.dao;

import java.util.List;

import com.vanhy.model.Book;

public interface BookDAO extends BaseDao<Integer, Book> {
	public List<Book> loadBooks();
}
