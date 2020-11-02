package com.cos.lectureex.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

	
	@Autowired
	ApplicationContext ctx;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("single");
		System.out.println(ctx.getBean(Single.class));
		System.out.println(ctx.getBean(Single.class));
		System.out.println(ctx.getBean(Single.class));
		
		
		System.out.println("proto @Component @Scope 사용");
		System.out.println(ctx.getBean(Proto.class));
		System.out.println(ctx.getBean(Proto.class));
		System.out.println(ctx.getBean(Proto.class));
		
		System.out.println("proto by single");
		// Single scope는 포로토타입이라서 레퍼런스 주소 바껴야되는데 그대로다
		System.out.println(ctx.getBean(Single.class).getProto());
		System.out.println(ctx.getBean(Single.class).getProto());
		System.out.println(ctx.getBean(Single.class).getProto());
		
		
	}
	
}
