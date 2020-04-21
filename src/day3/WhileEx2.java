package day3;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최소공배수를 구하는 코드를 작성하세요.
		 * 최소공배수 : 두 수의 공배수 중 가장 작은 공배수
		 * 공배수 : 두 수의 배수 중 공통인 배수
		 * 10의 배수 : 10 20 30 40 50 ...
		 * 15의 배수 : 15 30 45 60 75 ...
		 * 10과 15의 공배수 : 30 60 90 ...
		 * 10과 15의 최소 공배수 : 30
		 * 
		 * 1. 반복횟수 : i는 1부터 num1*num2 까지 1씩 증가
		 * 2. 규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문을 종료해라.
		 * 3. 반복문 종료 후 : 없음
		 */
		
		int num1 = 0, num2 = 0;
		int i;
		int cnt; //반복문 실행 횟수를 카운트 하기 위한.
		Scanner scan = new Scanner(System.in);
		System.out.print("최소공배수를 구할 정수 2개를 입력하세요. :  ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
		// i <= num1 대신 i <= num1 || i <= num2 이라고 쓰면 num1,2 둘중 더 큰값과 i로 계산 가능!

		/*
		i = 1;
		while (i <= num1 * num2) {
			cnt++;
			if (i%num1==0 && i%num2==0) {
				System.out.printf("%d와 %d의 최소공약수 : %d,반복횟수 : %d \n",num1,num2,i,cnt);
				break;
			}
			i++;
		}
		*/

		/*
		 * 위 예제는 i가 1부터 시작해서 최소공배수를 구하기 때문에 최소공배수가 큰 경우 반복횟수가 많아진다.
		 * 그래서 아래처럼 i를 num1부터 시작하여 num1의 배수로 한다면 반복횟수가 줄어든다.
		*/
		/*
		i = num1;
		cnt = 0;
		while (i <= num1 * num2) {
			cnt++;
			if (i%num2==0) {
				System.out.printf("%d와 %d의 최소공약수 : %d,반복횟수 : %d \n",num1,num2,i,cnt);
				break;
			}
			i+=num1;
		}		
		*/
		
		//아래의 코드는 num2의 값이 num1보다 클 경우 변수 2개의 값을 서로 바꿔서 반복 횟수를 줄이는 if문이다.
		if (num1 < num2) {
			int tmp = num1; //변수의 값은 바꿔치기가 불가능하기때문에 임시로 변수를 하나 더 만들어줘야함.
			num1 = num2;
			num2 = tmp;
		}
		//여기까지가 반복횟수를 줄이는 if문이다. (없어도 되는건데 있으면 반복횟수가 줄어드니까 더 좋긴함)
		i = num1;
		cnt = 0;
		while (i <= num1 * num2) {
			cnt++;
			if (i%num2==0) {
				System.out.printf("%d와 %d의 최소공약수 : %d,반복횟수 : %d \n",num1,num2,i,cnt);
				break;
			}
			i+=num1;
		}			
		
		

	}

}
