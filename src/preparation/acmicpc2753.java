package preparation;

import java.util.Scanner;

public class acmicpc2753 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		scan.close();
		
		/*
		if ( year >= 1 && year <= 4000) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //윤년찾기
				System.out.println("1");
			}else {System.out.println("0");}
		}
		*/
		//
		
		if ( year >= 1 && year <= 4000) {
			if (year % 4 == 0) {
				if (year % 100 != 0 || year % 400 == 0) {
					System.out.println("윤년입니다.");
				}else {System.out.println("윤년이 아님");}
			}else {System.out.println("윤년이 아님");}
		} 
		
		//
		
	}

}
