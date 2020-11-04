package com.cos.lectureex.applicationeventpublisher;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component // 빈등록. 
// 4.2이전에는 ApplicationListener<MyEvent>  인퍼페이스로 오버라이딩구현
public class MyEventHandler {

	@EventListener
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public void handle(MyEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("이벤트 받았다. 데이터는 " + event.getData());
	}
	
	@EventListener
	@Async
	public void handle(ContextRefreshedEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("ContextRefreshEvent");
	}
	
	@EventListener
	@Async
	public void handle(ContextClosedEvent event) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("ContextClosedEvent");
	}
	
}
