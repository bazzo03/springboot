package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.repository.BookRepository;
import com.library.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(path="HelloWorld", method=RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(path="book", method=RequestMethod.GET)
	public List<BookRepository> getAllBooks() {
		return bookService.getAllBooks();
	}
}
