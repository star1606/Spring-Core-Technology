package com.cos.lectureex.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

	// 프록시 빈을 주입시키는 것이다
	@Autowired // 프로토타입 스코프인데 변경이 되지 않는다.
	Proto proto;
	
	public Proto getProto() {
		return proto;
	}
	
	
}
