package day17;

import java.util.*;

public class MethodEx1 {
	
	//static Scanner scan = new Scanner(System.in);
	/* main 메소드부터 실행 순서를 줄 수로 표현하세요. (단, 1 / 2 를 입력했다고 가정)
	 *  12>20>21>22>23>24>25>80-85>79>25>26>27 였는데 지금은 또 달라짐.. ㅋ 
	 *  
	 * */
	public static void main(String[] args) {

		/*
		int a = scan.nextInt();
		char op = scan.next().charAt(0);
		int b = scan.nextInt();
		operator(a,op,b);
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 연산자 정수 입력 ㄱ");
		int a, b;
		char op;
		try {
			a = scan.nextInt();
			op = scan.next().charAt(0);
			b = scan.nextInt();
			System.out.printf("%d %c %d = %.1f \n",a, op, b, calc(a,op,b));
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		scan.close();
	}
	
	/* 
	1.기능 : 두 정수의 합을 반환하는 메소드 
	2.기능 : 두 정수의 차를 반환하는 메소드 
	3.기능 : 두 정수의 곱을 반환하는 메소드 
	4.기능 : 정수 a를 정수 b로 나눈 결과를 반환하는 메소드
	5.기능 : 정수 a를 정수 b로 나눈 나머지를 반환하는 메소드
	6.기능 : 정수 a와 정수 b를 산술연산자 op의 결과를 반환하는 메소드
	*/
	/*
	public static int plus (int a, int b) {
		int res = a + b;
		return res;
	}	
	public static int subtr (int a, int b) {
		int res = a - b;
		return res;
	}
	public static int multi (int a, int b) {
		int res = a * b;
		return res;
	}
	public static int divi (int a, int b) {
		int res = a / b;
		return res;
	}
	public static double remain (int a, int b) {
		double res = a % b;
		return res;
	}
	public static double operator (int a,char op, int b) {
		double res = 0.0;
		switch (op) {
		case '+' : res = plus(a,b); break;
		case '-' : res = subtr(a,b); break;
		case '*' : res = multi(a,b); break;
		case '/' : res = divi(a,b); break;
		case '%' : res = remain(a,b); break;
		default : System.out.println("잘못된 연산자입니다.");
		}
		if (res > 0) {
			System.out.println((int)res);
		}else {System.out.println(res);}
		return res;
	}
	*/
	
	public static int sum (int a, int b) {return a+b;}	
	public static int sub (int a, int b) {return a-b;}	
	public static int mul (int a, int b) {return a*b;}	
	public static int mod (int a, int b) {return a%b;}	
	public static double div (int a, int b) {return (double) a/b;}
	public static double calc(int a, char op, int b) {
		switch (op) {
		case '+' : return sum(a,b);
		case '-' : return sub(a,b);
		case '*' : return mul(a,b);
		case '/' : 
			if (b == 0) throw new ArithmeticException("예외발생 : 0으로 나눌 수 없습니다.");
			return div(a,b);
		case '%' : 
			if (b == 0) throw new ArithmeticException("예외발생 : 0으로 나눌 수 없습니다.");
			return mod(a,b);
		default : throw new ArithmeticException("예외발생 : "+ op+ "는 산술연산자가 아닙니다.");
		}
	}

	
}


