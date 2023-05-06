package com.spring.ioc.di.annotation.ioc.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet result, int rowNum) throws SQLException {

		Book book = new Book();

		book.setId(result.getInt("id"));
		book.setName(result.getString("name"));
		book.setAuthor(result.getString("author"));
		book.setDescription(result.getString("description"));
		book.setPrice(result.getString("price"));

		return book;
	}
}