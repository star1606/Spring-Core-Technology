package com.cos.lectureex.spel;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;


@Component
public class AppRunner6 implements ApplicationRunner {

	// 표현식
	// #을 쓰면 표현식을 인식해서 계산함
	@Value("#{1 + 1}")
	int value;
	
	@Value("#{'hello' + 'world'}")
	String greeting;

	@Value("#{1 eq 1}")
	boolean trueOrFalse;
	
	// 일반적으로 쓸 수도 있음
	@Value("hello")
	String hello;
	
	// $ 프로퍼티를 참고하는 방법임.
	// application.properties의 파일에 내용을 가져옴
	@Value("${my.value}")
	int myValue;
	
	// 표현식 안에는 프로퍼티를 사용할 수 있지만 프로퍼티 안에 표현식을 사용할 수 없다..
	@Value("#{${my.value} eq 100}")
	boolean isMyValue100;
	
	// 문자열 리터럴 그대로 간다.
	@Value("#{'spring'}")
	String spring;
	
	// 빈의 정보 참고
	@Value("#{sample.data}")
	int sampleData;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("=========================");
		System.out.println(value);
		System.out.println(greeting);
		System.out.println(trueOrFalse);
		System.out.println(hello);
		System.out.println(myValue);
		System.out.println(spring);
		System.out.println(sampleData);
		
		
		ExpressionParser parser = new SpelExpressionParser();
		// SpEL도 컨버터 사용함
		
		Expression expression = parser.parseExpression("2 + 100");
		Integer value = expression.getValue(Integer.class);
		System.out.println(value);
		
		
	}
}
