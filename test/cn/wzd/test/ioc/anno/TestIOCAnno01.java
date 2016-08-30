package cn.wzd.test.ioc.anno;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzd.spring.ioc.anno.PersonAnno;
import cn.wzd.spring.ioc.xml.PersonXml;

public class TestIOCAnno01 {
	
	private ApplicationContext context;
	
	@Before
	public void setUp(){
		this.context =
			    new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}

	@Test
	public void testIocXml(){
		PersonAnno personAnno = (PersonAnno)this.context.getBean("personAnno");
		
		System.out.println(personAnno);
		System.out.println(personAnno.getStudy());
		
	}
}
