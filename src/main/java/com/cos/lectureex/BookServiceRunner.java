package com.cos.lectureex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BookServiceRunner implements ApplicationRunner {

//	@Autowired
//	BookSerivce bookSerivce;
	
	@Autowired
	BookSerivce bookSerivce;
	
	 @Override
	public void run(ApplicationArguments args) throws Exception {
		
		 bookSerivce.printBookRepository();
		
	}
}
