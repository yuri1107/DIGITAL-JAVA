package day9;

public class OverloadEx2 {
//아래의 메서드들은 메서드명이 같은 오버로딩이다.
//오버로딩은 매개변수의 자료형이 다르거나 갯수가 달라야한다.
	public static void main(String[] args) {
		System.out.println(sum(1,2)); //두 정수의 합을 구하는 메서드를 호출
		System.out.println(sum(1.2,3.8)); //두 실수의 합을 구하는 메서드를 호출
		System.out.println(sum(1,3.8,6.7)); //세 실수의 합을 구하는 메서드를 호출
		System.out.println(sum(1,8,15.2,48.2,64.5));
		
		System.out.println(sum()); 
		System.out.println(sum('1',2,3,4,5)); //문자 1이 유니코드 (아스키코드로 49)로 자동자료형변환되어 연산됨
		//System.out.println(sum("1",2,3,4,5)); //문자열 1은 실수로 형변환 할 수 없어서 에러발생. 
		//에러가 발생하지 않게 하려면 문자열 1을 정수 혹은 실수 혹은 문자로 수정하던지
		//sum메서드를 오버로딩하여 문자열도 가능하도록 추가해야한다.
	}
	
	//아래의 정수의합을 구하는 메서드는 굳이 있을 필요가 없다. 정수 또한 소수로 표현이 가능하기때문에.
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public static double sum (double num1, double num2) {
		return num1+num2;
	}
	
	//세 실수의 합을 알려주는 메서드
	public static double sum (double num1, double num2, double num3) {
		return num1+num2+num3;
	}
	
	//n개의 실수의 합을 알려주는 메서드 
	//가변인자를 이용한 합계를 구하는 메서드 (매개변수가 가변인자 일때) 
	//(가변인자배울때 잤음)
	public static double sum (double...nums) {
		double res = 0.0;
		for (double tmp : nums) {
			res += tmp;
		}
		return res;
	}
	
	
	
	
}
/* 아래 코드는 sum 메서드에 static이 안붙는 경우 호출하는 방법이다.
 * 이렇게 사용하는것도 가능하지만 static을 쓰는것에 비해 
 * 코드가 길어지고 불편하기 때문에 static을 붙이는것이 좋다.
 */
/*
public class OverloadEx2 {

	public static void main(String[] args) {
		OverloadEx2 obj = new OverloadEx2();
		System.out.println(obj.sum(1,2));
	}
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	
}
*/