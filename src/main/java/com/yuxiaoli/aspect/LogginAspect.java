package com.yuxiaoli.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LogginAspect {
	/*
	 * 使用@Pointcut来表示切入点表达式
	 */
	@Pointcut("execution(* com.yuxiaoli.dao.CustomerDaoImpl.*(..))")
	public void declareJoinPointExpression(){}
	
	@Before("declareJoinPointExpression()")
	public void beforeMethod(){
		System.out.println("Before insert Customer Data");
	}
	@After("declareJoinPointExpression()")
	public void afterMethod(){
		System.out.println("After insert Customer Data");
	}
}
