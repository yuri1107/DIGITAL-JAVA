package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTestEx2 {

	public static void main(String[] args) {
		/* 정수값을 반복적으로 받는 코드에서 
		 * 실수로 정수 대신 문자를 입력했을때 예외를 처리하도록 코드를 작성하세요.
		 * 예)
		 * 정수를 입력하세요. : 1
		 * 정수를 입력하세요. : 2
		 * 정수를 입력하세요. : 100
		 * 정수를 입력하세요. : a
		 * 예외가 발생했습니다 : 문자를 입력했습니다 - a
		*/
		//혼자한거. 97 입력하면 예외처리됨 (논리적오류) 이유는 아스키코드로 97이 a라서
		/*
		Scanner scan = new Scanner(System.in);
		int input;
		char ch = 'a';
		try {
			for( ; ;) {
				System.out.print("정수를 입력하세요. : ");
				input = scan.nextInt();
				if (input >= ch) { //97 입력하면 예외처리됨 (논리적오류) 이유는 아스키코드로 97이 a라서
					throw new Exception("예외가 발생했습니다 : 문자를 입력했습니다 - " + input);
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		scan.close();
		*/
		
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
				System.out.print("정수를 입력하세요. : ");
				int num = scan.nextInt();
				
			}
		}catch(InputMismatchException e) { //Exception 이라고만 써도 가능하지만 난 밑에서 따로 기술할거
			System.out.println("예외가 발생했습니다 : 정수를 입력해야하는데 문자를 입력했습니다.");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료했습니다.");
		
		scan.close();
	}

}
