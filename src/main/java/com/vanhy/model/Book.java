package com.vanhy.model;

// default package
// Generated Dec 6, 2018 3:02:25 PM by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Book generated by hbm2java
 */
public class Book implements java.io.Serializable {

	private Integer id;
	private Author author;
	private String name;
	private int price;
	private List borrows = new ArrayList(0);

	public Book() {
	}

	public Book(Author author, String name, int price) {
		this.author = author;
		this.name = name;
		this.price = price;
	}

	public Book(Author author, String name, int price, List borrows) {
		this.author = author;
		this.name = name;
		this.price = price;
		this.borrows = borrows;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List getBorrows() {
		return this.borrows;
	}

	public void setBorrows(List borrows) {
		this.borrows = borrows;
	}

}