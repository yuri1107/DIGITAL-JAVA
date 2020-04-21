package day3;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// 
		int menu = 4;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("1.메뉴 1");
			System.out.println("2.메뉴 2");
			System.out.println("3.메뉴 3");
			System.out.println("4.메뉴 4");
			System.out.print("메뉴를 입력하세요. : ");
			menu = scan.nextInt();
		}while(menu != 4);
		scan.close();
		
		
	}

}
