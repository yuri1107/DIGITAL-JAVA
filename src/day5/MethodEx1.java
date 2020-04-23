package day5;

public class MethodEx1 {

	public static void main(String[] args) {
		//void는 리턴값이 없는 경우에 사용.
		//5번째 줄에 있는것들은 전부 '고정'된 것으로 콘솔응용프로그램을 실행하기 위해서 필요한것들임. 지우면 안됨
		/*
		int res = sum(1,2); // int res = 3; 과 같음. 문법이 맞기때문에 주석과 같이 선언이 가능함. (자료형이 같다.)
		//char res2 = 3; //이렇게 선언 불가능. char은 문자형, 2바이트 이고 정수 3은 int에 들어가는 4바이트짜리 이기 때문에.
//		char res2 = sum(1,2); //에러 발생
		
//		int num1 = 1, num2 = 2;
//		char ch = 1 + 2;
//		ch = num1 + num2;
		
		System.out.println(res);
		*/
		
		System.out.println(gcd(10,15));
		//System.out.println(gcd2(10,15)); //리턴값이 없기때문에 에러남
		gcd2(10,15);
		
		System.out.println(lcm(10,15));
		
		System.out.println((isPrime(343)));
		if(isPrime(343)) {
			System.out.println("343은 소수");
		}else {System.out.println("343은 소수가 아님");}

	}
	/* 기능 : 두 정수의 합을 알려주는 메서드
	 * 
	 * 매개변수 : 두 정수 => 자료형 변수명, 자료명 변수명 => int num1, int num2
	 * 리턴타입 : 정수의 합 => 정수 => int
	 * 메서드명 : sum
	 * 
	 * */
	public static int sum(int num1, int num2) {
		return num1 + num2; // return : 메서드를 종료하고 값을 전달하는 역할 
	}
	
	/* 기능 : 두 정수의 최대공약수를 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 최대 공약수 => 정수 => int
	 * 메서드명 : gcd
	 * 
	 * 리턴값과 매개변수가 같지 않아도 된다.
	 */
	
	public static int gcd(int num1, int num2) {
		
		int res = 1; //최대공약수를 저장하는 변수
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		
		return res;
	}
	
	// 이렇게하는것도 가능은 한데 매소드는 재활용이 장점인데 이렇게 쓰면 재사용을 못해서 권장하지 않는 방법.
	public static void gcd2 (int num1, int num2) {
		
		int res = 1; //최대공약수를 저장하는 변수
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				//System.out.println(res);
				res = i;
			}
		}
		System.out.println(res);
	}	
	
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1,num2);
		
	}
	
	/* 기능 : 정수가 소수인지 아닌지 판별하는 메소드
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 소수인지 아닌지 => 참,거짓 => boolean
	 * 메소드명 : isPrime
	 * 
	 * 
	 * */
	
	public static boolean isPrime (int num) {
		int cnt = 0;
		for (int i = 1; i*i <= num; i++) { //i*i를 하는 이유는 반복횟수를 줄이기 위함이다.
			if(num % i == 0) {
				cnt++;				
			}
		}
		if (cnt == 1) {
			return true;
			//리턴 1을 반환하는게 아니라 출력하는 예제였다면 이 이프문 이후에 있는 실행문도 실행을 하게된다.
		}//else를 생략했는데 있어도 상관없음
		return false;
	}
	
	
}
