package cn.wzd.spring.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myLogPrint")
@Aspect
public class MyLogPrint {

	@Pointcut("execution(* cn.wzd.spring.aop.xml.Animal.*(..))")
	public void anyMethod(){
	}

	@Before("anyMethod()")
	public void doBefore(){
		System.out.println("time---->");
	}
}
