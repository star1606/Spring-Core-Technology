package com.cos.lectureex.aop;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {
	
	@PerLogging
	@Override
	public void createEvent() {
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println("Ceated an Event");		
	}
	
	@PerLogging
	@Override
	public void publishEvent() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("published an event");
	}

	public void deleteEvent() {
		System.out.println("삭제");
	}
}
