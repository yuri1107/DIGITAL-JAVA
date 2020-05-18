package day18;

import java.util.*;

public class TestEx2 {
/* 1. 성적을 입력받아 입력받은 성적이 어떤 학점인지 판별하는 코드를 작성하세요.
 * A : 90 이상 100 이하
 * B : 80 이상 90 미만
 * C : 70 이상 80 미만
 * D : 60 이상 70 미만
 * F : 0 이상 60 미만
 *
 *2. 1번에서 작성한 내용을 메소드로 만드세요.
 *
 *
 *3. 영어사전을 프로그램으로 만들려고 한다. 이때 단어를 저장할 수 있는 클래스를 생성해 보시오. (기능구현X)
*/
	/*
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		grade(score);

		
	}
	
	//입력받은 성적이 어떤 학점인지 판별하는 메서드
	public static void grade (int score) {
		if (score >= 90 && score <=100) {System.out.println("A");}
		if (score >= 80 && score < 90) {System.out.println("B");}
		if (score >= 70 && score < 80) {System.out.println("C");}
		if (score >= 60 && score < 70) {System.out.println("D");}
		if (score >= 0 && score < 60) {System.out.println("F");}
		else if (score < 0 || score > 100) {System.out.println("범위 밖 성적");}		
	}
*/
	//쌤이랑한거
	
	/* 기능 : 정수 성적이 주어지면 성적에 맞는 학점을 알려주는 메소드
	 * 매개변수 : 정수 성적 => int score
	 * 리턴타입 : 학점 (추후 +를 추가할 수도 있기 때문에) => String
	 * 메소드명 : grade
	 * 기능 : 점수를 입력받아 입력받은 성적에 맞는 학점을 '알려주는' 메소드
	 * 기능 : 점수를 입력받아 입력받은 성적에 맞는 학점을 '출력하는' 메소드
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요 : ");
		int num = scan.nextInt();
		String grade = grade(num); 
		if (grade.equals("X")) {System.out.println("올바른 점수가 아닙니다.");}
		else { System.out.println(grade+"학점입니다.");}
		
		try {System.out.println(grade2(num)+"학점입니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
 	}
	/**
	 * 
	 * @param score : 정수 성적
	 * @return : 성적에 맞는 학점으로 A,B,C,D,F학점과 올바르지 않을때의 학점 X를 반환
	 */
	
	public static String grade (int score) {
		if (score < 0 || score > 100) return "X";
		if (score >= 90) return "A";
		if (score >= 80) return "B";
		if (score >= 70) return "C";
		if (score >= 60) return "D";
		return "F";
	}
	public static String grade2 (int score) {
		if (score < 0 || score > 100) throw new ArithmeticException("올바른 점수가 아닙니다.");
		if (score >= 90) return "A";
		if (score >= 80) return "B";
		if (score >= 70) return "C";
		if (score >= 60) return "D";
		return "F";
	}	
}

