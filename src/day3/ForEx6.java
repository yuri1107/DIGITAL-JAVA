package day3;

import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 for문을 이용해 작성.
		 * 소수 : 약수가 2개인 수.
		 * 1. 반복횟수 : i는 1부터 num까지 1씩 증가
		 * 2. 규칙성 : i가 num의 약수이면 약수의 갯수 (cnt)를 1 증가. 
		 * 			num % i == 0 이렇게 쓰면 num을 i로 나누었을때 나머지가 0과 같다면 이라는 뜻
		 * 3. 반복문 종료 후 : 약수의 갯수 (cnt)가 2이면 소수라고 출력하고
		 * 			아니면 소수가 아님 이라고 출력
		*/
		//혼자 해보기 못했음
		/*
		int i,num = 7;
		
		for (i=1; i<=num; i++) {
			int cnt = 0;
			if (i % num == 0) {
				//System.out.printf(i + ",");
				System.out.println("소수 입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}
		}		
		*/
		int num = 0, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요. :  ");
		num = scan.nextInt();
		scan.close();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				++cnt;
				//cnt++; cnt+=1; 이라고도 표현 가능
			}
		}
		if(cnt == 2) {
			System.out.println(num + " 는(은) 소수입니다.");
		}else {System.out.println(num + " 는(은) 소수가 아닙니다.");}
		
		
		
	}

}
