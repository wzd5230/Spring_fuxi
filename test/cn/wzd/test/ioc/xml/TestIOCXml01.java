package cn.wzd.test.ioc.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzd.spring.ioc.xml.PersonXml;

public class TestIOCXml01 {
	
	private ApplicationContext context;
	
	@Before
	public void setUp(){
		this.context =
			    new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}

	@Test
	public void testIocXml(){
		PersonXml personXml = (PersonXml)this.context.getBean("personXml");
		
		System.out.println(personXml);
		System.out.println(personXml.getStudy());
		
	}
}
