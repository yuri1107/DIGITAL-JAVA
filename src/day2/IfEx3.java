package day2;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		/* 
		 * 정수형변수 num을 선언하고 num의 값을 초기화하여 
		 * num이 2의 배수이면 2의 배수라고 출력하고,
		 * 3의 배수이면 3의 배수라고 출력하고,
		 * 6의 배수이면 6의 배수라고 출력하고,
		 * 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다 라고 출력하는 코드를 작성하세요.
		 * 예 : 6 => 6의 배수입니다.
		 */
		
		
		/* 혼자해본거 안됐음
		 
		 int num1 = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		num1 = scan.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println(num1 + " => 2의 배수입니다.");
		}else if (num1 % 3 == 0) {
			System.out.println(num1 + " => 3의 배수입니다.");
		}else if ((num1 % 6 == 0) || (num1 % 2 > 2)) {
			System.out.println(num1 + " => 6의 배수입니다.");
		}else { System.out.println(num1 + " => 2,3,6의 배수가 아닙니다."); }
		*/
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :  ");
		
		num = scan.nextInt();
		/*
		if (num % 2 == 0 && num % 3 != 0) {
			System.out.println(num + " 는 2의 배수입니다.");
		}else if (num % 3 == 0 && num % 2 != 0) {
			System.out.println(num + " 는 3의 배수입니다.");
		}else if (num % 6 == 0) {
			System.out.println(num + " 는 6의 배수입니다.");
		}else {
			System.out.println(num + " 는 2,3,6의 배수가 아닙니다.");
		}
		*/
		//if문은 위에서 아래로 순차적으로 해결하기 때문에 선행 조건식에 조건을 추가 보정하거나 큰 수를 먼저 조건문에 배치해야함.
		
		
		//중첩if문으로 표현
		if (num % 2 == 0) {
			//이 실행문까지 왔다는 것은 num 은 기본 2의 배수이다.
			//그주에서 3의 배수이기까지 한 num 은 6의 배수이다.
			if (num % 3 == 0) {
				System.out.println(num + " 는 6의 배수입니다.");
			}else {
				System.out.println(num + " 는 2의 배수입니다.");
			}
			
		}else if (num % 3 == 0 && num % 2 != 0) {
			System.out.println(num + " 는 3의 배수입니다.");
		}else {
			System.out.println(num + " 는 2,3,6의 배수가 아닙니다.");
		}		
		scan.close();
	}

}