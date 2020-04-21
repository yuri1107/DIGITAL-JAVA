package day3;

public class ForEx5 {

	public static void main(String[] args) {
		//
		//int i;
		//의도적인 무한루프
		/*
		for ( ; ; ) {
			System.out.println("hello");
		}
		*/
		//에러 발생, 무한루프로 인해 실행되지 않음.
		//System.out.println("Hello");
		//오류가 없는 코드에 오류가 뜬다면 윗줄의 반복문이 무한루프일 수 있음
		/* 조건식의 기준이 되는 i의 값이 변경되지 않아서 무한루프가 됨.
		int sum = 0;
		for (i=1; i<=5; sum++ ) {
			System.out.println("err_무한루프");
		}
		*/
		/*완전한 무한루프는 아니지만 무수히 많은 횟수를 반복하는 반복문
		 * (i가 계속 감소하여 언더플로우로 인해 정수 최대값이 되는 순간까지 반복
		 * for (i=1; i<=5; i--) {
		 * 	System.out.println("Hello");
		 * }
		 */
		//반복문이 한번도 실행되지 않는 경우 (기준점이 조건보다 값이 높기 때문에)
//		
//		for (i=10; i<=5; i++) {
//			System.out.println("hello");
//		}
//		
		
		//변수는 선언한 위치부터 변수가 선언돼 {}안에서 유효하다.
		//j는 for문의 초기화 위치에서 선언되었기 때문에 반복문 안에서 유효하다.
		for (int j=1; j<=5; j++) {
			System.out.println(j);
			char ch = 'A';
			System.out.println((char)(ch+j));
		}
		// for문을 작성하면서 j를 선언했기 때문에 for문을 벗어나면 유효하지않다.
		//에러 발생, j의 사용 범위 밖에서 j를 선언했기 때문에.
		//System.out.println(j);
	}

}
