package day13;

import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		//throw를 통해 예외를 발생시키는 예제
		int num1 = 1, num2 = 0;
		char op = '?';
		
		Scanner scan = new Scanner(System.in);
		op = scan.next().charAt(0);
		
		try {
			switch (op) {
			case '+' : System.out.println(num1 + num2); break;
			case '-' : System.out.println(num1 - num2); break;
			case '*' : System.out.println(num1 * num2); break;
			case '/' : System.out.println(num1 / num2); break;
			case '%' : System.out.println(num1 % num2); break;
			default : throw new Exception (op + " 는 산술연산자가 아닙니다."); //throw = 던진다, new = 새로운 객체 생성 연산자, Exception = 예외
			// 즉, throw new Exception 는 새로운 예외 객체를 생성해서 던져라 ((아래의 Exception e))로 던짐
			}
		}catch(Exception e) { //catch 받아라, Exception = 예외, e = 객체 ((던진걸 객체에 담아서 받아라)). 
			//위에서 Exception를 생성해서 던졌기 때문에 Exception만 받을수있음.
			// 그런 이유로 다른 예외 (예를들면 ArithmeticException)에서는 받을 수 없기때문에 만든 애와 같은 이름으로 지어줘야함.
			// 하지만 던지는게 ArithmeticException라면 Exception 에서 받을 수 있다. (자식이 부모한테 던진것이기 때문) 교재 415p 예외클래스 계층도 참조
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
