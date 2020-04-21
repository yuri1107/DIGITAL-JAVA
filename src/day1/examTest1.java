package day1;

import java.util.Scanner;

public class examTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수를 입력하세요 : ");
		
		num = scan.nextInt();
		
		System.out.println("입력한 정수 : " + num);
		
		scan.close();
		 //쌤이랑 같이한거고 VarCasting 클래스가 직접 해봤던것.

	}

}