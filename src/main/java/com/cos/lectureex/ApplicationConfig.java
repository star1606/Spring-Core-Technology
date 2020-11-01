package com.cos.lectureex;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// @SpringBootApplication 이거 쓰면 config 필요없음 -> 부트기준
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
