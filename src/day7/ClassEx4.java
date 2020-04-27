package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		/*
		 *
		*/
		Student s1 = new Student();
		s1.in();
		s1.printInfo();
		Student s2 = new Student("디지털 컨버전스 JAVA기반 응용S/W 엔지니어링 양성과정" , "홍과장");
		s2.in();
		s2.out();
		s2.printInfo();

	}

}

/*여기 뭐 출석할때 필요한 학생 정보같은거 그런걸로 class만들고 그러기..
 * */
//혼자한거 대실패 ㅊㅊ
/*
class Student1 {
	//멤버변수	
	//입실시간 퇴실시간
	String studentName; //학생이름
	boolean attendance; //입실여부
	String program; //수강과정
	String entryTime; //입실시간 퇴실시간
	
	
	//멤버메서드
	
	//입퇴실기능
	//아니면 언급 횟수를 카운트해서 홀수면 입실 짝수면 퇴실 이라고 해도 괜찮을것같은데 
	
	
	public void timeOn() {
		System.out.println("입실했습니다.");
		attendance = true;
	}
	public void timeOff() {
		if (attendance != true) {
			System.out.println("퇴실했습니다.");
			attendance = false;
		}
	}
	
	//학생정보 출력기능
	//일단 그럼 학생정보를 뭘 받아야하는거일텐데 뭘 어떻게 어디다 받아야 좋을까
	//나는 if문을 써서 timeOn이 참이면 입실시간 + 입실했습니다 를 띄우고 거짓이면 퇴실시간 + 퇴실했습니다 를 띄우고싶은데.
	public void printStudent() {
		System.out.println("학생정보 "  + "입니다.");
	}	
	
	
	
	//생성자
	//학생
}
*/

class Student {
	//멤버 변수
	//학생이름
	private String name;
	
	//입실여부
	private boolean isEntrance;
	
	//수강과정 (전부가 아닌 부분이 공유하기때문에 공유를 안한다고 봐야함) 그래서 스테틱 안붙음 ㅋ
	private String course;
	
	//입실시간,퇴실시간
	private String inTime,outTime;
	
	//멤버 메서드
	
	//입/퇴실 기능
	public void in() {
		System.out.println(name + "님이 입실했습니다.");
		isEntrance = true;
		inTime = "9시";
	}
	
	public void out() {
		System.out.println(name + "님이 퇴실했습니다.");
		isEntrance = false;
		outTime = "18시";		
	}
	
	
	//학생정보 출력기능
	public void printInfo() {
		System.out.println("과정 : " + course);
		System.out.println("이름 : " + name);
		if (isEntrance) {
			System.out.println("입실 중 입니다.");
			System.out.println("입실시간 : " + inTime);
		}else {
			System.out.println("퇴실 했습니다.");
			System.out.println("입실시간 : " + inTime);
			System.out.println("퇴실시간 : " + outTime);			
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEntrance() {
		return isEntrance;
	}

	public void setEntrance(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	
	//생성자
	public Student() {
		course = "자바";
		name = "홍유리";
	}
	
	public Student(String course, String name) {
		this.course = course;
		this.name = name;
	}
	
	
}

