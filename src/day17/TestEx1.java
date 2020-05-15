package day17;

import java.util.*;

public class TestEx1 {
	//static Scanner scan = new Scanner(System.in);
	//Scanner를 클래스 멤버 메소드로 사용할 수 있지만, TestEx1 클래스에서 스캐너는 의미있는 정보가 아니므로 사용하지 않는것이 좋다.
	public static void main(String[] args) {
		/* 두 정수를 입력받아 두 정수를 더하여 출력하는 코드
		 *
		*/
		
		Scanner scan = new Scanner(System.in); //참조변수, 지역변수
		int num1 = scan.nextInt(); //일반변수
		//int num2 = scan.nextInt(); //일반변수
		Integer num2 = scan.nextInt(); //참조변수, 지역변수
		System.out.println(num1 + " + "+ num2 + " = " + (num1+num2));
		System.out.println(num1 + " + "+ num2 + " = " + sum(num1,num2,-5));
		System.out.println(num1 + " + "+ num2 + " = " + sum(num1,num2));

		scan.close();
	
	}
	public static int sum (int num1, int num2, int res) { //res : 매개변수, 일반변수
		res = num1 + num2;
		return res;
	}
	public static int sum (int num1, int num2) {
		int res = num1 + num2; //res : 지역변수, 일반변수
		return res;
	}

}
