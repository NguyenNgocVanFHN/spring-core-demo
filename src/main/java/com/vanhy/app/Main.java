package com.vanhy.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vanhy.dao.AuthorDAO;
import com.vanhy.dao.BookDAO;
import com.vanhy.dao.ReaderDAO;
import com.vanhy.model.Author;
import com.vanhy.model.Book;
import com.vanhy.model.Reader;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AuthorDAO bookDao = context.getBean(AuthorDAO.class);
		Author author = bookDao.findById(1);
//		List<Book> listBooks = bookDao.loadBooks();
		for (Book book : author.getBooks()) {
			if (book != null) {
				System.out.println( book.getId());
			}
			
		}
//		
		
//		ReaderDAO readerDao = context.getBean(ReaderDAO.class);
//		readerDao.saveOrUpdate(new Reader("Van"));
		
	}
}
