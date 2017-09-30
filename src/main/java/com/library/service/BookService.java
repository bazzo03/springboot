package com.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;
import com.library.util.BookUtil;

@Service
public class BookService {

	public List<BookRepository> getAllBooks() {
		return  BookUtil.getAllBooks();
	}
}
