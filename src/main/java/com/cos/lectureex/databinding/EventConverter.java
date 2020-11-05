package com.cos.lectureex.databinding;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

// 프로퍼티 에디터 대신에 사용함
// 소스와 타켓을 받아옴
// 상태정보가 없어서 빈으로 등록해도됨.
// ConverterRegistry로 등록함.

public class EventConverter {
	
	
	@Component
	public static class StringToEventConverter implements Converter<String, Event>{
		@Override // 메소드 convert 한개 사용하면 됨.
		public Event convert(String source) {
			return new Event(Integer.parseInt(source)); // 소스를 받아서 이벤트로 바꿈
			
		}
	}
	
	@Component
	public static class EventToStringConverter implements Converter<Event, String>{
		@Override
		public String convert(Event source) {
			
			return source.getId().toString();
		}
	}
	
	
}
