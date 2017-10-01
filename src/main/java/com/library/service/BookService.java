package com.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.repository.Book;
import com.library.util.BookUtil;

@Service
public class BookService {

	public List<Book> getAllBooks() {
		return  BookUtil.getAllBooks();
	}
}
