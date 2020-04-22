package day4;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/*두 정수와 문자 하나를 입력받아 출력하는 코드를 작성하세요.
		 * 정수 스캔2개 문자 스캔 1개 출력
		*/
		
		//혼자해본거 도중에 에러뜸
		
/*
		int a = 0, b = 0;
		char c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("출력시킬 정수 두개와 문자 하나 입력하세요");
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = (char)scan.nextInt(); //입력받는게 int 이기때문에 자료형을 변환하기 전에 오류가 뜨는거
		//nextInt 기능이 정수만 입력받는 기능이라 문자를 입력하면 에러 발생
		System.out.printf("%d 와 %d 그리고 %c",a,b,c);
		
		scan.close();
*/		
		
		
		int num1, num2;
		char op;
		//String str; //문자열 선언
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력시킬 정수 2개와 문자 1개 입력하세요. : ");
		
		num1 = scan.nextInt();
		op = scan.next().charAt(0); //입력받은 char중에 첫번째꺼 출력
		num2 = scan.nextInt();
		//str = scan.next(); //문자열을 입력받아 자료형은 문자열인 str 변수에 넣는다.
		
		System.out.println("" + num1 + op + num2);
		System.out.println("--------------------------");
		System.out.printf("%d %c %d \n", num1, op, num2);
		
		//System.out.printf("%d %s %d \n", num1, str, num2); //입력받은 정수들과 문자열을 출력
		
		scan.close();
		
		
		
	}

}
