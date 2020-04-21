package day2;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch문을 이용한 홀짝 판별 예제
		
		int num = 14;
		switch (num % 2) {
			case 0 : 
				System.out.println(num + " 는 짝수");
				break;
			case 1 : //default: (라고 디폴트 문으로 선언 가능. if문의 else와 비슷함.)
				System.out.println(num + " 는 홀수");
				break;
		}
		

	}

}