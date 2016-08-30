package cn.wzd.spring.ioc.anno;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("personAnno")
public class PersonAnno {
	private String name;
	private int age;
	private StudyAnno study;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudyAnno getStudy() {
		return study;
	}
	@Resource(name="studyAnno")
	public void setStudy(StudyAnno study) {
		this.study = study;
	}
	@Override
	public String toString() {
		return "PersonXml [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
