package day7;

import java.util.Scanner;

public class MethodEx5 {

	public static void main(String[] args) {
		//이해 안가는 예제
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		/* 혼자한거 출력
		int nb1 = scan.nextInt();
		int cnt = 0;
		isPrime1(nb1);
		*/
		
		int num = scan.nextInt();
		//int num = 4;
		
		if(isPrime1(num)) {
			System.out.println(num + "는 소수 / isPrime1");
		}else {
			System.out.println(num + "는 소수가 아님 / isPrime1");
		}
		if(isPrime2(num)) {
			System.out.println(num + "는 소수 / isPrime2");
		}else {
			System.out.println(num + "는 소수가 아님 / isPrime2");
		}
		
		scan.close();

	}
	/* 기능 : 주어진 정수가 소수인지 아닌지 알려주는 메서드
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 소수인지 아닌지 => 참 또는 거짓 => boolean
	 * 메서드명 : isPrime (혼자할때는 isPrime1)
	 * */
	
	//혼자 해본것
	/* 소수를 못구해서 실패
	public static boolean isPrime1 (int nb1,int cnt) {
		// -----------------------------------
		for (int i = 1; i <= nb1; i++) {
			if (nb1 % i == 0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			System.out.println(nb1 + " 는(은) 소수입니다.");
		}else {System.out.println(nb1 + " 는(은) 소수가 아닙니다.");}
	}
	*/
	//알려줘도 못한다 나는..
	
	//선생님이 하신거
	public static boolean isPrime1 (int num) {
		int cnt = 0;
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if (num == 1) return false;
		if (cnt == 0) {
			return true;
		}else {return false;}
		
	}
	
	//선생님이랑 한 더 효율적인 메소드
	
	public static boolean isPrime2 (int num) {
		if (num == 1) return false; //소수가 아니면 먼저 거름
		for (int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true; // 위의 for문을 실행하고 여기까지 내려왔다면 true 반환
	}	

}
