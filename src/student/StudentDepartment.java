package student;

import java.util.Scanner;

public class StudentDepartment {
	public static void main(String[] args) {
		/* 학생들을 관리하는 프로그램을 작성하세요.
		 * - 학생 정보 : 학년(grade), 반(classNum), 번호(num), 이름(name), 국어(Korean), 영어(English), 수학(Math) 등
		 * - 기능 : 학생정보추가, 학생정보수정, 학생정보삭제, 학생정보 출력
		 * 
		 * 예시
		 * 메뉴
		 * 1. 학생정보추가 infoAdd
		 * 2. 학생정보수정 infoRevise
		 * 3. 학생정보삭제 infoDel
		 * 4. 학생정보출력 infoPrint
		 * 5. 종료 end
		 * 메뉴를 선택하세요. : 1
		 * 
		 * 1. 데이터 관리를 위한 작업
		 *   => 변수나 클래스를 이용
		 *   학생정보 => Student 클래스
		 *   과목정보 => Subject 클래스
		 *   
		 * 2. 기능 구현
		 * 	=> main 메소드에 바로 구현
		 * 	=> 기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스  
		 * 
		 * scan으로 누를 메뉴를 입력받고 입력받은 메뉴를 출력시키는것
		 *
		*/
		
		int menuNum = 0;
		System.out.printf("메뉴 \n 1.학생정보추가 \n 2.학생정보수정 \n 3.학생정보삭제 \n 4.학생정보출력 \n 5.종료 \n메뉴를 선택하세요. : ");
		Scanner scan = new Scanner(System.in);
		menuNum = scan.nextInt();
		
		//메뉴 선택시키기
		switch (menuNum) {
			case 1 : infoAdd(); break; 
			case 2 : infoRevise(); break;
			case 3 : infoDel(); break;
			case 4 : infoPrint(); break;
			case 5 : System.out.println("메뉴가 종료되었습니다."); break;
			default : System.out.println("메뉴 선택에 실패하였습니다.");
		}
	}
	// 학생정보추가
	public static int infoAdd() {
		Student();
		return 0;}
	// 학생정보수정
	public static int infoRevise() {return 0;}
	// 학생정보삭제
	public static int infoDel() {return 0;}
	// 학생정보출력
	public static int infoPrint() {return 0;}
}


// 메서드 : 추가 infoAdd 변경 infoRevise 삭제 infoDel 출력 infoPrint

/*
interface Manage {
	// 학생정보추가
	public default int infoAdd(Student []arr, Student std) {return 0;}
	// 학생정보수정
	public int infoRevise(Student []arr, Student std) {}
	// 학생정보삭제
	public int infoDel(Student []arr, Student std) {}
	// 학생정보출력
	public int infoPrint(Student []arr, int count) {}
}
*/