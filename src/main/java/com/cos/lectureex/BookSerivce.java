package com.cos.lectureex;

import org.springframework.beans.factory.annotation.Autowired;

public class BookSerivce {

	// BookService가 BookRepository를 사용한다.
	@Autowired // 의존 관계 설정
	//BookRepository bookRepository;
	
	// 1. 생성자로
//	BookRepository bookRepository;
//	
//	public BookSerivce(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}
	
	
	// 2. setter로
	BookRepository bookRepository;
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
}
