package day4;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 입력받은 문자가 + 이면 두 수의 합을 출력하고
		 * - 이면 두 수의 차를 출력하고
		 * / 이면 두 수의 나눈 결과를 출력하고
		 *  *이면 두 수의 곱한 결과를 출력하고
		 *  %이면 두 수의 나머지 결과를 출력하는 코드를 작성하세요.
		 *
		*/
		
		//혼자 해보는거
		
		// 
		int a,b;
		char c;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("계산식을 입력하세요 : ");
		
		a = scan.nextInt();
		c = scan.next().charAt(0);
		b = scan.nextInt();
		
		scan.close();
		
		//System.out.printf("%d %c %b ", a, c, b);
		
		/*
		
		if(c=='+') {
			System.out.printf("%d %c %d = %d",a ,c, b, a+b);
		}else if(c=='-') {
			System.out.printf("%d %c %d = %d",a ,c, b, a-b);			
		}else if (c=='/') {
			System.out.printf("%d %c %d = %.4f",a ,c, b, (double)a/b);			
		}else if (c=='*') {
			System.out.printf("%d %c %d = %d",a ,c, b, a*b);			
		}else if (c=='%') {
			System.out.printf("%d %c %d = %d",a ,c, b, a%b);			
		}else {
			System.out.printf("삐빅 잘못된 경우입니당");
		}
		*/
		
		//System.out.printf("입력값 : a=%d b=%d c=%c", a, b, c);
		
		//스위치문으로 해보깅 ~~
		/*
		int total=0;
		switch (c) {
			
			case '+' : total+=(a+b); break;
			case '-' : total+=a-b; break;
			case '/' : total+=a/b; break;
			case '*' : total+=a*b; break;
			case '%' : total+=(double)a%b; break;
			default : System.out.println("잘못된 경우입니다.");
			
		}
		
		System.out.println(total);
		//System.out.println("%d %c %d = %f.4",a ,c, b, (double)a+b);
		*/
		
		//쌤이랑 한거
		
		switch (c) {
			case '+' : System.out.printf("%d %c %d = %d",a ,c, b, a+b); break;
			case '-' : System.out.printf("%d %c %d = %d",a ,c, b, a-b); break;
			case '*' : System.out.printf("%d %c %d = %d",a ,c, b, a*b); break;
			case '%' : System.out.printf("%d %c %d = %d",a ,c, b, a%b); break;
			case '/' : //자료형변환은 예제와 같지만 if else는 내가 정수이면 소수점안나오게할라고 넣음
				if (a % b != 0) {System.out.printf("%d %c %d = %.2f",a ,c, b, (double)a/b); }
				else {System.out.printf("%d %c %d = %d",a ,c, b, a/b); }
				break;
			default : System.out.println("잘못된 경우입니다.");
		}
		
		
		/* testEx1 복붙한거
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
		*/

	}

}
