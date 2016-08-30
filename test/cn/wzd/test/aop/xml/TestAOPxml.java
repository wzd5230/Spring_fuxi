package cn.wzd.test.aop.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzd.spring.aop.xml.Animal;
import cn.wzd.spring.ioc.anno.PersonAnno;
import cn.wzd.spring.ioc.xml.PersonXml;

public class TestAOPxml {
	
	private ApplicationContext context;
	
	@Before
	public void setUp(){
		this.context =
			    new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}

	@Test
	public void testIocXml(){
		Animal animal = (Animal)this.context.getBean("animal");
		
		animal.sleep(888);
		
		
	}
}
