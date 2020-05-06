package student;

//학생 한명당 정보 클래스
public class Student {
		/* 학생들을 관리하는 프로그램을 작성하세요.
		 * - 학생 정보 : 학년(grade), 반(classNum), 번호(num), 이름(name)
		 * 국어(Korean), 영어(English), 수학(Math) 등
		*/
		
		int grade; //학년
		int classNum; //반
		int num; //번호
		String name; // 이름
		
		int korean; // 국어
		int english; // 영어
		int math; // 수학
		int score; // 평균 점수
		
		//생성자
		public Student () {}
		public Student (int grade, int classNum, int num, String name, int korean, int english, int math, int score) {
			this.grade = grade;
			this.classNum = classNum;
			this.num = num;
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
			this.score = score;
		}
		
		/*
		public Student (int grade, int classNum, int num, String name, int...sub) { //매개변수를 가변인자로 만들면 더 좋지않을까
			this.grade = grade;
			this.classNum = classNum;
			this.num = num;
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
			this.score = score;		
		} 
		*/
}


//-------------------------------------------------------------------------------------------

