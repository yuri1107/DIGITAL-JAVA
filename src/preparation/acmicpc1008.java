package preparation;

import java.util.Scanner;

public class acmicpc1008 {
//백준 1008번 문제
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if (a < 0 || b > 10) {System.out.println("조건에 부합하지 않습니다.");}
		else {System.out.println((double)a/b);}
		System.out.println();
	}

}
