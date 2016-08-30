package cn.wzd.spring.ioc.xml;

public class PersonXml {
	private String name;
	private int age;
	private StudyXml study;
	
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
	public StudyXml getStudy() {
		return study;
	}
	public void setStudy(StudyXml study) {
		this.study = study;
	}
	@Override
	public String toString() {
		return "PersonXml [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
