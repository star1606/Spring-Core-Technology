package com.cos.lectureex.applicationeventpublisher;

// 4.2 이후 부터 extends ApplicationEvent 안해도됨
//-> 비침투성 자신의 코드에 스프링코드가 들어가지 않는 것 : POJO 기반이라고 함

public class MyEvent {

	private int data;
	private Object source;
	
	
//	public MyEvent(Object source) {
//		super(source);
//	}
	
	public MyEvent(Object source, int data) {
		this.source = source;
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
}
