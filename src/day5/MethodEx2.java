package day5;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		/*
		 *
		*/
		//System.out.println(operation()); //혼자해본거 출력
		
		
		int n1, n2;
		char o;
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요(예 : 1 + 2)");
		n1 = scan.nextInt();
		o = scan.next().charAt(0);
		n2 = scan.nextInt();
		System.out.printf("%d %c %d = %.2f \n",n1, o, n2, calculate(n1,o,n2));
		scan.close();
		
		
		//문자열을 입력받아서 그대로 출력하기
		/*
		Scanner scan = new Scanner(System.in);
		String tmp = scan.next(); // 만약 공백을 포함해서 가져오고싶다면  scan.nextLine(); 이라고 쓰기
		System.out.println(tmp);
		*/
		
	}
	/* 기능 : 두 정수와 산술연산자가 주어지면 산술연산 결과를 알려주는 메서드 (확인 출력은 메인에서)
	 * 단, 예외 상황은 없다고 가정한다.
	 * 예외상황 : 잘못된 연산자가 들어오거나, 0으로 나누는 경우
	 * 매개변수 : 두 정수와 산술연산자 => int num1, char op, int num2
	 * 리턴타입 : 산술연산 결과 => 실수 => double
	 * 메소드명 : calculate
	 * */
	
	/* 혼자 해본것 몹시 잘됨 (중간에 쌤도움 조금받음)
	public static double operation() { //스캐너를 넣었기때문에 메소드가 필요없음. 하지만 여기서 스캐너를 넣어서 '입력'을 받고 '계산'을 한다면 이 메소드는 두가지 기능을 하는것이 됨.
		int a = 0, b = 0;
		char op;
		double res = 0;
		//스캐너로 1. 첫 정수 2. 산술연산자 3. 두번째 정수 를 입력받고
		//이 메서드에서 산술을 해서 메인에서 결과를 알려주는것
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계산 식을 입력하세요.");
		
		a = scan.nextInt();
		op = scan.next().charAt(0);
		b = scan.nextInt();
		
		scan.close();
		
		switch (op) {
		case '/' : res = a/b; break; //이부분에 형변환 까먹었네
		case '*' : res = a*b; break;
		case '-' : res = a-b; break;
		case '+' : res = a+b; break;
		case '%' : res = a%b; break;
		default : System.out.println("잘못된입력");
		}
		
		return res;
		
	}
	*/
	
	public static double calculate(int num1, char op, int num2) {
		
		double res = 0.0;
		
		switch (op) {
		case '/' : res = (double)num1/num2; break; //혼자할때 이부분에 형변환 까먹었음
		case '*' : res = num1*num2; break;
		case '-' : res = num1-num2; break;
		case '+' : res = num1+num2; break;
		case '%' : res = num1%num2; break;
		}		
		return res;
	}
	
	
	

}
