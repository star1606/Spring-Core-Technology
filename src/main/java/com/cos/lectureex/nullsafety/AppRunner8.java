package com.cos.lectureex.nullsafety;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner8 implements ApplicationRunner{
	
	@Autowired
	EventService eventService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//eventService.createEvent(null); // null 방지되게 하려면 애노테이션 설정 건드려야함
		String message = eventService.createEvent("lee");
		
	}

}
