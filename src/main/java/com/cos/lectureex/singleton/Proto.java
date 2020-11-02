package com.cos.lectureex.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Proto {

	@Autowired
	Single single;
	
	public Single getSingle() {
		return single;
	}
}
