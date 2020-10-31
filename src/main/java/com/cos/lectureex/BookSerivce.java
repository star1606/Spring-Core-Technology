package com.cos.lectureex;

public class BookSerivce {

	// BookService가 BookRepository를 사용한다.
	BookRepository bookRepository;
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
}
