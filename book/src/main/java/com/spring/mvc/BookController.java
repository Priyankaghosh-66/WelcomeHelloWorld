package com.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Book;
import com.spring.services.BookService;

@Controller
public class BookController {
	@Autowired(required=true)
	private BookService bookService;

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	@RequestMapping("/getAllBooks")
	public ModelAndView getAllProducts(){
		List<Book>books=bookService.getAllBooks();
		return new ModelAndView("bookList","books",books);
	}

}
