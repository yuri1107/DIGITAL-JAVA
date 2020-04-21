package day3;

public class ForEx10 {
	public static void main(String[] args) {
		/* 구구단 2단부터 9단까지 출력하는 코드를 작성하세요.
		 * 7단 출력 예제 활용
		 * 
		*/ 
		
		//혼자 해본것
		/*
		int dan = 1;
		int i;
		
		for (dan = 2; dan <= 9; dan++) {
			//i for문이 안에 있어야함
			for (i = 1; i <= 9; i++) {
				System.out.printf(dan + " X " + i + " = " + i*dan + "\n");
			}
		}
		*/
		
		//쌤이랑 한거. 근데 24번째줄에 7이라고 선언 할 필요가 없지않나..?
		int num = 7;
		for (num=2; num<=9; num++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", num, i, num*i);
			}
		}
		//반복문에 이름을 붙여서 구구단 전체를 출력하는 코드에서 2단만 출력하도록 수정
		Loop1 : for (num=2; num<=9; num++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d \n", num, i, num*i);
				if(i==9) {
					break Loop1;
				}
			}
		}
		
		
		
		
		
		
	}
}
