package day14;

import static java.lang.Math.*; //class메서드를 쓸때 클래스명을 생략하려면 static을 붙여서 import를 해주면 된다.

public class MathEx1 {

	public static void main(String[] args) {
		System.out.println(Math.ceil(1.51)); // Math.ceil(n.n) 소수점 첫째자리에서 올림
		System.out.println(Math.floor(1.51)); // Math.floor(n.n) 소수점 첫째자리에서 버림
		System.out.println(Math.round(1.51)); // Math.round(n.n) 소수점 첫째자리에서 반올림 (정수로 출력됨) 
		//1.51을 소수점 둘째자리에서 올림 하려면
		
		System.out.println("소수점 둘째자리 ");
		
		double num = 1.51; // 값을 구하기 전의 수를 변수에 저장
		num = num * 10; // 10의 n제곱으로 곱한다.
		
		System.out.println(Math.ceil(num)/10); 
		System.out.println(Math.floor(num)/10); 
		System.out.println(Math.round(num)/10.0); //round는 정수형이기 때문에 10.0으로 나눠야함
		
		System.out.println(round(num)/10.0);
		
		
	}

}
