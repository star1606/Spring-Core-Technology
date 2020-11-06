package com.cos.lectureex.aop;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {
	
	@Override
	public void createEvent() {
		
		// 시간을 구하는 코드는 여러 군데 들어가고 관심사가 다르다
		// 프록시 쓰기 위해 주석처리
		// long begin = System.currentTimeMillis();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ceated an Event");
		//System.out.println(System.currentTimeMillis() - begin);
		
	}
	
	public void publishEvent() {
		// 프록시 쓰기 위해 주석처리
		//long begin = System.currentTimeMillis();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("published an event");
		//System.out.println(System.currentTimeMillis() - begin);
	}

	public void deleteEvent() {
		System.out.println("삭제");
	}
}
