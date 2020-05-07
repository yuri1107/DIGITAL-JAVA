package preparation;

import java.util.Scanner;

public class acmicpc10039 {
	// 변수 안쓰고 한 예제
	/*
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s1,s2,s3,s4,s5,min;
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		s3 = scan.nextInt();
		s4 = scan.nextInt();
		s5 = scan.nextInt();
		scan.close();
		min = 40;
		int total = (s1+s2+s3+s4+s5)/5;
		
		if (s1 <= min) {s1 = min;}
		if (s2 <= min) {s2 = min;}
		if (s3 <= min) {s3 = min;}
		if (s4 <= min) {s4 = min;}
		if (s5 <= min) {s5 = min;}
		//s1 % 5 == 0 && s2 % 5 == 0 && s3 % 5 == 0 && s4 % 5 == 0 && s5 % 5 == 0

		if (s1 >= min && s2 >= min && s3 >= min && s4 >= min && s5 >= min ) {
			total = (s1+s2+s3+s4+s5)/5;
		}
		
		System.out.println(total);
	}
	*/
	public static void main(String[] args) {
		
		//배열을 써서 해본거
		/*
		Scanner scan = new Scanner(System.in);
		int[] score = new int [5];
		int min = 40;
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			if (score[i] < min) {score[i] = min;}
			total += score[i];
		}
		System.out.println(total/score.length);
		*/
		average();
	}
	
	public static void average () {
		Scanner scan = new Scanner(System.in);
		int[] score = new int [5];
		int min = 40;
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			if (score[i] < min) {score[i] = min;}
			total += score[i];
		}
		scan.close();
		System.out.println(total/score.length);
	}

}
