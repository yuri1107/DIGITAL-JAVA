package day6;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 코드를 작성하세요.
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * 
		 * 문자를 유니코드로 변환해서 유니코드를 하나씩 증가, 출력되는 문자의 수도 하나씩 증가
		*/
		
		
		int num = 5;
		
		for(int i=0; i < num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)('a' + j));
			}
			
			System.out.println();
			
		}
		
		/* 문자 상수 a 와 상수 1 을 연산 (a+1)하면 자료형변환이 일어나지 않고 더해지기 때문에
		 * 결과가 문자 b가 나오면 바로 문자형 변수 ch에 저장이 가능하다.
		*/
		char ch = 'a'+1;
		//ch = (char)(ch + 1);
		/* 문자 변수 ch + 상수를 하면 문자 변수 ch가 정수형 int로 형변환되어 더해지기 때문에
		 * 결과가 정수가 된다.
		 * */
		System.out.println(ch+1);
		System.out.println((char)(ch+1));
		
		System.out.println("-----------------------------------------");
		/*
		 * 
		 * 두 정수를 입력하면 다음과 같이 출력되도록 작성하세요. 자리수맞춰서 (그럼 printf나 print써서 %nd 해서 자리수맞추기)
		 * 3 5   앞의 숫자가 행, 뒤의 숫자가 한 줄에 들어갈 갯수
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 
		 * 
		 * 
		*/
		
		/* 두번째꺼 혼자하다가 만거
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 두개");
		
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		
		for (int i = 0; i <= a; i++) {
			//일단 a++;은 아님 
			
			for (int j = 0; j <= b; j++) {
				System.out.printf("%d,%d,%d,%d",a,b,i,j);
			}
		}
		*/
		/* 두번째 예제의 첫번째방법
		int row, col;
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt(); //행
		col = scan.nextInt(); //열
		scan.close();
		
		for (int i=0, cnt=1; i < row; i++) { //행을 먼저 한다. 엔터쳐지면 다시 올라갈 수 없으니까. cnt는 출력시킬 숫자에 +1을 하는 용도로다가.
			for (int j = 0; j < col; j++) { //초기화는 0이나 1이나 상관이 없는데 1로하면 수식이 바껴야함
				//System.out.printf("%2d ",cnt);
				//cnt++;
				System.out.printf("%2d ",cnt++); //위의 두 줄을 후위연산자로 이렇게 한줄로 코딩 가능
				System.out.printf("%2d ", col*i+j+1); //이렇게도 가능.
			}
			System.out.println();
		}
		*/
		int row, col;
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt(); //행
		col = scan.nextInt(); //열
		scan.close();
		
		for (int i=0, cnt=1; i < row; i++) { 
			for (int j = 0; j < col; j++) { 
				System.out.printf("%2d ", col*i+j+1); 
			}
			System.out.println();
		}		
		

	}

}
