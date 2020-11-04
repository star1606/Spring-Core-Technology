package com.cos.lectureex.applicationeventpublisher;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

	@EventListener
	@Order(Ordered.HIGHEST_PRECEDENCE + 2)
	public void handle(MyEvent myEvent) {
		System.out.println(Thread.currentThread().toString());
		System.out.println("Another핸들러 " + myEvent.getData());
	}
}
