package day18;

import java.util.*;

public class TestEx3 {
	/* - 정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 코드를 작성하세요. 단, 메소드를 생성하여 작업할것.
	 * 
	 * - 두 정수가 주어졌을 때 두 정수의 최대공약수가 1이면 서로소라고 출력하고, 
	 * 서로소가 아니면 서로소가 아님 이라고 출력하는 코드를 작성하세요.
	 * 단, 메소드를 생성하여 작업할것.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		menu(scan);
		scan.close();
	}
	
	public static void menu (Scanner scan) {
		System.out.print("메뉴\n1.소수 판별하기\n2.서로소 판별하기\n원하는 메뉴를 선택하세요");
		int menunum = scan.nextInt();
		
		if (menunum == 1) {
			System.out.println("소수를 판별할 정수를 입력하세요.");
			int given = scan.nextInt();
			isPrime(given);
		}
		if (menunum == 2) {
			System.out.println("서로소를 판별할 두 정수를 입력하세요.");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			isGcd(num1, num2);
		}		
	}
	//쌤꺼 소스 좋아보였음 분석해볼것
	public static void isPrime (int given) {
		int cnt = 0;
		for (int i = 1; i <= given; i++) {
			if (given % i == 0) {cnt ++;}
		}
		if (cnt == 1) throw new ArithmeticException("1을 입력했습니다.");
		if (cnt == 2) {System.out.println("소수 입니다.");}
		else {System.out.println("소수가 아닙니다.");}
	}
	
	public static void isGcd (int num1, int num2) {
		if (num1 < 0 || num2 < 0) throw new ArithmeticException("예외 발생 : 최대공약수는 2개의 양의 정수가 필요합니다.");
		if (num1 % num1 == 0 && num2 % num1 == 0) {System.out.println("서로소가 아닙니다.");}
		else {System.out.println("서로소 입니다.");}
	}
	
}
