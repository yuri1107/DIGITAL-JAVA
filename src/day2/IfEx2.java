package day2;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		//변수 num을 선언하고 num이 초기값을 설정하여 num이 0 이면 0이라고 출력하고, 
		//num이 양수면 양수, 음수면 음수라고 출력하는 코드를 if문을 이용해 작성하는 예제.
		
		int num = 10;

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		num = scan.nextInt();
		
		if (num == 0) {
			System.out.println(num + " : 0 입니다.");
		} else if (num >= 1) { System.out.println(num + " : 입력값 양수입니다.");}
		else { System.out.println(num + " : 음수입니다."); }
		
		scan.close();
	
		//선생님이 하신거 1
		/*
		int num1 = 5;
		System.out.println("정수를 입력하세요. :  ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		
		
		if (num1 == 0) {
			System.out.println("0입니다.");
		}else if (num1 > 0) {
			System.out.println(num1 + " 는 양수입니다.");
		}else {
			System.out.println(num1 + " 는 음수입니다.");
		}
		
		scan.close();
		*/
	}

}