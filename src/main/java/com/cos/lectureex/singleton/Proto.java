package com.cos.lectureex.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
// 클래스 기반의 프록시로 이 빈을 감싸서 이 빈을 쓰게해라.
// Proxy를 거쳐서 참조하도록함 , Proxy를 거쳐서 클래스 안의 내용을 바꿀 수 있게
public class Proto {

	@Autowired
	Single single;	
}
