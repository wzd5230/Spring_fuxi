package cn.wzd.spring.ioc.xml;

public class StudyXml {
	private String schoolName;
	private int score;
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "StudyXml [schoolName=" + schoolName + ", score=" + score + "]";
	}
	
	

}
