package day7;

import java.util.Scanner;

public class MethodEx4 {
	
	public static void main(String[] args) {
		/*
		 *
		*/
		//혼자 만든 메서드 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇단을 출력할까요?");
		/*
		int dan1 = scan.nextInt();
		int dan2 = 9;
		printDan(dan1,dan2);
		*/
		
		//쌤이 만든 메서드 출력
		
		int num = scan.nextInt();
		//printMultipTable(num,start,end);
		int start = 10, end = 19;  //본문의 if문 실행 결과를 보기 위한 초기화
		int res = printMultipTable(num,start,end);
		
		System.out.println("------------------------------------");
		
		if ( res == 0 ) { // (num,start,end) 라는 조건문에서 num은 입력받는것이고, start와 end는 상수를 입력해도 된당.
			System.out.println("0단의 모든 값은 0 입니다.");
		}else if( res == -1 ) { // end와 start 의 순서를 바꿈.
			System.out.println("구구단의 시작번호와 끝 번호가 바뀌었습니다.");
		}
		
		
		
	scan.close();

	}
	
	/* 기능 : num이 주어지면 주어진 num단(구구단)의 단을 출력하는 메서드
	 * 메서드명 : printDan
	 * 리턴타입 : void
	 *		0 => 0단이 입력됨 => 출력 안함
	 *		1 => 정상출력
	 *		-1 => (start > end) 경우 = 출력안함
	 *		인 경우에는 정수형 int로 리턴 할 수 있다. boolean으로도 출력 함,안함은 리턴할 수 있지만 어째서 안하는지는 알려 줄 수가 없다.
	 * 매개변수 : dan
	 * 접근제한자 : public
	 * 
	*/
	//혼자한거
	public static void printDan (int dan1, int dan2) {
		for (int i=1; i <= dan2; i++) {
				System.out.printf("%d X %d = %2d \n", dan1, i, dan1*i);
		}
	}
	
	//쌤이랑 한거
	//같은 이름의 메서드가 있지만 main에서 호출할때 매개변수로 구분해서 주석처리를 하지 않아도 된다. (오버로딩)
	public static void printMultipTable (int num) {
		for (int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %2d \n", num, i, num*i);
			
		}
	}
	
	
	//향상시켜서 만든거 (쌤이)
	//근데 이렇게 하면 i와 start가 같다고 초기화했기때문에 곱하기1 부터 나오지는 않음
	//메서드의 리턴타입이 void 인 경우에는 if문과 return을 정의 할 필요가 없음.

	public static int printMultipTable (int num,int start, int end) {
		if ( num == 0 ) { return 0; }
		if (start > end) { return -1; }
		for (int i=start; i<=end; i++) {
			System.out.printf("%d X %d = %2d \n", num, i, num*i);
		}
		return 1;
	}	
}
