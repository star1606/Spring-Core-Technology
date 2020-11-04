package com.cos.lectureex.messagesource;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class AppRunner2 implements ApplicationRunner {

	@Autowired
	MessageSource messageSource;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//System.out.println(messageSource.getClass());
		// 바로 쓸 수 있음
		//while(true) {
			//System.out.println(messageSource.getMessage("greeting", new String[] {"lee"}, Locale.KOREA));
			//System.out.println(messageSource.getMessage("greeting", new String[] {"lee"}, Locale.getDefault()));
			//Thread.sleep(1000l); // 1초마다 찍는다
		//}
		
		
	}
	
	
}
