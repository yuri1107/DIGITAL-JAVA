package day23;

import java.util.*;

public class OperatorEx1 {
/* 정수 num 가 짝수이면 true를 홀수이면 false를 출력하는 코드를 조건문 없이 작성해 보세요.
 * 예)  4
 * 4는 짝수입니까? true
 * 예) 5
 * 5는 짝수입니까? false
*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("정수를 입력하세요. : ");
		boolean num = scan.nextInt() % 2 == 0;
		System.out.print(num + "는 짝수입니까 ?  : " + num);
		*/
		int num = scan.nextInt();
		System.out.println(num + "는 짝수 입니까? " + (num % 2 == 0));
		
		
		
	}

}
