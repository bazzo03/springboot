package com.library.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.library.repository.Book;

public class BookUtil {

	public static Book getOneBook() {
		Book book = new Book();
		List<String> authors = new ArrayList<>();
		authors.add("Carlos Martinez");
		authors.add("Pedro Mendoza");
		authors.add("Juan Rodriguez");
		book.setAuthor(authors);
		book.setId(UUID.randomUUID().toString());
		book.setName("Example book");
//		book.setPrintedDate();
		return book;
	}
	
	public static List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		books.add(getOneBook());
		return books;
	}
	
	public static Book createBookRepository() {
		Book book = new Book();
		return book;
	}
}
