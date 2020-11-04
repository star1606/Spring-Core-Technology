package com.cos.lectureex.resourcroader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AppRunner4 implements ApplicationRunner {

	@Autowired
	ResourceLoader resourceLoader;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("resourceLoader타입 : " + resourceLoader.getClass()); // applicationcontext(= ResourceLoader)의 타입을찍어본다.
		
		Resource resource = resourceLoader.getResource("classpath:test.txt"); // 접두어를 쓰는게 좋다
		System.out.println("resource 타입 : " + resource.getClass()); //
		System.out.println(resource.getDescription()); 
		System.out.println("classpath를 넣으면: " + resource.exists()); // test.text를 가진 resource가 존재하는지 확인
		
		Resource resource2 = resourceLoader.getResource("test.txt"); // 접두어를 쓰는게 좋다
		System.out.println("classpath를 빼면 : " + resource2.exists());
		
	}
}
