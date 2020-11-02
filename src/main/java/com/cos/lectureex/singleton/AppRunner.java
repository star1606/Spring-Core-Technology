package com.cos.lectureex.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

	
	@Autowired
	Single single;
	
	@Autowired
	Proto proto;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(single);
		System.out.println(proto.getSingle());
		
		
	}
	
}
