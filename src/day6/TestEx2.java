package day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문자를 입력받아 입력받은 문자를 출력하세요.
		*/
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("문자를 입력하세요");
		
		char abc = scan.next().charAt(0);
		scan.close();
		System.out.printf("입력된 문자 %c 입니다.",abc);
		*/
		
		
		/* 문자를 10번 입력받아 입력받은 문자를 각 1번씩, 총5번 출력하세요.
		 * 문자를 입력받아 출력하는 과정을 5번 반복하세요 라는 뜻이라네
		 */
		//혼자했던거
		/*
		int r = 5;

		String end = new String();

		for (int i = 0; i < r; i++) {
			System.out.println("입력 : ");
			char a = scan.next().charAt(0);
			System.out.printf("출력 : %c \n",a);
			end += a;
		}
		//for문이 모두 종료된 후에 출력했었던 글자들을 한줄에 모두 출력시키고싶다
		//혼자했을때 String[] 으로 자료형을 문자열배열 으로 해버려서 출력할때 주소가 나왔음.
		System.out.println(end);
		*/
		
		//쌤이랑 한거
		/*
		for(int i = 0; i < 5; i++) {
			char ch;
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			System.out.println("입력받은 문자 : " + ch);			
		}
		*/
		
		/* 문자를 입력받아 출력하는 과정을 5번 반복하세요. 단 소문자 q를 입력하면
		 * 문자 출력 대신 종료합니다 가 출력되도록 수정하세요.
		 * */
		
		//내가 해본 for문 안의 switch문 (사실 쌤도움 조금 받음
		/*
		for(int i = 0; i < 5; i++) {
			char ch;
			System.out.print("입력 : ");
			ch = scan.next().charAt(0);
			
			
			//if (ch=='q') { System.out.println("종료합니다");}
			switch (ch) {
			case 'q' : System.out.println("종료합니다"); break;
			default : System.out.println("출력 : " + ch);	
				break;
			}
			
			
		}
		*/		
		
		//실패
		/*
		System.out.print("입력 : ");
		char ch = scan.next().charAt(0);
		switch (ch) {
		
		case 'q' : System.out.println("종료합니다"); break;
		default : for (int i = 0; i < 5; i++) {
			
			System.out.println("출력 : " + ch);	
		}
		
		}
		*/
		
		//쌤이랑 한거
		/*
		char ch;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if (ch != 'q') {
				System.out.println("입력받은 문자 : " + ch);	
			}else {System.out.println("종료합니다.");}
		}		
		*/
		
		/* 문자를 입력받아 출력하는 과정을 5번 반복하는데 
		 * 소문자 q를 입력하면 문자출력대신 종료합니다가 출력되고 
		 * 더이상 반복하지 않도록 수정하세요.
		 * */
		
		//혼자한거. 쌤이랑 똑같음
		/*
		char ch;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if (ch != 'q') {
				System.out.println("입력받은 문자 : " + ch);	
			}else {System.out.println("종료합니다."); break;}
		}			
		*/
		
		/* 문자를 입력받아 출력하는 과정을 q가 입력될 때 까지 반복하세요.
		 * */
		//혼자했던거
		/*
		char ch;
		
		for(int i = 0; i == i ; i++) {
			
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if (ch != 'q') {
				System.out.println("입력받은 문자 : " + ch);	
			}else {System.out.println("종료합니다."); break;}
		}
		*/
		
		//쌤이 하신거 for 안의 if문
		
		char ch;
		//for (int i = 0; i <=5 ; ) 라고 조건식을 써도 가능함. i가 증가하지 않으면 조건이 언제나 참이기 때문에 무한루프 가능
		for( ;  ; ) { //for문은 조건식 생략 가능
			
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if (ch != 'q') {
				System.out.println("입력받은 문자 : " + ch);	
			}else {System.out.println("종료합니다."); break;}
		}
		
		scan.close();

	}

}
