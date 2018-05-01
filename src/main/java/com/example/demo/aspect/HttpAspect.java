package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
	
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	
	/*
	 * 方法执行之前就被拦截
	 */
	@Pointcut("execution(public * com.example.demo.controller.PeopleController.*(..))")
	public void log(){
	}
	
	@Before("log()")
	public void doBefore(){
		System.out.println("11111111111111");
	}
	
	@After("log()")
	public void doAfter(){
		System.out.println("22222222222222");
	}
	
}
