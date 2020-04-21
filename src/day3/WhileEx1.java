package day3;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		// while문은 for문과 다르게 조건식 생략이 불가능하다.
		// while문에서 무한루프를 돌리려면 조건식에 무조건 참이 되는 값을 넣는다. 예: 1==1 혹은 true
		/*
		while(true) {
			System.out.println("Hi");
		}
		*/
		//이거 예제가 뭔가 좀 이상한데..
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		
		while(menu != 4) {
			System.out.println("1.메뉴 1");
			System.out.println("2.메뉴 2");
			System.out.println("3.메뉴 3");
			System.out.println("4.메뉴 4");
			System.out.print("메뉴를 입력하세요. : ");
			menu = scan.nextInt();
			
		}
		scan.close();

	}

}
