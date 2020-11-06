package com.cos.lectureex.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner7 implements ApplicationRunner{
	
	@Autowired // 프록시 써도 여긴 그대로 하면됨
	EventService eventService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		eventService.createEvent();
		eventService.publishEvent();
		eventService.deleteEvent();
		
	}
}
