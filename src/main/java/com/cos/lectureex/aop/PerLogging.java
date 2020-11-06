package com.cos.lectureex.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
@Target(ElementType.METHOD)
// @Retention(RetentionPolicy.SOURCE) 컴파일하고 나면 사라짐
@Retention(RetentionPolicy.CLASS) // 애노테이션정보를 얼마나 유지할 것인가. CLASS라 컴파일할 때도 이 정보가 남아 있을것이다.
public @interface PerLogging {

}
