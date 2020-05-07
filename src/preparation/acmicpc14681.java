package preparation;

import java.util.Scanner;

public class acmicpc14681 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		
		if (x > 0 && x <= 1000) { //양수
			if (y > 0 && y <= 1000) {System.out.println("1");}
			else if (y < 0 && y >= -1000) {System.out.println("4");}
		}
		if (x < 0 && x >= -1000) {
			if (y > 0 && y <= 1000) {System.out.println("2");}
			else if (y < 0 && y >= -1000) {System.out.println("3");}
		}
		if (x == 0 || y == 0) {System.out.println("사분면 번호를 출력할 수 없습니다.");}
	}

}
