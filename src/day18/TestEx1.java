package day18;

public class TestEx1 {
/* - 두 정수의 최대공약수를 구하는 메소드를 생성하고, main에서 테스트 해보시오.
 * - 두 정수의 최대공약수를 이용하여 두 정수의 최소 공배수를 구하는 메소드를 생성하고
 * 최대공약수가 g,두 정수가 a,b 라고 하면 최소공배수 l은 다음과 같다.
 * */
	public static void main(String[] args) {
		System.out.println(gcd(8,12));
		System.out.println(lcm(8,12));
	}
/* 기능 : 두 정수의 최대 공약수를 알려주는 메소드
 * 매개변수 : 두 정수 => int num1, int num2
 * 리턴타입 : 최대공약수 => int
 * 메소드명 : gcd
 * */
	
	//최대공약수
	public static int gcd (int num1, int num2) {
		if (num1 < 0 || num2 < 0) throw new ArithmeticException("예외 발생 : 최대공약수는 2개의 양의 정수가 필요합니다.");
		for (int i = num1; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {return i;}
		}
		return 1;
	}
	
	//최소공배수
	public static int lcm (int num1, int num2) {
		return (num1 * num2 / gcd (num1,num2));
	}
} // public class close
