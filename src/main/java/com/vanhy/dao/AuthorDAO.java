package com.vanhy.dao;

import java.util.List;

import com.vanhy.model.Author;

public interface AuthorDAO extends BaseDao<Integer, Author> {
	public List<Author> loadAuthors();
}
