package com.spring.assignment.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.assignment.library.entity.Author;
import com.spring.assignment.library.entity.Book;
import com.spring.assignment.library.entity.Library;
import com.spring.assignment.library.entity.Members;

public class LibraryManagementMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("LibraryManager.xml");

		Library library = context.getBean("library", Library.class);
		library.getLibraryDetails();

		Author author1 = context.getBean("author1", Author.class);
		author1.getAuthorDetails();

		Author author2 = context.getBean("author2", Author.class);
		author2.getAuthorDetails();

		Author author3 = context.getBean("author3", Author.class);
		author3.getAuthorDetails();

		Book book1 = context.getBean("book1", Book.class);
		book1.getBookDetails();
	
		Book book2 = context.getBean("book2", Book.class);
		book2.getBookDetails();
	
		Book book3 = context.getBean("book3", Book.class);
		book3.getBookDetails();
	
		Book book4 = context.getBean("book4", Book.class);
		book4.getBookDetails();
	
		Members members = context.getBean("members", Members.class);
		members.getMembersDetails();
	}
}