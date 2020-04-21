package day2;

public class ForEx2 {

	public static void main(String[] args) {
		// 구구단 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
/*
 * 반복 횟수 : i는 1부터 9까지 1씩 증가  혹은 7부터 63까지 7씩 증가
 * 규칙석 : 7 X i = 7*i 를 출력
 * 7 X i = 7*i <- 이번 예제의 목적에는 이 규칙이 어울림
 * 7 X i/7 = i
 * 7 X 1 = 7
 * 7 X 2 = 14
 * 7 X 3 = 21
 * 7 X 4 = 28
 * 7 X 5 = 35
 * 7 X 6 = 42
 * 7 X 7 = 49
 * 7 X 8 = 56
 * 7 X 9 = 63
 * 
 */
		
		//혼자 한거
		/*
		int i;
		for (i=1; i<=9; i++) {
			
			System.out.println("7 X " + i + " = " + 7*i);
		}
		*/
		
		int i, num = 7;
		for (i=1; i<=9; i+=1) {
			System.out.printf("%d X %d = %d \n", num, i, num*i);
		}
		System.out.println("--------------------");
		for (i=1; i<=9; i+=1) {
			System.out.printf(num + " X " + i + " = " + num*i + "\n");
		}
	}

}