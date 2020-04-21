package day3;

import java.util.Scanner;

public class ForEx7 {

	public static void main(String[] args) {
		/*
		 * 두 정수 num1과 num2의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 공약수 중에서 가장 큰 수
		 * 공약수 : 두 수의 약수 중 공통으로 있는 수
		 * 약수 : 나누어 떨어지는 수
		 * 8의 약수 : 1 2 4 8
		 * 12의 약수 : 1 2 3 4 6 12
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대공약수 : 4
		 * 
		 * 1. 반복횟수 : i는 1부터 num1 까지 1씩 증가
		 * 2. 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 gcd에 i를 저장. (i가 num1,num2의 공약수이면 gcd에 i를 저장)
		 * 3. 반복문 종료 후 : gcd를 출력.
		 */
		
		//혼자서 한것
		/*
		int num1 = 0, num2 = 0, gcd = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요. :  ");
		num1 = scan.nextInt();
		System.out.println("최대공약수를 구할 두번째 정수를 입력하세요. : ");
		num2 = scan.nextInt();
		scan.close();
		// i <= num1 대신 i <= num1 || i <= num2 이라고 쓰면 num1,2 둘중 더 큰값과 i로 계산 가능!
		for (int i = 1; i <= num1 ; i++) {
			if ((num1 % i == 0) && (num2 % i == 0)) { 
				gcd=i;
			}
		}
		System.out.printf("최대공약수는 %d 입니다.",gcd);
		*/
		
		int num1, num2;
		int gcd = 1;
		System.out.println("두 정수를 입력하세요. : ");
		Scanner scan = new Scanner (System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수 : %d \n", num1, num2, gcd);

	}

}
