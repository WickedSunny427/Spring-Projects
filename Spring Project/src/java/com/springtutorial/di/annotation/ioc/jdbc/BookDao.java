package com.spring.ioc.di.annotation.ioc.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertBook(Book book) {
		String sql = "INSERT INTO book (id,name, author, description, price) VALUES (APPLICATION_SEQUENCE.NextVAL,?, ?, ?, ?)";
		int response = jdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getDescription(),
				book.getPrice());

		return response;
	}

	public int updateBook(Book book, int bookId) {
		String sql = "UPDATE book set name=?, author=?, description=? ,price=? WHERE  id=?";
		int response = jdbcTemplate.update(sql, book.getName(), book.getAuthor(), book.getDescription(),
				book.getPrice(), bookId);
		return response;
	}

	public int deleteBook(int bookId) {
		String sql = "DELETE from book where id=?";
		int response = jdbcTemplate.update(sql, bookId);
		return response;
	}

	public List<Book> getBooks() {
		String sql = "select * from book";
		return jdbcTemplate.query(sql, new BookRowMapper());
	}

	public Book getBookById(int id) {
		String sql = "select * from book where id=?";
		return jdbcTemplate.queryForObject(sql, new BookRowMapper(), id);
	}
}