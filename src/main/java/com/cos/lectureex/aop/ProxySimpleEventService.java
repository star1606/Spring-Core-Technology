package com.cos.lectureex.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// 같은 서비스로 구현해야함
@Primary
@Service // 프록시 패턴 : 클라이언트를 안 건드리고 부가기능 추가 가능.
public class ProxySimpleEventService implements EventService {

	// real subject를 가지고 있고
	@Autowired
	SimpleEventService simpleEventService;

//	@Autowired 이렇게 받는 것도 가능
//	EventService simpleEventService;

	@Override
	public void createEvent() {
		// 여기서 시간재는 기능을 넣는다, 부가적인 기능을 가짐.
		long begin = System.currentTimeMillis();	
		simpleEventService.createEvent();
		System.out.println(System.currentTimeMillis() - begin);
	}

	@Override
	public void publishEvent() {
		long begin = System.currentTimeMillis();	
		simpleEventService.publishEvent();
		System.out.println(System.currentTimeMillis() - begin);
	}

	@Override
	public void deleteEvent() {
		simpleEventService.deleteEvent();
	}

}
