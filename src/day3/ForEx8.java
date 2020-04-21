package day3;

public class ForEx8 {

	public static void main(String[] args) {
 
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hi");
//			if(i==3) {
//				break;
//			}
//		}
		
		// for문으로 1부터 10까지 숫자 중 짝수만 출력하기
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
/*		
		for( ; ; ) {
			for ( ; ; ) {
				if () {
					break;
				}
			}
			//B
		}
		//A
		// for(1) for(2) if break; 인 경우 break문은 if문 안에 있지만 for(2)를 벗어나서 for(1) 의 하단으로 위치하게 된다.
		
*/		
	}

}
