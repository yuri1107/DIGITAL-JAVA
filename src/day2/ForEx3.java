package day2;

public class ForEx3 {

	public static void main(String[] args) {
		/*
		 * 1부터 5까지의 합을 구하는 코드를 for문으로 작성하세요.
		 * 1. 반복 횟수 : i 는 1 부터 5까지 1씩 증가
		 * 2. 규칙성 : 
		 * 3. 반복문 종료 후 : 1부터 15까지의 합 sum을 출력
		 * sum = 0;
		 * i = 1, sum = 0 + 1
		 * i = 2, sum = 0 + 1 + 2
		 * i = 3, sum = 0 + 1 + 2 + 3
		 * i = 4, sum = 0 + 1 + 2 + 3 + 4
		 * i = 5, sum = 0 + 1 + 2 + 3 + 4 + 5
		 * 
		 * sum0 = 0;
		 * i = 1, sum1 = sum0 + 1
		 * i = 2, sum2 = sum1 + 2
		 * i = 3, sum3 = sum2 + 3
		 * i = 4, sum4 = sum3 + 4
		 * i = 5, sum5 = sum4 + 5
		 * 		sum = sum + ?
		 */
		
		//혼자서 예제 해보는거.. 솔직히 질문을 이해하지 못했음.
//		int i, sum = 0;
		
//		for (i=1; i<=5; i+=sum) {
//			sum++;
//		}	
//		System.out.println(sum+i);
		
		//쌤이랑 같이
		
		int i, sum = 0;
		for (i=1; i<=5; i++) {
			sum = sum + i ; //sum += i;
		}
		System.out.println("1부터 5까지의 합 : " + sum);

	}

}