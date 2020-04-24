package day6;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		/* 학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요.
		 * 100 ~ 90 : A
		 * 89 ~ 80 : B
		 * 79 ~ 70 : C
		 * 69 ~ 60 : D
		 * 59 ~ 0 : F
		 * 100점 이상 : 잘못된 수 입니다.
		 * 
		*/
		
		Scanner scan = new Scanner(System.in);
		//나 혼자 한거
		/*
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		
		if (score <= 100 && score > 89) {System.out.println("학점 A입니다.");}
		else if (score <= 89 && score > 79) {System.out.println("학점 B입니다.");}
		else if (score <= 79 && score > 69) {System.out.println("학점 C입니다.");}
		else if (score <= 69 && score > 59) {System.out.println("학점 D입니다.");}
		else if (score <= 59 && score >= 0) {System.out.println("학점 F입니다.");}
		else if (score > 100) {System.out.println("잘못된 수 입니다.");}
		*/
		
		/* 학생 5명의 성적을 입력받아 
		 * */
		//혼자한거
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("점수를 입력하세요.");
			int score = scan.nextInt();
			
			if (score <= 100 && score > 89) {System.out.println("학점 A입니다.");}
			else if (score <= 89 && score > 79) {System.out.println("학점 B입니다.");}
			else if (score <= 79 && score > 69) {System.out.println("학점 C입니다.");}
			else if (score <= 69 && score > 59) {System.out.println("학점 D입니다.");}
			else if (score <= 59 && score >= 0) {System.out.println("학점 F입니다.");}
			else if (score > 100) {System.out.println("잘못된 수 입니다.");}			
		}				
		*/

		
		
		/* 여러명의 학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요.
		 * 학생의 성적이 음수가 입력되면 종료하도록 하세요.
		 * */
		
		
		for(int i = 1; ;i++) {

			System.out.printf("%d 번째 학생의 점수를 입력하세요. (종료=음수입력) : ",i);
			int score = scan.nextInt();
			if (score <= 100 && score > 89) {System.out.println("학점 A입니다.");}
			else if (score <= 89 && score > 79) {System.out.println("학점 B입니다.");}
			else if (score <= 79 && score > 69) {System.out.println("학점 C입니다.");}
			else if (score <= 69 && score > 59) {System.out.println("학점 D입니다.");}
			else if (score <= 59 && score >= 0) {System.out.println("학점 F입니다.");}
			else if (score > 100) {System.out.println("잘못된 수 입니다.");}
			else {System.out.printf("%d 번의 성적을 확인하고 종료함",(i-1)); break;} //i-1을 하는 이유는 종료를 위한 한번의 음수 입력도 카운트 하기 떄문에
			
		}
		
		

	}

}
