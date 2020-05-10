package assignment;

import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		/* ﻿1~50사이의 랜덤한 수를 컴퓨터가 생성하고, 사용자가 해당수를 맞추는 게임
			예) 컴퓨터가 랜덤으로 생성된 수가 34
			
			입력 : 50
			down
			입력 : 20
			up
			입력 : 35
			down
			입력 : 30
			up
			입력 : 34
			정답
		*/
		int max = 50;
		int min = 1;
		int rand = random(min, max);
		//System.out.println(rand); // 랜덤 메서드 호출 (출력)
		Scanner scan = new Scanner(System.in);
		questionIf(rand, scan);

	}
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1) + min);
	}
	
	public static void questionIf (int rand, Scanner scan) {

		for ( ; ; ) {
			System.out.print("입력 : ");
			int user = scan.nextInt();
			
			if (user > rand) {
				System.out.println("down");
			}
			else if (user < rand) {
				System.out.println("up");
			}
			else if (user == rand) {
				System.out.println("정답");
				break;
			}
			
		}

	} 
	
}
