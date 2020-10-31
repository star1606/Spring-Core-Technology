package com.cos.lectureex;

import org.springframework.beans.factory.annotation.Autowired;

public class BookSerivce {

	// BookService가 BookRepository를 사용한다.
	@Autowired // 의존 관계 설정
	BookRepository bookRepository;
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
}
