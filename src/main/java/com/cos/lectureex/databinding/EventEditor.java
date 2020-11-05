package com.cos.lectureex.databinding;

import java.beans.PropertyEditorSupport;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

// stateful함 빈등록하면 안됨 꼬인다 , 다른스레드와 공유해서 쓰면 안됨

public class EventEditor extends PropertyEditorSupport {
	
	
	// 쓰는방법
	@InitBinder
	public void init(WebDataBinder webDataBinder) {
		webDataBinder.registerCustomEditor(Event.class, new EventEditor());
	}
	
	@Override
	public String getAsText() {
		Event event = (Event)getValue();
		return event.getId().toString();
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// 문자로 들어오는 것을 이벤트 객체로 만듬
		setValue(new Event(Integer.parseInt(text)));
	}
}
