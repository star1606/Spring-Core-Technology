package com.cos.lectureex.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cos.lectureex.BookRepository;

@Configuration
@Profile("test")
public class TestConfiguration {
	
	
	// BookRepository2를 빈으로 등록하는 데 @Profile을 써서 test일 때만 등록하게 하는 것
	@Bean
	public BookRepository2 bookRepository2() {
		return new TestBookRepository();
	}
}
