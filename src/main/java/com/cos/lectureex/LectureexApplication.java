package com.cos.lectureex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
//@PropertySource("classpath:/app.properties")
public class LectureexApplication {

	public static void main(String[] args) {

		// 스프링은 기본적으로 웹애플리케이션을 띄우는데 웹애플리케이션을 안띄우고 자바 메인 메소드를 실행시키는 법
//		SpringApplication app = new SpringApplication(LectureexApplication.class);
//		app.setWebApplicationType(WebApplicationType.NONE);
//		app.run(args);
		
		
		SpringApplication.run(LectureexApplication.class, args);
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("application.xml");
		// context.
	}
	// var app = new SpringApplication(LectureexApplication.class);

	
	// 릴로딩 기능이 있는 메세지 소스 사용하기
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/messages");
		messageSource.setDefaultEncoding("UTF-8"); // 한글 깨짐 설정
		messageSource.setCacheSeconds(3); // 리소스를 3초 캐싱하고 다시 읽도록..
		return messageSource;
	}

}
