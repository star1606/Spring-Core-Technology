package com.cos.lectureex.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return Event.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title is not allowed");
		//reject안하고 직접도 가능
		Event event = (Event)target;
		
//		if(event.getTitle() == null) {
//			errors.rejectValue(field, errorCode);
//		}
	}
}
