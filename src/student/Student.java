package student;

//선생님이 하신거
public class StudentT {
	private String name="";
	private int grade;
	private int classNum;
	private int num;
	
	private Subject score[];
	
	//private SubjectT kor,eng,math;
	
	//기능설정
	public boolean equal(int grade, int classNum, int num, String name) {
		if (this.grade != grade) return false;
		if (this.classNum != classNum) return false;
		if (this.num != num) return false;
		if (this.name.equals(name)) return false;
		return true;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public SubjectT getKor() {
		return kor;
	}
	public void setKor(SubjectT kor) {
		this.kor = kor;
	}
	public SubjectT getEng() {
		return eng;
	}
	public void setEng(SubjectT eng) {
		this.eng = eng;
	}
	public SubjectT getMath() {
		return math;
	}
	public void setMath(SubjectT math) {
		this.math = math;
	}


	
}
