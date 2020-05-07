package preparation;

import java.util.Scanner;

public class acmicpc1330 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		if (A >= -10000 && B <= 10000) {
			if (A > B) {System.out.println(">");}
			else if (A < B) {System.out.println("<");}
			else if (A == B) {System.out.println("==");}
			else {System.out.println("바르지 못한 결과범위입니다.");}
		}else {System.out.println("바르지 못한 계산범위 입니다.");}
	}

}
