package day2;

import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {

		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		num = scan.nextInt();
		
		//int num = 4;
		
		boolean isEven = (num % 2 == 0) ? true : false;
		boolean isOdd = (num % 2 == 0) ? false : true;

		System.out.println(num + "짝수입니까? : " + isEven);
		System.out.println(num + "홀수입니까? : " + isOdd);
		

		scan.close();

	}

}