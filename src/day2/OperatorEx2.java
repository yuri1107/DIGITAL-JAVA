package day2;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1/2); // 정수/정수=정수
		System.out.println(1.0/2); // 실수/정수=실수
		System.out.println((double)1/2); //자료형변환으로 정수/정수 를 실수/정수로 변환
		
		int num1=1,num2=2;
		System.out.println((double)num1/num2);
		
		// System.out.println(3/0); 0으로 나눌수 없기때문에 에러 발생.
		
		System.out.println(3/0.0);
		
		//이하 예제는 변수선언 부분이 잘 이해되지 않음.
		char ch1 = 'A';
		//A라는 문자의 유니코드가 저장.
		char ch2 = 'A' + 1;
		//리터럴간의 연산이기 때문에 실행과정동안 변하지 않음.
		System.out.println(ch2);
		char ch3 = (char)(ch1 + 1);
		//char ch3 = ch1 + 1; 
		//에서 에러가 뜨는 이유는 자동 형변환이 안되기때문. 수동으로 형변환해야함 
		
		System.out.println(ch3);
		
		
	}

}