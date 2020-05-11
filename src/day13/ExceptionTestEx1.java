package day13;

import java.util.Scanner;

public class ExceptionTestEx1 {

	public static void main(String[] args) {
		/* 반복문을 통해 문자를 입력받고
		 * 입력받은 문자가 1이면 1입니다 라는 예외를 발생시키는 코드를 작성
		 * 예 )
		 * 문자를 입력하세요 : a
		 * 문자를 입력하세요 : b
		 * 문자를 입력하세요 : 1
		 * 예외가 발생했습니다.
		 *
		*/
		//혼자한거
		/*
		int cnt = 1; 
		Scanner scan = new Scanner(System.in);
		try {
			for ( ; ; ) {
				System.out.print(cnt+"번째 문자를 입력하세요 : ");
				char input = scan.next().charAt(0);
				if (input == '1') {
					throw new Exception ("예외가 발생했습니다. : " + input); 
				}
				cnt++;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	scan.close();
	*/
		char ch;
		Scanner scan = new Scanner(System.in);
		try {
			for( ; ;) {
				System.out.print("문자를 입력하세요 : ");
				ch = scan.next().charAt(0);
				if (ch == '1') {
					throw new Exception("예외가 발생했습니다. : " + ch);
				}
				if (ch == 'a') {
					throw new Exception("알파벳 예외입니다.");
				}
			}
			//실행문1 (지금은 무한루프라서 절대 실행되진 않는다.
		}catch(Exception e) {
			System.out.println(e.getMessage());//getMessage = 위에서 내가 만든 예외를 출력
			e.printStackTrace(); // 예외가 발생한곳을 추적해서 실행. 이걸 쓰면 예외가 발생해도 처리하고, 프로그램이 죽지 않음. 
			//쓰지 않고 예외(에러)가 발생한 경우에는 프로그램이 죽음.
		}finally {
			//실행문1 - catch 안에도 넣고 try안에도 넣어야하는데 finally 안에 쓰면 한번만 기술해도 됨. 하지만 그냥 try를 빠져나와 실행문을 써도 실행되기때문에 잘 쓰진 않음.
			System.out.println("예외 발생과 상관없이 무조건 실행되어야 하는 코드");
			
		}
		System.out.println("프로그램이 죽으면 안나오는 출력문");
	scan.close();
	}

}
