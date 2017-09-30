package com.library.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.library.repository.BookRepository;

public class BookUtil {

	public static BookRepository getOneBook() {
		BookRepository book = new BookRepository();
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
	
	public static List<BookRepository> getAllBooks() {
		List<BookRepository> books = new ArrayList<>();
		books.add(getOneBook());
		return books;
	}
	
	public static BookRepository createBookRepository() {
		BookRepository book = new BookRepository();
		return book;
	}
}
