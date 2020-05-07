package preparation;

import java.util.Scanner;

public class acmicpc9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scr = scan.nextInt();
		scan.close();
		
		if (scr >= 0 && scr <=100) {		
			if (scr >= 90) {System.out.println("A");}
			else if (scr >= 80 && scr < 90) {System.out.println("B");}
			else if (scr >= 70 && scr < 80) {System.out.println("C");}
			else if (scr >= 60 && scr < 70) {System.out.println("D");}
			else {System.out.println("F");}
		}else System.out.println("잘못된 점수입니다.");

		

	}
}