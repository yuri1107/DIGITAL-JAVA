package day18;

import java.util.*;


public class TestEx9 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세요.
		 * 예)
		 * 정수를 입력하세요 : 12345
		 * 결과 : 54321
		 *
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int input = scan.nextInt();
		int tmp = 0;
		System.out.print("결과 : ");
		
		while (0 < input) { // input != 0 이라고 조건하는거랑 같음
			tmp = input % 10;
			System.out.print(tmp);
			input = input / 10;
		}
		
	}

}
