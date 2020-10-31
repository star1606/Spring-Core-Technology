package com.cos.lectureex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = LectureexApplication.class)
public class ApplicationConfig {

	
	
	
//	@Bean
//	public BookRepository bookRepository() {
//		return new BookRepository();
//	}
//	
//	@Bean
//	public BookSerivce bookSerivce() {
//		BookSerivce bookSerivce = new BookSerivce();
//		bookSerivce.setBookRepository(bookRepository());
//		return bookSerivce;
//	}
}
