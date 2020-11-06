package com.cos.lectureex.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {
 //해야할일 advice
 //어디서할지 pointcut
	
	// Around : 메소드를 감싸는 형태  -> 메소드 앞 뒤에 기능 사용가능
	//@Around("execution(* com.cos..*.EventService.*(..))") //pointcut도 정의됨
	// 패키지에서 EventService안에 들어 있는 모든메소드의 행위를 적용하라 (deleteEvent까지 다 적용됨)
	@Around("@annotation(PerLogging)")
	public Object logPref(ProceedingJoinPoint pjp) throws Throwable {
		long begin = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		System.out.println(System.currentTimeMillis() - begin);
		return retVal;
	}
	
	@Before("bean(simpleEventService)") // 모든 메소드 실행이전에 실행함
	public void hello() {
		System.out.println("hello");
	}
}
