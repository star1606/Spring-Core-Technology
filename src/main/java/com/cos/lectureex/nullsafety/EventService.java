package com.cos.lectureex.nullsafety;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	@NonNull
	public String createEvent(@NonNull String name) {
		return "hello " + name;
	}
	
}
