package day2;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		/*
		 * 달 (월) 이 주어지면 해당하는 달의 마지막일을 출력하는 코드를 switch문을 이용해 작성하세요.
		 * 예 : 
		 * 31일 : 1 3 5 7 8 10 12
		 * 30일 : 4 6 9 11
		 * 28일 : 2
		 */

		//나 혼자서 책 살짝 베껴서 해본거
		Scanner scan = new Scanner(System.in);
		System.out.print("마지막날을 알고싶은 달(월)를 입력하세요. : ");
		/*
		int num = scan.nextInt();
		
		switch (num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println(num + "월의 마지막 일은 31일 입니다.");
			break;
		case 4 : case 6 : case 9 : case 11 : 
			System.out.println(num + "월의 마지막 일은 30일 입니다.");
			break;
		case 2 : 
			System.out.println(num + "월의 마지막 일은 28일 입니다.");
			break;
		default : System.out.println(num + "월은 존재하지 않습니다.");
		
		}
		*/
		
		// month 변수를 만들어서 if문으로 활용도 가능함.
		
		scan.close();
		
	}

}