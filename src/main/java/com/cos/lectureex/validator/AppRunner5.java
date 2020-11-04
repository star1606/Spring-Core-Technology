package com.cos.lectureex.validator;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AppRunner5 implements ApplicationRunner {
	
	@Autowired // 스프링 부트에서 Validator를 등록안하고 사용할 수 있음
	Validator validator;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("validator빈" + validator.getClass());
		
		Event event = new Event();
		EventValidator eventValidator = new EventValidator();
		Errors errors = new BeanPropertyBindingResult(event, "event");  // 첫번째 타겟 두번째 이름
		// 실질적으로 BeanPropertyBindingResult클래스 사용할일은 거의 없다
		eventValidator.validate(event, errors);
		System.out.println(errors.hasErrors());
		
		errors.getAllErrors().forEach(e -> {
			System.out.println("======== error code ========");
			// 에러코드 메세지를 여러방식으로 출력할 수 있다.
			Arrays.stream(e.getCodes()).forEach(System.out::println);
			System.out.println(e.getDefaultMessage());
		});
	}
}
