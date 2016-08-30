package cn.wzd.spring.aop.xml;

import org.springframework.stereotype.Component;

@Component("animal")
public class Animal {
	
	public void say(){
		System.out.println("this is animal say.");
	}
	
	public void sleep(int time){
		System.out.println("animal sleep "+time+" long time.");
	}
	
	public String run(){
		System.out.println("animal run,and return.");
		return "^_^animal^_^";
	}

}
