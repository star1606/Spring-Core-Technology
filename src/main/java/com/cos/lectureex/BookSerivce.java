package com.cos.lectureex;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookSerivce {

	// BookService가 BookRepository를 사용한다.
	//@Autowired // 의존 관계 설정
	//BookRepository bookRepository;
	
	// 1. 생성자로
//	BookRepository bookRepository;
//	@Autowired
//	public BookSerivce(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}
	
	
	// 2. setter로
	//BookRepository bookRepository;
	
	//@Autowired
	// BookRepository가 빈이 아닐 때 BookRepository의 의존성 없이도 BookService 등록
	//public void setBookRepository(BookRepository bookRepository) {
	//	this.bookRepository = bookRepository;
	//}
	
	
	// 3. 필드 인젝션
	// BookRepository가 빈이 아닐 때 BookRepository의 의존성 없이도 BookService 등록
//	@Autowired
//	BookRepository bookRepository;
	
	//@Autowired // 타입만으로 주입받는게 아니라 이름도 확인함
	//List<BookRepository> bookRepositories; 
	// 이렇게 하면 bookRepository타입의 모든 빈을 주입받을 수 있다.
	
	
	@Autowired
	BookRepository myBookRepository;
	
	@PostConstruct
	public void setup() {
		System.out.println(myBookRepository.getClass());
	}
	
	
//	public void printBookRepository() {
//		this.bookRepositories.forEach(System.out::println);
		// System.out::println 이거 뭐지
//	}
	
}
