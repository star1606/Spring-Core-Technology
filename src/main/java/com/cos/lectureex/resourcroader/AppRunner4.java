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
		Resource resource = resourceLoader.getResource("classpath:test.txt");
		System.out.println(resource.exists()); // test.text를 가진 resource가 존재하는지 확인
		// classpath 이하를 읽는다
		System.out.println(resource.getDescription()); 
	}
}
