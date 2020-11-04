package com.cos.lectureex.applicationeventpublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class AppRunner3 implements ApplicationRunner {
	
	@Autowired
	ApplicationEventPublisher publisherEvent;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		publisherEvent.publishEvent(new MyEvent(this, 100));
		
	}
}
