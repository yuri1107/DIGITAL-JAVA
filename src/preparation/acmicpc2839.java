package preparation;

import java.util.Scanner;

public class acmicpc2839 {
//https://www.acmicpc.net/problem/2839
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int bong3 = 0;
		int bong5 = 0;
		
		if (n >= 3 && n <= 5000) {
			if (n % 3 == 0) { bong3++; }
			if (n % 5 == 0) { bong5++; }
			if (n % 3 == 0 && n % 5 == 0) { bong5++;}
			//나머지 말고 몫은 어떻게 구하지 
		}
		System.out.printf("가져가야 할 봉지는 3키로 %d 개, 5키로 %d 개 입니다.", bong3, bong5);
		scan.close();

	}

}
